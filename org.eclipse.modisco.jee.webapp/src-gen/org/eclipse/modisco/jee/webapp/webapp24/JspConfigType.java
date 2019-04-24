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
package org.eclipse.modisco.jee.webapp.webapp24;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsp Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The jsp-configType is used to provide global configuration
 * 	information for the JSP files in a web application. It has
 * 	two subelements, taglib and jsp-property-group.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getTaglib <em>Taglib</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getJspPropertyGroup <em>Jsp Property Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getJspConfigType()
 * @model extendedMetaData="name='jsp-configType' kind='elementOnly'"
 * @generated
 */
public interface JspConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Taglib</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.TaglibType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getJspConfigType_Taglib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='taglib' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<TaglibType> getTaglib();

	/**
	 * Returns the value of the '<em><b>Jsp Property Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.JspPropertyGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsp Property Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsp Property Group</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getJspConfigType_JspPropertyGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsp-property-group' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<JspPropertyGroupType> getJspPropertyGroup();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getJspConfigType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // JspConfigType
