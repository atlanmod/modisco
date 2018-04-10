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
package org.eclipse.modisco.jee.webapp.webapp30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         Declares the handler for a port-component, service-ref. Handlers can
 *         access the init-param name/value pairs using the HandlerInfo interface.
 *         
 *         Used in: port-component, service-ref
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerName <em>Handler Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerClass <em>Handler Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getSoapHeader <em>Soap Header</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getSoapRole <em>Soap Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType()
 * @model extendedMetaData="name='handlerType' kind='elementOnly'"
 * @generated
 */
public interface HandlerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Handler Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Defines the name of the handler. The name must be unique within the
	 *             module.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Name</em>' containment reference.
	 * @see #setHandlerName(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_HandlerName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='handler-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getHandlerName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerName <em>Handler Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Name</em>' containment reference.
	 * @see #getHandlerName()
	 * @generated
	 */
	void setHandlerName(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Handler Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Defines a fully qualified class name for the handler implementation.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Class</em>' containment reference.
	 * @see #setHandlerClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_HandlerClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='handler-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getHandlerClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getHandlerClass <em>Handler Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Class</em>' containment reference.
	 * @see #getHandlerClass()
	 * @generated
	 */
	void setHandlerClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.ParamValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Not to be specified for JAX-WS runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_InitParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-param' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ParamValueType> getInitParam();

	/**
	 * Returns the value of the '<em><b>Soap Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.XsdQNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Defines the QName of a SOAP header that will be processed by the
	 *             handler.
	 *             
	 *             Not to be specified for JAX-WS runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap Header</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_SoapHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap-header' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<XsdQNameType> getSoapHeader();

	/**
	 * Returns the value of the '<em><b>Soap Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The soap-role element contains a SOAP actor definition that the
	 *             Handler will play as a role.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap Role</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_SoapRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap-role' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<org.eclipse.modisco.jee.webapp.webapp30.String> getSoapRole();

	/**
	 * Returns the value of the '<em><b>Port Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The port-name element defines the WSDL port-name that a
	 *             handler should be associated with. If port-name is not
	 *             specified, the handler is assumed to be associated with
	 *             all ports of the service.
	 *             
	 *             Not to be specified for JAX-WS runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_PortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<org.eclipse.modisco.jee.webapp.webapp30.String> getPortName();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // HandlerType
