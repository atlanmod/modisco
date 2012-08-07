/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ org.eclipse.modisco.xml.discoverer.tests.AllTests.class,
		org.eclipse.modisco.infra.query.tests.AllTests.class,
		org.eclipse.modisco.infra.facet.tests.AllTests.class,
		org.eclipse.modisco.infra.browser.custom.examples.uml.tests.AllTests.class,
		org.eclipse.modisco.infra.browser.custom.tests.AllTests.class,
		org.eclipse.modisco.infra.common.core.tests.AllTests.class,
		org.eclipse.modisco.java.discoverer.tests.AllTests.class,
		org.eclipse.gmt.modisco.java.discoverer.tests.AllTests.class,
		org.eclipse.modisco.java.queries.tests.AllTests.class,
/* disable benchmark tests because benchmark is disabled because Birt is disabled in Juno aggregation build
		org.eclipse.modisco.java.discoverer.benchmark.tests.AllTests.class,
		org.eclipse.gmt.modisco.java.discoverer.benchmark.tests.AllTests.class,
*/
//  see Bug 363302 - Disabled junit test java.discoverer.cdo.tests
//		org.eclipse.modisco.java.discoverer.cdo.tests.AllTests.class,
//		org.eclipse.gmt.modisco.java.discoverer.cdo.tests.AllTests.class,
		org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests.AllTests.class,
		org.eclipse.modisco.java.browser.customization.test.AllTests.class,
		org.eclipse.modisco.java.generation.tests.AllTests.class,
		org.eclipse.modisco.infra.doc.tests.AllTests.class,
		org.eclipse.modisco.jee.ejbjar.discoverer.tests.AllTests.class,
		org.eclipse.modisco.jee.webapp.discoverer.tests.AllTests.class,
		org.eclipse.modisco.jee.webapp.discoverer.tests.compatibility.AllTests.class,
		org.eclipse.modisco.jee.jsp.discoverer.tests.AllTests.class,
		org.eclipse.modisco.jee.jsp.discoverer.tests.compatibility.AllTests.class,
		org.eclipse.modisco.jee.jsp.generation.tests.DiffGeneratedJspTest.class,
		org.eclipse.modisco.kdm.uml2converter.tests.AllTests.class,
		org.eclipse.gmt.modisco.kdm.uml2converter.tests.AllTests.class,
		org.eclipse.modisco.jee.queries.tests.AllTests.class,
		org.eclipse.modisco.java.composition.discoverer.tests.AllTests.class,
		org.eclipse.modisco.java.composition.discoverer.tests.compatibility.AllTests.class,
		org.eclipse.modisco.infra.discovery.core.tests.AllTests.class,
		org.eclipse.modisco.infra.discovery.ui.tests.AllTests.class,
		org.eclipse.modisco.xml.discoverer.tests.AllTests.class,
		org.eclipse.gmt.modisco.xml.discoverer.tests.AllTests.class,
//		org.eclipse.modisco.utils.chart.birt.core.tests.AllTestInUIThread.class,
		BundleTest.class
	})
public class AllTests {
	// JUnit 4 test suite
}
