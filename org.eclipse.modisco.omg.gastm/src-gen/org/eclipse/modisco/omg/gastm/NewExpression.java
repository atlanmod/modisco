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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NewExpression#getNewType <em>New Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NewExpression#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNewExpression()
 * @model
 * @generated
 */
public interface NewExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' containment reference.
	 * @see #setNewType(TypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNewExpression_NewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getNewType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.NewExpression#getNewType <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' containment reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Actual Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.ActualParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Params</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNewExpression_ActualParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualParameter> getActualParams();

} // NewExpression
