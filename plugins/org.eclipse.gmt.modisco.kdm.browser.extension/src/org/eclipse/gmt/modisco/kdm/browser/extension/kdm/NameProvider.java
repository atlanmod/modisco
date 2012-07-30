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
package org.eclipse.gmt.modisco.kdm.browser.extension.kdm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.AbstractNameProvider;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Annotation;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Audit;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;
import org.eclipse.gmt.modisco.omg.kdm.kdm.TagDefinition;
import org.eclipse.gmt.modisco.omg.kdm.kdm.TaggedRef;
import org.eclipse.gmt.modisco.omg.kdm.kdm.TaggedValue;

/**
 * @generated
 */
public class NameProvider extends AbstractNameProvider {
	// Start of user code for additional methods and attributes

	// End of user code

	// Start of user code name attribute for KDMModel
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getKDMModelName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Segment
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSegmentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for KDMFramework
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getKDMFrameworkName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TaggedValue
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTaggedValueName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TaggedRef
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTaggedRefName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Audit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAuditName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Stereotype
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getStereotypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TagDefinition
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTagDefinitionName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ExtensionFamily
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExtensionFamilyName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ExtendedValue
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExtendedValueName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Attribute
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAttributeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Annotation
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAnnotationName(final EObject eObject) {
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
		if (eObject instanceof KDMModel) {
			result = getKDMModelName(eObject);
		} else if (eObject instanceof Segment) {
			result = getSegmentName(eObject);
		} else if (eObject instanceof KDMFramework) {
			result = getKDMFrameworkName(eObject);
		} else if (eObject instanceof TaggedValue) {
			result = getTaggedValueName(eObject);
		} else if (eObject instanceof TaggedRef) {
			result = getTaggedRefName(eObject);
		} else if (eObject instanceof Audit) {
			result = getAuditName(eObject);
		} else if (eObject instanceof Stereotype) {
			result = getStereotypeName(eObject);
		} else if (eObject instanceof TagDefinition) {
			result = getTagDefinitionName(eObject);
		} else if (eObject instanceof ExtensionFamily) {
			result = getExtensionFamilyName(eObject);
		} else if (eObject instanceof ExtendedValue) {
			result = getExtendedValueName(eObject);
		} else if (eObject instanceof Attribute) {
			result = getAttributeName(eObject);
		} else if (eObject instanceof Annotation) {
			result = getAnnotationName(eObject);
		}
		return result;
	}

}
