/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getAssemblyDescriptorType()
 * @model extendedMetaData="name='assembly-descriptor_._type' kind='elementOnly'"
 * @generated
 */
public interface AssemblyDescriptorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getAssemblyDescriptorType_SecurityRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityRoleType> getSecurityRole();

	/**
	 * Returns the value of the '<em><b>Method Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Permission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Permission</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getAssemblyDescriptorType_MethodPermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method-permission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodPermissionType> getMethodPermission();

	/**
	 * Returns the value of the '<em><b>Container Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Transaction</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getAssemblyDescriptorType_ContainerTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container-transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContainerTransactionType> getContainerTransaction();

	/**
	 * Returns the value of the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude List</em>' containment reference.
	 * @see #setExcludeList(ExcludeListType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getAssemblyDescriptorType_ExcludeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-list' namespace='##targetNamespace'"
	 * @generated
	 */
	ExcludeListType getExcludeList();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude List</em>' containment reference.
	 * @see #getExcludeList()
	 * @generated
	 */
	void setExcludeList(ExcludeListType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getAssemblyDescriptorType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AssemblyDescriptorType
