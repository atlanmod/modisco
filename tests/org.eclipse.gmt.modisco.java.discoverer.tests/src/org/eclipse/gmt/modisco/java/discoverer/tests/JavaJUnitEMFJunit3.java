/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.tests;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @generated
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class JavaJUnitEMFJunit3 extends TestCase {

	/**
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("JavaJUnitEMFJunit3"); //$NON-NLS-1$
		suite.addTestSuite(JavaJUnitEMFJunit3.class);
		return suite;
	}

	/**
	 * @generated
	 */
	public void testtest001() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.test001();
	}

	/**
	 * @generated
	 */
	public void testtest002() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.test002();
	}

	/**
	 * @generated
	 */
	public void testtest003() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.test003();
	}

	/**
	 * @generated
	 */
	public void testpackageaccess() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.packageaccess();
	}

	/**
	 * @generated
	 */
	public void testvalidation() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.validation();
	}

	/**
	 * @generated
	 */
	public void testvarargs() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.varargs();
	}

	/**
	 * @generated
	 */
	public void testannotations() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.annotations();
	}

	/**
	 * @generated
	 */
	public void testduplicateproxy() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.duplicateproxy();
	}

	/**
	 * @generated
	 */
	public void testinitializer() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.initializer();
	}

	/**
	 * @generated
	 */
	public void testcomments() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.comments();
	}

	/**
	 * @generated
	 */
	public void testclassorifaceproxy() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.classorifaceproxy();
	}

	/**
	 * @generated
	 */
	public void testparameterizedtypeinmethoddecl() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.parameterizedtypeinmethoddecl();
	}

	/**
	 * @generated
	 */
	public void testmodifiers() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.modifiers();
	}

	/**
	 * @generated
	 */
	public void testproxyField() throws Exception {
		JavaJUnitEMF test = new JavaJUnitEMF();
		test.initResource();
		test.proxyField();
	}

	/**
	 * @generated NOT
	 */
	public void testJavaDiscovererAsBlackBox() {
		SimpleBlackBoxDiscovery test = new SimpleBlackBoxDiscovery();
		try {
			test.setUp();
			test.testJavaModelDiscoveryFromJavaProject();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		} finally {
			try {
				test.tearDown();
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
