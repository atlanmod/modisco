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
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/** @deprecated */
@Deprecated
public class AdditionalButtonsComposite extends Composite {
	private Button removeButton = null;
	private Button upButton = null;
	private Button downButton = null;
	private Button loadButton = null;
	private final WorkflowTab workflowTransformationTab;
	
	/**
	 * Class constructor
	 * 
	 * @param parent
	 *            The composite parent
	 * @param style
	 *            The style of composite
	 * @param table
	 *            The table of transformations
	 * @param workflowModel
	 *            The workflowModel managing the display
	 */
	public AdditionalButtonsComposite(final Composite parent, final int style,
			final WorkflowTab workflowTransformationTabParam) {
		super(parent, style);
		this.workflowTransformationTab = workflowTransformationTabParam;
		
		initialize();
	}

	/**
	 * Create the composite representing the additional buttons
	 */
	private void initialize() {
		GridData gridDataUp = new GridData();
		gridDataUp.horizontalAlignment = GridData.FILL;
		gridDataUp.verticalAlignment = GridData.CENTER;
		GridData gridDataDown = new GridData();
		gridDataDown.horizontalAlignment = GridData.FILL;
		gridDataDown.verticalAlignment = GridData.CENTER;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.CENTER;
		this.loadButton = new Button(this, SWT.NONE);
		this.loadButton.setText(Messages.AdditionalButtonsComposite_load);
		this.loadButton.setLayoutData(gridData);
		this.loadButton.setImage(Activator.getImageDescriptor(
				Constants.pathIconLoad).createImage());
		this.loadButton
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(
							final org.eclipse.swt.events.SelectionEvent e) {
						AdditionalButtonsComposite.this.workflowTransformationTab
								.loadAdditionalWork();
					}
				});
		this.removeButton = new Button(this, SWT.NONE);
		this.removeButton.setText(Messages.AdditionalButtonsComposite_remove);
		this.removeButton.setLayoutData(gridData);
		this.removeButton.setImage(Activator.getImageDescriptor(
				Constants.pathIconRemove).createImage());
		this.removeButton
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(
							final org.eclipse.swt.events.SelectionEvent e) {
						AdditionalButtonsComposite.this.workflowTransformationTab
								.removeAdditionalWork();
					}
				});
		this.upButton = new Button(this, SWT.PUSH);
		// for add one space character
		this.upButton.setText(Messages.AdditionalButtonsComposite_up);
		gridDataUp.verticalIndent = 30;
		this.upButton.setLayoutData(gridDataUp);
		this.upButton.setImage(Activator.getImageDescriptor(
				Constants.pathIconUp).createImage());
		this.upButton
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(
							final org.eclipse.swt.events.SelectionEvent e) {
						AdditionalButtonsComposite.this.workflowTransformationTab
								.upAdditionalWork();
					}
				});
		this.downButton = new Button(this, SWT.PUSH);
		this.downButton.setText(Messages.AdditionalButtonsComposite_down);
		this.downButton.setLayoutData(gridDataDown);
		this.downButton.setImage(Activator.getImageDescriptor(
				Constants.pathIconDown).createImage());
		this.downButton
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(
							final org.eclipse.swt.events.SelectionEvent e) {
						AdditionalButtonsComposite.this.workflowTransformationTab
								.downAdditionalWork();
					}
				});

		GridData layoutData = new GridData();
		layoutData.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		this.setSize(new Point(63, 202));
		setLayout(new GridLayout());
		setLayoutData(layoutData);
	}
}
