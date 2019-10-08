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
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.lang.String;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerChainType;
import org.eclipse.modisco.jee.webapp.webapp25.ServiceRefHandlerType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Ref Handler Chain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServiceRefHandlerChainTypeImpl#getServiceNamePattern <em>Service Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServiceRefHandlerChainTypeImpl#getPortNamePattern <em>Port Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServiceRefHandlerChainTypeImpl#getProtocolBindings <em>Protocol Bindings</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServiceRefHandlerChainTypeImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServiceRefHandlerChainTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceRefHandlerChainTypeImpl extends EObjectImpl implements ServiceRefHandlerChainType {
	/**
	 * The default value of the '{@link #getServiceNamePattern() <em>Service Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNamePattern() <em>Service Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String serviceNamePattern = SERVICE_NAME_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNamePattern() <em>Port Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortNamePattern() <em>Port Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String portNamePattern = PORT_NAME_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolBindings() <em>Protocol Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolBindings()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> PROTOCOL_BINDINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolBindings() <em>Protocol Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolBindings()
	 * @generated
	 * @ordered
	 */
	protected List<String> protocolBindings = PROTOCOL_BINDINGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRefHandlerType> handler;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRefHandlerChainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.SERVICE_REF_HANDLER_CHAIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNamePattern() {
		return serviceNamePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNamePattern(String newServiceNamePattern) {
		String oldServiceNamePattern = serviceNamePattern;
		serviceNamePattern = newServiceNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN, oldServiceNamePattern, serviceNamePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortNamePattern() {
		return portNamePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNamePattern(String newPortNamePattern) {
		String oldPortNamePattern = portNamePattern;
		portNamePattern = newPortNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN, oldPortNamePattern, portNamePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getProtocolBindings() {
		return protocolBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolBindings(List<String> newProtocolBindings) {
		List<String> oldProtocolBindings = protocolBindings;
		protocolBindings = newProtocolBindings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS, oldProtocolBindings, protocolBindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRefHandlerType> getHandler() {
		if (handler == null) {
			handler = new EObjectContainmentEList<ServiceRefHandlerType>(ServiceRefHandlerType.class, this, Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER);
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN:
				return getServiceNamePattern();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN:
				return getPortNamePattern();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS:
				return getProtocolBindings();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER:
				return getHandler();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN:
				setServiceNamePattern((String)newValue);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN:
				setPortNamePattern((String)newValue);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS:
				setProtocolBindings((List<String>)newValue);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends ServiceRefHandlerType>)newValue);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN:
				setServiceNamePattern(SERVICE_NAME_PATTERN_EDEFAULT);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN:
				setPortNamePattern(PORT_NAME_PATTERN_EDEFAULT);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS:
				setProtocolBindings(PROTOCOL_BINDINGS_EDEFAULT);
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER:
				getHandler().clear();
				return;
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__SERVICE_NAME_PATTERN:
				return SERVICE_NAME_PATTERN_EDEFAULT == null ? serviceNamePattern != null : !SERVICE_NAME_PATTERN_EDEFAULT.equals(serviceNamePattern);
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PORT_NAME_PATTERN:
				return PORT_NAME_PATTERN_EDEFAULT == null ? portNamePattern != null : !PORT_NAME_PATTERN_EDEFAULT.equals(portNamePattern);
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__PROTOCOL_BINDINGS:
				return PROTOCOL_BINDINGS_EDEFAULT == null ? protocolBindings != null : !PROTOCOL_BINDINGS_EDEFAULT.equals(protocolBindings);
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__HANDLER:
				return handler != null && !handler.isEmpty();
			case Webapp25Package.SERVICE_REF_HANDLER_CHAIN_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceNamePattern: "); //$NON-NLS-1$
		result.append(serviceNamePattern);
		result.append(", portNamePattern: "); //$NON-NLS-1$
		result.append(portNamePattern);
		result.append(", protocolBindings: "); //$NON-NLS-1$
		result.append(protocolBindings);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ServiceRefHandlerChainTypeImpl
