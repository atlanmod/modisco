/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.internal.ui.export;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This class defines export dialog box It allows to capture project name,
 * symbolic name or base package name
 * 
 * @author Nicolas Payneau
 * @deprecated
 */
@Deprecated
public class ExportDialog extends Dialog {

	private Text baseNameText;
	private Text projectNameText;

	private Text symbolicNameText;
	private boolean export;
	private Composite compositeButton = null;
	private Button exportButton = null;
	private String baseName;
	private String projectName;
	private String symbolicName;
	private final String defaultName;

	public ExportDialog(final String defaultName, final Shell parentShell) {
		super(parentShell);
		this.defaultName = defaultName;
	}

	@Override
	protected Control createContents(final Composite parent) {
		parent.getShell().setSize(400, 150);
		parent.getShell().setLocation(
				Common.getInstance().centerShell(
						parent.getShell().getDisplay(), parent.getShell()));
		GridLayout layoutParent = new GridLayout();
		parent.setLayout(layoutParent);
		layoutParent.numColumns = 3;
		layoutParent.makeColumnsEqualWidth = false;
		GridData gdText = new GridData();
		gdText.horizontalAlignment = GridData.FILL;
		gdText.horizontalSpan = 2;
		gdText.grabExcessHorizontalSpace = true;
		gdText.verticalAlignment = GridData.CENTER;
		Label labelProjectName = new Label(parent, SWT.NONE);
		labelProjectName.setText(Messages.ExportDialog_0);
		this.projectNameText = new Text(parent, SWT.BORDER);
		this.projectNameText.setLayoutData(gdText);
		this.projectNameText.setText(this.defaultName.toLowerCase());
		this.projectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				ExportDialog.this.updateButton();
			}
		});
		Label labelSymbolicName = new Label(parent, SWT.NONE);
		labelSymbolicName.setText(Messages.ExportDialog_1);
		this.symbolicNameText = new Text(parent, SWT.BORDER);
		this.symbolicNameText.setLayoutData(gdText);
		this.symbolicNameText.setText(this.defaultName.toLowerCase());
		this.symbolicNameText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				ExportDialog.this.updateButton();
			}
		});
		Label labelBase = new Label(parent, SWT.NONE);
		labelBase.setText(Messages.ExportDialog_2);
		this.baseNameText = new Text(parent, SWT.BORDER);
		this.baseNameText.setLayoutData(gdText);
		this.baseNameText
				.setText("org.eclipse." + this.defaultName.toLowerCase()); //$NON-NLS-1$
		this.baseNameText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				ExportDialog.this.updateButton();
			}
		});
		createCompositeButton(parent);
		getShell().setText(Messages.ExportDialog_4);
		return parent;
	}

	/**
	 * Create composite button
	 * 
	 * @param parent
	 *            Composite parent
	 */
	private void createCompositeButton(final Composite parent) {
		GridData gdButtonExport = new GridData();
		gdButtonExport.grabExcessHorizontalSpace = true;
		gdButtonExport.verticalAlignment = GridData.CENTER;
		gdButtonExport.horizontalAlignment = GridData.END;
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = GridData.BEGINNING;
		gridData5.grabExcessHorizontalSpace = true;
		gridData5.verticalAlignment = GridData.CENTER;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		GridData gridData4 = new GridData();
		gridData4.horizontalSpan = 3;
		gridData4.verticalAlignment = GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		gridData4.horizontalAlignment = GridData.FILL;
		this.compositeButton = new Composite(parent, SWT.NONE);
		this.compositeButton.setLayoutData(gridData4);
		this.compositeButton.setLayout(gridLayout);
		this.exportButton = new Button(this.compositeButton, SWT.NONE);
		this.exportButton.setText(Messages.ExportDialog_5);
		this.exportButton.setLayoutData(gdButtonExport);
		this.exportButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				super.widgetSelected(e);
				IStatus status = verifyAllName();
				if (status.isOK()) {
					ExportDialog.this.setExport(true);
					ExportDialog.this.setProjectName(ExportDialog.this
							.getProjectNameText().getText().trim());
					ExportDialog.this.setBaseName(ExportDialog.this
							.getBaseNameText().getText().trim());
					ExportDialog.this.setSymbolicName(ExportDialog.this
							.getSymbolicNameText().getText().trim());
					ExportDialog.this.close();
				} else {
					MessageDialog.openError(getShell(),
							Messages.ExportDialog_6, status.getMessage());
				}
			}
		});
		Button buttonCancel = new Button(this.compositeButton, SWT.NONE);
		buttonCancel.setText(Messages.ExportDialog_7);
		buttonCancel.setLayoutData(gridData5);
		buttonCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				super.widgetSelected(e);
				ExportDialog.this.setExport(false);
				ExportDialog.this.close();
			}
		});
		updateButton();
	}


	/**
	 * Update button
	 */
	void updateButton() {
		if (this.projectNameText.getText().trim().length() > 0
				&& this.baseNameText.getText().trim().length() > 0) {
			this.exportButton.setEnabled(true);
		} else {
			this.exportButton.setEnabled(false);
		}
	}

	/**
	 * Allows to verify all the fields Text are valid
	 * 
	 * @return Status of verification
	 */
	IStatus verifyAllName() {
		IStatus status = null;
		status = JavaConventions.validatePackageName(this.symbolicNameText
				.getText(), JavaCore.VERSION_1_6, JavaCore.VERSION_1_6);
		if (status.isOK()) {
			status = JavaConventions.validatePackageName(this.baseNameText
					.getText(), JavaCore.VERSION_1_6, JavaCore.VERSION_1_6);
		}
		return status;
	}
	//Getters
	public boolean isExport() {
		return this.export;
	}
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(final String projectName) {
		this.projectName = projectName;
	}

	public String getBaseName() {
		return this.baseName;
	}
	public String getSymbolicName() {
		return this.symbolicName;
	}
	public void setExport(final boolean export) {
		this.export = export;
	}

	public void setSymbolicName(final String symbolicName) {
		this.symbolicName = symbolicName;
	}

	public Text getProjectNameText() {
		return this.projectNameText;
	}

	protected void setBaseName(final String baseName) {
		this.baseName = baseName;
	}

	protected Text getBaseNameText() {
		return this.baseNameText;
	}

	protected Text getSymbolicNameText() {
		return this.symbolicNameText;
	}
}
