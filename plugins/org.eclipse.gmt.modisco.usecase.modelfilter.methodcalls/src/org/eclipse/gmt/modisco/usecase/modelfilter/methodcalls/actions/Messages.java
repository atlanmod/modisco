/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.actions;

import org.eclipse.osgi.util.NLS;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.actions.messages"; //$NON-NLS-1$
	public static String DiscoverMethodCallsModelFromAbstractMethodDeclaration_discoveryName;
	public static String DiscoverMethodCallsModelFromJavaModel_discoveryName;
	public static String DiscoverMethodCallsModelFromJavaModel_javaProjectNotFound;
	public static String DiscoverMethodCallsModelFromJavaOperation_discoveryName;
	public static String DiscoverMethodCallsModelFromJavaProject_discoveryName;
	public static String DiscoverMethodCallsModelFromJavaProject_javaProjectNotFound;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
