/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visible In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getVisibleIn()
 * @model
 * @generated
 */
public interface VisibleIn extends AbstractCodeRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CodeItem)
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getVisibleIn_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CodeItem getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CodeItem value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CodeItem)
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getVisibleIn_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CodeItem getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CodeItem value);

} // VisibleIn
