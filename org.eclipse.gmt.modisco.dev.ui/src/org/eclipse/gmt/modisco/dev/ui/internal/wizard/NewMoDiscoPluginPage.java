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
package org.eclipse.gmt.modisco.dev.ui.internal.wizard;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.facet.dev.ui.internal.wizard.NewEmfFacetPluginPage;
import org.eclipse.gmt.modisco.dev.ui.internal.Activator;

public class NewMoDiscoPluginPage extends NewEmfFacetPluginPage {

	private static final String SETTINGS_FILENAME = "settings.txt"; //$NON-NLS-1$

	@Override
	protected String getDefaultID() {
		return "org.eclipse.modisco.xx"; //$NON-NLS-1$
	}

	@Override
	protected String getDefaultName() {
		return "MoDisco xx"; //$NON-NLS-1$
	}

	@Override
	protected String getDefaultVersion() {
		return "0.10.0"; //$NON-NLS-1$
	}

	@Override
	protected String getDefaultProvider() {
		return "Eclipse Modeling Project"; //$NON-NLS-1$
	}


	@Override
	protected String getSettingsFilePath() {
		IPath path = Activator.getDefault().getStateLocation();
		return path.append(NewMoDiscoPluginPage.SETTINGS_FILENAME).toOSString();
	}

}
