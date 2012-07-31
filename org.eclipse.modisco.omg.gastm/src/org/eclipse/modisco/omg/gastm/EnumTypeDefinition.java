/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.EnumTypeDefinition#getDefinitionType <em>Definition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getEnumTypeDefinition()
 * @model
 * @generated
 */
public interface EnumTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Type</em>' containment reference.
	 * @see #setDefinitionType(EnumType)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getEnumTypeDefinition_DefinitionType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EnumType getDefinitionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.EnumTypeDefinition#getDefinitionType <em>Definition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Type</em>' containment reference.
	 * @see #getDefinitionType()
	 * @generated
	 */
	void setDefinitionType(EnumType value);

} // EnumTypeDefinition
