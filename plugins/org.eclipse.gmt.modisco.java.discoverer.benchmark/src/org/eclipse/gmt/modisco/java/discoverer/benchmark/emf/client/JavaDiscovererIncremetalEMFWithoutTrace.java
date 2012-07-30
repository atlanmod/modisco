/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.gmt.modisco.java.internal.actions.DiscoverSimpleJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.io.java.JavaReader;
import org.eclipse.jdt.core.IJavaProject;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component
 */
@Deprecated
@SuppressWarnings("deprecation")
public class JavaDiscovererIncremetalEMFWithoutTrace extends DiscoverSimpleJavaModelFromJavaProject {

	@Override
	public Resource getResource(final String resourceName, final IJavaProject javaProject) {
		String resourceName2 = resourceName + System.currentTimeMillis()
				+ "." + DefaultDiscoverer.JAVA_FILE_EXTENSION; //$NON-NLS-1$
		URI uri = URI.createPlatformResourceURI(javaProject.getProject().getName()
				+ "/" + resourceName2, true); //$NON-NLS-1$

		IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"Resource uri=" + uri.toString()); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status);
		ResourceSet resourceSet = new ResourceSetImpl();
		return resourceSet.createResource(uri);
	}

	@Override
	public void saveResource(final URI target, final IPath path, final Resource resource,
			final IProgressMonitor monitor) throws IOException {
		resource.save(new HashMap<String, String>());
	}

	@Override
	protected JavaReader getJavaReader(final boolean isIncremental) {
		return new JavaReader(getEFactory(), true);
	}
}
