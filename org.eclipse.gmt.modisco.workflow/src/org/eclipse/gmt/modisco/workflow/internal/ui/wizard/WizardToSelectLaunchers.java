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
package org.eclipse.gmt.modisco.workflow.internal.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.TableItem;

/** @deprecated */
@Deprecated
public class WizardToSelectLaunchers extends Wizard {

	private LaunchersPage loadLauncher;
	private final WorkflowModel workflowModel;

	/**
	 * Class constructor
	 * 
	 * @param controllerWorkflow
	 *            The controller managing the workflow
	 */
	public WizardToSelectLaunchers(final WorkflowModel workflowModelParam) {
		setWindowTitle(Messages.WizardToSelectLaunchers_selectLaunch);
		this.workflowModel = workflowModelParam;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public final void addPages() {
		this.loadLauncher = new LaunchersPage(this.workflowModel.getName());
		addPage(this.loadLauncher);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			for (TableItem item : this.loadLauncher.getItemsSelected()) {
				ILaunchConfiguration launchConfiguration = this.loadLauncher
						.getLaunchConfigurationMap().get(item);
				Element element;
				final String type = launchConfiguration.getType().getIdentifier();
				if (type.equals(Constants.launchTypeOfWorkflow)) {
					element = ModiscoworkflowFactory.eINSTANCE.createWorkflow();
				} else {
					element = ModiscoworkflowFactory.eINSTANCE.createWork();
				}
				element.setName(item.getText());
				element.setType(type);
				this.workflowModel.addElement(element);
			}
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.WizardToSelectLaunchers_unknownError, e);
			Activator.getDefault().getLog().log(status);
		}
		return true;
	}

}
