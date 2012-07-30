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
package org.eclipse.gmt.modisco.workflow.internal.engine;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowController;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow;

/** @deprecated */
@Deprecated
public class WorkflowControllerImpl implements WorkflowController {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowController#validate(org.eclipse
	 * .debug.ui.workflow.WorkflowModel)
	 */
	public String validate(final WorkflowModel workflowModel) {
		String message = null;
		// check existenz of launch configuration (may happens after a rename)
		String unknownLaunch = verifyExistenz(workflowModel.getAllElements());
		if (unknownLaunch != null) {
			message = Messages.WorkflowControllerImpl_launchConfigurationNotFound + unknownLaunch;
		}
		// check recursion
		if (verifyLoops(workflowModel.getAllElements(), workflowModel.getName())) {
			message = Messages.WorkflowControllerImpl_recursionError;
		}
		return message;
	}

	/**
	 * @param allElements
	 * @return
	 */
	private String verifyExistenz(final List<Element> allElements) {
		String unknownLaunch = null;
		for (Element element : allElements) {
			ILaunchConfiguration launch = Utils.getInstance().getLaunchConfigurationFromName(
					element.getName());
			if (launch == null) {
				unknownLaunch = element.getName();
				break;
			}
		}
		return unknownLaunch;
	}

	/**
	 * Allows to verify the loop in the Workflow
	 * 
	 * @param elements All elements contained in Workflow
	 * @param name The name of root
	 * @return True if Workflow contains a loop otherwise false
	 */
	private boolean verifyLoops(final List<Element> elements, final String name) {
		boolean loop = false;
		for (Element element : elements) {
			if (element instanceof Workflow) {
				if (element.getName().equals(name)) {
					loop = true;
					break;
				}
				WorkflowModel workflowModel = new WorkflowModelImpl();
				ILaunchConfiguration launch = Utils.getInstance().getLaunchConfigurationFromName(
						element.getName());
				if (launch != null) {
					workflowModel.initialization(launch);
					loop = verifyLoops(workflowModel.getAllElements(), name);
				}
			}
		}
		return loop;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowController#hasPotentialRecursion
	 * (java.lang.String, org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public boolean hasPotentialRecursion(final String rootConfigName, final ILaunchConfiguration launch) {
		boolean result = false;
		// basic test with the name
		if (launch.getName().equals(rootConfigName)) {
			result = true;
		} else {
			/*
			 * test the type of launch config, then if it is workflow we will
			 * test inner elements (recurse)
			 */
			try {
				String type = launch.getType().getIdentifier();
				if (type.equals(Constants.launchTypeOfWorkflow)) {
					WorkflowModel workflowModel = new WorkflowModelImpl();
					workflowModel.initialization(launch);
					result = verifyLoops(workflowModel.getAllElements(), rootConfigName);
				}
			} catch (CoreException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.WorkflowControllerImpl_unknownError, e);
				Activator.getDefault().getLog().log(status);
			}
		}
		return result;
	}

}
