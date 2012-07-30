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
package org.eclipse.gmt.modisco.kdm.browser.extension.build;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.build.AbstractBuildElement;
import org.eclipse.gmt.modisco.omg.kdm.build.AbstractBuildRelationship;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildComponent;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildDescription;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildElement;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildModel;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildProduct;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildRelationship;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildResource;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildStep;
import org.eclipse.gmt.modisco.omg.kdm.build.Consumes;
import org.eclipse.gmt.modisco.omg.kdm.build.DescribedBy;
import org.eclipse.gmt.modisco.omg.kdm.build.Library;
import org.eclipse.gmt.modisco.omg.kdm.build.LinksTo;
import org.eclipse.gmt.modisco.omg.kdm.build.Produces;
import org.eclipse.gmt.modisco.omg.kdm.build.SuppliedBy;
import org.eclipse.gmt.modisco.omg.kdm.build.Supplier;
import org.eclipse.gmt.modisco.omg.kdm.build.SupportedBy;
import org.eclipse.gmt.modisco.omg.kdm.build.SymbolicLink;
import org.eclipse.gmt.modisco.omg.kdm.build.Tool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for BuildDescription
	private final Image BuildDescriptionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildComponent
	private final Image BuildComponentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Library
	private final Image LibraryImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildStep
	private final Image BuildStepImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildProduct
	private final Image BuildProductImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildResource
	private final Image BuildResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SymbolicLink
	private final Image SymbolicLinkImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for LinksTo
	private final Image LinksToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Consumes
	private final Image ConsumesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildModel
	private final Image BuildModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Supplier
	private final Image SupplierImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Tool
	private final Image ToolImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildElement
	private final Image BuildElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BuildRelationship
	private final Image BuildRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SuppliedBy
	private final Image SuppliedByImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Produces
	private final Image ProducesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SupportedBy
	private final Image SupportedByImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DescribedBy
	private final Image DescribedByImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractBuildElement
	private final Image AbstractBuildElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractBuildRelationship
	private final Image AbstractBuildRelationshipImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof BuildDescription) {
			result = this.BuildDescriptionImage;
		} else if (eObject instanceof BuildComponent) {
			result = this.BuildComponentImage;
		} else if (eObject instanceof Library) {
			result = this.LibraryImage;
		} else if (eObject instanceof BuildStep) {
			result = this.BuildStepImage;
		} else if (eObject instanceof BuildProduct) {
			result = this.BuildProductImage;
		} else if (eObject instanceof BuildResource) {
			result = this.BuildResourceImage;
		} else if (eObject instanceof SymbolicLink) {
			result = this.SymbolicLinkImage;
		} else if (eObject instanceof LinksTo) {
			result = this.LinksToImage;
		} else if (eObject instanceof Consumes) {
			result = this.ConsumesImage;
		} else if (eObject instanceof BuildModel) {
			result = this.BuildModelImage;
		} else if (eObject instanceof Supplier) {
			result = this.SupplierImage;
		} else if (eObject instanceof Tool) {
			result = this.ToolImage;
		} else if (eObject instanceof BuildElement) {
			result = this.BuildElementImage;
		} else if (eObject instanceof BuildRelationship) {
			result = this.BuildRelationshipImage;
		} else if (eObject instanceof SuppliedBy) {
			result = this.SuppliedByImage;
		} else if (eObject instanceof Produces) {
			result = this.ProducesImage;
		} else if (eObject instanceof SupportedBy) {
			result = this.SupportedByImage;
		} else if (eObject instanceof DescribedBy) {
			result = this.DescribedByImage;
		} else if (eObject instanceof AbstractBuildElement) {
			result = this.AbstractBuildElementImage;
		} else if (eObject instanceof AbstractBuildRelationship) {
			result = this.AbstractBuildRelationshipImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/build/" //$NON-NLS-1$ 
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
