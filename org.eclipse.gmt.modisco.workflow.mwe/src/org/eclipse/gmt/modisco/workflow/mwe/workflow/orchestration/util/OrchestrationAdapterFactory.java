/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Nicolas Payneau (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class OrchestrationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrchestrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OrchestrationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestrationSwitch<Adapter> modelSwitch =
		new OrchestrationSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflowSerialOrchestrationStrategy(WorkflowSerialOrchestrationStrategy object) {
				return createWorkflowSerialOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowParallelOrchestrationStrategy(WorkflowParallelOrchestrationStrategy object) {
				return createWorkflowParallelOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy object) {
				return createWorkflowCompositeOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy object) {
				return createWorkflowComponentOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowConditionalComponentOrchestrationStrategy(WorkflowConditionalComponentOrchestrationStrategy object) {
				return createWorkflowConditionalComponentOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowExecutionPredicate(WorkflowExecutionPredicate object) {
				return createWorkflowExecutionPredicateAdapter();
			}
			@Override
			public Adapter caseWorkflowRerunPredicate(WorkflowRerunPredicate object) {
				return createWorkflowRerunPredicateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowSerialOrchestrationStrategy <em>Workflow Serial Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowSerialOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowSerialOrchestrationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowParallelOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowParallelOrchestrationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy <em>Workflow Composite Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowCompositeOrchestrationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowComponentOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowComponentOrchestrationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy <em>Workflow Conditional Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowConditionalComponentOrchestrationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowExecutionPredicate
	 * @generated
	 */
	public Adapter createWorkflowExecutionPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowRerunPredicate <em>Workflow Rerun Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowRerunPredicate
	 * @generated
	 */
	public Adapter createWorkflowRerunPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OrchestrationAdapterFactory
