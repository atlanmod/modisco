/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.MemoryMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.impl.MemoryMeasurementImpl#getMemoryUsed <em>Memory Used</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryMeasurementImpl extends EventImpl implements MemoryMeasurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * The default value of the '{@link #getMemoryUsed() <em>Memory Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryUsed() <em>Memory Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsed()
	 * @generated
	 * @ordered
	 */
	protected int memoryUsed = MEMORY_USED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.MEMORY_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryUsed() {
		return memoryUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUsed(int newMemoryUsed) {
		int oldMemoryUsed = memoryUsed;
		memoryUsed = newMemoryUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.MEMORY_MEASUREMENT__MEMORY_USED, oldMemoryUsed, memoryUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BenchmarkPackage.MEMORY_MEASUREMENT__MEMORY_USED:
				return getMemoryUsed();
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
			case BenchmarkPackage.MEMORY_MEASUREMENT__MEMORY_USED:
				setMemoryUsed((Integer)newValue);
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
			case BenchmarkPackage.MEMORY_MEASUREMENT__MEMORY_USED:
				setMemoryUsed(MEMORY_USED_EDEFAULT);
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
			case BenchmarkPackage.MEMORY_MEASUREMENT__MEMORY_USED:
				return memoryUsed != MEMORY_USED_EDEFAULT;
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
		result.append(" (memoryUsed: ");
		result.append(memoryUsed);
		result.append(')');
		return result.toString();
	}

} //MemoryMeasurementImpl
