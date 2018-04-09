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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp25.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextRefType;
import org.eclipse.modisco.jee.webapp.webapp25.PersistenceContextTypeType;
import org.eclipse.modisco.jee.webapp.webapp25.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;
import org.eclipse.modisco.jee.webapp.webapp25.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Context Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getPersistenceContextRefName <em>Persistence Context Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getPersistenceUnitName <em>Persistence Unit Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getPersistenceContextType <em>Persistence Context Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getPersistenceProperty <em>Persistence Property</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.PersistenceContextRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceContextRefTypeImpl extends EObjectImpl implements PersistenceContextRefType {
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
	 * The cached value of the '{@link #getPersistenceContextRefName() <em>Persistence Context Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceContextRefName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType persistenceContextRefName;

	/**
	 * The cached value of the '{@link #getPersistenceUnitName() <em>Persistence Unit Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp25.String persistenceUnitName;

	/**
	 * The cached value of the '{@link #getPersistenceContextType() <em>Persistence Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceContextType()
	 * @generated
	 * @ordered
	 */
	protected PersistenceContextTypeType persistenceContextType;

	/**
	 * The cached value of the '{@link #getPersistenceProperty() <em>Persistence Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> persistenceProperty;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType mappedName;

	/**
	 * The cached value of the '{@link #getInjectionTarget() <em>Injection Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<InjectionTargetType> injectionTarget;

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
	protected PersistenceContextRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.PERSISTENCE_CONTEXT_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getPersistenceContextRefName() {
		return persistenceContextRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceContextRefName(JndiNameType newPersistenceContextRefName, NotificationChain msgs) {
		JndiNameType oldPersistenceContextRefName = persistenceContextRefName;
		persistenceContextRefName = newPersistenceContextRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME, oldPersistenceContextRefName, newPersistenceContextRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceContextRefName(JndiNameType newPersistenceContextRefName) {
		if (newPersistenceContextRefName != persistenceContextRefName) {
			NotificationChain msgs = null;
			if (persistenceContextRefName != null)
				msgs = ((InternalEObject)persistenceContextRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME, null, msgs);
			if (newPersistenceContextRefName != null)
				msgs = ((InternalEObject)newPersistenceContextRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME, null, msgs);
			msgs = basicSetPersistenceContextRefName(newPersistenceContextRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME, newPersistenceContextRefName, newPersistenceContextRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp25.String getPersistenceUnitName() {
		return persistenceUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceUnitName(org.eclipse.modisco.jee.webapp.webapp25.String newPersistenceUnitName, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp25.String oldPersistenceUnitName = persistenceUnitName;
		persistenceUnitName = newPersistenceUnitName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME, oldPersistenceUnitName, newPersistenceUnitName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnitName(org.eclipse.modisco.jee.webapp.webapp25.String newPersistenceUnitName) {
		if (newPersistenceUnitName != persistenceUnitName) {
			NotificationChain msgs = null;
			if (persistenceUnitName != null)
				msgs = ((InternalEObject)persistenceUnitName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME, null, msgs);
			if (newPersistenceUnitName != null)
				msgs = ((InternalEObject)newPersistenceUnitName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME, null, msgs);
			msgs = basicSetPersistenceUnitName(newPersistenceUnitName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME, newPersistenceUnitName, newPersistenceUnitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextTypeType getPersistenceContextType() {
		return persistenceContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceContextType(PersistenceContextTypeType newPersistenceContextType, NotificationChain msgs) {
		PersistenceContextTypeType oldPersistenceContextType = persistenceContextType;
		persistenceContextType = newPersistenceContextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE, oldPersistenceContextType, newPersistenceContextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceContextType(PersistenceContextTypeType newPersistenceContextType) {
		if (newPersistenceContextType != persistenceContextType) {
			NotificationChain msgs = null;
			if (persistenceContextType != null)
				msgs = ((InternalEObject)persistenceContextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE, null, msgs);
			if (newPersistenceContextType != null)
				msgs = ((InternalEObject)newPersistenceContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE, null, msgs);
			msgs = basicSetPersistenceContextType(newPersistenceContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE, newPersistenceContextType, newPersistenceContextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getPersistenceProperty() {
		if (persistenceProperty == null) {
			persistenceProperty = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY);
		}
		return persistenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedName(XsdStringType newMappedName, NotificationChain msgs) {
		XsdStringType oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(XsdStringType newMappedName) {
		if (newMappedName != mappedName) {
			NotificationChain msgs = null;
			if (mappedName != null)
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionTargetType> getInjectionTarget() {
		if (injectionTarget == null) {
			injectionTarget = new EObjectContainmentEList<InjectionTargetType>(InjectionTargetType.class, this, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET);
		}
		return injectionTarget;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME:
				return basicSetPersistenceContextRefName(null, msgs);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME:
				return basicSetPersistenceUnitName(null, msgs);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE:
				return basicSetPersistenceContextType(null, msgs);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY:
				return ((InternalEList<?>)getPersistenceProperty()).basicRemove(otherEnd, msgs);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET:
				return ((InternalEList<?>)getInjectionTarget()).basicRemove(otherEnd, msgs);
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
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME:
				return getPersistenceContextRefName();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME:
				return getPersistenceUnitName();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE:
				return getPersistenceContextType();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY:
				return getPersistenceProperty();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME:
				return getMappedName();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET:
				return getInjectionTarget();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__ID:
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
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME:
				setPersistenceContextRefName((JndiNameType)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME:
				setPersistenceUnitName((org.eclipse.modisco.jee.webapp.webapp25.String)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE:
				setPersistenceContextType((PersistenceContextTypeType)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY:
				getPersistenceProperty().clear();
				getPersistenceProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				getInjectionTarget().addAll((Collection<? extends InjectionTargetType>)newValue);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__ID:
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
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME:
				setPersistenceContextRefName((JndiNameType)null);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME:
				setPersistenceUnitName((org.eclipse.modisco.jee.webapp.webapp25.String)null);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE:
				setPersistenceContextType((PersistenceContextTypeType)null);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY:
				getPersistenceProperty().clear();
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				return;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__ID:
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
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_REF_NAME:
				return persistenceContextRefName != null;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_UNIT_NAME:
				return persistenceUnitName != null;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_CONTEXT_TYPE:
				return persistenceContextType != null;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__PERSISTENCE_PROPERTY:
				return persistenceProperty != null && !persistenceProperty.isEmpty();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__MAPPED_NAME:
				return mappedName != null;
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__INJECTION_TARGET:
				return injectionTarget != null && !injectionTarget.isEmpty();
			case Webapp25Package.PERSISTENCE_CONTEXT_REF_TYPE__ID:
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

} //PersistenceContextRefTypeImpl
