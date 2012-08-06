/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.internal.impl;

import org.eclipse.modisco.infra.discovery.benchmark.api.IEventManager;
import org.eclipse.modisco.infra.discovery.benchmark.api.IEventManagerFactory;

/**
 * the Factory class for creating event managers
 * @author Guillaume Doux
 *
 */
public class EventManagerFactory implements IEventManagerFactory {

	
	public IEventManager createEventManager() {
		return new EventManager();
	}

}
