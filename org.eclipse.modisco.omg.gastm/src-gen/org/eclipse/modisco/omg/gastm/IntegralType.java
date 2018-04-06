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

import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integral Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.IntegralType#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getIntegralType()
 * @model abstract="true"
 * @generated
 */
public interface IntegralType extends NumberType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getIntegralType_Size()
	 * @model
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.IntegralType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // IntegralType
