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

import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplay;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class ParametersTableLabelProvider extends LabelProvider implements ITableLabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang
	 * .Object, int)
	 */
	public Image getColumnImage(final Object element, final int columnIndex) {
		// no image, perhaps to indicate if it is a mandatory discoverer
		// parameter ...
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang
	 * .Object, int)
	 */
	public String getColumnText(final Object element, final int columnIndex) {
		String result = null;
		if ((element != null) && (element instanceof DiscoveryParameterDisplay)) {
			DiscoveryParameterDisplay parameter = (DiscoveryParameterDisplay) element;
			switch (columnIndex) {
			case 0:
				result = parameter.getName();
				break;
			case 1:
				if (parameter.isRequired()) {
					result = Messages.ParametersTableLabelProvider_0;
				} else {
					result = Messages.ParametersTableLabelProvider_1;
				}
				break;
			case 2:
				result = parameter.getValue().toString();
				break;
			default:
				break;
			}
		}
		return result;
	}

}
