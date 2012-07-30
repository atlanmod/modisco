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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StatePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowIdleState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Idle State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@Deprecated
public class WorkflowIdleStateImpl extends WorkflowStateImpl implements WorkflowIdleState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowIdleStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatePackage.Literals.WORKFLOW_IDLE_STATE;
	}

} //WorkflowIdleStateImpl
