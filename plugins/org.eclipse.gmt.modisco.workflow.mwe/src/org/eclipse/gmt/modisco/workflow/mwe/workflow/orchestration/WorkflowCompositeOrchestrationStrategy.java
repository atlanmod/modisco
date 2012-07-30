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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Composite Orchestration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage#getWorkflowCompositeOrchestrationStrategy()
 * @model abstract="true"
 * @generated
 */
@Deprecated
public interface WorkflowCompositeOrchestrationStrategy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run(WorkflowCompositeComponent composite, WorkflowContext context);

} // WorkflowCompositeOrchestrationStrategy
