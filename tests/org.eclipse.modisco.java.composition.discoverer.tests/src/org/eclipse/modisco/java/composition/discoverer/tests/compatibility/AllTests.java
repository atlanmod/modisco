/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests.compatibility;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuppressWarnings("deprecation")
@RunWith(Suite.class)
@Deprecated
@SuiteClasses({ TestMemoryUsage.class, TestJavaApp.class,
	CompositeDiscoveryTests.class, StrategySourceJavaTests.class })
public class AllTests {
	// JUnit 4 test suite
}
