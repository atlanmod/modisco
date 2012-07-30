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
package org.eclipse.gmt.modisco.kdm.browser.extension.event;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.event.AbstractEventElement;
import org.eclipse.gmt.modisco.omg.kdm.event.AbstractEventRelationship;
import org.eclipse.gmt.modisco.omg.kdm.event.ConsumesEvent;
import org.eclipse.gmt.modisco.omg.kdm.event.Event;
import org.eclipse.gmt.modisco.omg.kdm.event.EventAction;
import org.eclipse.gmt.modisco.omg.kdm.event.EventElement;
import org.eclipse.gmt.modisco.omg.kdm.event.EventModel;
import org.eclipse.gmt.modisco.omg.kdm.event.EventRelationship;
import org.eclipse.gmt.modisco.omg.kdm.event.EventResource;
import org.eclipse.gmt.modisco.omg.kdm.event.HasState;
import org.eclipse.gmt.modisco.omg.kdm.event.InitialState;
import org.eclipse.gmt.modisco.omg.kdm.event.NextState;
import org.eclipse.gmt.modisco.omg.kdm.event.OnEntry;
import org.eclipse.gmt.modisco.omg.kdm.event.OnExit;
import org.eclipse.gmt.modisco.omg.kdm.event.ProducesEvent;
import org.eclipse.gmt.modisco.omg.kdm.event.ReadsState;
import org.eclipse.gmt.modisco.omg.kdm.event.State;
import org.eclipse.gmt.modisco.omg.kdm.event.Transition;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for OnEntry
	private final Image OnEntryImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for OnExit
	private final Image OnExitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InitialState
	private final Image InitialStateImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for State
	private final Image StateImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Transition
	private final Image TransitionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EventModel
	private final Image EventModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Event
	private final Image EventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EventRelationship
	private final Image EventRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EventResource
	private final Image EventResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EventAction
	private final Image EventActionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ReadsState
	private final Image ReadsStateImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ProducesEvent
	private final Image ProducesEventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConsumesEvent
	private final Image ConsumesEventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for NextState
	private final Image NextStateImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EventElement
	private final Image EventElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for HasState
	private final Image HasStateImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractEventElement
	private final Image AbstractEventElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractEventRelationship
	private final Image AbstractEventRelationshipImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof OnEntry) {
			result = this.OnEntryImage;
		} else if (eObject instanceof OnExit) {
			result = this.OnExitImage;
		} else if (eObject instanceof InitialState) {
			result = this.InitialStateImage;
		} else if (eObject instanceof State) {
			result = this.StateImage;
		} else if (eObject instanceof Transition) {
			result = this.TransitionImage;
		} else if (eObject instanceof EventModel) {
			result = this.EventModelImage;
		} else if (eObject instanceof Event) {
			result = this.EventImage;
		} else if (eObject instanceof EventRelationship) {
			result = this.EventRelationshipImage;
		} else if (eObject instanceof EventResource) {
			result = this.EventResourceImage;
		} else if (eObject instanceof EventAction) {
			result = this.EventActionImage;
		} else if (eObject instanceof ReadsState) {
			result = this.ReadsStateImage;
		} else if (eObject instanceof ProducesEvent) {
			result = this.ProducesEventImage;
		} else if (eObject instanceof ConsumesEvent) {
			result = this.ConsumesEventImage;
		} else if (eObject instanceof NextState) {
			result = this.NextStateImage;
		} else if (eObject instanceof EventElement) {
			result = this.EventElementImage;
		} else if (eObject instanceof HasState) {
			result = this.HasStateImage;
		} else if (eObject instanceof AbstractEventElement) {
			result = this.AbstractEventElementImage;
		} else if (eObject instanceof AbstractEventRelationship) {
			result = this.AbstractEventRelationshipImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/event/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
