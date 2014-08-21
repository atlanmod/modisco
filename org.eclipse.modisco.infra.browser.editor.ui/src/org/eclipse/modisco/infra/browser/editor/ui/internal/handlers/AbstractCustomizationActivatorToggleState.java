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
	private final String customId;

	protected AbstractCustomizationActivatorToggleState(final String customID) {
		/*
		 * No persistence and initialized to FALSE (unchecked button)
		 */
		super();
		setShouldPersist(false);
		setValue(Boolean.FALSE);
		this.customId = customID;
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
				AbstractCustomizationActivatorToggleState.this
						.partActivated(part);
			}
		};

		this.facetMgrListener = new IFacetManagerListener() {
			public void facetManagerChanged() {
				changeToggleState();
			}
		};
	}
	
	protected void partActivated(final IWorkbenchPart part) {
		if (part instanceof TreeEditor) {
			final TreeEditor treeEditor = (TreeEditor) part;
			this.facetManager = treeEditor.getFacetManager();
			this.facetManager.removeListener(this.facetMgrListener);
			this.facetManager.addListener(this.facetMgrListener);
			changeToggleState();
		}
	}
	

	/**
	 * Check if the customization linked to this ToogleState is activated. If
	 * so, the ToggleState is checked
	 * 
	 * @param pCustomID
	 *            ID of the customization linked to this ToggleState
	 */
	protected void changeToggleState() {
		final List<FacetSet> facetSets = this.facetManager
				.getManagedFacetSets();
		for (FacetSet facetSet : facetSets) {
			if (this.customId.equals(facetSet.getName())) {
				setValue(Boolean.TRUE);
				break;
			} else if (!this.getValue().equals(Boolean.FALSE)) {
				setValue(Boolean.FALSE);
			}
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
