package org.eclipse.modisco.infra.query.tests.samples;
/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;

public abstract class Bug303036AbstractClass implements IJavaModelQuery<EObject, String> {

	public abstract String getResult();

	public String evaluate(final EObject context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return getResult();
	}

}