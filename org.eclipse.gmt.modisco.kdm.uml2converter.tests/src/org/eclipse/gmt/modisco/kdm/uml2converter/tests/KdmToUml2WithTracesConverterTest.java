/*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.uml2converter.tests;

import java.io.IOException;

import junit.framework.Assert;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.modisco.common.tests.TestModelUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabriel Barbier
 *
 *
 * @deprecated use matching org.eclipse.modisco.x.y.z component, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class KdmToUml2WithTracesConverterTest {
	// To be able to export reference model after a change in atl transformation
	private final boolean export = false;

	private final String referenceFolderPath = "/reference/"; //$NON-NLS-1$
	private final String sourceFolderPath = "/source/"; //$NON-NLS-1$
	private final String modelName = "test001"; //$NON-NLS-1$

	private final String umlModelExtension = ".uml"; //$NON-NLS-1$
	private final String kdmModelExtension = ".kdm"; //$NON-NLS-1$

	private AtlProjectFactory projectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.projectFactory = new AtlProjectFactory(this.getClass().getSimpleName());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.projectFactory != null) {
			this.projectFactory.dispose();
		}
	}

	@Test
	public void testKdmToUmlConverter() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectFactory.getProject().getName() + "/BasicConversion"//$NON-NLS-1$
				+ this.umlModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);
		basicKdmToUmlConverter(outputUri);
	}

	private final void basicKdmToUmlConverter(final URI outputUri) {
		/*
		 * first, create an empty project into the workspace, then, convert the
		 * kdm model into uml model using converter, finally, compare the result
		 * with a reference uml model.
		 */
		try {
			/*
			 * load the source model ...
			 */
			final String sourcePath = "/" + Activator.PLUGIN_ID + this.sourceFolderPath + this.modelName //$NON-NLS-1$
					+ this.kdmModelExtension;
			final URI sourceUri = URI.createPlatformPluginURI(sourcePath, true);
			/*
			 * initialize the converter ...
			 */

			Resource output = basicConvertKDMModel(sourceUri, outputUri);

			/*
			 * Because everything looks great, well we have to test model
			 * content. In details we will compare current resource with a
			 * reference (checked manually)
			 */
			final String referencePath = "/" + Activator.PLUGIN_ID + this.referenceFolderPath //$NON-NLS-1$
					+ this.modelName + this.umlModelExtension;
			final URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
			Assert.assertNotNull(referenceUri);
			final Resource referenceModel = ModelUtils.loadModel(referenceUri);
			Assert.assertNotNull(referenceModel);

			// bug 327643 workaround : .uml reload from xmi rather than direct
			// atl output use
			if (output.getResourceSet() != null) {
				output.getResourceSet().getResources().remove(output);
			}
			output = ModelUtils.loadModel(output.getURI());

			Assert.assertTrue(TestModelUtils.compareModels(output, referenceModel, true));

			if (this.export) {
				output.setURI(URI.createFileURI("c:/referenceModel" + this.umlModelExtension)); //$NON-NLS-1$
				output.save(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Transformation of kdm model into uml model shall not produce errors!"); //$NON-NLS-1$
		}
	}

	// TODO this tests fails
	// @Test
	// public void testValidationOfConvertedUmlModel() {
	// /*
	// * prepare the target ... we have to create an empty project into the
	// * workspace with a real uri for atl extraction.
	// */
	//		final String outputPath = projectFactory.getProject().getName() + "/ConvertedValidated" //$NON-NLS-1$
	// + this.umlModelExtension;
	// final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
	// Assert.assertNotNull(outputUri);
	//
	// this.basicKdmToUmlConverter(outputUri);
	// Resource outputModel;
	// try {
	// outputModel = ModelUtils.load(outputUri);
	// Assert.assertNotNull(outputModel);
	// Diagnostician diagnostician = new Diagnostician();
	// for (EObject eObject : outputModel.getContents()) {
	// boolean result = diagnostician.validate(eObject, (DiagnosticChain) null);
	// Assert.assertTrue(result);
	// }
	// } catch (IOException e) {
	// Assert.fail(e.getMessage());
	// }
	//
	// }

	@Test
	public void testKdmSourceToUmlConverter_bug315355() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectFactory.getProject().getName()
				+ "/BasicKdmSourceConversion"//$NON-NLS-1$
				+ this.umlModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);
		basicKdmSourceToUmlConverter_bug315355(outputUri);
	}

	private final void basicKdmSourceToUmlConverter_bug315355(final URI outputUri) {
		/*
		 * first, create an empty project into the workspace, then, convert the
		 * kdm model into uml model using converter, finally, compare the result
		 * with a reference uml model.
		 */
		try {
			/*
			 * load the source model ...
			 */
			final String sourcePath = "/" + Activator.PLUGIN_ID + this.sourceFolderPath + this.modelName //$NON-NLS-1$
					+ "_Source" + this.kdmModelExtension; //$NON-NLS-1$
			final URI sourceUri = URI.createPlatformPluginURI(sourcePath, true);

			Resource output = basicConvertKDMModel(sourceUri, outputUri);

			/*
			 * Because everything looks great, well we have to test model
			 * content. In details we will compare current resource with a
			 * reference (checked manually)
			 */
			final String referencePath = "/" + Activator.PLUGIN_ID + this.referenceFolderPath //$NON-NLS-1$
					+ this.modelName + "_Source" + this.umlModelExtension; //$NON-NLS-1$
			final URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
			Assert.assertNotNull(referenceUri);
			final Resource referenceModel = ModelUtils.loadModel(referenceUri);
			Assert.assertNotNull(referenceModel);

			// 327643 : temporary .uml ref copy for hudson debugging
			referenceModel.setURI(output.getURI().appendFileExtension("ref.uml"));
			referenceModel.save(null);
			// end temporary

			// 327643 : temporary .uml reload from xmi for hudson strange
			// behavior
			if (output.getResourceSet() != null) {
				output.getResourceSet().getResources().remove(output);
			}
			output = ModelUtils.loadModel(output.getURI());
			// end temporary

			Assert.assertTrue(TestModelUtils.compareModels(output, referenceModel, true));

			if (this.export) {
				output.setURI(URI.createFileURI("c:/referenceModel" + this.umlModelExtension)); //$NON-NLS-1$
				output.save(null);
			}
		} catch (Exception e) {
			throw new RuntimeException(
					"Transformation of kdm model into uml model shall not produce errors!", e);//$NON-NLS-1$
		}
	}

	private Resource basicConvertKDMModel(final URI sourceUri, final URI outputUri)
			throws IOException, ATLCoreException {
		Assert.assertNotNull(sourceUri);
		final Resource sourceModel = ModelUtils.loadModel(sourceUri);
		Assert.assertNotNull(sourceModel);
		/*
		 * initialize the converter ...
		 */
		final KdmToUmlConverter converter = new KdmtoUmlConverterImpl();
		Assert.assertNotNull(converter);

		Resource[] out = converter.getUML2ModelFromKDMModel(sourceModel, true, outputUri);
		Assert.assertNotNull(out);
		Assert.assertEquals(2, out.length);
		Resource output = out[0];
		Assert.assertNotNull(output);

		return output;
	}

	@Test
	public void testValidationOfConvertedSourceUmlModel() {

		final String outputPath = this.projectFactory.getProject().getName()
				+ "/ConvertedSourceValidated" //$NON-NLS-1$
				+ this.umlModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);

		try {
			final String sourcePath = "/" + Activator.PLUGIN_ID + this.sourceFolderPath + this.modelName //$NON-NLS-1$
					+ "_Source" + this.kdmModelExtension; //$NON-NLS-1$
			final URI sourceUri = URI.createPlatformPluginURI(sourcePath, true);

			basicConvertKDMModel(sourceUri, outputUri);
		} catch (Exception e) {
			throw new RuntimeException(
					"Transformation of kdm model into uml model shall not produce errors!", e);//$NON-NLS-1$
		}

		Resource outputModel;
		try {
			outputModel = ModelUtils.loadModel(outputUri);
			Assert.assertNotNull(outputModel);
			Diagnostician diagnostician = new Diagnostician();
			for (EObject eObject : outputModel.getContents()) {
				boolean result = diagnostician.validate(eObject, (DiagnosticChain) null);
				Assert.assertTrue(result);
			}
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}

	}

	@Test
	public void testKdmToUmlConverter_bug318638() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectFactory.getProject().getName() + "/BasicConversion"//$NON-NLS-1$
				+ this.umlModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);

		final String modelNameForBug = "Bug_318638";
		try {
			/*
			 * load the source model ...
			 */
			final String sourcePath = "/" + Activator.PLUGIN_ID + this.sourceFolderPath //$NON-NLS-1$
					+ modelNameForBug + this.kdmModelExtension;
			final URI sourceUri = URI.createPlatformPluginURI(sourcePath, true);
			/*
			 * initialize the converter ...
			 */

			Resource output = basicConvertKDMModel(sourceUri, outputUri);

			/*
			 * Because everything looks great, well we have to test model
			 * content. In details we will compare current resource with a
			 * reference (checked manually)
			 */
			final String referencePath = "/" + Activator.PLUGIN_ID + this.referenceFolderPath //$NON-NLS-1$
					+ modelNameForBug + this.umlModelExtension;
			final URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
			Assert.assertNotNull(referenceUri);
			final Resource referenceModel = ModelUtils.loadModel(referenceUri);
			Assert.assertNotNull(referenceModel);

			// bug 327643 workaround : .uml reload from xmi rather than direct
			// atl output use
			if (output.getResourceSet() != null) {
				output.getResourceSet().getResources().remove(output);
			}
			output = ModelUtils.loadModel(output.getURI());

			Assert.assertTrue(TestModelUtils.compareModels(output, referenceModel, true));

			if (this.export) {
				output.setURI(URI.createFileURI("c:/referenceModel" + this.umlModelExtension)); //$NON-NLS-1$
				output.save(null);
			}
		} catch (Exception e) {
			Assert.fail("Transformation of kdm model into uml model shall not produce errors!"); //$NON-NLS-1$
		}
	}
}
