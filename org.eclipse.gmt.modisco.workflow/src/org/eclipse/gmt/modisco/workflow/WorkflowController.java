/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow;

import org.eclipse.debug.core.ILaunchConfiguration;

/** @deprecated */
@Deprecated
public interface WorkflowController {

	/**
	 * To validate the model of workflow, like a recursion in sequence of launch
	 * 
	 * @param workflowModel
	 * @return null if valid, or a message to indicate the error
	 */
	public String validate(WorkflowModel workflowModel);

	/**
	 * To check if the launch configuration identified by its name (rootConfigName) could be
	 * launched directly or indirectly from the current launch configuration (launch)
	 * 
	 * @param rootConfigName
	 * @param launch
	 * @return true if recursion occurs, false otherwise
	 */
	public boolean hasPotentialRecursion(String rootConfigName, ILaunchConfiguration launch);
}
