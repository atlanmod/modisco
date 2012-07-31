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
package org.eclipse.gmt.modisco.kdm.browser.extension.structure;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureRelationship;
import org.eclipse.gmt.modisco.omg.kdm.structure.ArchitectureView;
import org.eclipse.gmt.modisco.omg.kdm.structure.Component;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.SoftwareSystem;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureRelationship;
import org.eclipse.gmt.modisco.omg.kdm.structure.Subsystem;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for Subsystem
	private final Image SubsystemImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Layer
	private final Image LayerImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for StructureModel
	private final Image StructureModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Component
	private final Image ComponentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SoftwareSystem
	private final Image SoftwareSystemImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for StructureRelationship
	private final Image StructureRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ArchitectureView
	private final Image ArchitectureViewImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for StructureElement
	private final Image StructureElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractStructureElement
	private final Image AbstractStructureElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractStructureRelationship
	private final Image AbstractStructureRelationshipImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof Subsystem) {
			result = this.SubsystemImage;
		} else if (eObject instanceof Layer) {
			result = this.LayerImage;
		} else if (eObject instanceof StructureModel) {
			result = this.StructureModelImage;
		} else if (eObject instanceof Component) {
			result = this.ComponentImage;
		} else if (eObject instanceof SoftwareSystem) {
			result = this.SoftwareSystemImage;
		} else if (eObject instanceof StructureRelationship) {
			result = this.StructureRelationshipImage;
		} else if (eObject instanceof ArchitectureView) {
			result = this.ArchitectureViewImage;
		} else if (eObject instanceof StructureElement) {
			result = this.StructureElementImage;
		} else if (eObject instanceof AbstractStructureElement) {
			result = this.AbstractStructureElementImage;
		} else if (eObject instanceof AbstractStructureRelationship) {
			result = this.AbstractStructureRelationshipImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/structure/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
