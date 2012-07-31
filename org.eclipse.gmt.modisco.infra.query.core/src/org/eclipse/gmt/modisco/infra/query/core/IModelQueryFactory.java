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
package org.eclipse.gmt.modisco.infra.query.core;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryException;
import org.osgi.framework.Bundle;

public interface IModelQueryFactory {
	public AbstractModelQuery create(ModelQuery modelQuery, Bundle bundle)
			throws ModelQueryException;

	public EClass getManagedModelQueryType();
}
