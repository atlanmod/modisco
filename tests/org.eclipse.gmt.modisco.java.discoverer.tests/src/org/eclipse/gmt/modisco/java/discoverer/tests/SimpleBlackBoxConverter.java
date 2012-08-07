/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 378965 - Tests disabled due to EMF Compare API change
 */

package org.eclipse.gmt.modisco.java.discoverer.tests;

import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.java.actions.TranslateJavaModelToKdm;
import org.eclipse.gmt.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.modisco.common.tests.TestModelUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * To test conversion of java model to kdm model.
 *
 *
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class SimpleBlackBoxConverter {
	// To be able to export reference model after a change in atl transformation
	private final boolean export = false;

	private final String referencesFolderPath = "/references/"; //$NON-NLS-1$
	private final String javaModelExtension = ".javaxmi"; //$NON-NLS-1$
	private final String kdmModelExtension = ".kdm"; //$NON-NLS-1$
	private final String projectName = "test001"; //$NON-NLS-1$

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
	@Ignore
	// @Ignore : FIXME TestModelUtils#compareModels must be rewritten for EMF Compare 2.0
	public void testConversionOfJavaModelToKdmModel() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);
		basicConversionOfJavaModelToKdmModel(outputUri);
	}

	private void basicConversionOfJavaModelToKdmModel(final URI outputUri) {
		Assert.assertNotNull(this.javaProjectFactory);
		/*
		 * load the java model from references
		 */
		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.projectName + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);
		try {
			final TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
			final Resource output = kdmTranslater
					.getKDMModelFromJavaModelWithCustomTransformation(
							javaReferenceUri, outputUri);
			Assert.assertNotNull(output);

			/*
			 * Because everything looks great, well we have to test model
			 * content. In details we will compare current resource with a
			 * reference (checked manually)
			 */
			String referencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.projectName + this.kdmModelExtension; //$NON-NLS-1$
			URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
			Assert.assertNotNull(referenceUri);
			Resource referenceModel = ModelUtils.loadModel(referenceUri);
			Assert.assertNotNull(referenceModel);
			boolean result = TestModelUtils.compareModels(output,
					referenceModel, true);

			if (this.export) {
				output.setURI(URI
						.createFileURI("c:/referenceModel" + this.kdmModelExtension)); //$NON-NLS-1$
				output.save(null);
			}
			Assert.assertTrue("Comparison of UML models has failed !", result); //$NON-NLS-1$

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	// @Ignore : FIXME TestModelUtils#compareModels must be rewritten for EMF Compare 2.0
	public void testValidationOfKdmModelConvertedFromJavaModel() {
		try {
			/*
			 * prepare the target ... we have to create an empty project into
			 * the workspace with a real uri for atl extraction.
			 */
			final String outputPath = this.projectName + "/ConversionValidated"//$NON-NLS-1$
					+ this.kdmModelExtension;
			final URI outputUri = URI.createPlatformResourceURI(outputPath,
					false);
			Assert.assertNotNull(outputUri);
			basicConversionOfJavaModelToKdmModel(outputUri);

			final Resource outputModel = ModelUtils.loadModel(outputUri);
			Assert.assertNotNull(outputModel);

			Diagnostician diagnostician = new Diagnostician();
			BasicDiagnostic diagnosticChain = new BasicDiagnostic();
			/*
			 * For one of the root object, we expect a failure in validation,
			 * with two errors (one for System.out field which have no type, and
			 * one for a parameterized type which have currently no type, ie.
			 * which is a wildcard.
			 */
			for (EObject eObject : outputModel.getContents()) {
				boolean result = diagnostician.validate(eObject,
						diagnosticChain);
				if (!result) {
					Assert.assertNotNull(diagnosticChain);
					List<Diagnostic> diagnostics = diagnosticChain
							.getChildren();
					Assert.assertNotNull(diagnostics);
					Assert.assertEquals(2, diagnostics.size());
				}
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
