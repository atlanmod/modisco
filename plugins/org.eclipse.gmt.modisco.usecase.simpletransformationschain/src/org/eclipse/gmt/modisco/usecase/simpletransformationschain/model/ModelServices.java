/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer;

/**
 * @author Gabriel Barbier
 * 
 */
public interface ModelServices {

	public ModelplexDiscoverer getDiscoverer();

	public void persistDiscoverer();

	public ModelEventsSubscribe getModelEventsSubscribe();
}
