/** 
 * Copyright (c) 2014 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442714 - New toolbar action to show/hide eContainer link
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class EContainerHandler extends AbstractFacetSetActivatorHandler {

	private static final String FACET_SET_ID = "org.eclipse.emf.facet.ecore.econtainer"; //$NON-NLS-1$

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		return execute(event, FACET_SET_ID);
	}

}
