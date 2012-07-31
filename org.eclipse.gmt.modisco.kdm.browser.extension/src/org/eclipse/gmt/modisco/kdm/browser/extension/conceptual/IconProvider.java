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
package org.eclipse.gmt.modisco.kdm.browser.extension.conceptual;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualElement;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualRelationship;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.BehaviorUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualContainer;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualElement;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualFlow;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualModel;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualRelationship;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualRole;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.FactUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.RuleUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ScenarioUnit;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.TermUnit;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for FactUnit
	private final Image FactUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BehaviorUnit
	private final Image BehaviorUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RuleUnit
	private final Image RuleUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ScenarioUnit
	private final Image ScenarioUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConceptualModel
	private final Image ConceptualModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TermUnit
	private final Image TermUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConceptualContainer
	private final Image ConceptualContainerImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConceptualRelationship
	private final Image ConceptualRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConceptualFlow
	private final Image ConceptualFlowImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConceptualElement
	private final Image ConceptualElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConceptualRole
	private final Image ConceptualRoleImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractConceptualElement
	private final Image AbstractConceptualElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractConceptualRelationship
	private final Image AbstractConceptualRelationshipImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof FactUnit) {
			result = this.FactUnitImage;
		} else if (eObject instanceof BehaviorUnit) {
			result = this.BehaviorUnitImage;
		} else if (eObject instanceof RuleUnit) {
			result = this.RuleUnitImage;
		} else if (eObject instanceof ScenarioUnit) {
			result = this.ScenarioUnitImage;
		} else if (eObject instanceof ConceptualModel) {
			result = this.ConceptualModelImage;
		} else if (eObject instanceof TermUnit) {
			result = this.TermUnitImage;
		} else if (eObject instanceof ConceptualContainer) {
			result = this.ConceptualContainerImage;
		} else if (eObject instanceof ConceptualRelationship) {
			result = this.ConceptualRelationshipImage;
		} else if (eObject instanceof ConceptualFlow) {
			result = this.ConceptualFlowImage;
		} else if (eObject instanceof ConceptualElement) {
			result = this.ConceptualElementImage;
		} else if (eObject instanceof ConceptualRole) {
			result = this.ConceptualRoleImage;
		} else if (eObject instanceof AbstractConceptualElement) {
			result = this.AbstractConceptualElementImage;
		} else if (eObject instanceof AbstractConceptualRelationship) {
			result = this.AbstractConceptualRelationshipImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/conceptual/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
