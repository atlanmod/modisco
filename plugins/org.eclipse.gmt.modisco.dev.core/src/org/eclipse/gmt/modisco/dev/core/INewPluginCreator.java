/*******************************************************************************
 * Copyright (c) 2011 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 355961 - Wizard to create MoDisco plug-ins
 *******************************************************************************/
package org.eclipse.gmt.modisco.dev.core;

import org.eclipse.core.runtime.IProgressMonitor;

/** Used to create new MoDisco plug-ins that follow established rules. */
public interface INewPluginCreator {
	static INewPluginCreator INSTANCE = new NewPluginCreator();

	/**
	 * Create a new plug-in project
	 *
	 * @param id
	 *            id of the new plug-in
	 * @param name
	 *            name of the new plug-in
	 * @param version
	 *            version of the new plug-in
	 * @param provider
	 *            provider of the new plug-in
	 * @param javaNatureEnabled
	 *            whether the new project will have the Java nature (and builder, etc.)
	 * @param monitor
	 *            used to report progress
	 */
	void createProject(String id, String name, String version, String provider, boolean javaNatureEnabled, IProgressMonitor monitor);
}
