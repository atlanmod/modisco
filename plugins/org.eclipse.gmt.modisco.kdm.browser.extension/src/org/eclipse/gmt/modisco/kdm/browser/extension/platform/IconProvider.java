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
package org.eclipse.gmt.modisco.kdm.browser.extension.platform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformElement;
import org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformRelationship;
import org.eclipse.gmt.modisco.omg.kdm.platform.BindsTo;
import org.eclipse.gmt.modisco.omg.kdm.platform.DataManager;
import org.eclipse.gmt.modisco.omg.kdm.platform.DefinedBy;
import org.eclipse.gmt.modisco.omg.kdm.platform.DeployedComponent;
import org.eclipse.gmt.modisco.omg.kdm.platform.DeployedResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.DeployedSoftwareSystem;
import org.eclipse.gmt.modisco.omg.kdm.platform.ExecutionResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.ExternalActor;
import org.eclipse.gmt.modisco.omg.kdm.platform.FileResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Loads;
import org.eclipse.gmt.modisco.omg.kdm.platform.LockResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Machine;
import org.eclipse.gmt.modisco.omg.kdm.platform.ManagesResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.MarshalledResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.MessagingResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.NamingResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformAction;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformElement;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformEvent;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformModel;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformRelationship;
import org.eclipse.gmt.modisco.omg.kdm.platform.Process;
import org.eclipse.gmt.modisco.omg.kdm.platform.ReadsResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Requires;
import org.eclipse.gmt.modisco.omg.kdm.platform.ResourceType;
import org.eclipse.gmt.modisco.omg.kdm.platform.RuntimeResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Spawns;
import org.eclipse.gmt.modisco.omg.kdm.platform.StreamResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Thread;
import org.eclipse.gmt.modisco.omg.kdm.platform.WritesResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for Process
	private final Image ProcessImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Thread
	private final Image ThreadImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for NamingResource
	private final Image NamingResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MarshalledResource
	private final Image MarshalledResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MessagingResource
	private final Image MessagingResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for FileResource
	private final Image FileResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExecutionResource
	private final Image ExecutionResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for LockResource
	private final Image LockResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for StreamResource
	private final Image StreamResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataManager
	private final Image DataManagerImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PlatformEvent
	private final Image PlatformEventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExternalActor
	private final Image ExternalActorImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RuntimeResource
	private final Image RuntimeResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PlatformModel
	private final Image PlatformModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ResourceType
	private final Image ResourceTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PlatformAction
	private final Image PlatformActionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BindsTo
	private final Image BindsToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Requires
	private final Image RequiresImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ManagesResource
	private final Image ManagesResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ReadsResource
	private final Image ReadsResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for WritesResource
	private final Image WritesResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DefinedBy
	private final Image DefinedByImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DeployedComponent
	private final Image DeployedComponentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DeployedSoftwareSystem
	private final Image DeployedSoftwareSystemImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Machine
	private final Image MachineImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DeployedResource
	private final Image DeployedResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Loads
	private final Image LoadsImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Spawns
	private final Image SpawnsImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PlatformElement
	private final Image PlatformElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PlatformRelationship
	private final Image PlatformRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractPlatformElement
	private final Image AbstractPlatformElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractPlatformRelationship
	private final Image AbstractPlatformRelationshipImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof Process) {
			result = this.ProcessImage;
		} else if (eObject instanceof Thread) {
			result = this.ThreadImage;
		} else if (eObject instanceof NamingResource) {
			result = this.NamingResourceImage;
		} else if (eObject instanceof MarshalledResource) {
			result = this.MarshalledResourceImage;
		} else if (eObject instanceof MessagingResource) {
			result = this.MessagingResourceImage;
		} else if (eObject instanceof FileResource) {
			result = this.FileResourceImage;
		} else if (eObject instanceof ExecutionResource) {
			result = this.ExecutionResourceImage;
		} else if (eObject instanceof LockResource) {
			result = this.LockResourceImage;
		} else if (eObject instanceof StreamResource) {
			result = this.StreamResourceImage;
		} else if (eObject instanceof DataManager) {
			result = this.DataManagerImage;
		} else if (eObject instanceof PlatformEvent) {
			result = this.PlatformEventImage;
		} else if (eObject instanceof ExternalActor) {
			result = this.ExternalActorImage;
		} else if (eObject instanceof RuntimeResource) {
			result = this.RuntimeResourceImage;
		} else if (eObject instanceof PlatformModel) {
			result = this.PlatformModelImage;
		} else if (eObject instanceof ResourceType) {
			result = this.ResourceTypeImage;
		} else if (eObject instanceof PlatformAction) {
			result = this.PlatformActionImage;
		} else if (eObject instanceof BindsTo) {
			result = this.BindsToImage;
		} else if (eObject instanceof Requires) {
			result = this.RequiresImage;
		} else if (eObject instanceof ManagesResource) {
			result = this.ManagesResourceImage;
		} else if (eObject instanceof ReadsResource) {
			result = this.ReadsResourceImage;
		} else if (eObject instanceof WritesResource) {
			result = this.WritesResourceImage;
		} else if (eObject instanceof DefinedBy) {
			result = this.DefinedByImage;
		} else if (eObject instanceof DeployedComponent) {
			result = this.DeployedComponentImage;
		} else if (eObject instanceof DeployedSoftwareSystem) {
			result = this.DeployedSoftwareSystemImage;
		} else if (eObject instanceof Machine) {
			result = this.MachineImage;
		} else if (eObject instanceof DeployedResource) {
			result = this.DeployedResourceImage;
		} else if (eObject instanceof Loads) {
			result = this.LoadsImage;
		} else if (eObject instanceof Spawns) {
			result = this.SpawnsImage;
		} else if (eObject instanceof PlatformElement) {
			result = this.PlatformElementImage;
		} else if (eObject instanceof PlatformRelationship) {
			result = this.PlatformRelationshipImage;
		} else if (eObject instanceof AbstractPlatformElement) {
			result = this.AbstractPlatformElementImage;
		} else if (eObject instanceof AbstractPlatformRelationship) {
			result = this.AbstractPlatformRelationshipImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/platform/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
