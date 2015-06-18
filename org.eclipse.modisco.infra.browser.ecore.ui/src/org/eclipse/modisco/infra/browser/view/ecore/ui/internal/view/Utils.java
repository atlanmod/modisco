/** 
 * Copyright (c) 2015 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 471020 - Ecore Explorer View 
 */
package org.eclipse.modisco.infra.browser.view.ecore.ui.internal.view;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;
import org.eclipse.emf.facet.custom.ui.CustomizedContentProviderUtils;

public final class Utils {

	private Utils() {
		// Must not be used
	}

	public static ResourceSet getResourceSet(final Object object) {
		ResourceSet result = null;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			result = eObject.eResource().getResourceSet();
		}
		return result;
	}
	
	public static EPackage getEPackage(final Object object) {
		EPackage result = null;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			result = getEPackage(eObject);
		}
		return result;
	}

	public static EPackage getEPackage(final EObject eObject) {
		EPackage result;
		EObject resolvedEObject = eObject;
		if (eObject instanceof EObjectTreeElement) {
			final EObjectTreeElement treeElt = (EObjectTreeElement) eObject;
			final Object resolvedObject = CustomizedContentProviderUtils
					.resolve(treeElt);
			if (resolvedObject instanceof EObject) {
				resolvedEObject = (EObject) resolvedObject;
			}
		} else if (eObject instanceof EStructuralFeatureTreeElement) {
			final EStructuralFeatureTreeElement sfTreeElt = (EStructuralFeatureTreeElement) eObject;
			final EObjectTreeElement eContainer = (EObjectTreeElement) sfTreeElt.eContainer();
			resolvedEObject = eContainer.getEObject();
		}
		final EClass eClass = resolvedEObject.eClass();
		result = eClass.getEPackage();
		return result;
	}
}
