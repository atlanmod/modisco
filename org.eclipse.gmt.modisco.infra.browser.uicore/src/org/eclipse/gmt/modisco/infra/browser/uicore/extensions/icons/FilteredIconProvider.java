/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons;

/**
 * An extension to {@link IconProvider} that adds a way to filter elements
 * before the {@link IconProvider#getIcon(org.eclipse.emf.ecore.EObject)
 * getName} method is called.
 */
public interface FilteredIconProvider extends IconProvider {
	/** @return whether this {@link IconProvider} filters the given metaclass */
	boolean filter(String metaclass);
}
