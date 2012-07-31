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

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.jface.wizard.Wizard;

/**
 * @author Gabriel Barbier
 * 
 */
public abstract class AbstractKnowledgeDiscoveryWizard extends Wizard {

	public AbstractKnowledgeDiscoveryWizard() {
		super();
		// initialisation des composants du wizard
		initComponents();
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	private final void initComponents() {
		// initialisation du titre global du wizard
		setWindowTitle(Messages.AbstractKnowledgeDiscoveryWizard_wizardTitle);
		// initialisation de l'image globale du wizard
		// this.setDefaultPageImageDescriptor(Activator.getImageDescriptor("resources/images/logo_modelplex_mini.gif"));
	}
}
