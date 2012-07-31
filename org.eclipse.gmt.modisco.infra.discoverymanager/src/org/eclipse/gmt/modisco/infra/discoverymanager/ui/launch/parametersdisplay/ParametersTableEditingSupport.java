/**
 * Copyright (c) 2009 Mia-Software.
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
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.utils.ParameterUtils;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class ParametersTableEditingSupport extends EditingSupport {

	private final TextCellEditor defaultEditor;

	/**
	 * @param viewer
	 */
	public ParametersTableEditingSupport(final TableViewer viewer) {
		super(viewer);
		this.defaultEditor = new TextCellEditor(viewer.getTable());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
	 */
	@Override
	protected boolean canEdit(final Object element) {
		return ParameterUtils.getInstance().canEdit((DiscoveryParameterDisplay) element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
	 */
	@Override
	protected CellEditor getCellEditor(final Object element) {
		CellEditor cellEditor = ParameterUtils.getInstance().getCellEditor(
				(DiscoveryParameterDisplay) element, ((TableViewer) getViewer()).getTable());
		if (cellEditor == null) {
			cellEditor = this.defaultEditor;
		}
		return cellEditor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
	 */
	@Override
	protected Object getValue(final Object element) {
		return ParameterUtils.getInstance().retrieveValueForEditingSupport(
				(DiscoveryParameterDisplay) element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	protected void setValue(final Object element, final Object value) {
		ParameterUtils.getInstance().initializeValueFromEditingSupport(
				(DiscoveryParameterDisplay) element, value);
		getViewer().update(element, null);
	}

}
