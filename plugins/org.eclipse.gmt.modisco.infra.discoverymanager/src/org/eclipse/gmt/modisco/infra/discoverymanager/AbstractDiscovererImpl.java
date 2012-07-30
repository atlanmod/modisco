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

package org.eclipse.gmt.modisco.infra.discoverymanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author GBarbier
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public abstract class AbstractDiscovererImpl implements Discoverer {

	private final List<DiscoveryParameter> discovererParameters = new ArrayList<DiscoveryParameter>();

	/**
	 * To be able to add parameters to the list, we need a basic getter for
	 * sub-classes. However, we have to flag this method as final, to call it
	 * safely from constructors
	 * 
	 * @return the modifiable list of discovery parameters
	 */
	protected final List<DiscoveryParameter> getBasicDiscovererParameters() {
		return this.discovererParameters;
	}

	/**
	 * @return the unmodifiable list of discovery parameters
	 */
	public List<DiscoveryParameter> getDiscovererParameters() {
		return Collections.unmodifiableList(this.discovererParameters);
	}

	private final DiscoveryParameter targetModel;

	public DiscoveryParameter getTargetModelParameter() {
		return this.targetModel;
	}

	private final DiscoveryParameter targetUri;

	public DiscoveryParameter getTargetUriParameter() {
		return this.targetUri;
	}

	private final DiscoveryParameter silentMode;

	public DiscoveryParameter getSilentModeParameter() {
		return this.silentMode;
	}

	public AbstractDiscovererImpl() {
		this.targetModel = new DiscoveryParameterImpl(
				"TargetModel", DiscoveryParameterDirectionKind.out, Resource.class, false); //$NON-NLS-1$
		this.getBasicDiscovererParameters().add(this.targetModel);
		this.targetUri = new DiscoveryParameterImpl(
				"TargetUri", DiscoveryParameterDirectionKind.in, URI.class, false); //$NON-NLS-1$
		this.getBasicDiscovererParameters().add(this.targetUri);
		this.silentMode = new DiscoveryParameterImpl(
				"SilentMode", DiscoveryParameterDirectionKind.in, Boolean.class, false); //$NON-NLS-1$
		this.getBasicDiscovererParameters().add(this.silentMode);
	}

	/*
	 * Provides a basic implementation of this deprecated method. It is to avoid
	 * re-implement it for each new discovery action.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer#discoverElement
	 * (java.lang.Object, org.eclipse.emf.common.util.URI)
	 */
	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		Resource result = null;
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(this.getTargetUriParameter(), target);
		this.discoverElement(source, parameters);
		if (parameters.containsKey(this.getTargetModelParameter())) {
			result = (Resource) parameters.get(this.getTargetModelParameter());
		}
		return result;
	}

}
