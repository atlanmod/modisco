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
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.discoverymanager;

/**
 * 
 * The DiscoveryParameter describes informations needed to characterize inputs
 * and outputs for discoverers.
 * 
 * A basic implementation has been provided:
 * org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public interface DiscoveryParameter {
	/**
	 * 
	 * @return the name of the discoverer parameter
	 */
	public String getName();

	/**
	 * 
	 * @return the description of the discoverer parameter
	 */
	public String getDescription();

	/**
	 * 
	 * @return the direction (in, out, inout) of the discoverer parameter
	 */
	public DiscoveryParameterDirectionKind getParameterDirectionKind();

	/**
	 * 
	 * @return true if a value for this discoverer parameter is mandatory to use
	 *         the discoverer.
	 */
	public boolean isRequired();

	/**
	 * 
	 * @return the type (class) of values for the discoverer parameter
	 */
	public Class<?> getType();

	/**
	 * 
	 * @return true if the parameter is a collection or an array of indicated
	 *         type.
	 */
	public boolean isMultivalued();
}
