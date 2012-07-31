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
package org.eclipse.gmt.modisco.kdm.browser.extension.source;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryRelationship;
import org.eclipse.gmt.modisco.omg.kdm.source.BinaryFile;
import org.eclipse.gmt.modisco.omg.kdm.source.Configuration;
import org.eclipse.gmt.modisco.omg.kdm.source.DependsOn;
import org.eclipse.gmt.modisco.omg.kdm.source.Directory;
import org.eclipse.gmt.modisco.omg.kdm.source.ExecutableFile;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryElement;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryItem;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryRelationship;
import org.eclipse.gmt.modisco.omg.kdm.source.Project;
import org.eclipse.gmt.modisco.omg.kdm.source.ResourceDescription;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceFile;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRegion;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for SourceFile
	private final Image SourceFileImage = createImage("source_attach_attrib.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Image
	private final Image ImageImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Configuration
	private final Image ConfigurationImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ResourceDescription
	private final Image ResourceDescriptionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BinaryFile
	private final Image BinaryFileImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExecutableFile
	private final Image ExecutableFileImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Directory
	private final Image DirectoryImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Project
	private final Image ProjectImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InventoryModel
	private final Image InventoryModelImage = createImage("folder.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InventoryItem
	private final Image InventoryItemImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InventoryContainer
	private final Image InventoryContainerImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DependsOn
	private final Image DependsOnImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InventoryElement
	private final Image InventoryElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InventoryRelationship
	private final Image InventoryRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractInventoryElement
	private final Image AbstractInventoryElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractInventoryRelationship
	private final Image AbstractInventoryRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SourceRef
	private final Image SourceRefImage = createImage("ExchangeSourceAndTarget.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SourceRegion
	private final Image SourceRegionImage = createImage("source.gif"); //$NON-NLS-1$

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
	 * 
	 */
	public Image getIcon(final EObject eObject) {
		Image result = null;
		if (eObject instanceof SourceFile) {
			result = this.SourceFileImage;
		} else if (eObject instanceof org.eclipse.gmt.modisco.omg.kdm.source.Image) {
			result = this.ImageImage;
		} else if (eObject instanceof Configuration) {
			result = this.ConfigurationImage;
		} else if (eObject instanceof ResourceDescription) {
			result = this.ResourceDescriptionImage;
		} else if (eObject instanceof BinaryFile) {
			result = this.BinaryFileImage;
		} else if (eObject instanceof ExecutableFile) {
			result = this.ExecutableFileImage;
		} else if (eObject instanceof Directory) {
			result = this.DirectoryImage;
		} else if (eObject instanceof Project) {
			result = this.ProjectImage;
		} else if (eObject instanceof InventoryModel) {
			result = this.InventoryModelImage;
		} else if (eObject instanceof InventoryItem) {
			result = this.InventoryItemImage;
		} else if (eObject instanceof InventoryContainer) {
			result = this.InventoryContainerImage;
		} else if (eObject instanceof DependsOn) {
			result = this.DependsOnImage;
		} else if (eObject instanceof InventoryElement) {
			result = this.InventoryElementImage;
		} else if (eObject instanceof InventoryRelationship) {
			result = this.InventoryRelationshipImage;
		} else if (eObject instanceof AbstractInventoryElement) {
			result = this.AbstractInventoryElementImage;
		} else if (eObject instanceof AbstractInventoryRelationship) {
			result = this.AbstractInventoryRelationshipImage;
		} else if (eObject instanceof SourceRef) {
			result = this.SourceRefImage;
		} else if (eObject instanceof SourceRegion) {
			result = this.SourceRegionImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/source/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
