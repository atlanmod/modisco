/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas BROS (Mia-Software)
 */
package org.eclipse.gmt.modisco.infra.query.core.internal;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.MoDiscoCatalogBuilder;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;

public class QueryBuilder extends MoDiscoCatalogBuilder {

	protected static final String FILE_EXTENSION = "querySet"; //$NON-NLS-1$
	private static final String MARKER_TYPE = "org.eclipse.gmt.modisco.infra.query.problem"; //$NON-NLS-1$

	@Override
	protected AbstractMoDiscoCatalog getCatalog() {
		return ModelQuerySetCatalog.getSingleton();
	}

	@Override
	protected String getElementType() {
		return Messages.QueryBuilder_querySet;
	}

	@Override
	protected String getRegistrationExtensionPoint() {
		return ModelQuerySetCatalog.REGISTRATION_EXTENSION_POINT_ID;
	}

	@Override
	protected String getMarkerType() {
		return QueryBuilder.MARKER_TYPE;
	}

	@Override
	protected String getFileExtension() {
		return QueryBuilder.FILE_EXTENSION;
	}

	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}

}
