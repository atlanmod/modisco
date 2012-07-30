/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getWebResourceCollection <em>Web Resource Collection</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getAuthConstraint <em>Auth Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getUserDataConstraint <em>User Data Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getSecurityConstraintType()
 * @model extendedMetaData="name='security-constraint_._type' kind='elementOnly'"
 * @generated
 */
public interface SecurityConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(DisplayNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getSecurityConstraintType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

	/**
	 * Returns the value of the '<em><b>Web Resource Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp23.WebResourceCollectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Resource Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Resource Collection</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getSecurityConstraintType_WebResourceCollection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='web-resource-collection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WebResourceCollectionType> getWebResourceCollection();

	/**
	 * Returns the value of the '<em><b>Auth Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Constraint</em>' containment reference.
	 * @see #setAuthConstraint(AuthConstraintType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getSecurityConstraintType_AuthConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auth-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthConstraintType getAuthConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getAuthConstraint <em>Auth Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Constraint</em>' containment reference.
	 * @see #getAuthConstraint()
	 * @generated
	 */
	void setAuthConstraint(AuthConstraintType value);

	/**
	 * Returns the value of the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Data Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data Constraint</em>' containment reference.
	 * @see #setUserDataConstraint(UserDataConstraintType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getSecurityConstraintType_UserDataConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-data-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDataConstraintType getUserDataConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getUserDataConstraint <em>User Data Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Constraint</em>' containment reference.
	 * @see #getUserDataConstraint()
	 * @generated
	 */
	void setUserDataConstraint(UserDataConstraintType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getSecurityConstraintType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SecurityConstraintType
