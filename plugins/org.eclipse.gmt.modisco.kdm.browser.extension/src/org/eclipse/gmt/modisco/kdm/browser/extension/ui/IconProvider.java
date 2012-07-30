/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.kdm.browser.extension.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.ui.AbstractUIElement;
import org.eclipse.gmt.modisco.omg.kdm.ui.AbstractUIRelationship;
import org.eclipse.gmt.modisco.omg.kdm.ui.Displays;
import org.eclipse.gmt.modisco.omg.kdm.ui.DisplaysImage;
import org.eclipse.gmt.modisco.omg.kdm.ui.ManagesUI;
import org.eclipse.gmt.modisco.omg.kdm.ui.ReadsUI;
import org.eclipse.gmt.modisco.omg.kdm.ui.Report;
import org.eclipse.gmt.modisco.omg.kdm.ui.Screen;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIAction;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIDisplay;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIElement;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIEvent;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIField;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIFlow;
import org.eclipse.gmt.modisco.omg.kdm.ui.UILayout;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIModel;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIRelationship;
import org.eclipse.gmt.modisco.omg.kdm.ui.UIResource;
import org.eclipse.gmt.modisco.omg.kdm.ui.WritesUI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for Screen
	private final Image ScreenImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Report
	private final Image ReportImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIDisplay
	private final Image UIDisplayImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIField
	private final Image UIFieldImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIResource
	private final Image UIResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIModel
	private final Image UIModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UILayout
	private final Image UILayoutImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DisplaysImage
	private final Image DisplaysImageImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Displays
	private final Image DisplaysImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIFlow
	private final Image UIFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIElement
	private final Image UIElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIRelationship
	private final Image UIRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIAction
	private final Image UIActionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UIEvent
	private final Image UIEventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ReadsUI
	private final Image ReadsUIImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for WritesUI
	private final Image WritesUIImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ManagesUI
	private final Image ManagesUIImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractUIElement
	private final Image AbstractUIElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractUIRelationship
	private final Image AbstractUIRelationshipImage = createImage(""); //$NON-NLS-1$

	// End of user code

	/**
	 * @generated
	 */
	public IconProvider() {
		//
	}

	/**
	 * @return the icon that must be displayed for the given {@link EObject}, or
	 *         <code>null</code> to keep the default icon, which can be empty,
	 *         or let another {@link IconProvider} provide the icon
	 * @generated
	 */
	public Image getIcon(final EObject eObject) {
		Image result = null;
		if (eObject instanceof Screen) {
			result = this.ScreenImage;
		} else if (eObject instanceof Report) {
			result = this.ReportImage;
		} else if (eObject instanceof UIDisplay) {
			result = this.UIDisplayImage;
		} else if (eObject instanceof UIField) {
			result = this.UIFieldImage;
		} else if (eObject instanceof UIResource) {
			result = this.UIResourceImage;
		} else if (eObject instanceof UIModel) {
			result = this.UIModelImage;
		} else if (eObject instanceof UILayout) {
			result = this.UILayoutImage;
		} else if (eObject instanceof DisplaysImage) {
			result = this.DisplaysImageImage;
		} else if (eObject instanceof Displays) {
			result = this.DisplaysImage;
		} else if (eObject instanceof UIFlow) {
			result = this.UIFlowImage;
		} else if (eObject instanceof UIElement) {
			result = this.UIElementImage;
		} else if (eObject instanceof UIRelationship) {
			result = this.UIRelationshipImage;
		} else if (eObject instanceof UIAction) {
			result = this.UIActionImage;
		} else if (eObject instanceof UIEvent) {
			result = this.UIEventImage;
		} else if (eObject instanceof ReadsUI) {
			result = this.ReadsUIImage;
		} else if (eObject instanceof WritesUI) {
			result = this.WritesUIImage;
		} else if (eObject instanceof ManagesUI) {
			result = this.ManagesUIImage;
		} else if (eObject instanceof AbstractUIElement) {
			result = this.AbstractUIElementImage;
		} else if (eObject instanceof AbstractUIRelationship) {
			result = this.AbstractUIRelationshipImage;
		}

		return result;

	}

	/**
	 * Create an image from a resource in the bundle (plugin)
	 * 
	 * @param resourcePath
	 *            the path of the resource (in the bundle)
	 * @return the image
	 * @generated
	 */
	private Image createImage(final String resourcePath) {
		Image result = null;
		if ((resourcePath != null) && (resourcePath.length() > 0)) {
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/ui/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
