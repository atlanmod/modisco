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
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import org.eclipse.gmt.modisco.java.internal.util.JavaUtil;

public class IsEclipseUI implements IJavaModelQuery<TypeDeclaration, Boolean> {

	public Boolean evaluate(final TypeDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		TypeDeclaration typeDeclartion = context;
		CompilationUnit compilationUnit = typeDeclartion
				.getOriginalCompilationUnit();
		if (compilationUnit != null) {
			for (ImportDeclaration importDeclaraion : compilationUnit
					.getImports()) {
				String qualifiedName = JavaUtil
						.getQualifiedName(importDeclaraion.getImportedElement());
				boolean isJFace = qualifiedName.startsWith("org.eclipse.jface"); //$NON-NLS-1$
				boolean isSWT = qualifiedName.startsWith("org.eclipse.swt"); //$NON-NLS-1$
				if (isJFace || isSWT) {
					return new Boolean(true);
				}
			}
		}
		return new Boolean(false);
	}


}
