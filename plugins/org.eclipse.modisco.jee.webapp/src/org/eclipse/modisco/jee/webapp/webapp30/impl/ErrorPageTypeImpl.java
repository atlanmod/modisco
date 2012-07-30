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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp30.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp30.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Page Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorPageTypeImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorPageTypeImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorPageTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.ErrorPageTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorPageTypeImpl extends EObjectImpl implements ErrorPageType {
	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected ErrorCodeType errorCode;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType exceptionType;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected WarPathType location;

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
	protected ErrorPageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getErrorPageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeType getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorCode(ErrorCodeType newErrorCode, NotificationChain msgs) {
		ErrorCodeType oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE, oldErrorCode, newErrorCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(ErrorCodeType newErrorCode) {
		if (newErrorCode != errorCode) {
			NotificationChain msgs = null;
			if (errorCode != null)
				msgs = ((InternalEObject)errorCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE, null, msgs);
			if (newErrorCode != null)
				msgs = ((InternalEObject)newErrorCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE, null, msgs);
			msgs = basicSetErrorCode(newErrorCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE, newErrorCode, newErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionType(FullyQualifiedClassType newExceptionType, NotificationChain msgs) {
		FullyQualifiedClassType oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, oldExceptionType, newExceptionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(FullyQualifiedClassType newExceptionType) {
		if (newExceptionType != exceptionType) {
			NotificationChain msgs = null;
			if (exceptionType != null)
				msgs = ((InternalEObject)exceptionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, null, msgs);
			if (newExceptionType != null)
				msgs = ((InternalEObject)newExceptionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, null, msgs);
			msgs = basicSetExceptionType(newExceptionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, newExceptionType, newExceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarPathType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(WarPathType newLocation, NotificationChain msgs) {
		WarPathType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(WarPathType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ERROR_PAGE_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ERROR_PAGE_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__LOCATION, newLocation, newLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ERROR_PAGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE:
				return basicSetErrorCode(null, msgs);
			case Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				return basicSetExceptionType(null, msgs);
			case Webapp30Package.ERROR_PAGE_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE:
				return getErrorCode();
			case Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				return getExceptionType();
			case Webapp30Package.ERROR_PAGE_TYPE__LOCATION:
				return getLocation();
			case Webapp30Package.ERROR_PAGE_TYPE__ID:
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
			case Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE:
				setErrorCode((ErrorCodeType)newValue);
				return;
			case Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				setExceptionType((FullyQualifiedClassType)newValue);
				return;
			case Webapp30Package.ERROR_PAGE_TYPE__LOCATION:
				setLocation((WarPathType)newValue);
				return;
			case Webapp30Package.ERROR_PAGE_TYPE__ID:
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
			case Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE:
				setErrorCode((ErrorCodeType)null);
				return;
			case Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				setExceptionType((FullyQualifiedClassType)null);
				return;
			case Webapp30Package.ERROR_PAGE_TYPE__LOCATION:
				setLocation((WarPathType)null);
				return;
			case Webapp30Package.ERROR_PAGE_TYPE__ID:
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
			case Webapp30Package.ERROR_PAGE_TYPE__ERROR_CODE:
				return errorCode != null;
			case Webapp30Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				return exceptionType != null;
			case Webapp30Package.ERROR_PAGE_TYPE__LOCATION:
				return location != null;
			case Webapp30Package.ERROR_PAGE_TYPE__ID:
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

} //ErrorPageTypeImpl
