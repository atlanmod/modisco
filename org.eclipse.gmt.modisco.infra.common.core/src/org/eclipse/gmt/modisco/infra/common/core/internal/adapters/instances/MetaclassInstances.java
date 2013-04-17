/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 339930 - Anticipate UI freeze : MoDisco project & externalize Strings
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.adapters.instances;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/** Handles a cache for instances by metaclass */
public interface MetaclassInstances {
	/**
	 * Return the list of instances for the given metaclass
	 * 
	 * @param eClass
	 *            the metaclass
	 * @param includingSubclasses
	 *            whether to include instances of subclasses too
	 * @return instances of the given metaclass, or an empty set if none
	 */
	Collection<EObject> getInstances(EClass eClass, boolean includingSubclasses);

	/** Clears the cache and recomputes its contents */
	void clearCache();

	/** Add a listener to be notified when the model changes */
	void addListener(ModelChangeListener listener);

	/** Remove a previously set listener */
	void removeListener(ModelChangeListener listener);

}
