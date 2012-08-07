/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.benchmark.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @deprecated use org.eclipse.modisco.java.discover.benchmark.tests component
 */
@Deprecated
@RunWith(Suite.class)
@SuiteClasses({ JavaDiscovererBenchmarkTest.class })
// NO JavaScalabilityTest !
public class AllTests {
	// JUnit 4 test suite
}
