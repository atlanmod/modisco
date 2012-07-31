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
package org.eclipse.gmt.modisco.infra.query.core.java.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryParameterValue;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class JavaModelQueryAdapter extends AbstractModelQuery {

	private final IJavaModelQuery<EObject, ?> javaModelQuery;

	public JavaModelQueryAdapter(final ModelQuery modelQuery,
			final IJavaModelQuery<EObject, ?> javaModelQuery) {
		super(modelQuery);
		this.javaModelQuery = javaModelQuery;
	}

	@Override
	public Object basicEvaluate(final EObject context,
			final List<ModelQueryParameterValue> parameterValues) throws ModelQueryException {
		ParameterValueList plist = new ParameterValueList();
		if (parameterValues != null) {
			plist.addAll(parameterValues);
		}
		Object result = this.javaModelQuery.evaluate(context, plist);
		this.checkResult(result);
		return result;
	}
}
