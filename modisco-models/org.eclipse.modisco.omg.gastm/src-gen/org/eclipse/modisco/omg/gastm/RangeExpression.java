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
 * A representation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.RangeExpression#getFromExpression <em>From Expression</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.RangeExpression#getToExpression <em>To Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getRangeExpression()
 * @model
 * @generated
 */
public interface RangeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>From Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Expression</em>' containment reference.
	 * @see #setFromExpression(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getRangeExpression_FromExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFromExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.RangeExpression#getFromExpression <em>From Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Expression</em>' containment reference.
	 * @see #getFromExpression()
	 * @generated
	 */
	void setFromExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>To Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Expression</em>' containment reference.
	 * @see #setToExpression(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getRangeExpression_ToExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getToExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.RangeExpression#getToExpression <em>To Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Expression</em>' containment reference.
	 * @see #getToExpression()
	 * @generated
	 */
	void setToExpression(Expression value);

} // RangeExpression
