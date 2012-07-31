/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *		Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.discoverymanager.handlers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Image;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscovererHandler implements Discoverer {

	private final Discoverer delegate;

	private String name;
	private String[] paths;
	private Image imageIcon;

	public DiscovererHandler(final Discoverer delegateParemeter) {
		this.delegate = delegateParemeter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		try {
			result = this.delegate.isApplicableTo(source);
		} catch (Throwable e) {
			MoDiscoLogger.logError(e, NLS.bind(Messages.DiscovererHandler_discovererCompliance,
					new Object[] { getName() }), DiscoveryManager.getDefault());
			result = false;
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#
	 * discoverElement(java.lang.Object, org.eclipse.emf.common.util.URI)
	 */
	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		throw new RuntimeException(Messages.DiscovererHandler_deprecatedDiscoveryProcess);
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param paths
	 *            the paths to set
	 */
	public void setPaths(final String[] paths) {
		this.paths = paths;
	}

	/**
	 * @return the paths
	 */
	public String[] getPaths() {
		return this.paths;
	}

	public void setImageIcon(final Image imageIcon) {
		this.imageIcon = imageIcon;
	}

	public Image getImageIcon() {
		return this.imageIcon;
	}

	@Override
	public String toString() {
		String result = getName();
		if ((result == null) || (result.length() == 0)) {
			result = this.delegate.toString();
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer#discoverElement
	 * (java.lang.Object, java.util.Map)
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		this.delegate.discoverElement(source, parameters);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.infra.discoverymanager.Discoverer#
	 * getDiscovererParameters ()
	 */
	public List<DiscoveryParameter> getDiscovererParameters() {
		List<DiscoveryParameter> result = this.delegate.getDiscovererParameters();
		if (result == null) {
			result = Collections.emptyList();
		}
		return result;
	}
}
