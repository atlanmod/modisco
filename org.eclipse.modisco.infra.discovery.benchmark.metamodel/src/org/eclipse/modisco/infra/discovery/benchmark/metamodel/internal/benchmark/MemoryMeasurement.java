/**
 * Copyright (c) 2012, 2015 INRIA and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Guillaume Doux (INRIA) - Initial API and implementation
 *      Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement#getMemoryUsed <em>Memory Used</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getMemoryMeasurement()
 * @model
 * @generated
 */
public interface MemoryMeasurement extends Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: Guillaume Doux - INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * Returns the value of the '<em><b>Memory Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Used</em>' attribute.
	 * @see #setMemoryUsed(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getMemoryMeasurement_MemoryUsed()
	 * @model
	 * @generated
	 */
	long getMemoryUsed();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement#getMemoryUsed <em>Memory Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Used</em>' attribute.
	 * @see #getMemoryUsed()
	 * @generated
	 */
	void setMemoryUsed(long value);

} // MemoryMeasurement
