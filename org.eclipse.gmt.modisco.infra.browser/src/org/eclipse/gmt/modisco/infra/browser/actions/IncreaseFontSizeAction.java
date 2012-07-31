/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.actions;

import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;

public class IncreaseFontSizeAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public IncreaseFontSizeAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.EcoreActionBarContributor_increaseFontSize, IAction.AS_PUSH_BUTTON);
		setImageDescriptor(ImageProvider.getInstance().getIncreaseFontSizeIcon());
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {
		final EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			browser.setFontSizeDelta(browser.getFontSizeDelta() + 1);
		}
	}
}
