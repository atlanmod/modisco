/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow.internal.engine;

import org.eclipse.gmt.modisco.workflow.WorkflowExecution;

/** @deprecated */
@Deprecated
public interface EngineFactory {

	/**
	 * The singleton instance of the factory.
	 * 
	 */
	public static final EngineFactory INSTANCE = new EngineFactoryImpl();
	
	public WorkflowExecution getEngine(final String engineId);
}
