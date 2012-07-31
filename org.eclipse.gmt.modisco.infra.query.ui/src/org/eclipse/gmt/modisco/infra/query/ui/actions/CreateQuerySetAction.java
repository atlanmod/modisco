/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.ui.actions;

import org.eclipse.gmt.modisco.infra.query.editor.presentation.QueryModelWizard;
import org.eclipse.gmt.modisco.infra.query.ui.Messages;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class CreateQuerySetAction extends Action {

	public CreateQuerySetAction() {
		// nothing
		setText(Messages.CreateQuerySetAction_createQuerySet);
	}

	@Override
	public void run() {
		QueryModelWizard createQuerySetWizard = new QueryModelWizard();
		createQuerySetWizard.setOpenEditor(false);
		IWorkbench workbench = PlatformUI.getWorkbench();
		// ISelection selection =
		// workbench.getActiveWorkbenchWindow().getSelectionService().getSelection();
		createQuerySetWizard.init(workbench, new StructuredSelection());
		WizardDialog wizardDialog = new WizardDialog(null, createQuerySetWizard);
		wizardDialog.open();
	}
}
