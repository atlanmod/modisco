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
package org.eclipse.gmt.modisco.kdm.browser.extension.action;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.action.AbstractActionRelationship;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionRelationship;
import org.eclipse.gmt.modisco.omg.kdm.action.Addresses;
import org.eclipse.gmt.modisco.omg.kdm.action.BlockUnit;
import org.eclipse.gmt.modisco.omg.kdm.action.Calls;
import org.eclipse.gmt.modisco.omg.kdm.action.CatchUnit;
import org.eclipse.gmt.modisco.omg.kdm.action.CompliesTo;
import org.eclipse.gmt.modisco.omg.kdm.action.ControlFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.Creates;
import org.eclipse.gmt.modisco.omg.kdm.action.Dispatches;
import org.eclipse.gmt.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.ExceptionFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.ExceptionUnit;
import org.eclipse.gmt.modisco.omg.kdm.action.ExitFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.FalseFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.FinallyUnit;
import org.eclipse.gmt.modisco.omg.kdm.action.Flow;
import org.eclipse.gmt.modisco.omg.kdm.action.GuardedFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.Reads;
import org.eclipse.gmt.modisco.omg.kdm.action.Throws;
import org.eclipse.gmt.modisco.omg.kdm.action.TrueFlow;
import org.eclipse.gmt.modisco.omg.kdm.action.TryUnit;
import org.eclipse.gmt.modisco.omg.kdm.action.UsesType;
import org.eclipse.gmt.modisco.omg.kdm.action.Writes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for TryUnit
	private final Image TryUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CatchUnit
	private final Image CatchUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for FinallyUnit
	private final Image FinallyUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExceptionUnit
	private final Image ExceptionUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BlockUnit
	private final Image BlockUnitImage = createImage("block.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Flow
	private final Image FlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TrueFlow
	private final Image TrueFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for FalseFlow
	private final Image FalseFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for GuardedFlow
	private final Image GuardedFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ActionElement
	private final Image ActionElementImage = createImage("StartClassifierBehaviorAction.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ControlFlow
	private final Image ControlFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EntryFlow
	private final Image EntryFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Calls
	private final Image CallsImage = createImage("ch_callees.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Dispatches
	private final Image DispatchesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Reads
	private final Image ReadsImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Writes
	private final Image WritesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Addresses
	private final Image AddressesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Creates
	private final Image CreatesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExitFlow
	private final Image ExitFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExceptionFlow
	private final Image ExceptionFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Throws
	private final Image ThrowsImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CompliesTo
	private final Image CompliesToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UsesType
	private final Image UsesTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ActionRelationship
	private final Image ActionRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractActionRelationship
	private final Image AbstractActionRelationshipImage = createImage(""); //$NON-NLS-1$

	// End of user code

	/**
	 * @generated
	 */
	public IconProvider() {
		//
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
		if (eObject instanceof TryUnit) {
			result = this.TryUnitImage;
		} else if (eObject instanceof CatchUnit) {
			result = this.CatchUnitImage;
		} else if (eObject instanceof FinallyUnit) {
			result = this.FinallyUnitImage;
		} else if (eObject instanceof ExceptionUnit) {
			result = this.ExceptionUnitImage;
		} else if (eObject instanceof BlockUnit) {
			result = this.BlockUnitImage;
		} else if (eObject instanceof Flow) {
			result = this.FlowImage;
		} else if (eObject instanceof TrueFlow) {
			result = this.TrueFlowImage;
		} else if (eObject instanceof FalseFlow) {
			result = this.FalseFlowImage;
		} else if (eObject instanceof GuardedFlow) {
			result = this.GuardedFlowImage;
		} else if (eObject instanceof ActionElement) {
			result = this.ActionElementImage;
		} else if (eObject instanceof ControlFlow) {
			result = this.ControlFlowImage;
		} else if (eObject instanceof EntryFlow) {
			result = this.EntryFlowImage;
		} else if (eObject instanceof Calls) {
			result = this.CallsImage;
		} else if (eObject instanceof Dispatches) {
			result = this.DispatchesImage;
		} else if (eObject instanceof Reads) {
			result = this.ReadsImage;
		} else if (eObject instanceof Writes) {
			result = this.WritesImage;
		} else if (eObject instanceof Addresses) {
			result = this.AddressesImage;
		} else if (eObject instanceof Creates) {
			result = this.CreatesImage;
		} else if (eObject instanceof ExitFlow) {
			result = this.ExitFlowImage;
		} else if (eObject instanceof ExceptionFlow) {
			result = this.ExceptionFlowImage;
		} else if (eObject instanceof Throws) {
			result = this.ThrowsImage;
		} else if (eObject instanceof CompliesTo) {
			result = this.CompliesToImage;
		} else if (eObject instanceof UsesType) {
			result = this.UsesTypeImage;
		} else if (eObject instanceof ActionRelationship) {
			result = this.ActionRelationshipImage;
		} else if (eObject instanceof AbstractActionRelationship) {
			result = this.AbstractActionRelationshipImage;
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
			ImageDescriptor descriptor = Activator
					.getImageDescriptor("icons/kdm/action/" + resourcePath); //$NON-NLS-1$
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
