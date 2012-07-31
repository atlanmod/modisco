/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */

package org.eclipse.gmt.modisco.java.queries.modifiers;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ImportDeclaration;

public class IsStatic implements IJavaModelQuery<ASTNode, Boolean> {

	public Boolean evaluate(final ASTNode context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		try {
			if (context instanceof BodyDeclaration) {
				BodyDeclaration classDeclation = (BodyDeclaration) context;
				if (classDeclation.getModifier() != null) {
					return classDeclation.getModifier().isStatic();
				}
				return false;

			} else if (context instanceof ImportDeclaration) {
				ImportDeclaration importDeclaration = (ImportDeclaration) context;
				return importDeclaration.isStatic();
			} else {
				throw new ModelQueryExecutionException(
						"Unexpected context type: " //$NON-NLS-1$
								+ context
								+ " expected: BodyDeclaration or ImportDeclaration in " + this.getClass().getName()); //$NON-NLS-1$
			}
		} catch (Exception e) {
			return false;
		}
	}
}
