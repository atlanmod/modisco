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

import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowController;
import org.eclipse.gmt.modisco.workflow.internal.engine.WorkflowControllerImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

/** @deprecated */
@Deprecated
public class LaunchersPage extends WizardPage {

	private Table launchersTable;
	private final HashMap<TableItem, ILaunchConfiguration> launchConfigurationMap;
	private TableItem[] itemsSelected;
	private final WorkflowController workflowController;
	private final String rootConfigName;

	public TableItem[] getItemsSelected() {
		return this.itemsSelected;
	}

	public HashMap<TableItem, ILaunchConfiguration> getLaunchConfigurationMap() {
		return this.launchConfigurationMap;
	}

	protected LaunchersPage(final String rootConfigName) {
		super(Messages.LaunchersPage_launchersList);
		setImageDescriptor(Activator.getImageDescriptor(Constants.pathBigImage));
		setDescription(Messages.LaunchersPage_wizardDescription);
		this.workflowController = new WorkflowControllerImpl();
		this.rootConfigName = rootConfigName;
		this.itemsSelected = new TableItem[] {};
		this.launchConfigurationMap = new HashMap<TableItem, ILaunchConfiguration>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		this.launchersTable = new Table(container, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		this.launchersTable.setLayoutData(gridData);
		this.launchersTable.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				LaunchersPage.this.itemsSelected = LaunchersPage.this.launchersTable.getSelection();
				setPageComplete(true);
			}
		});
		this.launchersTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(final MouseEvent e) {
				LaunchersPage.this.getWizard().performFinish();
				LaunchersPage.this.getShell().close();
			}
		});
		loadLauncher();
		initializeDialogUnits(container);
		setControl(container);
	}

	/**
	 * Load all the launchers in the table which one driver is defined
	 */
	private final void loadLauncher() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		boolean recursionMessage = false;
		try {
			for (ILaunchConfiguration launch : manager.getLaunchConfigurations()) {
				if (this.workflowController.hasPotentialRecursion(this.rootConfigName, launch)) {
					recursionMessage = true;
				} else {
					TableItem item = new TableItem(this.launchersTable, SWT.NULL);
					item.setText(launch.getName());
					item.setImage(DebugUITools.getImage(launch.getType().getIdentifier()));
					this.launchConfigurationMap.put(item, launch);
				}
			}
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					Messages.LaunchersPage_unknownError, e);
			Activator.getDefault().getLog().log(status);
		}
		if (recursionMessage) {
			this.setMessage(Messages.LaunchersPage_messageExtended);
		} else {
			this.setMessage(Messages.LaunchersPage_message);
		}
		setPageComplete(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.DialogPage#setVisible(boolean)
	 */
	@Override
	public void setVisible(final boolean visible) {
		if (visible) {
			getShell().setSize(400, 400);
			getShell().setLocation(centerShell(Display.getDefault(), getShell()));
		}
		super.setVisible(visible);
	}

	/**
	 * Allows to retrieve a point allowing to center our shell
	 * 
	 * @parameter shell Our shell which we want to center
	 * @parameter display The display on which open the shell
	 * @return Return a point
	 */
	private final Point centerShell(final Display display, final Shell shell) {
		Rectangle rect = display.getClientArea();
		Point size = shell.getSize();
		int x = (rect.width - size.x) / 2;
		int y = (rect.height - size.y) / 2;
		return new Point(x, y);
	}
}
