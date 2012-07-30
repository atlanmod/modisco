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
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.common.PageValidationEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Gabriel Barbier
 * 
 */
public class Uml2BridgePage extends WizardPage implements PageValidationEvent {

	private Uml2BridgeBodyComposite wizardContent;
	private final ControllerServices controller;

	public Uml2BridgePage(final ControllerServices controllerServices) {
		super("Uml2Bridge", Messages.Uml2BridgePage_0, null); //$NON-NLS-1$
		setDescription(Messages.Uml2BridgePage_2);
		setImageDescriptor(ModelplexKnowledgeDiscoveryFrameworkPlugin
				.getImageDescriptor("resources/images/NewEcore2EcoreBig.gif")); //$NON-NLS-1$
		this.controller = controllerServices;
	}

	public void createControl(final Composite parent) {
		this.wizardContent = new Uml2BridgeBodyComposite(parent, SWT.NONE, this, this.controller);

		setControl(this.wizardContent);

		setPageComplete(this.wizardContent.validatePage());
	}

	public void pageValidationChanged(final boolean validity) {
		setPageComplete(validity);
	}
}
