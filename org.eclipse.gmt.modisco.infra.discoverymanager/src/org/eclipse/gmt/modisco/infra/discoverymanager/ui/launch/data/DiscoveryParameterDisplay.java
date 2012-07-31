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

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data;

import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public interface DiscoveryParameterDisplay extends DiscoveryParameter {
	/**
	 * To associate a value with a discoverer parameter in the context of launch
	 * configuration, we have a technical limitation due to serialization of
	 * parameters. The value have to be an instance of int, boolean, String,
	 * List<String> or Map<String, String>. For other types, each discoverer
	 * will have to provide a serialization method to obtain a String which
	 * represent the value, and a dezerialization method to obtain a value from
	 * a String.
	 * 
	 * Null indicates there is no value (it is not possible to use null as a
	 * valid value)
	 * 
	 * @return the value associated to this discoverer parameter.
	 */
	public Object getValue();

	/**
	 * To initialize the value of the discoverer parameter.
	 * 
	 * @param value
	 */
	public void setValue(Object value);
}
