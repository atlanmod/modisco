/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.internal.actions.DiscoverSimpleJavaModelFromJavaProject;
import org.eclipse.jdt.core.IJavaProject;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
@SuppressWarnings("deprecation")
public class ModelElementStats extends DiscoverSimpleJavaModelFromJavaProject {

	private final HashMap<Class<?>, Long> modelElementStat = new HashMap<Class<?>, Long>();
	private PrintStream ps;

	@Override
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		super.discoverElement(source, parameters);
		Resource resource = (Resource) parameters
				.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
		getModelElementStats(resource);
		initPS((IJavaProject) source);
		print((IJavaProject) source);
	}

	private void print(final IJavaProject javaProject) {
		Iterator<Class<?>> classes = this.modelElementStat.keySet().iterator();
		while (classes.hasNext()) {
			Class<?> eObjectClass = classes.next();
			Long nbModelElement = this.modelElementStat.get(eObjectClass);
			this.ps.println(eObjectClass.getSimpleName() + "\t" //$NON-NLS-1$
					+ nbModelElement.toString());
		}
		try {
			javaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (CoreException e) {
			Status status2 = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
					e.getMessage(), e);
			Activator.getDefault().getLog().log(status2);
		}
	}

	private void getModelElementStats(final Resource resource) {
		TreeIterator<EObject> treeIterator = resource.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();
			Class<?> eObjectClass = eObject.getClass();
			System.out.println(eObjectClass.toString());
			Long nbElement = this.modelElementStat.get(eObjectClass);
			if (nbElement != null) {
				this.modelElementStat.put(eObjectClass,
						new Long(nbElement.longValue() + 1));
			} else {
				this.modelElementStat.put(eObjectClass, new Long(1));
			}
		}
	}

	public void initPS(final IJavaProject javaProject) {
		File statisticsDir = javaProject.getProject().getLocation().toFile();
		File f = new File(statisticsDir, "modelElementStats-" //$NON-NLS-1$
				+ System.currentTimeMillis() + ".tsv"); //$NON-NLS-1$
		Status status = new Status(IStatus.INFO, JavaActivator.PLUGIN_ID,
				"Statistic file= " + f.toString()); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status);
		try {
			this.ps = new PrintStream(f);
		} catch (FileNotFoundException e) {
			Status status2 = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
					e.getMessage(), e);
			Activator.getDefault().getLog().log(status2);
		}
	}

}
