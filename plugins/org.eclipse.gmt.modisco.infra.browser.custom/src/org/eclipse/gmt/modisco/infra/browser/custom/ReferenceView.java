/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getReferenceView()
 * @model
 * @generated
 */
public interface ReferenceView extends CustomView {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getReferenceView_ReferenceName()
	 * @model
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.infra.browser.custom.TypeView#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getReferenceView_Type()
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.TypeView#getReferences
	 * @model opposite="references" required="true" transient="false" changeable="false"
	 * @generated
	 */
	TypeView getType();

} // ReferenceView
