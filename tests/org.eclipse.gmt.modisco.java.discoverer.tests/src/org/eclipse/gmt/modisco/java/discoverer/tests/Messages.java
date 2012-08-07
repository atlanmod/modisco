/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.tests;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.java.discoverer.tests.messages"; //$NON-NLS-1$
	public static String JavaJUnitEMF_113;
	public static String JavaJUnitEMF_62;
	public static String JavaJUnitEMF_88;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
