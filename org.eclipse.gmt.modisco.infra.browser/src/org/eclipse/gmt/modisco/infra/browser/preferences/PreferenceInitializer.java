/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.gmt.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values for the Browser.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = MoDiscoBrowserPlugin.getPlugin().getPreferenceStore();
		// general rule is to keep the same behavior as EMF by default
		store.setDefault(PreferenceConstants.P_BROWSER_ASK_LOADING_DEPTH, false);
		store.setDefault(PreferenceConstants.P_BROWSER_LOADING_DEPTH, 0);
		store.setDefault(PreferenceConstants.P_BROWSER_OVERRIDE_METAMODEL_SPECIFIC_SETTINGS, false);
		store.setDefault(PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_SETTING,
				PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_ASK);
	}

}
