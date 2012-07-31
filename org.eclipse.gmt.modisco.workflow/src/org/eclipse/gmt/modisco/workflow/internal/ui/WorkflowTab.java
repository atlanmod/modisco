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
 *    Nicolas Bros (Mia-Software)
 */
package org.eclipse.gmt.modisco.workflow.internal.ui;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowController;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.WorkflowModelEvents;
import org.eclipse.gmt.modisco.workflow.internal.engine.WorkflowControllerImpl;
import org.eclipse.gmt.modisco.workflow.internal.engine.WorkflowModelImpl;
import org.eclipse.gmt.modisco.workflow.internal.ui.wizard.WizardToSelectLaunchers;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;

/** @deprecated */
@Deprecated
public class WorkflowTab extends AbstractLaunchConfigurationTab implements WorkflowModelEvents {

	private Table transformationsTable;
	private ContextualMenuInWorkflowTable popUp;
	private WorkflowModel workflowModel;
	private final WorkflowController workflowController;
	private boolean isValid;

	public WorkflowTab() {
		initWorkflowModel();
		this.workflowController = new WorkflowControllerImpl();
	}

	final WorkflowModel getWorkflowModel() {
		return this.workflowModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	public void createControl(final Composite parent) {
		Composite rootContainer = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		rootContainer.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		Label labelWFTransfo = new Label(rootContainer, SWT.NULL);
		labelWFTransfo.setText(Messages.WorkflowTab_basicLabel);
		GridData gdLabel = new GridData();
		gdLabel.horizontalSpan = 3;
		labelWFTransfo.setLayoutData(gdLabel);
		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		this.transformationsTable = new Table(rootContainer, SWT.BORDER | SWT.V_SCROLL);
		this.transformationsTable.setLayoutData(gridData);
		this.transformationsTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(final MouseEvent evt) {
				if (evt.button == 3) {
					contextualMenuOfTransformationTable(evt);
				}
			}
		});
		this.transformationsTable.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					removeAdditionalWork();
				}
			}
		});
		// add panel of buttons to manage the table
		@SuppressWarnings("unused")
		AdditionalButtonsComposite gpButtonTransformation = new AdditionalButtonsComposite(
				rootContainer, SWT.NONE, this);
		setControl(rootContainer);
	}

	private final void contextualMenuOfTransformationTable(final MouseEvent evt) {
		Point p = new Point(evt.x, evt.y);
		TableItem item = getTransformationsTable().getItem(p);
		if (item == null) {
			getPopUp().createPopupMenuNoSelectionItem(getShell());
			getTransformationsTable().setMenu(getPopUp().getMenuNoSelection());
		} else {
			getPopUp().createPopupMenuSelectionItem(getShell());
			getTransformationsTable().setMenu(getPopUp().getMenuSelection());
		}
	}

	public ContextualMenuInWorkflowTable getPopUp() {
		if (this.popUp == null) {
			this.popUp = new ContextualMenuInWorkflowTable(this);
		}
		return this.popUp;
	}

	public Table getTransformationsTable() {
		return this.transformationsTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		// no defaults
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(final ILaunchConfiguration configuration) {
		initWorkflowModel();
		this.workflowModel.initialization(configuration);

		updateStatus();
	}

	private final void initWorkflowModel() {
		if (this.workflowModel != null) {
			this.workflowModel.unsubscribe(this);
			getTransformationsTable().removeAll();
		}
		this.workflowModel = new WorkflowModelImpl();
		this.workflowModel.subscribe(this);
	}

	private final void updateStatus() {
		setMessage(Messages.WorkflowTab_basicLabel);
		this.isValid = true;
		String errorMessage = this.workflowController.validate(this.workflowModel);
		if (errorMessage != null) {
			this.isValid = false;
		}
		setErrorMessage(errorMessage);
		updateLaunchConfigurationDialog();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		this.workflowModel.save(configuration);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return Messages.WorkflowTab_name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEvents#notifyElementAdded(
	 * org.eclipse.debug.ui.workflow.model.workflow.Element)
	 */
	public void notifyElementAdded(final Element element) {
		this.createItemTable(element.getName(), element.getType());
		refreshTable();
		updateStatus();
	}

	/**
	 * Allows to create a table item
	 * 
	 * @param name
	 *            Item name
	 * @param driverType
	 *            Type of driver to retrieve its image
	 */
	private final void createItemTable(final String name, final String driverType) {
		this.createItemTable(name, driverType, getTransformationsTable().getItemCount());
	}

	/**
	 * Allows to create a table item
	 * 
	 * @param name
	 *            Item name
	 * @param driverType
	 *            Type of driver to retrieve its image
	 * @param index
	 *            position of inserted table item
	 */
	private final void createItemTable(final String name, final String driverType, final int index) {
		TableItem item = new TableItem(getTransformationsTable(), SWT.NULL, index);
		item.setText(name);
		item.setImage(DebugUITools.getImage(driverType));
	}

	/**
	 * Allows to refresh the table selection
	 */
	private final void refreshTable() {
		getTransformationsTable().notifyListeners(SWT.Selection, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEvents#notifyElementInserted
	 * (int, org.eclipse.debug.ui.workflow.model.workflow.Element)
	 */
	public void notifyElementInserted(final int index, final Element element) {
		getTransformationsTable().remove(index);
		this.createItemTable(element.getName(), element.getType(), index);
		getTransformationsTable().select(index);
		refreshTable();
		updateStatus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEvents#notifyElementRemoved
	 * (int)
	 */
	public void notifyElementRemoved(final int index) {
		getTransformationsTable().remove(index);
		refreshTable();
		updateStatus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return Activator.getImageDescriptor(Constants.pathLittleImage).createImage();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		return this.isValid;
	}

	/**
	 * Load a work in the workflow
	 */
	public void loadAdditionalWork() {
		// Image oldImage = Window.getDefaultImage();
		WizardToSelectLaunchers wizard = new WizardToSelectLaunchers(this.workflowModel);
		// Create the wizard dialog
		WizardDialog dialog = new WizardDialog(PlatformUI.createDisplay().getActiveShell(), wizard);
		// Open the wizard dialog
		dialog.setPageSize(400, 200);
		// Window.setDefaultImage(Activator.getImageDescriptor(Constants.pathLittleImage)
		// .createImage());
		dialog.open();
		// restore default icon
		// Window.setDefaultImage(oldImage);
	}

	/**
	 * Remove the selected work from the workflow
	 */
	public void removeAdditionalWork() {
		int index = getTransformationsTable().getSelectionIndex();
		if (index != -1) {
			this.workflowModel.removeElement(index);
		}
	}

	/**
	 * Up the selected work in the workflow
	 */
	public void upAdditionalWork() {
		int index = getTransformationsTable().getSelectionIndex();
		if (index > 0 && index != -1) {
			this.workflowModel.upElement(index);
		}
	}

	/**
	 * Down the selected work in the workflow
	 */
	public void downAdditionalWork() {
		int index = getTransformationsTable().getSelectionIndex();
		// +1 because the numbering begining at 0
		if ((index + 1 < getTransformationsTable().getItemCount()) && index != -1) {
			this.workflowModel.downElement(index);
		}
	}
}
