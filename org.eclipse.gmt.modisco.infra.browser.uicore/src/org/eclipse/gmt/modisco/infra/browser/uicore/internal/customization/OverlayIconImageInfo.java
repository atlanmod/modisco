/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.uicore.internal.customization;

import org.eclipse.gmt.modisco.infra.browser.custom.util.OverlayIconPosition;
import org.eclipse.swt.graphics.Image;

/**
 * Represents an overlay icon positioned over the man icon of an element in a tree widget. The icon
 * can have a different position depending on the value of the given {@link OverlayIconPosition}
 * instance.
 */
public class OverlayIconImageInfo {
	private final OverlayIconPosition iconPosition;
	private final Image image;

	public OverlayIconImageInfo(final Image image, final OverlayIconPosition iconPosition) {
		this.image = image;
		this.iconPosition = iconPosition;
	}

	public Image getImage() {
		return this.image;
	}

	public OverlayIconPosition getIconPosition() {
		return this.iconPosition;
	}
}