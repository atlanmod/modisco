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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.uml2bridge;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.TransformationExporter;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.common.AdditionalButtonsComposite;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.common.TransformationTreeComposite;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author Gabriel Barbier
 * 
 */
public class Uml2BridgeBodyComposite extends Composite {

	private Label standardTransformationLabel = null;
	private Button standardTransformationEditButton = null;
	private Label additionalLabel = null;
	@SuppressWarnings("unused")
	private Composite additionalButtonsComposite = null;
	private TransformationTreeComposite additionalTransformationsComposite = null;
	private Label customTransformationLabel = null;
	private Button customTransformationCheckBox = null;
	private Text customTransformationText = null;
	private Button customTransformationButton = null;
	private Uml2BridgePage pageValidationConsumer = null;

	private final ControllerServices controllerServices;
	private final ModelplexTransformation model;

	public Uml2BridgeBodyComposite(final Composite parent, final int style,
			final Uml2BridgePage consumerParameter, final ControllerServices controller) {
		super(parent, style);
		this.pageValidationConsumer = consumerParameter;
		this.controllerServices = controller;
		this.model = this.controllerServices.getModelServices().getDiscoverer().getToUml();

		initialize();

		initializeFromModelInformations();
	}

	private final void initializeFromModelInformations() {
		if (this.model.isCustom()) {
			this.customTransformationCheckBox.setSelection(this.model.isCustom());
			this.customTransformationText.setText(this.model.getTransformationPath());
			this.customTransformationText.setEnabled(this.model.isCustom());
			this.customTransformationButton.setEnabled(this.model.isCustom());
		}
	}

	private void initialize() {
		GridData gridData11 = new GridData();
		gridData11.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		this.standardTransformationLabel = new Label(this, SWT.NONE);
		this.standardTransformationLabel.setText(Messages.Uml2BridgeBodyComposite_0);
		this.standardTransformationEditButton = new Button(this, SWT.NONE);
		this.standardTransformationEditButton.setText(Messages.Uml2BridgeBodyComposite_1);
		this.standardTransformationEditButton.setLayoutData(gridData1);
		this.standardTransformationEditButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				Uml2BridgeBodyComposite.this.exportStandardTransformation();
			}
		});
		this.customTransformationLabel = new Label(this, SWT.NONE);
		this.customTransformationLabel.setText(Messages.Uml2BridgeBodyComposite_2);
		this.customTransformationCheckBox = new Button(this, SWT.CHECK);
		this.customTransformationCheckBox.setLayoutData(gridData);
		this.customTransformationCheckBox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				Uml2BridgeBodyComposite.this.customTransformationCheckBoxSelectionChange();
			}
		});
		this.customTransformationText = new Text(this, SWT.BORDER);
		this.customTransformationText.setEnabled(false);
		this.customTransformationText.setEditable(false);
		this.customTransformationText.setLayoutData(gridData2);
		this.customTransformationButton = new Button(this, SWT.NONE);
		this.customTransformationButton.setText(Messages.Uml2BridgeBodyComposite_3);
		this.customTransformationButton.setEnabled(false);
		this.customTransformationButton.setLayoutData(gridData3);
		this.customTransformationButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				Uml2BridgeBodyComposite.this.selectCustomTransformation();
			}
		});
		this.additionalLabel = new Label(this, SWT.NONE);
		this.additionalLabel.setText(Messages.Uml2BridgeBodyComposite_4);
		@SuppressWarnings("unused")
		Label filler = new Label(this, SWT.NONE);
		this.additionalTransformationsComposite = new TransformationTreeComposite(this, SWT.NONE,
				this.controllerServices, this.model);
		this.controllerServices.getModelServices().getModelEventsSubscribe()
				.subscribe(this.additionalTransformationsComposite);
		this.additionalButtonsComposite = new AdditionalButtonsComposite(this, SWT.NONE,
				this.additionalTransformationsComposite, this.controllerServices, this.model);

		setLayout(gridLayout);
		this.setSize(new Point(509, 530));

	}

	final void customTransformationCheckBoxSelectionChange() {
		boolean selection = this.customTransformationCheckBox.getSelection();
		this.customTransformationText.setEnabled(selection);
		this.customTransformationButton.setEnabled(selection);

		this.pageValidationConsumer.pageValidationChanged(validatePage());
		// store this informations into model
		this.model.setCustom(selection);
	}

	final void exportStandardTransformation() {
		// close the wizard, so that the exported transformation can be immediately modified
		((WizardDialog) this.pageValidationConsumer.getWizard().getContainer()).close();

		TransformationExporter exporter = this.controllerServices.getTransformationExporter();
		exporter.exportKdmToUmlTransformation();

	}

	final void selectCustomTransformation() {
		String customTransformation = this.customTransformationText.getText();

		// select the .asm transformation
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell(), lp, cp);
		dialog.setValidator(null);
		dialog.setAllowMultiple(false);
		dialog.setTitle(Messages.Uml2BridgeBodyComposite_5);
		dialog.setMessage(Messages.Uml2BridgeBodyComposite_6);
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
		if ((customTransformation == null) || (customTransformation.length() == 0)) {
			// initialization from the model's information
			customTransformation = this.model.getTransformationPath();
		}
		if ((customTransformation != null) && (customTransformation.length() != 0)) {
			IResource selection = ResourcesPlugin.getWorkspace().getRoot()
					.getFileForLocation(new Path(customTransformation));
			if (selection != null) {
				dialog.setInitialSelection(selection);
			}
		}

		if (dialog.open() == Window.OK) {
			Object[] elements = dialog.getResult();
			if (elements.length == 1) {
				customTransformation = ((IResource) elements[0]).getLocation().toString();
				this.customTransformationText.setText(customTransformation);

				this.pageValidationConsumer.pageValidationChanged(validatePage());

				// store this information into the model
				this.model.setCustom(true);
				this.model.setTransformationPath(customTransformation);
			}
		}
	}

	/**
	 * The page is valid if:
	 * <ul>
	 * <li>the KDM to UML transformation must be the standard transformation, or
	 * <li>in the case of a transformation provided by the user, it must be valid:
	 * <ul>
	 * <li>the file must exist
	 * <li>the file's extension must be ".asm"
	 * </ul>
	 * </ul>
	 */
	public boolean validatePage() {
		boolean result = true;
		if (this.customTransformationCheckBox.getSelection()) {
			// cas d'une transformation fournie par l'utilisateur
			String path = this.customTransformationText.getText();
			if ((path != null) && (path.equals("") == false)) { //$NON-NLS-1$
				if (path.endsWith(".asm")) { //$NON-NLS-1$
					IPath customTransformation = new Path(path);
					result = customTransformation.toFile().exists();
				} else {
					result = false;
				}
				if (result == false) {
					this.customTransformationText.forceFocus();
					this.customTransformationText.selectAll();
				}
			} else {
				result = false;
			}
		} // else nothing to do !
		return result;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
