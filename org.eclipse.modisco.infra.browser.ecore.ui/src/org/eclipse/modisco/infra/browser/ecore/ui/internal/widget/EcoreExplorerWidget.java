/** 
 * Copyright (c) 2015 Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget;
import org.eclipse.swt.widgets.Composite;

public class EcoreExplorerWidget implements IEcoreExplorerWidget {

	private final EcoreExplorerWidgetComposite composite;

	EcoreExplorerWidget(final Composite parent) {
		this(parent, new MenuManager(EcoreExplorerWidget.class.getName(),
				EcoreExplorerWidget.class.getName()));
	}

	EcoreExplorerWidget(final Composite parent, final MenuManager menuManager) {
		this.composite = new EcoreExplorerWidgetComposite(parent, menuManager);
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		// @SuppressWarnings("rawtypes") Raw Type because of the implementation
		Object result = null;
		if (adapter.isInstance(this)) {
			result = this;
		} else if (adapter.isInstance(this.composite)) {
			result = this.composite;
		}
		return result;
	}

	public void changeInput(final Collection<EObject> eObjects) {
		this.composite.changeInput(eObjects);
	}

}
