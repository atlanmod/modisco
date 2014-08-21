/** 
 * Copyright (c) 2014 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442257 - New toolbar actions to (des)activate customizations
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

import java.util.List;

import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerListener;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.jface.commands.ToggleState;
import org.eclipse.modisco.infra.browser.editor.ui.internal.editor.TreeEditor;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Abstract ToggleState to manage menu toolbar shortcuts. These shortcuts allow
 * users to (des)activate customizations. If you want to create a menu shortcut,
 * your ToggleState must extends this class
 */
public abstract class AbstractCustomizationActivatorToggleState extends
		ToggleState {

	private final IPartListener partListener;
	private final IFacetManagerListener facetMgrListener;

	private IFacetManager facetManager;

	protected AbstractCustomizationActivatorToggleState(final String customID) {
		/*
		 * No persistance and initialized to FALSE (unchecked button)
		 */
		super();
		setShouldPersist(false);
		setValue(Boolean.FALSE);

		this.partListener = new IPartListener() {
			public void partOpened(final IWorkbenchPart part) {
				// DO NOTHING
			}

			public void partDeactivated(final IWorkbenchPart part) {
				// DO NOTHING
			}

			public void partClosed(final IWorkbenchPart part) {
				// DO NOTHING
			}

			public void partBroughtToTop(final IWorkbenchPart part) {
				// DO NOTHING
			}

			public void partActivated(final IWorkbenchPart part) {
				if (part instanceof TreeEditor) {
					final TreeEditor treeEditor = (TreeEditor) part;
					AbstractCustomizationActivatorToggleState.this.facetManager = treeEditor
							.getFacetManager();

					AbstractCustomizationActivatorToggleState.this.facetManager
							.removeListener(AbstractCustomizationActivatorToggleState.this.facetMgrListener);
					AbstractCustomizationActivatorToggleState.this.facetManager
							.addListener(AbstractCustomizationActivatorToggleState.this.facetMgrListener);
					changeState(customID);

				}
			}
		};

		this.facetMgrListener = new IFacetManagerListener() {
			public void facetManagerChanged() {
				changeState(customID);
			}
		};
	}

	/**
	 * Check if the customization linked to this ToogleState is activated. If
	 * so, the ToggleState is checked
	 * 
	 * @param pCustomID
	 *            ID of the customization linked to this ToggleState
	 */
	private void changeState(final String pCustomID) {
		final List<FacetSet> facetSets = this.facetManager
				.getManagedFacetSets();
		for (FacetSet facetSet : facetSets) {
			if (facetSet.getName().equals(pCustomID)) {
				setValue(Boolean.TRUE);
				break;
			}
			setValue(Boolean.FALSE);
		}
	}

	@Override
	public Object getValue() {
		/*
		 * Add a listener which changes all ToggleStates when user changes the
		 * activated editor
		 */
		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			final IWorkbenchPage activePage = window.getActivePage();
			if (activePage != null) {
				activePage.removePartListener(this.partListener);
				activePage.addPartListener(this.partListener);
			}
		}
		return super.getValue();
	}

}
