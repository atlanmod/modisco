/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.usecase.modelfilter.tests;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.usecases.modelfilter.actions.DiscoverUmlModelWithRealTypesFromJavaProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.common.tests.TestModelUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabriel Barbier
 * 
 */
public class SimpleBlackBoxDiscovery {
	// To be able to export reference model after a change in java discovery
	private final boolean export = false;

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String referencesFolderPath = "/references/"; //$NON-NLS-1$
	private final String umlModelExtension = ".uml"; //$NON-NLS-1$
	private final String projectName = "RealTypesExample"; //$NON-NLS-1$

	private JavaProjectFactory javaProjectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.javaProjectFactory = new JavaProjectFactory(this.projectName);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.javaProjectFactory != null) {
			this.javaProjectFactory.dispose();
		}
	}

	@Test
	public void testUmlModelDiscoveryFromJavaProject() {
		Assert.assertNotNull(this.javaProjectFactory);

		try {

			IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
			Assert.assertNotNull(javaProject);

			String sourceFolderPath = this.rootSourcesPath + this.projectName
					+ "/src"; //$NON-NLS-1$
			URL src = Activator.getDefault().getBundle()
					.getEntry(sourceFolderPath);
			Assert.assertNotNull(src);
			this.javaProjectFactory.populateSourceFolder(sourceFolderPath);

			DiscoverUmlModelWithRealTypesFromJavaProject discoverer = new DiscoverUmlModelWithRealTypesFromJavaProject();
			Assert.assertNotNull(discoverer);
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(discoverer.getSilentModeParameter(), Boolean.TRUE);
			discoverer.discoverElement(javaProject, parameters);
			Resource output = (Resource) parameters.get(discoverer
					.getTargetModelParameter());
			Assert.assertNotNull(output);

			if (this.export) {
				output.setURI(URI
						.createFileURI("c:/referenceModel" + this.umlModelExtension)); //$NON-NLS-1$
				output.save(null);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testUmlModelFromJavaProjectWithReferenceModel() {
		Assert.assertNotNull(this.javaProjectFactory);
		try {
			IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
			Assert.assertNotNull(javaProject);

			String sourceFolderPath = this.rootSourcesPath + this.projectName
					+ "/src"; //$NON-NLS-1$
			URL src = Activator.getDefault().getBundle()
					.getEntry(sourceFolderPath);
			Assert.assertNotNull(src);
			this.javaProjectFactory.populateSourceFolder(sourceFolderPath);

			DiscoverUmlModelWithRealTypesFromJavaProject discoverer = new DiscoverUmlModelWithRealTypesFromJavaProject();
			Assert.assertNotNull(discoverer);
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(discoverer.getSilentModeParameter(), Boolean.TRUE);
			discoverer.discoverElement(javaProject, parameters);
			Resource output = (Resource) parameters.get(discoverer
					.getTargetModelParameter());
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
			String referencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.projectName //$NON-NLS-1$ 
					+ "RealTypes" + this.umlModelExtension; //$NON-NLS-1$
			URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
			Assert.assertNotNull(referenceUri);
			Resource referenceModel = ModelUtils.loadModel(referenceUri);
			Assert.assertNotNull(referenceModel);
			boolean result = TestModelUtils.compareModels(output,
					referenceModel, true);
			Assert.assertTrue(
					"Comparison of Uml models with real types has failed !", result); //$NON-NLS-1$
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testValidationOfUmlModelDiscoveryFromJavaProject() {
		Assert.assertNotNull(this.javaProjectFactory);

		try {

			IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
			Assert.assertNotNull(javaProject);

			String sourceFolderPath = this.rootSourcesPath + this.projectName
					+ "/src"; //$NON-NLS-1$
			URL src = Activator.getDefault().getBundle()
					.getEntry(sourceFolderPath);
			Assert.assertNotNull(src);
			this.javaProjectFactory.populateSourceFolder(sourceFolderPath);

			DiscoverUmlModelWithRealTypesFromJavaProject discoverer = new DiscoverUmlModelWithRealTypesFromJavaProject();
			Assert.assertNotNull(discoverer);
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(discoverer.getSilentModeParameter(), Boolean.TRUE);
			discoverer.discoverElement(javaProject, parameters);
			Resource outputModel = (Resource) parameters.get(discoverer
					.getTargetModelParameter());
			Assert.assertNotNull(outputModel);

			Diagnostician diagnostician = new Diagnostician();
			BasicDiagnostic diagnosticChain = new BasicDiagnostic();
			for (EObject eObject : outputModel.getContents()) {
				boolean result = diagnostician.validate(eObject,
						(DiagnosticChain) null);
				if (result == false) {
					Assert.assertNotNull(diagnosticChain);
					List<Diagnostic> diagnostics = diagnosticChain
							.getChildren();
					Assert.assertNotNull(diagnostics);
					Assert.assertEquals(0, diagnostics.size());
				}
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
