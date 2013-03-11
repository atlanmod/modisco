/**
 * *******************************************************************************
 *  * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 *  * accompanying materials are made available under the terms of the Eclipse
 *  * Public License v1.0 which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  * 
 *  * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *  * 
 *  ******************************************************************************
 * 
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent#getBeginning <em>Beginning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getEndEvent()
 * @model
 * @generated
 */
public interface EndEvent extends Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: Guillaume Doux - INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * Returns the value of the '<em><b>Beginning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginning</em>' reference.
	 * @see #setBeginning(BeginEvent)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getEndEvent_Beginning()
	 * @model required="true"
	 * @generated
	 */
	BeginEvent getBeginning();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent#getBeginning <em>Beginning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginning</em>' reference.
	 * @see #getBeginning()
	 * @generated
	 */
	void setBeginning(BeginEvent value);

} // EndEvent
