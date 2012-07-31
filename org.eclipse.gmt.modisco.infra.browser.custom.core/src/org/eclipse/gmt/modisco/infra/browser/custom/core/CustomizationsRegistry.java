/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.core;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class CustomizationsRegistry {

	

	private static CustomizationsRegistry instance = null;

	private final List<URL> uiCustomURLS = new ArrayList<URL>();
	private final List<URL> uiCustomDefaultURLS = new ArrayList<URL>();

	private CustomizationsRegistry() {
		// nothing
	}

	public static CustomizationsRegistry getInstance() {
		if (CustomizationsRegistry.instance == null) {
			CustomizationsRegistry.instance = new CustomizationsRegistry();
		}
		return CustomizationsRegistry.instance;
	}

	public List<URL> getUiCustomURLS() {
		return this.uiCustomURLS;
	}

	public List<URL> getUiCustomDefaultURLS() {
		return this.uiCustomDefaultURLS;
	}

}
