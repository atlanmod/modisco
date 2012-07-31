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

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Gabriel Barbier
 * 
 */
public class FiltersButtonsComposite extends Composite {

	private Button newButton = null;
	private Button editButton = null;
	private Button removeButton = null;

	public FiltersButtonsComposite(final Composite parent, final int style) {
		super(parent, style);
		initialize();
	}

	private void initialize() {
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.CENTER;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = GridData.FILL;
		gridData3.verticalAlignment = GridData.CENTER;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.CENTER;
		this.newButton = new Button(this, SWT.NONE);
		this.newButton.setText(Messages.FiltersButtonsComposite_0);
		this.newButton.setLayoutData(gridData);
		this.editButton = new Button(this, SWT.NONE);
		this.editButton.setText(Messages.FiltersButtonsComposite_1);
		this.editButton.setLayoutData(gridData4);
		this.removeButton = new Button(this, SWT.NONE);
		this.removeButton.setText(Messages.FiltersButtonsComposite_2);
		this.removeButton.setLayoutData(gridData3);
		setSize(new Point(300, 200));
		setLayout(new GridLayout());
	}

}
