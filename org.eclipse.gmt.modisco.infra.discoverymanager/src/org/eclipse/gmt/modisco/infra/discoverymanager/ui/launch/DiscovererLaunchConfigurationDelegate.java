/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.utils.ParameterUtils;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscovererLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.
	 * eclipse.debug.core.ILaunchConfiguration, java.lang.String,
	 * org.eclipse.debug.core.ILaunch,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		try {
			/*
			 * Do we have to validate launch configuration before execution ? it
			 * seems to be ...
			 */
			String kind = configuration.getAttribute(DiscovererLaunchConstants.discovererKind, ""); //$NON-NLS-1$
			String sourcePath = configuration.getAttribute(
					DiscovererLaunchConstants.discovererSourcePath, ""); //$NON-NLS-1$

			Discoverer discoverer = DiscoveryManager.getDefault().getDiscoverer(kind);
			/*
			 * initialization of discoverer parameters
			 */
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			for (DiscoveryParameter parameter : discoverer.getDiscovererParameters()) {
				Object value = ParameterUtils.getInstance().deserializeParameterValue(parameter,
						configuration);
				if (value != null) {
					parameters.put(parameter, value);
				}
			}

			Object source = convertSourcePath(sourcePath);

			discoverer.discoverElement(source, parameters);
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, DiscoveryManager.PLUGIN_ID,
					"Please, check your discoverer configuration.", e); //$NON-NLS-1$
			throw new CoreException(status);
		}
	}

	private final Object convertSourcePath(final String sourcePath) {
		/*
		 * Conversion of source path into source element
		 */
		Object source = null;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath rootPath = root.getFullPath();
		IPath path = rootPath.append(sourcePath);
		/*
		 * It could be a file, a folder or a project ...
		 */
		IContainer iproject = null;
		if (path.segmentCount() == 1) {
			iproject = root.getProject(sourcePath);
		} else {
			iproject = root.getFolder(path);
		}
		if ((iproject != null) && (iproject.exists())) {
			source = iproject;
		} else {
			IFile ifile = root.getFile(path);
			source = ifile;
		}
		return source;
	}
}
