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
package org.eclipse.gmt.modisco.workflow.internal.ui;

import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

/** @deprecated */
@Deprecated
public class ContextualMenuInWorkflowTable {

	private Menu menuSelection;
	private Menu menuNoSelection;
	private final WorkflowTab workflowTab;

	public ContextualMenuInWorkflowTable(final WorkflowTab workflowTab) {
		this.workflowTab = workflowTab;
	}

	/**
	 * Create a pop-up menu on item selected with right click
	 * 
	 * @param shell
	 *            Shell of selection
	 */
	public void createPopupMenuSelectionItem(final Shell shell) {
		if (this.menuSelection == null) {
			this.menuSelection = new Menu(shell, SWT.POP_UP);

			MenuItem itemRemove = new MenuItem(this.menuSelection, SWT.PUSH);
			itemRemove.setText(Messages.ContextualMenuInWorkflowTable_Remove);
			itemRemove.setImage(Activator.getImageDescriptor(Constants.pathIconRemove)
					.createImage());
			itemRemove.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					ContextualMenuInWorkflowTable.this.getButtonComposite().removeAdditionalWork();
				}
			});
			MenuItem itemUp = new MenuItem(this.menuSelection, SWT.PUSH);
			itemUp.setText(Messages.ContextualMenuInWorkflowTable_Up);
			itemUp.setImage(Activator.getImageDescriptor(Constants.pathIconUp).createImage());
			itemUp.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					ContextualMenuInWorkflowTable.this.getButtonComposite().upAdditionalWork();
				}
			});
			MenuItem itemDown = new MenuItem(this.menuSelection, SWT.PUSH);
			itemDown.setText(Messages.ContextualMenuInWorkflowTable_Down);
			itemDown.setImage(Activator.getImageDescriptor(Constants.pathIconDown).createImage());
			itemDown.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					ContextualMenuInWorkflowTable.this.getButtonComposite().downAdditionalWork();
				}
			});
			itemRemove.setEnabled(true);
			itemUp.setEnabled(true);
			itemDown.setEnabled(true);

		}
	}

	/**
	 * Create a pop-up menu on right click on table selection (Not item
	 * selected)
	 * 
	 * @param shell
	 */
	public void createPopupMenuNoSelectionItem(final Shell shell) {
		if (this.menuNoSelection == null) {
			this.menuNoSelection = new Menu(shell, SWT.POP_UP);
			MenuItem itemLoad = new MenuItem(this.menuNoSelection, SWT.PUSH);
			itemLoad.setText(Messages.ContextualMenuInWorkflowTable_Load);
			itemLoad.setImage(Activator.getImageDescriptor(Constants.pathIconLoad).createImage());
			itemLoad.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					ContextualMenuInWorkflowTable.this.getButtonComposite().loadAdditionalWork();
				}
			});
			itemLoad.setEnabled(true);

		}
	}

	// Getters
	public Menu getMenuSelection() {
		return this.menuSelection;
	}

	public Menu getMenuNoSelection() {
		return this.menuNoSelection;
	}

	public WorkflowTab getButtonComposite() {
		return this.workflowTab;
	}
}
