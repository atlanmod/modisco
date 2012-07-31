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

/**
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscoveryParameterImpl implements DiscoveryParameter {

	private String description;
	private String name;
	private DiscoveryParameterDirectionKind parameterDirectionKind;
	private Class<?> type;
	private boolean required;
	private boolean multivalued = false;

	public DiscoveryParameterImpl() {
		this(Messages.DiscoveryParameterImpl_0);
	}

	public DiscoveryParameterImpl(final String name) {
		this(name, DiscoveryParameterDirectionKind.inout, null, true);
	}

	public DiscoveryParameterImpl(final String name,
			final DiscoveryParameterDirectionKind parameterDirectionKind, final Class<?> type,
			final boolean required) {
		this.name = name;
		this.description = getName();
		this.parameterDirectionKind = parameterDirectionKind;
		if (type != null) {
			this.type = type;
		} else {
			this.type = String.class;
		}
		this.required = required;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public DiscoveryParameterDirectionKind getParameterDirectionKind() {
		return this.parameterDirectionKind;
	}

	public void setParameterDirectionKind(
			final DiscoveryParameterDirectionKind parameterDirectionKind) {
		this.parameterDirectionKind = parameterDirectionKind;
	}

	public Class<?> getType() {
		return this.type;
	}

	public void setType(final Class<?> type) {
		this.type = type;
	}

	public boolean isRequired() {
		return this.required;
	}

	public void setRequired(final boolean required) {
		this.required = required;
	}

	public boolean isMultivalued() {
		return this.multivalued;
	}

	public void setMultivalued(final boolean multivalued) {
		this.multivalued = multivalued;
	}

}
