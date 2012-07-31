/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.core.ATLCoreException;

/**
 * @author GBarbier
 * 
 */
public interface BidirectionalAssociationDiscoverer {

	/**
	 * Discovery of bidirectional associations in selected Uml model. It is limited to a simple
	 * detection, there should be only one property in a class which type is opposite class and same
	 * thing for opposite.
	 * 
	 * @param umlSourceUri
	 * @param umlTargetUri
	 *            ; could be null, in this case, umlSourceUri will be used.
	 * @throws ATLCoreException
	 */
	public void discoverBidirectionalAssociations(URI umlSourceUri, final URI umlTargetUri)
			throws ATLCoreException;

}
