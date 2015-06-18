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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.EditorPart;

public class EcoreExplorerWindowListener implements IPageListener,
		IPartListener2 {

	private final EcoreExplorerView view;

	public EcoreExplorerWindowListener(final EcoreExplorerView view) {
		this.view = view;
	}

	public void pageActivated(final IWorkbenchPage page) {
		changeInput(page);
	}

	public void pageClosed(final IWorkbenchPage page) {
		changeInput(page);
	}

	public void pageOpened(final IWorkbenchPage page) {
		changeInput(page);
		page.addPartListener(this);
	}

	public void partActivated(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partBroughtToTop(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partClosed(final IWorkbenchPartReference partRef) {
		final IEditorPart activeEditor = partRef.getPage().getActiveEditor();
		if (activeEditor == null) {
			this.view.changeInput(new StructuredSelection());
		} else {
			changeInput(activeEditor);
		}
	}

	public void partDeactivated(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partOpened(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partHidden(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partVisible(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	public void partInputChanged(final IWorkbenchPartReference partRef) {
		changeInput(partRef.getPart(false));
	}

	private void changeInput(final IWorkbenchPage page) {
		final ISelection selection = page.getSelection();
		this.view.changeInput(selection);
	}

	private void changeInput(final IWorkbenchPart part) {
		if (part instanceof EditorPart) {
			final IEditingDomainProvider edProvider = (IEditingDomainProvider) part
					.getAdapter(IEditingDomainProvider.class);
			if (edProvider == null) {
				changeInput(part.getSite().getPage());
			} else {
				final EditingDomain editingDomain = edProvider
						.getEditingDomain();
				final ResourceSet resourceSet = editingDomain.getResourceSet();
				final Set<EPackage> ePackages = new HashSet<EPackage>();
				for (Resource resource : resourceSet.getResources()) {
					for (EObject eObject : resource.getContents()) {
						final EPackage ePackage = Utils.getEPackage(eObject);
						ePackages.add(ePackage);
					}
				}
				this.view.changeInput(ePackages);
			}
		}
	}
}
