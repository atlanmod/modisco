/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.gmt.modisco.java.internal.actions.DiscoverSimpleJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.io.java.JavaReader;
import org.eclipse.jdt.core.IJavaProject;

import com.ibm.icu.text.SimpleDateFormat;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component
 */
@Deprecated
@SuppressWarnings("deprecation")
public class DiscoverJavaModelFromJavaProjectEMFStat extends DiscoverSimpleJavaModelFromJavaProject {

	public static final int MEGA_BYTES = 1024;
	private static final int BUFFER_SIZE = 10000;
	public static final String STORAGE_KIND = "STORAGE_KIND"; //$NON-NLS-1$
	public static final String JAVA_PROJECT_NAME = "JAVA_PROJECT_NAME"; //$NON-NLS-1$
	public static final String DISCOVERER_CLASS_NAME = "DISCOVERER_CLASS_NAME"; //$NON-NLS-1$
	public static final String DISCOVERY_DATE = "DISCOVERY_DATE"; //$NON-NLS-1$
	public static final String XMX = "XMX"; //$NON-NLS-1$
	public static final String MM_VARIANT = "MM_VARIANT"; //$NON-NLS-1$
	public static final String ALGO_VARIANT = "ALGO_VARIANT"; //$NON-NLS-1$

	private Statistics statistics;
	private IJavaProject javaProject;
	private IProject statProject;

	@Override
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Map<DiscoveryParameter, Object> localParameters = new HashMap<DiscoveryParameter, Object>();
		localParameters.putAll(parameters);
		localParameters.put(DefaultDiscoverer.PARAMETER_BROWSE_RESULT, new Boolean(false));
		localParameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(true));
		this.javaProject = (IJavaProject) source;
		getStatistics().getProperties().put(
				DiscoverJavaModelFromJavaProjectEMFStat.JAVA_PROJECT_NAME,
				this.javaProject.getElementName());
		getStatistics().getProperties().put(
				DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERER_CLASS_NAME,
				this.getClass().getName());
		getStatistics().getProperties().put(DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERY_DATE,
				new Date().toString());
		getStatistics().getProperties().putAll(getProperties());
		getStatistics().begin();
		super.discoverElement(source, localParameters);
		getStatistics().end();
	}

	@Override
	public void saveResource(final URI target, final IPath path, final Resource resource,
			final IProgressMonitor monitor) throws IOException {
		if (getStatistics() != null) {
			getStatistics().beginSave();
		}
		Map<Object, Object> optionMap = new HashMap<Object, Object>();
		optionMap.put(XMLResource.OPTION_FLUSH_THRESHOLD,
				DiscoverJavaModelFromJavaProjectEMFStat.BUFFER_SIZE);
		optionMap.put(XMLResource.OPTION_USE_FILE_BUFFER, true);
		monitor.subTask("Saving model"); //$NON-NLS-1$
		if (target != null) {
			resource.setURI(target);
		} else {
			URI uri = URI.createPlatformResourceURI(path.toString(), true);
			resource.setURI(uri);
		}
		resource.save(optionMap);
		if (getStatistics() != null) {
			getStatistics().endSave();
		}
	}

	@Override
	public Resource getResource(final String resourceName, final IJavaProject javaProjectParam) {
		Status status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"Resource name=" + javaProjectParam.getElementName() + "_" //$NON-NLS-1$ //$NON-NLS-2$
						+ System.currentTimeMillis());
		Activator.getDefault().getLog().log(status);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("file:///" //$NON-NLS-1$
				+ javaProjectParam.getProject().getLocation().toString() + "/" //$NON-NLS-1$
				+ resourceName + ".javaxmi")); //$NON-NLS-1$
		return resource;
	}

	protected Properties getProperties() {
		Properties properties = new Properties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.STORAGE_KIND, "XMI"); //$NON-NLS-1$
		return properties;
	}

	@Override
	protected JavaReader getJavaReader(final boolean isIncremental) {
		JavaReaderEMFStat javaReader = new JavaReaderEMFStat(getEFactory(), false);
		javaReader.setStatistics(getStatistics());
		return javaReader;
	}

	public void setStatProject(final IProject statProject) {
		this.statProject = statProject;
	}

	protected IProject getStatProject() {
		if (this.statProject == null) {
			File projectFile = Statistics.getDefaultStatProject(getProject()).getLocation()
					.toFile();
			this.statProject = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectFile.getName());
		}
		return this.statProject;
	}

	protected Statistics getStatistics() {
		if (this.statistics == null) {
			File statProjectFile = getStatProject().getLocation().toFile();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
			this.statistics = Statistics
					.getStatistics(
							getProject().getName() + "_" + formatter.format(System.currentTimeMillis()), statProjectFile); //$NON-NLS-1$
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.JAVA_PROJECT_NAME,
					getProject().getName());
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERER_CLASS_NAME,
					this.getClass().getName());
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERY_DATE, new Date().toString());
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.XMX,
					Runtime.getRuntime().maxMemory()
							/ DiscoverJavaModelFromJavaProjectEMFStat.MEGA_BYTES
							/ DiscoverJavaModelFromJavaProjectEMFStat.MEGA_BYTES + "Mo"); //$NON-NLS-1$
		}
		return this.statistics;
	}

	public IProject getProject() {
		return this.javaProject.getProject();
	}
}
