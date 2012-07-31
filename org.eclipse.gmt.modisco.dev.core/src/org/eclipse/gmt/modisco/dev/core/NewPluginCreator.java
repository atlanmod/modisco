/*******************************************************************************
 * Copyright (c) 2011 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 355961 - Wizard to create MoDisco plug-ins
 *******************************************************************************/
package org.eclipse.gmt.modisco.dev.core;

import java.net.URL;

public class NewPluginCreator extends org.eclipse.emf.facet.dev.core.internal.NewPluginCreator implements INewPluginCreator {

	/** overridden to allow template overriding */
	@Override
	protected URL getFileURL(final String path) {
		URL url = Activator.getDefault()
				.getBundle().getResource(path);
		if (url != null) {
			return url;
		}
		return super.getFileURL(path);
	}
}
