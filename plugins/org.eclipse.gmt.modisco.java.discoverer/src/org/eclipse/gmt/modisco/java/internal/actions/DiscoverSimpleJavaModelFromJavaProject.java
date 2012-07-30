/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.internal.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.java.IModelReader;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.io.java.JavaReader;
import org.eclipse.jdt.core.IJavaProject;

/**
 * Discover Java model action from a Java project. It is a simplified discoverer
 * compared to DiscoverJavaModelFromJavaProjectAndDependencies since it does not
 * compute and propose project/libraries to the end user.
 * 
 * @deprecated use
 *             org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject
 *             This class is dedicated to non reg tests
 */
@Deprecated
public class DiscoverSimpleJavaModelFromJavaProject extends DefaultDiscoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * A parameter key for indicating to work with incremental mode
	 */
	public static final DiscoveryParameter PARAMETER_INCREMENTAL_MODE = new DiscoveryParameterImpl(
			"PARAMETER_INCREMENTAL_MODE", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = true;
		}
		return result;
	}

	/**
	 * Discovers a Java model.
	 * 
	 * @param source
	 *            a {@link IJavaProject} instance
	 * @param parameters
	 *            possible keys are :
	 *            {@link DefaultDiscoverer#PARAMETER_SILENT_MODE}
	 *            {@link DiscoverSimpleJavaModelFromJavaProject#PARAMETER_INCREMENTAL_MODE}
	 *            {@link DefaultDiscoverer#PARAMETER_TARGET_RESOURCE}
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		final boolean isIncremental;
		if (parameters != null) {
			isIncremental = Boolean.TRUE.equals(parameters
					.get(DiscoverSimpleJavaModelFromJavaProject.PARAMETER_INCREMENTAL_MODE));
		} else {
			isIncremental = false;
		}

		setResourceResult(null);

		final IJavaProject project = (IJavaProject) source;
		final IPath path = project.getProject().getFullPath().addTrailingSeparator()
				.append(project.getElementName()).addFileExtension("javaxmi"); //$NON-NLS-1$

		// discovering
		Job job = new Job("Discovering Java model") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = null;
				monitor.beginTask("", IProgressMonitor.UNKNOWN); //$NON-NLS-1$
				try {
					URI sourceURI = URI.createPlatformResourceURI(path.toString(), true);
					Resource resource = getResource("", project); //$NON-NLS-1$

					Model model = getEFactory().createModel();
					resource.getContents().add(model);
					IModelReader reader = getJavaReader(isIncremental);
					reader.readModel(project, model, monitor);

					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
						return result;
					}
					reader.terminate(monitor);
					saveResource(sourceURI, path, resource, monitor);

					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
						return result;
					}
					result = Status.OK_STATUS;
					DiscoverSimpleJavaModelFromJavaProject.this.setResourceResult(resource);
				} catch (Exception e) {
					result = Status.CANCEL_STATUS;
					IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
							"Unknown error.", e); //$NON-NLS-1$
					JavaActivator.getDefault().getLog().log(status);
				} finally {
					monitor.done();
					try {
						// refresh the folder
						project.getCorrespondingResource().refreshLocal(IResource.DEPTH_ONE,
								new NullProgressMonitor());
						if (monitor.isCanceled()) {
							// if monitor is canceled, delete the model file
							IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
							IFile ifile = root.getFileForLocation(path);
							if (ifile.exists()) {
								ifile.delete(true, new NullProgressMonitor());
							}
						}
					} catch (Exception e1) {
						IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
								e1.getMessage(), e1);
						JavaActivator.getDefault().getLog().log(status);
					}
					if (DiscoverSimpleJavaModelFromJavaProject.this.getResourceResult() != null) {
						terminate(DiscoverSimpleJavaModelFromJavaProject.this.getResourceResult());
					}
				}
				return result;
			}
		};

		scheduleEditorOpening(ResourcesPlugin.getWorkspace().getRoot().getFile(path), job,
				parameters);

		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID, e.getMessage(), e);
			JavaActivator.getDefault().getLog().log(status);
		}

		if (parameters != null) {
			parameters.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE, getResourceResult());
		}
	}

	protected void terminate(final Resource resource) {
		// Nothing
	}

	protected JavaReader getJavaReader(final boolean isIncremental) {
		return new JavaReader(getEFactory(), isIncremental);
	}

	@Override
	public String toString() {
		return "Java Discoverer"; //$NON-NLS-1$
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverSimpleJavaModelFromJavaProject.parametersKeys == null) {
			DiscoverSimpleJavaModelFromJavaProject.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverSimpleJavaModelFromJavaProject.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverSimpleJavaModelFromJavaProject.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverSimpleJavaModelFromJavaProject.parametersKeys
					.add(DiscoverSimpleJavaModelFromJavaProject.PARAMETER_INCREMENTAL_MODE);
		}
		return DiscoverSimpleJavaModelFromJavaProject.parametersKeys;
	}

}
