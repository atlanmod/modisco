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
package org.eclipse.gmt.modisco.kdm.browser.extension.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.AbstractNameProvider;
import org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.Element;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;

/**
 * @generated
 */
public class NameProvider extends AbstractNameProvider {
	// Start of user code for additional methods and attributes

	// End of user code

	// Start of user code name attribute for KDMEntity
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getKDMEntityName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for KDMRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getKDMRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AggregatedRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAggregatedRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ModelElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getModelElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Element
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getElementName(final EObject eObject) {
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
		if (eObject instanceof KDMEntity) {
			result = getKDMEntityName(eObject);
		} else if (eObject instanceof KDMRelationship) {
			result = getKDMRelationshipName(eObject);
		} else if (eObject instanceof AggregatedRelationship) {
			result = getAggregatedRelationshipName(eObject);
		} else if (eObject instanceof ModelElement) {
			result = getModelElementName(eObject);
		} else if (eObject instanceof Element) {
			result = getElementName(eObject);
		}
		return result;
	}

}
