/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471597 - [New Browser] Add a customization to display subclasses from an EClass
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class HierarchicalEClassFacetHandler extends
		AbstractFacetSetActivatorHandler {

	private static final String FACET_ID = "org.eclipse.modisco.infra.browser.ecore.core.hierarchicalEClass.facet"; //$NON-NLS-1$

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		return execute(event, FACET_ID);
	}

}
