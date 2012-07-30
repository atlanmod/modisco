/**
 * Copyright (c) 2011 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Nicolas Guyomar (Mia-Software) - Bug 344243 - illegal API use in org.eclipse.gmt.modisco.infra.query.ui.wizards.NewQueryClassWizardPage
 */
package org.eclipse.gmt.modisco.infra.query.ui.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;

public class NewClassWizardPage extends NewTypeWizardPage {

	private static final String PAGE_NAME = "NewClassWizardPage"; //$NON-NLS-1$

	public NewClassWizardPage() {
		super(true, NewClassWizardPage.PAGE_NAME);
		// TODO : To be externalized
		setTitle("Java Class"); //$NON-NLS-1$
		setDescription("Create a new Java class."); //$NON-NLS-1$
	}

	public void init(final IStructuredSelection selection) {
		IJavaElement jelem = getInitialJavaElement(selection);
		initContainerPage(jelem);
		initTypePage(jelem);
		doStatusUpdate();
	}

	public void createControl(final Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		final int nColumns = 4;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createTypeNameControls(composite, nColumns);
		createModifierControls(composite, nColumns);

		createSuperInterfacesControls(composite, nColumns);

		setControl(composite);

		Dialog.applyDialogFont(composite);
	}

	private void doStatusUpdate() {
		// status of all used components
		IStatus[] status = new IStatus[] { this.fContainerStatus, this.fPackageStatus,
				this.fTypeNameStatus, this.fModifierStatus, this.fSuperClassStatus,
				this.fSuperInterfacesStatus };

		updateStatus(status);
	}

	@Override
	protected void handleFieldChanged(final String fieldName) {
		super.handleFieldChanged(fieldName);

		doStatusUpdate();
	}

}
