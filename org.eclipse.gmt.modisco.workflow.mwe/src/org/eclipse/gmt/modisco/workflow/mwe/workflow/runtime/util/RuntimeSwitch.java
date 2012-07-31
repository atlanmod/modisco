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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.*;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

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
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage
 * @generated
 */
@Deprecated
public class RuntimeSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
			case RuntimePackage.WORKFLOW_CONTEXT: {
				WorkflowContext workflowContext = (WorkflowContext)theEObject;
				T result = caseWorkflowContext(workflowContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_ENGINE: {
				WorkflowEngine workflowEngine = (WorkflowEngine)theEObject;
				T result = caseWorkflowEngine(workflowEngine);
				if (result == null) result = caseWorkflowRunnable(workflowEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_STATE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<WorkflowComponent, WorkflowState> workflowStateMap = (Map.Entry<WorkflowComponent, WorkflowState>)theEObject;
				T result = caseWorkflowStateMap(workflowStateMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_PARAMETER_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<WorkflowParameter, EObject> workflowParameterMap = (Map.Entry<WorkflowParameter, EObject>)theEObject;
				T result = caseWorkflowParameterMap(workflowParameterMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_STATE_RESOLUTION_STRATEGY: {
				WorkflowStateResolutionStrategy workflowStateResolutionStrategy = (WorkflowStateResolutionStrategy)theEObject;
				T result = caseWorkflowStateResolutionStrategy(workflowStateResolutionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_RUNNER: {
				WorkflowRunner workflowRunner = (WorkflowRunner)theEObject;
				T result = caseWorkflowRunner(workflowRunner);
				if (result == null) result = caseWorkflowRunnable(workflowRunner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_STATE_RESETTER: {
				WorkflowStateResetter workflowStateResetter = (WorkflowStateResetter)theEObject;
				T result = caseWorkflowStateResetter(workflowStateResetter);
				if (result == null) result = caseIWorkflowVisitor(workflowStateResetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_LOG: {
				WorkflowLog workflowLog = (WorkflowLog)theEObject;
				T result = caseWorkflowLog(workflowLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_LOG_ENTRY: {
				WorkflowLogEntry workflowLogEntry = (WorkflowLogEntry)theEObject;
				T result = caseWorkflowLogEntry(workflowLogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_LOG_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<WorkflowComponent, WorkflowLog> workflowLogMap = (Map.Entry<WorkflowComponent, WorkflowLog>)theEObject;
				T result = caseWorkflowLogMap(workflowLogMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_LOG_RESETTER: {
				WorkflowLogResetter workflowLogResetter = (WorkflowLogResetter)theEObject;
				T result = caseWorkflowLogResetter(workflowLogResetter);
				if (result == null) result = caseIWorkflowVisitor(workflowLogResetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.WORKFLOW_ENGINE_PROXY: {
				WorkflowEngineProxy workflowEngineProxy = (WorkflowEngineProxy)theEObject;
				T result = caseWorkflowEngineProxy(workflowEngineProxy);
				if (result == null) result = caseWorkflowEngine(workflowEngineProxy);
				if (result == null) result = caseWorkflowRunnable(workflowEngineProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowContext(WorkflowContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowEngine(WorkflowEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow State Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow State Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowStateMap(Map.Entry<WorkflowComponent, WorkflowState> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Parameter Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Parameter Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParameterMap(Map.Entry<WorkflowParameter, EObject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow State Resolution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow State Resolution Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowStateResolutionStrategy(WorkflowStateResolutionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowRunnable(Runnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Runner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Runner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowRunner(WorkflowRunner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow State Resetter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow State Resetter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowStateResetter(WorkflowStateResetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLog(WorkflowLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLogEntry(WorkflowLogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Log Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Log Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLogMap(Map.Entry<WorkflowComponent, WorkflowLog> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Log Resetter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Log Resetter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLogResetter(WorkflowLogResetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Engine Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Engine Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowEngineProxy(WorkflowEngineProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWorkflow Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWorkflow Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWorkflowVisitor(IWorkflowVisitor object) {
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

} //RuntimeSwitch
