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
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.DiscovererUpdate;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscoveryParameterDisplayImpl implements DiscoveryParameterDisplay {

	private Object value = null;
	private final DiscoveryParameter delegate;
	private final DiscovererUpdate updater;

	public DiscoveryParameterDisplayImpl(final DiscoveryParameter realParameterInput,
			final DiscovererUpdate updater) {
		this.updater = updater;
		this.delegate = realParameterInput;
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return this.value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(final Object value) {
		this.value = value;
		this.updater.update();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter#
	 * getDescription ()
	 */
	public String getDescription() {
		return this.delegate.getDescription();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter#getName
	 * ()
	 */
	public String getName() {
		return this.delegate.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter#
	 * getParameterDirectionKind()
	 */
	public DiscoveryParameterDirectionKind getParameterDirectionKind() {
		return this.delegate.getParameterDirectionKind();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter#getType
	 * ()
	 */
	public Class<?> getType() {
		return this.delegate.getType();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter#isRequired
	 * ()
	 */
	public boolean isRequired() {
		return this.delegate.isRequired();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter#
	 * isMultivalued()
	 */
	public boolean isMultivalued() {
		return this.delegate.isMultivalued();
	}

}
