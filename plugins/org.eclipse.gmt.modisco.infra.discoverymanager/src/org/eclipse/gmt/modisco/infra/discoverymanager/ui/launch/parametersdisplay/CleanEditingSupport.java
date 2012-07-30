/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.parametersdisplay;

import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplay;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;

/**
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class CleanEditingSupport extends EditingSupport {

	public CleanEditingSupport(final ColumnViewer viewer) {
		super(viewer);
	}

	@Override
	protected CellEditor getCellEditor(final Object element) {
		return null;
	}

	@Override
	protected boolean canEdit(final Object element) {
		// clean the value of element
		DiscoveryParameterDisplay displayParameter = (DiscoveryParameterDisplay) element;
		displayParameter.setValue(null);
		this.getViewer().update(element, null);

		// return always false
		return false;
	}

	@Override
	protected Object getValue(final Object element) {
		return null;
	}

	@Override
	protected void setValue(final Object element, final Object value) {
		assert (true);
	}

}
