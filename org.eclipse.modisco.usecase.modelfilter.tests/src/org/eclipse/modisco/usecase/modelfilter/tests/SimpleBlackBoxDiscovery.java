/*
 * Copyright (c) 2010, 2015  Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 468346 - [Unit Test Failure] org.eclipse.modisco.usecase.modelfilter.tests.SimpleBlackBoxDiscovery.testUmlModelFromJavaProjectWithReferenceModel
 *    Grégoire Dupé (Mia-Software) - Bug 470806 - [Deprecated] org.eclipse.gmt.modisco.usecase.modelfilter
 */

package org.eclipse.modisco.usecase.modelfilter.tests;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.common.tests.TestModelUtils;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.usecase.modelfilter.DiscoverUmlModelWithRealTypesFromJavaProject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * @author Gabriel Barbier
 *
 */
public class SimpleBlackBoxDiscovery {
	// To be able to export reference model after a change in java discovery
	private static final boolean EXPORT = false;

	private static final String ROOT_SOURCES_PATH = "/workspace/"; //$NON-NLS-1$
	private static final String REF_FOLDER_PATH = "/references/"; //$NON-NLS-1$
	private static final String UML_MODEL_EXT = ".uml"; //$NON-NLS-1$
	private static final String PROJECT_NAME = "RealTypesExample"; //$NON-NLS-1$

	private JavaProjectFactory javaPrjFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.javaPrjFactory = new JavaProjectFactory(PROJECT_NAME);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.javaPrjFactory != null) {
			this.javaPrjFactory.dispose();
		}
	}

	@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474705
	@Test
	public void testUmlModelDiscoveryFromJavaProject() throws CoreException,
			IOException, DiscoveryException {
		Assert.assertNotNull(this.javaPrjFactory);
		final IJavaProject javaProject = this.javaPrjFactory.getJavaProject();
		Assert.assertNotNull(javaProject);
		final String sourceFolderPath = ROOT_SOURCES_PATH + PROJECT_NAME
				+ "/src"; //$NON-NLS-1$
		final URL src = Activator.getDefault().getBundle()
				.getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaPrjFactory.populateSourceFolder(sourceFolderPath);
		final DiscoverUmlModelWithRealTypesFromJavaProject discoverer = new DiscoverUmlModelWithRealTypesFromJavaProject();
		Assert.assertNotNull(discoverer);
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		final Resource output = discoverer.getTargetModel();
		Assert.assertNotNull(output);
		if (EXPORT) {
			final Bundle bundle = Activator.getDefault().getBundle();
			final String uriStr = String.format(
					"platform:/meta/%s/referenceModel%s", //$NON-NLS-1$
					bundle.getSymbolicName(),
					UML_MODEL_EXT);
			final URI uri = URI.createURI(uriStr);
			output.setURI(uri);
			output.save(null);
		}
	}

	@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468346
	@Test
	public void testUmlModelFromJavaProjectWithReferenceModel()
			throws CoreException, IOException, InterruptedException,
			DiscoveryException {
		Assert.assertNotNull(this.javaPrjFactory);
		final IJavaProject javaProject = this.javaPrjFactory.getJavaProject();
		Assert.assertNotNull(javaProject);
		final String sourceFolderPath = ROOT_SOURCES_PATH + PROJECT_NAME
				+ "/src"; //$NON-NLS-1$
		final URL src = Activator.getDefault().getBundle()
				.getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaPrjFactory.populateSourceFolder(sourceFolderPath);
		final DiscoverUmlModelWithRealTypesFromJavaProject discoverer = new DiscoverUmlModelWithRealTypesFromJavaProject();
		Assert.assertNotNull(discoverer);
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		final Resource output = discoverer.getTargetModel();
		Assert.assertNotNull(output);
		/*
		 * Because everything looks great, well we have to test model
		 * content. In details we will compare current resource with a
		 * reference (checked manually)
		 *
		 * Warning, because the java model store the "filepath" of
		 * discovered java code, the compilation units elements could not be
		 * the same !!!!
		 */
		final String referencePath = "/" + Activator.PLUGIN_ID + REF_FOLDER_PATH + PROJECT_NAME //$NON-NLS-1$
				+ "RealTypes" + UML_MODEL_EXT; //$NON-NLS-1$
		final URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
		Assert.assertNotNull(referenceUri);
		final Resource referenceModel = ModelUtils.loadModel(referenceUri);
		Assert.assertNotNull(referenceModel);
		final boolean result = TestModelUtils.compareModels(output,
				referenceModel, true);
		Assert.assertTrue(
				"Comparison of Uml models with real types has failed !", result); //$NON-NLS-1$
	}

	@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474705
	@Test
	public void testValidationOfUmlModelDiscoveryFromJavaProject()
			throws DiscoveryException, CoreException {
		Assert.assertNotNull(this.javaPrjFactory);
		final IJavaProject javaProject = this.javaPrjFactory.getJavaProject();
		Assert.assertNotNull(javaProject);
		final String sourceFolderPath = ROOT_SOURCES_PATH + PROJECT_NAME
				+ "/src"; //$NON-NLS-1$
		final Bundle bundle = Activator.getDefault().getBundle();
		final URL src = bundle.getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaPrjFactory.populateSourceFolder(sourceFolderPath);
		final DiscoverUmlModelWithRealTypesFromJavaProject discoverer = new DiscoverUmlModelWithRealTypesFromJavaProject();
		Assert.assertNotNull(discoverer);
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		final Resource output = discoverer.getTargetModel();
		Assert.assertNotNull(output);
		final Diagnostician diagnostician = new Diagnostician();
		final BasicDiagnostic diagnosticChain = new BasicDiagnostic();
		for (EObject eObject : output.getContents()) {
			final boolean result = diagnostician.validate(eObject,
					(DiagnosticChain) null);
			if (!result) {
				Assert.assertNotNull(diagnosticChain);
				final List<Diagnostic> diagnostics = diagnosticChain
						.getChildren();
				Assert.assertNotNull(diagnostics);
				Assert.assertEquals(0, diagnostics.size());
			}
		}
	}
}
