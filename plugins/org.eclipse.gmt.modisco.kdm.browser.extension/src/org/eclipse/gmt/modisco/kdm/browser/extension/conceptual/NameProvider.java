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
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.AbstractNameProvider;
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

/**
 * @generated
 */
public class NameProvider extends AbstractNameProvider {
	// Start of user code for additional methods and attributes

	// End of user code

	// Start of user code name attribute for FactUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getFactUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for BehaviorUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getBehaviorUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RuleUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRuleUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ScenarioUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getScenarioUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConceptualModel
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConceptualModelName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TermUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTermUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConceptualContainer
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConceptualContainerName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConceptualRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConceptualRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConceptualFlow
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConceptualFlowName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConceptualElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConceptualElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConceptualRole
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConceptualRoleName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractConceptualElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractConceptualElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractConceptualRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractConceptualRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code

	/**
	 * @generated
	 */
	public NameProvider() {
		//
	}

	/**
	 * @return the name that must be displayed for the given {@link EObject}, or
	 *         <code>null</code> to keep the default name (or let another
	 *         {@link NameProvider} provide the name)
	 * 
	 * @generated
	 */
	public String getName(final EObject eObject) {
		String result = getDefaultName(eObject);
		if (eObject instanceof FactUnit) {
			result = getFactUnitName(eObject);
		} else if (eObject instanceof BehaviorUnit) {
			result = getBehaviorUnitName(eObject);
		} else if (eObject instanceof RuleUnit) {
			result = getRuleUnitName(eObject);
		} else if (eObject instanceof ScenarioUnit) {
			result = getScenarioUnitName(eObject);
		} else if (eObject instanceof ConceptualModel) {
			result = getConceptualModelName(eObject);
		} else if (eObject instanceof TermUnit) {
			result = getTermUnitName(eObject);
		} else if (eObject instanceof ConceptualContainer) {
			result = getConceptualContainerName(eObject);
		} else if (eObject instanceof ConceptualRelationship) {
			result = getConceptualRelationshipName(eObject);
		} else if (eObject instanceof ConceptualFlow) {
			result = getConceptualFlowName(eObject);
		} else if (eObject instanceof ConceptualElement) {
			result = getConceptualElementName(eObject);
		} else if (eObject instanceof ConceptualRole) {
			result = getConceptualRoleName(eObject);
		} else if (eObject instanceof AbstractConceptualElement) {
			result = getAbstractConceptualElementName(eObject);
		} else if (eObject instanceof AbstractConceptualRelationship) {
			result = getAbstractConceptualRelationshipName(eObject);
		}
		return result;
	}

}
