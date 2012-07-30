/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugo Bruneliere (INRIA) - initial API and implementation
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.common;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.data.ElementDisplay;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author Gabriel Barbier
 * 
 */
public class AdditionalButtonsComposite extends Composite {

	private final ControllerServices controller;
	private final ModelplexTransformation modelplexTransformation;
	private final TransformationTreeComposite transformationTreeComposite;

	private Button newButton = null;
	private Button editButton = null;
	private Button removeButton = null;
	private Button upButton = null;
	private Button downButton = null;

	public AdditionalButtonsComposite(final Composite parent, final int style,
			final TransformationTreeComposite transformationTreeCompositeParameter,
			final ControllerServices controllerParameter,
			final ModelplexTransformation modelplexTransformationParameter) {
		super(parent, style);
		this.transformationTreeComposite = transformationTreeCompositeParameter;
		this.controller = controllerParameter;
		this.modelplexTransformation = modelplexTransformationParameter;
		initialize();
	}

	private void initialize() {
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.CENTER;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = GridData.FILL;
		gridData3.verticalAlignment = GridData.CENTER;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = GridData.FILL;
		gridData2.verticalAlignment = GridData.CENTER;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalAlignment = GridData.CENTER;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.CENTER;
		this.newButton = new Button(this, SWT.NONE);
		this.newButton.setText(Messages.AdditionalButtonsComposite_0);
		this.newButton.setLayoutData(gridData);
		this.newButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				AdditionalButtonsComposite.this.newAdditionalTransformation();
			}
		});
		this.editButton = new Button(this, SWT.NONE);
		this.editButton.setText(Messages.AdditionalButtonsComposite_1);
		this.editButton.setLayoutData(gridData4);
		this.editButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				AdditionalButtonsComposite.this.editAdditionalTransformation();
			}
		});
		this.removeButton = new Button(this, SWT.NONE);
		this.removeButton.setText(Messages.AdditionalButtonsComposite_2);
		this.removeButton.setLayoutData(gridData3);
		this.removeButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				AdditionalButtonsComposite.this.removeAdditionalTransformation();
			}
		});
		this.upButton = new Button(this, SWT.NONE);
		this.upButton.setText(Messages.AdditionalButtonsComposite_3);
		this.upButton.setLayoutData(gridData2);
		this.upButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				AdditionalButtonsComposite.this.upAdditionalTransformation();
			}
		});
		this.downButton = new Button(this, SWT.NONE);
		this.downButton.setText(Messages.AdditionalButtonsComposite_4);
		this.downButton.setLayoutData(gridData1);
		this.downButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				AdditionalButtonsComposite.this.downAdditionalTransformation();
			}
		});

		GridData layoutData = new GridData();
		layoutData.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		this.setSize(new Point(63, 202));
		setLayout(new GridLayout());
		setLayoutData(layoutData);
	}

	private final void newAdditionalTransformation() {
		// select the .asm transformation
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell(), lp, cp);
		dialog.setValidator(null);
		dialog.setAllowMultiple(false);
		dialog.setTitle(Messages.AdditionalButtonsComposite_5);
		dialog.setMessage(Messages.AdditionalButtonsComposite_6);
		dialog.addFilter(new ViewerFilter() {
			@Override
			public boolean select(final Viewer viewer, final Object parentElement,
					final Object element) {
				if (element instanceof IFile) {
					return ((IFile) element).getFileExtension().equals("asm"); //$NON-NLS-1$
				}
				return true;
			}
		});
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

		if (dialog.open() == Window.OK) {
			Object[] elements = dialog.getResult();
			if (elements.length == 1) {
				String additionalTransformationPath = ((IResource) elements[0]).getLocation()
						.toString();
				this.controller.createAdditionalTransformation(additionalTransformationPath,
						this.modelplexTransformation);
			}
		}
	}

	@SuppressWarnings("null")
	private final void editAdditionalTransformation() {
		ITreeSelection selection = this.transformationTreeComposite.getSelection();
		if (selection.isEmpty() == false) {
			AtlTransformation updatedTransformation = null;
			for (Object updated : selection.toList()) {
				if (updated instanceof ElementDisplay) {
					updatedTransformation = ((ElementDisplay) updated).getModelElement();
				}
			}
			String location = updatedTransformation.getTransformationPath();
			// select the new .asm transformation
			ILabelProvider lp = new WorkbenchLabelProvider();
			ITreeContentProvider cp = new WorkbenchContentProvider();
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getShell(), lp, cp);
			dialog.setValidator(null);
			dialog.setAllowMultiple(false);
			dialog.setTitle(Messages.AdditionalButtonsComposite_8);
			dialog.setMessage(Messages.AdditionalButtonsComposite_9);
			dialog.addFilter(new ViewerFilter() {
				@Override
				public boolean select(final Viewer viewer, final Object parentElement,
						final Object element) {
					if (element instanceof IFile) {
						return ((IFile) element).getFileExtension().equals("asm"); //$NON-NLS-1$
					}
					return true;
				}
			});
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			if ((location != null) && (location.length() != 0)) {
				IResource initialSelection = ResourcesPlugin.getWorkspace().getRoot()
						.getFileForLocation(new Path(location));
				if (initialSelection != null) {
					dialog.setInitialSelection(initialSelection);
				}
			}

			if (dialog.open() == Window.OK) {
				Object[] elements = dialog.getResult();
				if (elements.length == 1) {
					String additionalTransformationPath = ((IResource) elements[0]).getLocation()
							.toString();
					this.controller.updateAdditionalTransformation(updatedTransformation,
							this.modelplexTransformation, additionalTransformationPath);
				}
			}
		}
	}

	private final void removeAdditionalTransformation() {
		ITreeSelection selection = this.transformationTreeComposite.getSelection();
		if (selection.isEmpty() == false) {
			for (Object removed : selection.toList()) {
				if (removed instanceof ElementDisplay) {
					this.controller.deleteAdditionalTransformation(
							((ElementDisplay) removed).getModelElement(),
							this.modelplexTransformation);
				}
			}
		}
	}

	private final void upAdditionalTransformation() {
		ITreeSelection selection = this.transformationTreeComposite.getSelection();
		if (selection.isEmpty() == false) {
			for (Object upper : selection.toList()) {
				if (upper instanceof ElementDisplay) {
					this.controller.upAdditionalTransformation(
							((ElementDisplay) upper).getModelElement(),
							this.modelplexTransformation);
				}
			}
		}
	}

	private final void downAdditionalTransformation() {
		ITreeSelection selection = this.transformationTreeComposite.getSelection();
		if (selection.isEmpty() == false) {
			for (Object lower : selection.toList()) {
				if (lower instanceof ElementDisplay) {
					this.controller.downAdditionalTransformation(
							((ElementDisplay) lower).getModelElement(),
							this.modelplexTransformation);
				}
			}
		}
	}

} // @jve:decl-index=0:visual-constraint="10,10"
