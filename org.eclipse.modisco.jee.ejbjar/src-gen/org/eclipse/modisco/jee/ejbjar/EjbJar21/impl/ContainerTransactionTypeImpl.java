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
package org.eclipse.modisco.jee.ejbjar.EjbJar21.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar21.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.TransAttributeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl#getTransAttribute <em>Trans Attribute</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ContainerTransactionTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerTransactionTypeImpl extends EObjectImpl implements ContainerTransactionType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodType> method;

	/**
	 * The cached value of the '{@link #getTransAttribute() <em>Trans Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransAttribute()
	 * @generated
	 * @ordered
	 */
	protected TransAttributeType transAttribute;

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
	protected ContainerTransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar21Package.Literals.CONTAINER_TRANSACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar21Package.CONTAINER_TRANSACTION_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodType> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<MethodType>(MethodType.class, this, EjbJar21Package.CONTAINER_TRANSACTION_TYPE__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeType getTransAttribute() {
		return transAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransAttribute(TransAttributeType newTransAttribute, NotificationChain msgs) {
		TransAttributeType oldTransAttribute = transAttribute;
		transAttribute = newTransAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE, oldTransAttribute, newTransAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransAttribute(TransAttributeType newTransAttribute) {
		if (newTransAttribute != transAttribute) {
			NotificationChain msgs = null;
			if (transAttribute != null)
				msgs = ((InternalEObject)transAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE, null, msgs);
			if (newTransAttribute != null)
				msgs = ((InternalEObject)newTransAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE, null, msgs);
			msgs = basicSetTransAttribute(newTransAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE, newTransAttribute, newTransAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar21Package.CONTAINER_TRANSACTION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE:
				return basicSetTransAttribute(null, msgs);
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
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__METHOD:
				return getMethod();
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE:
				return getTransAttribute();
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__ID:
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
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends MethodType>)newValue);
				return;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE:
				setTransAttribute((TransAttributeType)newValue);
				return;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__ID:
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
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__METHOD:
				getMethod().clear();
				return;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE:
				setTransAttribute((TransAttributeType)null);
				return;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__ID:
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
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__METHOD:
				return method != null && !method.isEmpty();
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE:
				return transAttribute != null;
			case EjbJar21Package.CONTAINER_TRANSACTION_TYPE__ID:
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

} //ContainerTransactionTypeImpl
