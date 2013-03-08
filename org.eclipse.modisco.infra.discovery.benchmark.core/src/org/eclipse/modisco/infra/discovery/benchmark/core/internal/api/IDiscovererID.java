/*******************************************************************************
 * Copyright (c) 2011 INRIA. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     Guillaume Doux - INRIA - Initial API and implementation
 *     
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.api;

/**
 * Interface for the discoverer ID element
 * @author Guillaume Doux
 *
 */
public interface IDiscovererID {

	/**
	 * Give the discoverer ID in a String 
	 * @return the String version of the discoverer ID
	 */
	public String getId();
	
}
