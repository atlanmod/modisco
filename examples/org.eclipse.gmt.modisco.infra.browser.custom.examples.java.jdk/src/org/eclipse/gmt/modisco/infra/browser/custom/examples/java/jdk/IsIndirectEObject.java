/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.examples.java.jdk;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeDeclaration;

public class IsIndirectEObject implements
		IJavaModelQuery<TypeDeclaration, Boolean> {

	public Boolean evaluate(final TypeDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		if (new IsEObject().evaluate(context, parameterValues).booleanValue()) {
			return new Boolean(true);
		}
		for (TypeAccess ta : context.getSuperInterfaces()) {
			if (ta.getType() instanceof TypeDeclaration) {
				TypeDeclaration superInterface = (TypeDeclaration) ta.getType();
				if (this.evaluate(superInterface, parameterValues)
						.booleanValue()) {
					return new Boolean(true);
				}
			}
		}
		return new Boolean(false);
	}
}
