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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class OrchestrationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrchestrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationSwitch() {
		if (modelPackage == null) {
			modelPackage = OrchestrationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OrchestrationPackage.WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY: {
				WorkflowSerialOrchestrationStrategy workflowSerialOrchestrationStrategy = (WorkflowSerialOrchestrationStrategy)theEObject;
				T result = caseWorkflowSerialOrchestrationStrategy(workflowSerialOrchestrationStrategy);
				if (result == null) result = caseWorkflowCompositeOrchestrationStrategy(workflowSerialOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY: {
				WorkflowParallelOrchestrationStrategy workflowParallelOrchestrationStrategy = (WorkflowParallelOrchestrationStrategy)theEObject;
				T result = caseWorkflowParallelOrchestrationStrategy(workflowParallelOrchestrationStrategy);
				if (result == null) result = caseWorkflowCompositeOrchestrationStrategy(workflowParallelOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY: {
				WorkflowCompositeOrchestrationStrategy workflowCompositeOrchestrationStrategy = (WorkflowCompositeOrchestrationStrategy)theEObject;
				T result = caseWorkflowCompositeOrchestrationStrategy(workflowCompositeOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY: {
				WorkflowComponentOrchestrationStrategy workflowComponentOrchestrationStrategy = (WorkflowComponentOrchestrationStrategy)theEObject;
				T result = caseWorkflowComponentOrchestrationStrategy(workflowComponentOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY: {
				WorkflowConditionalComponentOrchestrationStrategy workflowConditionalComponentOrchestrationStrategy = (WorkflowConditionalComponentOrchestrationStrategy)theEObject;
				T result = caseWorkflowConditionalComponentOrchestrationStrategy(workflowConditionalComponentOrchestrationStrategy);
				if (result == null) result = caseWorkflowComponentOrchestrationStrategy(workflowConditionalComponentOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_EXECUTION_PREDICATE: {
				WorkflowExecutionPredicate workflowExecutionPredicate = (WorkflowExecutionPredicate)theEObject;
				T result = caseWorkflowExecutionPredicate(workflowExecutionPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_RERUN_PREDICATE: {
				WorkflowRerunPredicate workflowRerunPredicate = (WorkflowRerunPredicate)theEObject;
				T result = caseWorkflowRerunPredicate(workflowRerunPredicate);
				if (result == null) result = caseWorkflowExecutionPredicate(workflowRerunPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Serial Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Serial Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowSerialOrchestrationStrategy(WorkflowSerialOrchestrationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParallelOrchestrationStrategy(WorkflowParallelOrchestrationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Composite Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Composite Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Component Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Component Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Conditional Component Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Conditional Component Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowConditionalComponentOrchestrationStrategy(WorkflowConditionalComponentOrchestrationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Execution Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Execution Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowExecutionPredicate(WorkflowExecutionPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Rerun Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Rerun Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowRerunPredicate(WorkflowRerunPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OrchestrationSwitch
