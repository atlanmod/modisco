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


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BenchmarkFactoryImpl extends EFactoryImpl implements BenchmarkFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BenchmarkFactory init() {
		try {
			BenchmarkFactory theBenchmarkFactory = (BenchmarkFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/modisco/infra/discovery/0.1.incubation/benchmark"); 
			if (theBenchmarkFactory != null) {
				return theBenchmarkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BenchmarkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BenchmarkPackage.MEMORY_MEASUREMENT: return createMemoryMeasurement();
			case BenchmarkPackage.EVENT: return createEvent();
			case BenchmarkPackage.EVENT_TYPE: return createEventType();
			case BenchmarkPackage.BEGIN_EVENT: return createBeginEvent();
			case BenchmarkPackage.END_EVENT: return createEndEvent();
			case BenchmarkPackage.FILE: return createFile();
			case BenchmarkPackage.PROJECT: return createProject();
			case BenchmarkPackage.BENCHMARK: return createBenchmark();
			case BenchmarkPackage.DISCOVERY: return createDiscovery();
			case BenchmarkPackage.DISCOVERY_ITERATION: return createDiscoveryIteration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMeasurement createMemoryMeasurement() {
		MemoryMeasurementImpl memoryMeasurement = new MemoryMeasurementImpl();
		return memoryMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginEvent createBeginEvent() {
		BeginEventImpl beginEvent = new BeginEventImpl();
		return beginEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Benchmark createBenchmark() {
		BenchmarkImpl benchmark = new BenchmarkImpl();
		return benchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discovery createDiscovery() {
		DiscoveryImpl discovery = new DiscoveryImpl();
		return discovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryIteration createDiscoveryIteration() {
		DiscoveryIterationImpl discoveryIteration = new DiscoveryIterationImpl();
		return discoveryIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkPackage getBenchmarkPackage() {
		return (BenchmarkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BenchmarkPackage getPackage() {
		return BenchmarkPackage.eINSTANCE;
	}

} //BenchmarkFactoryImpl
