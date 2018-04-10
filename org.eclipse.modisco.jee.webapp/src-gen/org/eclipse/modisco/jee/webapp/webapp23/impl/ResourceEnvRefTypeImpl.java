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
package org.eclipse.modisco.jee.webapp.webapp23.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType;
import org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Env Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ResourceEnvRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceEnvRefTypeImpl extends EObjectImpl implements ResourceEnvRefType {
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
	 * The cached value of the '{@link #getResourceEnvRefName() <em>Resource Env Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRefName()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvRefNameType resourceEnvRefName;

	/**
	 * The cached value of the '{@link #getResourceEnvRefType() <em>Resource Env Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRefType()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvRefTypeType resourceEnvRefType;

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
	protected ResourceEnvRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.RESOURCE_ENV_REF_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefNameType getResourceEnvRefName() {
		return resourceEnvRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefName(ResourceEnvRefNameType newResourceEnvRefName, NotificationChain msgs) {
		ResourceEnvRefNameType oldResourceEnvRefName = resourceEnvRefName;
		resourceEnvRefName = newResourceEnvRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, oldResourceEnvRefName, newResourceEnvRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefName(ResourceEnvRefNameType newResourceEnvRefName) {
		if (newResourceEnvRefName != resourceEnvRefName) {
			NotificationChain msgs = null;
			if (resourceEnvRefName != null)
				msgs = ((InternalEObject)resourceEnvRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, null, msgs);
			if (newResourceEnvRefName != null)
				msgs = ((InternalEObject)newResourceEnvRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, null, msgs);
			msgs = basicSetResourceEnvRefName(newResourceEnvRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME, newResourceEnvRefName, newResourceEnvRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefTypeType getResourceEnvRefType() {
		return resourceEnvRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefType(ResourceEnvRefTypeType newResourceEnvRefType, NotificationChain msgs) {
		ResourceEnvRefTypeType oldResourceEnvRefType = resourceEnvRefType;
		resourceEnvRefType = newResourceEnvRefType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, oldResourceEnvRefType, newResourceEnvRefType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefType(ResourceEnvRefTypeType newResourceEnvRefType) {
		if (newResourceEnvRefType != resourceEnvRefType) {
			NotificationChain msgs = null;
			if (resourceEnvRefType != null)
				msgs = ((InternalEObject)resourceEnvRefType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, null, msgs);
			if (newResourceEnvRefType != null)
				msgs = ((InternalEObject)newResourceEnvRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, null, msgs);
			msgs = basicSetResourceEnvRefType(newResourceEnvRefType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE, newResourceEnvRefType, newResourceEnvRefType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.RESOURCE_ENV_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				return basicSetResourceEnvRefName(null, msgs);
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				return basicSetResourceEnvRefType(null, msgs);
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
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				return getResourceEnvRefName();
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				return getResourceEnvRefType();
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__ID:
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
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((ResourceEnvRefNameType)newValue);
				return;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((ResourceEnvRefTypeType)newValue);
				return;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__ID:
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
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((ResourceEnvRefNameType)null);
				return;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((ResourceEnvRefTypeType)null);
				return;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__ID:
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
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__DESCRIPTION:
				return description != null;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_NAME:
				return resourceEnvRefName != null;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__RESOURCE_ENV_REF_TYPE:
				return resourceEnvRefType != null;
			case Webapp23Package.RESOURCE_ENV_REF_TYPE__ID:
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

} //ResourceEnvRefTypeImpl
