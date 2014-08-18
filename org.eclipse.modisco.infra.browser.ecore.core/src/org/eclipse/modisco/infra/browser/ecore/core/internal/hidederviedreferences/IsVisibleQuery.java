/** 
 * Copyright (c) 2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 */
package org.eclipse.modisco.infra.browser.ecore.core.internal.hidederviedreferences;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class IsVisibleQuery implements IJavaQuery2<EObject, Boolean> {
	public Boolean evaluate(final EObject context, 
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
			throws DerivedTypedElementException {
		boolean result = false;
		if (parameterValues.size() == 0) {
			result = true;
		} else {
			final Object paramValue = parameterValues.get(0).getValue();
			if (paramValue instanceof EStructuralFeature) {
				final EStructuralFeature eStructFeature = (EStructuralFeature) paramValue;
				result = !eStructFeature.isDerived();
			} else {
				throw new DerivedTypedElementException(
						"Unexpected parameter type"); //$NON-NLS-1$
			}
		}
		return  Boolean.valueOf(result);
	}
}
