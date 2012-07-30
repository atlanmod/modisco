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

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch;

/**
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public final class DiscovererLaunchConstants {

	private DiscovererLaunchConstants() {
		// util class
	}

	public static final String discovererKind = "discoverer_kind"; //$NON-NLS-1$
	public static final String discovererSourcePath = "discoverer_source_path"; //$NON-NLS-1$
	public static final String discovererTargetPath = "discoverer_target_path"; //$NON-NLS-1$

}
