/*******************************************************************************
 * Copyright (c) 2010, 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Nicolas Guyomar (Mia-Software)
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package plugins.eclipse.bundles.org.eclipse.modisco.jee.queries.tests.src.org.eclipse.modisco.jee.queries.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JeeEjbAnnotationsTests.class, JeeJpaAnnotations.class, JeeServletAnnotations.class })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
