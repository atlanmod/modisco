/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442041 - A customization hiding empty references
 */
package org.eclipse.modisco.infra.browser.ecore.core.internal.hideemptyreferences;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.core.exception.SuperInvokeException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.query.java.core.IJavaQuery3;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class IsEmptyQuery implements IJavaQuery3<EObject, Boolean> {
	public Boolean evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager, final DerivedTypedElement feature)
			throws DerivedTypedElementException {
		try {
			boolean isVisible = true;
			if (parameterValues != null) {
				final ETypedElement sfParam = (ETypedElement) parameterValues
						.getParameterValueByName("eStructuralFeature").getValue(); //$NON-NLS-1$
				if (sfParam instanceof EReference) {
					final int size = getSizeForReference(source, facetManager,
							sfParam);
					isVisible = (size > 0);
				}
			}

			if (isVisible) {
				isVisible = facetManager.getSuperValueOf(feature, source,
						parameterValues, Boolean.class).booleanValue();
			}

			return Boolean.valueOf(isVisible);
		} catch (FacetManagerException e) {
			throw new DerivedTypedElementException(e);
		} catch (SuperInvokeException e) {
			throw new DerivedTypedElementException(e);
		}
	}

	private static int getSizeForReference(final EObject source,
			final IFacetManager facetManager, final ETypedElement sfParam)
			throws FacetManagerException {
		int size = 0;
		final Object object = facetManager.getOrInvoke(source, sfParam,
				Object.class);
		if (object instanceof Collection) {
			final Collection<?> collection = (Collection<?>) object;
			size = collection.size();
		} else if (object != null) {
			size = 1;
		}
		return size;
	}
}
