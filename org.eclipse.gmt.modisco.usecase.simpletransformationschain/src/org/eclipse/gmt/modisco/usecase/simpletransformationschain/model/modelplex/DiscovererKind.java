/**
 * ******************************************************************************
 *  Copyright (c) 2009, 2011 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 * ******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Discoverer Kind</b></em>', and utility methods for working with them. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getDiscovererKind()
 * @model
 * @generated
 */
public enum DiscovererKind implements Enumerator {
	/**
	 * The '<em><b>Csharp</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #CSHARP_VALUE
	 * @generated
	 * @ordered
	 */
	CSHARP(0, "csharp", "csharp"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Java</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #JAVA_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA(1, "java", "java"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Csharp</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Csharp</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #CSHARP
	 * @model name="csharp"
	 * @generated
	 * @ordered
	 */
	public static final int CSHARP_VALUE = 0;

	/**
	 * The '<em><b>Java</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #JAVA
	 * @model name="java"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Discoverer Kind</b></em>' enumerators. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DiscovererKind[] VALUES_ARRAY = new DiscovererKind[] { CSHARP, JAVA, };

	/**
	 * A public read-only list of all the '<em><b>Discoverer Kind</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DiscovererKind> VALUES = Collections.unmodifiableList(Arrays
			.asList(DiscovererKind.VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Discoverer Kind</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DiscovererKind get(final String literal) {
		for (int i = 0; i < DiscovererKind.VALUES_ARRAY.length; ++i) {
			DiscovererKind result = DiscovererKind.VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discoverer Kind</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DiscovererKind getByName(final String name) {
		for (int i = 0; i < DiscovererKind.VALUES_ARRAY.length; ++i) {
			DiscovererKind result = DiscovererKind.VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discoverer Kind</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DiscovererKind get(final int value) {
		switch (value) {
		case CSHARP_VALUE:
			return CSHARP;
		case JAVA_VALUE:
			return JAVA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private DiscovererKind(final int value, final String name, final String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return this.literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return this.literal;
	}

} // DiscovererKind
