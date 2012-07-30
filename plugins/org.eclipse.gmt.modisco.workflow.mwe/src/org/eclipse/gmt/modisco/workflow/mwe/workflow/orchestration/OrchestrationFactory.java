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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage
 * @generated
 */
@Deprecated
public interface OrchestrationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrchestrationFactory eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow Serial Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Serial Orchestration Strategy</em>'.
	 * @generated
	 */
	WorkflowSerialOrchestrationStrategy createWorkflowSerialOrchestrationStrategy();

	/**
	 * Returns a new object of class '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * @generated
	 */
	WorkflowParallelOrchestrationStrategy createWorkflowParallelOrchestrationStrategy();

	/**
	 * Returns a new object of class '<em>Workflow Component Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Component Orchestration Strategy</em>'.
	 * @generated
	 */
	WorkflowComponentOrchestrationStrategy createWorkflowComponentOrchestrationStrategy();

	/**
	 * Returns a new object of class '<em>Workflow Conditional Component Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Conditional Component Orchestration Strategy</em>'.
	 * @generated
	 */
	WorkflowConditionalComponentOrchestrationStrategy createWorkflowConditionalComponentOrchestrationStrategy();

	/**
	 * Returns a new object of class '<em>Workflow Rerun Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Rerun Predicate</em>'.
	 * @generated
	 */
	WorkflowRerunPredicate createWorkflowRerunPredicate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrchestrationPackage getOrchestrationPackage();

} //OrchestrationFactory
