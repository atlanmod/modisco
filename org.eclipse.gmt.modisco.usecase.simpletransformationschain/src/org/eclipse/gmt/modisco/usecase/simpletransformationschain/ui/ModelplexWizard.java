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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.kdmbridge.KdmBridgePage;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.uml2bridge.Uml2BridgePage;

/**
 * @author Gabriel Barbier
 * 
 */
public class ModelplexWizard extends AbstractKnowledgeDiscoveryWizard {

	private final ControllerServices controllerServices;
	private Uml2BridgePage uml2BridgePage;
	private KdmBridgePage kdmBridgePage;

	public ModelplexWizard(final ControllerServices controller) {
		super();
		this.controllerServices = controller;
	}

	@Override
	public final void addPages() {
		this.kdmBridgePage = new KdmBridgePage(this.controllerServices);
		addPage(this.kdmBridgePage);
		this.uml2BridgePage = new Uml2BridgePage(this.controllerServices);
		addPage(this.uml2BridgePage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.ui.AbstractKnowledgeDiscoveryWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		/*
		 * We do not have to retrieve informations from pages because it is all in modelplex model.
		 * 
		 * So we will first, save modelplex informations. Then, we will convert this java project
		 * into an uml model.
		 */
		this.controllerServices.getModelServices().persistDiscoverer();

		this.controllerServices.getConverter().convertJavaProjectToUml2();

		return super.performFinish();
	}
}
