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

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerProvider;
import org.eclipse.emf.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.emf.facet.custom.ui.IResolvingCustomizedLabelProviderFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManagerListener;
import org.eclipse.emf.facet.efacet.core.IFacetManagerProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class EcoreExplorerView extends ViewPart implements
		IFacetManagerProvider, ICustomizationManagerProvider {

	private TreeViewer tree;
	private final EcoreExplorerWindowListener wListener;
	private ICustomizationManager customizationMgr;
	private IFacetManager facetManager;

	public EcoreExplorerView() {
		super();
		final IWorkbenchWindow[] windows = PlatformUI.getWorkbench()
				.getWorkbenchWindows();
		this.wListener = new EcoreExplorerWindowListener(this);
		for (IWorkbenchWindow window : windows) {
			window.addPageListener(this.wListener);
			for (IWorkbenchPage page : window.getPages()) {
				page.addPartListener(this.wListener);
			}
		}
	}

	protected final void changeInput(final ISelection selection) {
		final Set<EPackage> ePackages = new HashSet<EPackage>();
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structSelection = (IStructuredSelection) selection;
			for (Object object : structSelection.toArray()) {
				final EPackage ePackage = Utils.getEPackage(object);
				ePackages.add(ePackage);
			}
		}
		changeInput(ePackages);
	}

	public void changeInput(final Collection<EPackage> ePackages) {
		if (this.tree != null && !ePackages.isEmpty()
				&& !this.tree.getInput().equals(ePackages)) {
			this.tree.setInput(ePackages);
			this.tree.refresh();
		}
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.tree = new TreeViewer(parent);
		this.facetManager = IFacetManagerFactory.DEFAULT
				.getOrCreateDefaultFacetManager(new ResourceSetImpl());
		this.customizationMgr = ICustomizationManagerFactory.DEFAULT
				.createICustomizationManager(this.facetManager);
		final ILabelProvider labelProvider = IResolvingCustomizedLabelProviderFactory.DEFAULT
				.createCustomizedLabelProvider(this.customizationMgr);
		final IContentProvider contentProvider = ICustomizedContentProviderFactory.DEFAULT
				.createCustomizedTreeContentProvider(this.customizationMgr);
		this.tree.setContentProvider(contentProvider);
		this.tree.setLabelProvider(labelProvider);
		this.tree.setInput(Collections.EMPTY_LIST);
		final MenuManager menuManager = new MenuManager("#PopUp"); //$NON-NLS-1$
		menuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		final Menu createContextMenu = menuManager.createContextMenu(this.tree
				.getControl());
		this.tree.getControl().setMenu(createContextMenu);
		getSite().registerContextMenu(menuManager, this.tree);
		/* Drag and drop is not used currently
		final int operations = DND.DROP_COPY | DND.DROP_MOVE;
		final Transfer[] transferTypes = new Transfer[] { LocalTransfer
				.getInstance() };
		*/
		this.facetManager.addListener(new IFacetManagerListener() {
			public void facetManagerChanged() {
				EcoreExplorerView.this.facetManagerChanged();
			}
		});
	}

	protected void facetManagerChanged() {
		final Object[] expanededElts = this.tree.getExpandedElements();
		this.tree.refresh();
		this.tree.setExpandedElements(expanededElts);
	}

	@Override
	public void setFocus() {
		// No thing to do
	}

	public void setSelection(final ISelection selection) {
		this.tree.setSelection(selection);
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tree.removeSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.tree.getSelection();
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tree.addSelectionChangedListener(listener);
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		/* @SuppressWarnings("rawtypes"): gdupe> Imposed by the super class */
		Object result;
		if (adapter.isInstance(this)) {
			result = this;
		} else if (adapter == ISelectionProvider.class) {
			result = this.tree;
		} else {
			result = super.getAdapter(adapter);
		}
		return result;
	}
	
	@Override
	public void dispose() {
		final IWorkbenchWindow[] windows = PlatformUI.getWorkbench()
				.getWorkbenchWindows();
		for (IWorkbenchWindow window : windows) {
			window.addPageListener(this.wListener);
			for (IWorkbenchPage page : window.getPages()) {
				page.removePartListener(this.wListener);
			}
		}
		super.dispose();
	}

	public ICustomizationManager getCustomizationManager() {
		return this.customizationMgr;
	}

	public IFacetManager getFacetManager() {
		return this.facetManager;
	}
}
