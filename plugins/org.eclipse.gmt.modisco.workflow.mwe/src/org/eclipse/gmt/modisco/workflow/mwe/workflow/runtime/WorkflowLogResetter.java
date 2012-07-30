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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Log Resetter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLogResetter()
 * @model
 * @generated
 */
@Deprecated
public interface WorkflowLogResetter extends IWorkflowVisitor {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(WorkflowContext)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLogResetter_Context()
	 * @model required="true"
	 * @generated
	 */
	WorkflowContext getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(WorkflowContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visitUnitOfWork(WorkflowUnitOfWork unitOfWork);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visitComposite(WorkflowCompositeComponent composite);

} // WorkflowLogResetter
