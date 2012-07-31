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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowController;
import org.eclipse.gmt.modisco.workflow.WorkflowExecution;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;


/** @deprecated */
@Deprecated
public class WorkflowExecutionImpl implements WorkflowExecution {

	public void launchWorkflow(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		WorkflowModel workflowModel = new WorkflowModelImpl();
		workflowModel.initialization(configuration);
		monitor.worked(1);
		WorkflowController workflowController = new WorkflowControllerImpl();
		String errorMessage = workflowController.validate(workflowModel);
		if (errorMessage != null) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, errorMessage);
			throw new CoreException(status);
		}
		monitor.worked(1);
		this.launchWorkflow(workflowModel, mode, launch, monitor);
	}
	
	/**
	 * To manage sequence of execution, even in background, we will not use the
	 * method DebugUIPlugin.launchInForeground even if the expected behaviour
	 * seems similar. Specially for the specific case of java application
	 * launch, which has not been correctly managed (use of sub-process).
	 */
	public void launchWorkflow(final WorkflowModel workflowModel, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) {
		final boolean parallelExecution = false;
		final List<ILaunch> launchResults = new ArrayList<ILaunch>();
		for (Element element : workflowModel.getAllElements()) {
			if (monitor.isCanceled() && launch.canTerminate()) {
				try {
					launch.terminate();
					for (ILaunch subLaunch : launchResults) {
						if (subLaunch.canTerminate()) {
							subLaunch.terminate();
						}
					}
				} catch (DebugException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							Messages.WorkflowExecutionImpl_unknownError, e);
					Activator.getDefault().getLog().log(status);
				}
			}
			ILaunchConfiguration conf = Utils.getInstance().getLaunchConfigurationFromName(
					element.getName());
			ILaunchConfigurationWorkingCopy config = null;
			try {
				config = conf.getWorkingCopy();
				monitor.subTask(element.getName() + Messages.WorkflowExecutionImpl_ofType
						+ element.getType());
				ILaunch launchChild = config.launch(mode, new SubProgressMonitor(monitor, 1));
				if (parallelExecution) {
					launchResults.add(launchChild);
				} else {
					IProcess[] processes = launchChild.getProcesses();
					for (IProcess process : processes) {
						while (process.isTerminated() == false) {
							Thread.yield();
							Thread.sleep(10);
						}
					}
				}
				monitor.worked(1);
			} catch (CoreException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						Messages.WorkflowExecutionImpl_unknownError, e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						Messages.WorkflowExecutionImpl_unknownError, e);
				Activator.getDefault().getLog().log(status);
			}

		}
	}

}
