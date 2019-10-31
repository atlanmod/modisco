/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication.queries;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceFile;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;

public class GetSourceFileCompilationUnit implements
		IJavaModelQuery<SourceFile, CompilationUnit> {
	public CompilationUnit evaluate(final SourceFile sourceFile,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		CompilationUnit result = null;
		Java2Directory java2Directory = null;
		ResourceSet rSet = sourceFile.eResource().getResourceSet();
		if (rSet != null) {
			List<Resource> resources = rSet.getResources();
			for (Resource resource : resources) {
				for (EObject rootObject : resource.getContents()) {
					if (rootObject instanceof Java2Directory) {
						Java2Directory currentJava2Directory = (Java2Directory) rootObject;
						if (currentJava2Directory.getDirectory().contains(
								sourceFile.eContainer())) {
							java2Directory = currentJava2Directory;
							break;
						}
					}
				}
			}
			if (java2Directory != null) {
				for (Java2File java2File : java2Directory
						.getJava2FileChildren()) {
					if (java2File.getFile() == sourceFile) {
						result = java2File.getJavaUnit();
					}
				}
			}
		}
		return result;
	}

}
