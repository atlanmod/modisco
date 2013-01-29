/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Nicolas Bros (Mia-Software)
 *		Fabien Giquel (Mia-Software) - Bug 339720 - MoDisco Discoverers (infra + techno) API clean
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
@RunWith(Suite.class)
@SuiteClasses({
//		JavaJUnitEMF.class, SimpleBlackBoxDiscovery.class,
//		SimpleBlackBoxConverter.class, Java2KdmConverterTest.class,
//		ParameterizedDiscovery.class, Bug329423CommentsTest.class 
		})
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
