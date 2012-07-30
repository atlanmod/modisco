/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.workflow.internal.engine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.generator.GenerateDiscoverer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;

/**
 * The aim of this class is to create a discoverer plug-in project It create all
 * of plug-in file such as "plugin.xml", "Manifest.mf", "build.properties"...
 * 
 * @author Nicolas Payneau
 * @deprecated
 */
@Deprecated
public class CreatePluginProject {

	private final IProject project;
	private final IJavaProject javaProject;
	private IPackageFragmentRoot sourceFolder;
	
	/**
	 * Constructor
	 * 
	 * @param projectName
	 *            Name of project
	 */
	public CreatePluginProject(final String symbolicName, final String packageBase, final WorkflowModel workflowModel) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		this.project = root.getProject(symbolicName);
		if (!this.project.exists()) {
			// project.delete(true, true, new NullProgressMonitor());
			this.project.create(null);

		}
		this.project.open(null);
		this.javaProject = JavaCore.create(this.project);
		IFolder binFolder = createBinFolder();
		setJavaNature();
		this.javaProject.setRawClasspath(new IClasspathEntry[0], null);
		createOutputFolder(binFolder);
		addSystemLibraries();

		createPackage(packageBase);
		this.sourceFolder.createPackageFragment(packageBase, false, null);
		this.sourceFolder.createPackageFragment(packageBase
				+ ".actions", false, null); //$NON-NLS-1$
		this.sourceFolder.createPackageFragment(packageBase
				+ ".modiscoworks", false, null); //$NON-NLS-1$
		createMetaInfFolder();
		// Save the resource in the plugin
		URI uri = URI.createPlatformResourceURI(this.project.getFullPath().append(
						symbolicName).addFileExtension(
						Constants.extensionMoDiscoWorkflow).toString(), true);
		workflowModel.exportWorkflow(uri);
		createDiscovererFiles(uri);

		// Refresh
		//this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
					IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	/**
	 * This method allows to generate the JAVA plug-in discoverer
	 */
	private void createDiscovererFiles(final URI modelUri) {
		GenerateDiscoverer gen;
		try {
			List<String> arguments = new ArrayList<String>();
			File fileResource = this.project.getWorkspace().getRoot()
					.getLocation().append(this.project.getName()).toFile();
			gen = new GenerateDiscoverer(modelUri, fileResource,
					arguments);
			gen.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	public IJavaProject getJavaProject() {
		return this.javaProject;
	}

	public void populateSourceFolder(final File src) throws CoreException {
		if (this.sourceFolder == null) {
			this.sourceFolder = createSourceFolder();
		}
		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	public IPackageFragment createPackage(final String name)
			throws CoreException {
		if (this.sourceFolder == null) {
			this.sourceFolder = createSourceFolder();
		}
		return this.sourceFolder.createPackageFragment(name, false, null);
	}

	public IType createType(final IPackageFragment pack, final String cuName,
			final String source) throws JavaModelException {
		StringBuffer buf = new StringBuffer();
		buf.append("package " + pack.getElementName() + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
		buf.append("\n"); //$NON-NLS-1$
		buf.append(source);
		ICompilationUnit cu = pack.createCompilationUnit(cuName,
				buf.toString(), false, null);
		return cu.getTypes()[0];
	}

	public void dispose() throws CoreException {
		this.project.delete(true, true, null);
		this.project.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private final IFolder createBinFolder() throws CoreException {
		IFolder binFolder = this.project.getFolder("bin"); //$NON-NLS-1$
		if (!binFolder.exists()) {
			binFolder.create(false, true, null);
		}
		return binFolder;
	}

	private final IFolder createMetaInfFolder() throws CoreException {
		IFolder metaInfFolder = this.project.getFolder("META-INF"); //$NON-NLS-1$
		if (!metaInfFolder.exists()) {
			metaInfFolder.create(false, true, null);
		}
		return metaInfFolder;
	}

	private final void setJavaNature() throws CoreException {
		IProjectDescription description = this.project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		this.project.setDescription(description, null);
	}

	private final void createOutputFolder(final IFolder binFolder)
			throws JavaModelException {
		IPath outputLocation = binFolder.getFullPath();
		this.javaProject.setOutputLocation(outputLocation, null);
	}

	private final IPackageFragmentRoot createSourceFolder()
			throws CoreException {
		IFolder folder = this.project.getFolder("src"); //$NON-NLS-1$
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
		IPackageFragmentRoot root = this.javaProject
				.getPackageFragmentRoot(folder);

		IClasspathEntry[] oldEntries = this.javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
		this.javaProject.setRawClasspath(newEntries, null);
		return root;
	}

	private final void addSystemLibraries() throws JavaModelException {
		IClasspathEntry[] oldEntries = this.javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		this.javaProject.setRawClasspath(newEntries, null);
	}

}
