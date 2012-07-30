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

import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class CleanColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(final Object element) {
		return ""; //$NON-NLS-1$
	}

	@Override
	public Image getImage(final Object element) {
		return DiscoveryManager.getImageDescriptor("icons/deleteValue.png").createImage(); //$NON-NLS-1$
	}

}
