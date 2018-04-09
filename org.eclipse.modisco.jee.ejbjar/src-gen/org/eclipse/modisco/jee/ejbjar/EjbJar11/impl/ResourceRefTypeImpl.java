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
package org.eclipse.modisco.jee.ejbjar.EjbJar11.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.ResourceRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRefTypeImpl extends EObjectImpl implements ResourceRefType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getResRefName() <em>Res Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResRefName()
	 * @generated
	 * @ordered
	 */
	protected ResRefNameType resRefName;

	/**
	 * The cached value of the '{@link #getResType() <em>Res Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResType()
	 * @generated
	 * @ordered
	 */
	protected ResTypeType resType;

	/**
	 * The cached value of the '{@link #getResAuth() <em>Res Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAuth()
	 * @generated
	 * @ordered
	 */
	protected ResAuthType resAuth;

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
	protected ResourceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar11Package.Literals.RESOURCE_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResRefNameType getResRefName() {
		return resRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResRefName(ResRefNameType newResRefName, NotificationChain msgs) {
		ResRefNameType oldResRefName = resRefName;
		resRefName = newResRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME, oldResRefName, newResRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResRefName(ResRefNameType newResRefName) {
		if (newResRefName != resRefName) {
			NotificationChain msgs = null;
			if (resRefName != null)
				msgs = ((InternalEObject)resRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME, null, msgs);
			if (newResRefName != null)
				msgs = ((InternalEObject)newResRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME, null, msgs);
			msgs = basicSetResRefName(newResRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME, newResRefName, newResRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResTypeType getResType() {
		return resType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResType(ResTypeType newResType, NotificationChain msgs) {
		ResTypeType oldResType = resType;
		resType = newResType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE, oldResType, newResType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(ResTypeType newResType) {
		if (newResType != resType) {
			NotificationChain msgs = null;
			if (resType != null)
				msgs = ((InternalEObject)resType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE, null, msgs);
			if (newResType != null)
				msgs = ((InternalEObject)newResType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE, null, msgs);
			msgs = basicSetResType(newResType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE, newResType, newResType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType getResAuth() {
		return resAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResAuth(ResAuthType newResAuth, NotificationChain msgs) {
		ResAuthType oldResAuth = resAuth;
		resAuth = newResAuth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH, oldResAuth, newResAuth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAuth(ResAuthType newResAuth) {
		if (newResAuth != resAuth) {
			NotificationChain msgs = null;
			if (resAuth != null)
				msgs = ((InternalEObject)resAuth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH, null, msgs);
			if (newResAuth != null)
				msgs = ((InternalEObject)newResAuth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH, null, msgs);
			msgs = basicSetResAuth(newResAuth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH, newResAuth, newResAuth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.RESOURCE_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return basicSetResRefName(null, msgs);
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE:
				return basicSetResType(null, msgs);
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH:
				return basicSetResAuth(null, msgs);
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
			case EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return getResRefName();
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE:
				return getResType();
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH:
				return getResAuth();
			case EjbJar11Package.RESOURCE_REF_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				setResRefName((ResRefNameType)newValue);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE:
				setResType((ResTypeType)newValue);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH:
				setResAuth((ResAuthType)newValue);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__ID:
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
			case EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				setResRefName((ResRefNameType)null);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE:
				setResType((ResTypeType)null);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH:
				setResAuth((ResAuthType)null);
				return;
			case EjbJar11Package.RESOURCE_REF_TYPE__ID:
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
			case EjbJar11Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return resRefName != null;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_TYPE:
				return resType != null;
			case EjbJar11Package.RESOURCE_REF_TYPE__RES_AUTH:
				return resAuth != null;
			case EjbJar11Package.RESOURCE_REF_TYPE__ID:
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ResourceRefTypeImpl
