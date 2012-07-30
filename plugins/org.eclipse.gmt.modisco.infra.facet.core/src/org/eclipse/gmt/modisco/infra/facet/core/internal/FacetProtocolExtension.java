/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.infra.facet.core.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.internal.protocol.IModiscoProtocolExtension;
import org.eclipse.gmt.modisco.infra.facet.core.FacetSetCatalog;

public class FacetProtocolExtension implements IModiscoProtocolExtension {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.common.core.IModiscoResourceFactoryExt#
	 * getSchemeSpecificPart()
	 */
	public String getSchemeSpecificPart() {
		return "facet"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.common.core.internal.IModiscoResourceFactoryExt#getURI
	 * (java.lang.String)
	 */
	public URI getURI(final String name) {
		return FacetSetCatalog.getSingleton().getURI(name);
	}
}