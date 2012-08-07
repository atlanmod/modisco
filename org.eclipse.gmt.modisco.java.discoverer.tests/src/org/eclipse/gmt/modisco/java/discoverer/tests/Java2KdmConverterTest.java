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
 */

package org.eclipse.gmt.modisco.java.discoverer.tests;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.actions.TranslateJavaModelToKdm;
import org.eclipse.gmt.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.ExportKind;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * To test result of java model to kdm model.
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class Java2KdmConverterTest {
	private final String referencesFolderPath = "/references/"; //$NON-NLS-1$
	private final String javaModelExtension = ".javaxmi"; //$NON-NLS-1$
	private final String kdmModelExtension = ".kdm"; //$NON-NLS-1$

	private final String projectName = "testProject"; //$NON-NLS-1$
	private final String modelName1 = "bug317835"; //$NON-NLS-1$
	private final String modelName2 = "bug318469"; //$NON-NLS-1$
	private final String modelName3 = "bug326584"; //$NON-NLS-1$
	private final String modelNameBug326944 = "bug326944"; //$NON-NLS-1$
	private final String modelNameBug318631 = "bug318631"; //$NON-NLS-1$

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

	/**
	 * bug 317835
	 */
	@SuppressWarnings("null")
	@Test
	public void testInterfaceMethodVisibility() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelName1 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		this.basicConversionOfJavaModelToKdmModel(javaReferenceUri, outputUri);

		Resource kdmModel = this.basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);

		MethodUnit mi = null;
		MethodUnit mc = null;
		Iterator<EObject> it = kdmModel.getAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof MethodUnit) {
				if (((MethodUnit) next).getName().equalsIgnoreCase(
						"aMethodWithoutVisibility")) { //$NON-NLS-1$
					mi = (MethodUnit) next;
				} else if (((MethodUnit) next).getName().equalsIgnoreCase(
						"aMethodWithoutVisibility2")) { //$NON-NLS-1$
					mc = (MethodUnit) next;
				}
			}
		}
		Assert.assertNotNull(
				"Interface1.aMethodWithoutVisibility should exist", mi); //$NON-NLS-1$
		Assert.assertNotNull(
				"Interface1.aMethodWithoutVisibility2 should exist", mc); //$NON-NLS-1$

		Assert.assertEquals(mi.getExport(), ExportKind.PUBLIC);
		Assert.assertEquals(mc.getExport(), ExportKind.PROTECTED);
	}

	/**
	 * bug 318469
	 */
	@Test
	public void testArrayAsAnnotationValue() {
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelName2 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		this.basicConversionOfJavaModelToKdmModel(javaReferenceUri, outputUri);
	}

	/**
	 * bug 326584
	 */
	@SuppressWarnings("null")
	@Test
	public void testKdmComments() {
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelName3 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		Resource kdmModel = this.basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);

		Iterator<EObject> it = kdmModel.getAllContents();
		ClassUnit cuWithJavaDoc = null;
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof ClassUnit) {
				ClassUnit cu = (ClassUnit) next;
				if (cu.getName().equalsIgnoreCase("ASimpleClassWithComments")) { //$NON-NLS-1$
					cuWithJavaDoc = cu;
				}
			}
		}
		Assert.assertNotNull(cuWithJavaDoc);
		Assert.assertFalse(cuWithJavaDoc.getComment().isEmpty());
	}

	private Resource basicConversionOfJavaModelToKdmModel(final URI inputURI,
			final URI outputUri) {
		Resource kdmModel = null;
		Assert.assertNotNull(this.javaProjectFactory);
		try {
			final TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
			kdmModel = kdmTranslater
					.getKDMModelFromJavaModelWithCustomTransformation(inputURI,
							outputUri);
			Assert.assertNotNull(kdmModel);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return kdmModel;
	}

	@Test
	public void testBug326944_JavaToKdmTransformation() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/"//$NON-NLS-1$
				+ this.modelNameBug326944 + this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelNameBug326944 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		Resource kdmModel = this.basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);
		Assert.assertNotNull(kdmModel);
	}

	@Test
	public void testBug318631_JavaToKdmTransformation() {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/"//$NON-NLS-1$
				+ this.modelNameBug318631 + this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelNameBug318631 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		Resource kdmModel = this.basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);
		Assert.assertNotNull(kdmModel);
	}
}
