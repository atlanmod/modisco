/** 
 * Copyright (c) 2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.opener;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.util.emf.core.IResourceBrowserOpener;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Activator;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Messages;
import org.eclipse.modisco.infra.browser.editor.ui.internal.editor.TreeEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class ResourceBrowserOpener implements IResourceBrowserOpener {

	public void openResource(final Resource resource) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				try {
					final IWorkbench workbench = PlatformUI.getWorkbench();
					final IWorkbenchWindow window = workbench
							.getActiveWorkbenchWindow();
					final IWorkbenchPage page = window.getActivePage();
					IDE.openEditor(page, new ResourceEditorInput(resource),
							TreeEditor.getEditorId(), true);
				} catch (Exception e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		});

	}

	public String getBrowserName() {
		return Messages.ResourceBrowserOpener_EmfFacetDefaultTreeBrowser;
	}

}
