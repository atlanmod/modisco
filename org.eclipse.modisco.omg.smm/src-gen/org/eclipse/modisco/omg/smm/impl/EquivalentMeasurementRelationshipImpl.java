/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship;
import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.EquivalentMeasurementRelationshipImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.EquivalentMeasurementRelationshipImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentMeasurementRelationshipImpl extends MeasurementRelationshipImpl implements EquivalentMeasurementRelationship {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Measurement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Measurement to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentMeasurementRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.EQUIVALENT_MEASUREMENT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Measurement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Measurement newFrom, NotificationChain msgs) {
		Measurement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Measurement newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, SmmPackage.MEASUREMENT__EQUIVALENT_TO, Measurement.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, SmmPackage.MEASUREMENT__EQUIVALENT_TO, Measurement.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Measurement)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Measurement newTo, NotificationChain msgs) {
		Measurement oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Measurement newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, SmmPackage.MEASUREMENT__EQUIVALENT_FROM, Measurement.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, SmmPackage.MEASUREMENT__EQUIVALENT_FROM, Measurement.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, SmmPackage.MEASUREMENT__EQUIVALENT_TO, Measurement.class, msgs);
				return basicSetFrom((Measurement)otherEnd, msgs);
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, SmmPackage.MEASUREMENT__EQUIVALENT_FROM, Measurement.class, msgs);
				return basicSetTo((Measurement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM:
				return basicSetFrom(null, msgs);
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO:
				return basicSetTo(null, msgs);
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
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM:
				setFrom((Measurement)newValue);
				return;
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO:
				setTo((Measurement)newValue);
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
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM:
				setFrom((Measurement)null);
				return;
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO:
				setTo((Measurement)null);
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
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM:
				return from != null;
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //EquivalentMeasurementRelationshipImpl
