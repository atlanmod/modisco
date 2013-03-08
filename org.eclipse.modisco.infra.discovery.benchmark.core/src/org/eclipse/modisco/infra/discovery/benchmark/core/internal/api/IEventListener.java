/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.api;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.Event;

/**
 * Interface of the EventListener that have to be implemented by the EventAndMemoryRecorder
 * @author Guillaume Doux
 *
 */
public interface IEventListener {

	/**
	 * method to call to notify an Event to the listener
	 * @param event
	 */
	public void notifyEvent(Event event);
	
}
