/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 338874
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */

package org.eclipse.gmt.modisco.java.discoverer.tests;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.actions.TranslateJavaModelToKdm;
import org.eclipse.gmt.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.jdt.core.IJavaProject;
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
public class JavaProject2KdmTest {
	// To be able to export reference model after a change in java discovery
	private final boolean export = false;

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String javaModelExtension = ".javaxmi"; //$NON-NLS-1$
	private final String kdmModelExtension = ".kdm"; //$NON-NLS-1$

	private final String projectName = "testProject"; //$NON-NLS-1$
	private final String modelNameBug338874 = "bug338874"; //$NON-NLS-1$

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

	private Resource basicConversionOfJavaModelToKdmModel(final URI inputURI,
			final URI outputUri) {
		Resource kdmModel = null;
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		Assert.assertNotNull(this.javaProjectFactory);
		try {
			final TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
			kdmModel = kdmTranslater
					.getKDMModelFromJavaModelWithCustomTransformation(inputURI,
							outputUri);
			Assert.assertNotNull(kdmModel);

			if (this.export) {
				URI tmpUri = kdmModel.getURI();
				kdmModel.setURI(URI
						.createFileURI("c:/referenceModel" + this.kdmModelExtension)); //$NON-NLS-1$
				kdmModel.save(null);
				kdmModel.setURI(tmpUri);
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return kdmModel;
	}

	private Resource basicDiscoveryOfJavaProject(final String sourceFolderPath) {
		Resource javaModel = null;

		Assert.assertNotNull(this.javaProjectFactory);

		try {
			/*
			 * prepare the target ... we have to create an empty project into
			 * the workspace with a real uri for atl extraction. We have to fill
			 * this project with sources from our test context.
			 */
			IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
			Assert.assertNotNull(javaProject);

			URL src = Activator.getDefault().getBundle()
					.getEntry(sourceFolderPath);
			Assert.assertNotNull(src);
			this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
					Activator.getDefault());

			DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
			Assert.assertNotNull(javaDiscoverer);
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, true);
			javaDiscoverer.discoverElement(javaProject, parameters);

			javaModel = (Resource) parameters
					.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			Assert.assertNotNull(javaModel);

			if (this.export) {
				URI tmpUri = javaModel.getURI();
				javaModel
						.setURI(URI
								.createFileURI("c:/referenceModel" + this.javaModelExtension)); //$NON-NLS-1$
				javaModel.save(null);
				javaModel.setURI(tmpUri);
			}

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return javaModel;
	}

	@SuppressWarnings("null")
	@Test
	public void testBug338874_InfixExpressionWithVariables() {
		/*
		 * This bug happens when user code contains an infix expression with two
		 * variable access. In this case, java model contains everything,
		 * however corresponding kdm model lack variable access information.
		 * 
		 * To test, we will use a specific project, then we will check that
		 * leftHandSide and rightHandSide of InfixExpression are not empty.
		 */
		final String sourceFolderPath = this.rootSourcesPath
				+ this.modelNameBug338874 + "/src"; //$NON-NLS-1$

		Resource javaModel = this.basicDiscoveryOfJavaProject(sourceFolderPath);
		Assert.assertNotNull(javaModel);
		// check the InfixExpression (there is only one in this model)
		InfixExpression infixExpression = null;
		TreeIterator<EObject> iterator = javaModel.getAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof InfixExpression) {
				infixExpression = (InfixExpression) eObject;
			}
		}
		Assert.assertNotNull(infixExpression);

		Expression left = infixExpression.getLeftOperand();
		Assert.assertNotNull(left);
		Assert.assertTrue(left instanceof SingleVariableAccess);

		Expression right = infixExpression.getRightOperand();
		Assert.assertNotNull(right);
		Assert.assertTrue(right instanceof SingleVariableAccess);

		/*
		 * kdm translation
		 */
		final String outputPath = this.projectName + "/"//$NON-NLS-1$
				+ this.modelNameBug338874 + this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, true);
		Resource kdmModel = this.basicConversionOfJavaModelToKdmModel(
				javaModel.getURI(), outputUri);
		Assert.assertNotNull(kdmModel);
		// check the InfixExpression (there is only one in this model)
		ActionElement infixElement = null;
		iterator = kdmModel.getAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof ActionElement) {
				ActionElement actionElement = (ActionElement) eObject;
				if ((actionElement.getKind() != null)
						&& (actionElement.getKind().equals("infix expression"))) { //$NON-NLS-1$
					infixElement = actionElement;
				}
			}
		}
		Assert.assertNotNull(infixElement);
		Assert.assertNotNull(infixElement.getActionRelation());
		Assert.assertEquals(2, infixElement.getActionRelation().size());
		// we should test type of action relations (Reads or Addresses for
		// variable access ...)
	}
}
