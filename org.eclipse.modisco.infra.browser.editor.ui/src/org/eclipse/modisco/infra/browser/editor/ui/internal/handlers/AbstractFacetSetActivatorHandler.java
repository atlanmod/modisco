/** 
 * Copyright (c) 2014 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442257 - New toolbar actions to (des)activate customizations
 *    Thomas Cicognani (Soft-Maint) - Bug 442714 - New toolbar action to show/hide eContainer link
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerProvider;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Abstract Handler to manage menu toolbar shortcuts. These shortcuts allow
 * users to (des)activate facet sets (customizations are facet sets). If you
 * want to create a menu shortcut, your Handler must extends this class
 */
public abstract class AbstractFacetSetActivatorHandler extends AbstractHandler {

	/**
	 * Execute the Handler
	 * 
	 * @param event
	 *            The execution event that contains the application context
	 * @param facetSetID
	 *            ID of the facet set linked to this Handler
	 * @return the result of the execution. Reserved for future use, can be
	 *         null.
	 * @throws ExecutionException
	 */
	protected static Object execute(final ExecutionEvent event,
			final String facetSetID) throws ExecutionException {
		final boolean toggle = HandlerUtil.toggleCommandState(event
				.getCommand());
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final ICustomizationManagerProvider customMgrProvider = (ICustomizationManagerProvider) activePart
					.getAdapter(ICustomizationManagerProvider.class);
			if (customMgrProvider != null) {
				execute(facetSetID, toggle, customMgrProvider);
			}
		}
		return null;
	}

	private static void execute(final String facetSetID, final boolean toggle,
			final ICustomizationManagerProvider customMgrProvider) {
		final ICustomizationManager manager = customMgrProvider
				.getCustomizationManager();

		final IFacetSetCatalogManager catalog = IFacetSetCatalogManagerFactory.DEFAULT
				.getOrCreateFacetSetCatalogManager(manager.getResourceSet());

		FacetSet facetSetToActive = null;
		for (FacetSet facetSet : catalog.getRegisteredFacetSets()) {
			if (facetSetID.equals(facetSet.getName())) {
				facetSetToActive = facetSet;
				break;
			}
		}
		if (facetSetToActive != null) {
			final IFacetManager facetManager = manager.getFacetManager();
			final List<FacetSet> managedFacetSets = facetManager
					.getManagedFacetSets();
			if (toggle) {
				managedFacetSets.remove(facetSetToActive);
			} else {
				if (!managedFacetSets.contains(facetSetToActive)) {
					managedFacetSets.add(0, facetSetToActive);
				}
			}
		}
	}

}
