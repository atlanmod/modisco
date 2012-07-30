/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.editors.table;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TableEditorContentProvider implements IStructuredContentProvider {

	public Object[] getElements(final Object inputElement) {
		final TableEditorInput input = (TableEditorInput) inputElement;
		final List<TableElement> elements = input.getElements();
		return elements.toArray(new Object[elements.size()]);
	}

	public void dispose() {
		// nothing
	}

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// nothing
	}

}
