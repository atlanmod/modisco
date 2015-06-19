/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.modiscoworkflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Element</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getElement()
 * @model abstract="true"
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getElement_Name()
	 * @model
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getElement_Type()
	 * @model
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	String getType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element#getType <em>Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getElement_Index()
	 * @model
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	int getIndex();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element#getIndex <em>Index</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	void setIndex(int value);

} // Element
