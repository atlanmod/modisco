/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benchmark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getJvmMaxHeapInMiB <em>Jvm Max Heap In Mi B</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorName <em>Processor Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorDescription <em>Processor Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorCount <em>Processor Count</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorCacheSize <em>Processor Cache Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getSystemMemory <em>System Memory</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getOsName <em>Os Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getOsArchitecture <em>Os Architecture</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getDiscoveries <em>Discoveries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark()
 * @model
 * @generated
 */
public interface Benchmark extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * Returns the value of the '<em><b>Jvm Max Heap In Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jvm Max Heap In Mi B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvm Max Heap In Mi B</em>' attribute.
	 * @see #setJvmMaxHeapInMiB(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_JvmMaxHeapInMiB()
	 * @model
	 * @generated
	 */
	long getJvmMaxHeapInMiB();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getJvmMaxHeapInMiB <em>Jvm Max Heap In Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Max Heap In Mi B</em>' attribute.
	 * @see #getJvmMaxHeapInMiB()
	 * @generated
	 */
	void setJvmMaxHeapInMiB(long value);

	/**
	 * Returns the value of the '<em><b>Processor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Name</em>' attribute.
	 * @see #setProcessorName(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_ProcessorName()
	 * @model
	 * @generated
	 */
	String getProcessorName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorName <em>Processor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Name</em>' attribute.
	 * @see #getProcessorName()
	 * @generated
	 */
	void setProcessorName(String value);

	/**
	 * Returns the value of the '<em><b>Processor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Description</em>' attribute.
	 * @see #setProcessorDescription(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_ProcessorDescription()
	 * @model
	 * @generated
	 */
	String getProcessorDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorDescription <em>Processor Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Description</em>' attribute.
	 * @see #getProcessorDescription()
	 * @generated
	 */
	void setProcessorDescription(String value);

	/**
	 * Returns the value of the '<em><b>Processor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Count</em>' attribute.
	 * @see #setProcessorCount(int)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_ProcessorCount()
	 * @model
	 * @generated
	 */
	int getProcessorCount();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorCount <em>Processor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Count</em>' attribute.
	 * @see #getProcessorCount()
	 * @generated
	 */
	void setProcessorCount(int value);

	/**
	 * Returns the value of the '<em><b>Processor Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Cache Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Cache Size</em>' attribute.
	 * @see #setProcessorCacheSize(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_ProcessorCacheSize()
	 * @model
	 * @generated
	 */
	String getProcessorCacheSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getProcessorCacheSize <em>Processor Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Cache Size</em>' attribute.
	 * @see #getProcessorCacheSize()
	 * @generated
	 */
	void setProcessorCacheSize(String value);

	/**
	 * Returns the value of the '<em><b>System Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Memory</em>' attribute.
	 * @see #setSystemMemory(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_SystemMemory()
	 * @model
	 * @generated
	 */
	String getSystemMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getSystemMemory <em>System Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Memory</em>' attribute.
	 * @see #getSystemMemory()
	 * @generated
	 */
	void setSystemMemory(String value);

	/**
	 * Returns the value of the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Name</em>' attribute.
	 * @see #setOsName(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_OsName()
	 * @model
	 * @generated
	 */
	String getOsName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getOsName <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Name</em>' attribute.
	 * @see #getOsName()
	 * @generated
	 */
	void setOsName(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_OsVersion()
	 * @model
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Os Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Architecture</em>' attribute.
	 * @see #setOsArchitecture(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_OsArchitecture()
	 * @model
	 * @generated
	 */
	String getOsArchitecture();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Benchmark#getOsArchitecture <em>Os Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Architecture</em>' attribute.
	 * @see #getOsArchitecture()
	 * @generated
	 */
	void setOsArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getProjects();

	/**
	 * Returns the value of the '<em><b>Discoveries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Discovery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoveries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoveries</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkPackage#getBenchmark_Discoveries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discovery> getDiscoveries();

} // Benchmark
