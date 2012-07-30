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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.facet.dev.ui.internal.wizard.NewEmfFacetPluginPage;
import org.eclipse.gmt.modisco.dev.core.INewPluginCreator;

public class NewMoDiscoPluginWizard extends org.eclipse.emf.facet.dev.ui.internal.wizard.NewEmfFacetPluginWizard {

	@Override
	protected NewEmfFacetPluginPage createPage() {
		return new NewMoDiscoPluginPage();
	}

	@Override
	protected void createProject(final String id, final String name, final String version, final String provider, final boolean javaNatureEnabled, final IProgressMonitor monitor) {
		INewPluginCreator.INSTANCE.createProject(id, name, version, provider, javaNatureEnabled, monitor);
	}
}
