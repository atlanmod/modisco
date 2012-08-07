/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.java.discoverer.tests;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.actions.DiscoveryParametersBean;
import org.eclipse.gmt.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.gmt.modisco.java.internal.util.JavaUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class ParameterizedDiscovery {

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String projectName = "test001"; //$NON-NLS-1$
	private JavaProjectFactory javaProjectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.javaProjectFactory = new JavaProjectFactory(this.projectName);
	}

	@After
	public void tearDown() throws Exception {
		if (this.javaProjectFactory != null) {
			this.javaProjectFactory.dispose();
		}
	}

	private Model getJavaModel(final Resource javaResource) {
		Model aModel = null;
		EList<EObject> i = javaResource.getContents();
		for (Iterator<EObject> iterator = i.iterator(); iterator.hasNext()
				&& aModel == null;) {
			EObject eobject = iterator.next();
			if (eobject instanceof Model) {
				aModel = (Model) eobject;
			}
		}
		return aModel;
	}

	/**
	 * Test exclusion/inclusion regex parameter
	 */
	@Test
	public void testBug319606() {
		Assert.assertNotNull(this.javaProjectFactory);

		try {

			IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
			Assert.assertNotNull(javaProject);

			String sourceFolderPath = this.rootSourcesPath + this.projectName
					+ "/src"; //$NON-NLS-1$
			URL src = Activator.getDefault().getBundle()
					.getEntry(sourceFolderPath);
			Assert.assertNotNull(src);
			this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
					Activator.getDefault());

			DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
			Assert.assertNotNull(javaDiscoverer);
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, true);

			DiscoveryParametersBean parametersBean = new DiscoveryParametersBean();
			parametersBean.setExcludedElementsRegEx("annotat[a-z]*"); //$NON-NLS-1$
			parametersBean.addElementToDiscover(javaProject);
			parameters.put(DiscoverJavaModelFromJavaProject.PARAMETERS_BEAN,
					parametersBean);

			javaDiscoverer.discoverElement(javaProject, parameters);

			Resource output = (Resource) parameters
					.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			Assert.assertNotNull(output);

			Model javaModel = getJavaModel(output);
			NamedElement classAnnotation = JavaUtil
					.getNamedElementByQualifiedName(javaModel,
							"annotations.MyAnnotatedClass"); //$NON-NLS-1$
			Assert.assertNull(classAnnotation);

			Assert.assertTrue(!javaModel.getOwnedElements().isEmpty());

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
