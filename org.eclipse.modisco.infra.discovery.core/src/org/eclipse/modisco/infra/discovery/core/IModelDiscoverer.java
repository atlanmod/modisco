/*******************************************************************************
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - Bug 393416
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A category of discoverers which handle some
 * resulting model. Some classic implementation is provided on {@link AbstractModelDiscoverer}.
 * It proposes to centralize some usual parameters :
 *
 * <ul>
 * <li>
 * A model container ({@link org.eclipse.emf.ecore.resource.Resource}), usually
 * an output of the discovery but which might be provided also as input.
 * <li>
 * A boolean indicating if some serialization is wished.
 * <li>
 * A location for optional serialization (
 * {@link org.eclipse.emf.common.util.URI})
 * </ul>
 *
 * @param <T>
 *            the type of source of the discovery
 */
public interface IModelDiscoverer<T> extends IDiscoverer<T> {

	public abstract Resource getTargetModel();

	public abstract void setTargetModel(final Resource targetModel);

	public abstract void setSerializeTarget(final boolean serializeTarget);

	public abstract URI getTargetURI();

	public abstract void setTargetURI(final URI targetURI);

}