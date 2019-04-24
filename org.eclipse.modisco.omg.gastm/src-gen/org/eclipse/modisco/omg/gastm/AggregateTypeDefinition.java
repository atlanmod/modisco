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
 * A representation of the model object '<em><b>Aggregate Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAggregateTypeDefinition()
 * @model
 * @generated
 */
public interface AggregateTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Aggregate Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #setAggregateType(AggregateType)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAggregateTypeDefinition_AggregateType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AggregateType getAggregateType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.AggregateTypeDefinition#getAggregateType <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Type</em>' containment reference.
	 * @see #getAggregateType()
	 * @generated
	 */
	void setAggregateType(AggregateType value);

} // AggregateTypeDefinition
