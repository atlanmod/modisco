/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.gmt.modisco.infra.common.cdo.server;

import org.eclipse.equinox.app.IApplication;

public interface Server extends IApplication {

	void start(String dbName, int port) throws Exception;

	void stop();

	String getDescription();

	boolean isStarted();
}