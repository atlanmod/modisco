/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow.internal.engine;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Messages;

/** @deprecated */
@Deprecated
public final class Utils {
	
	private static final Utils INSTANCE = new Utils();
	public static final Utils getInstance() {
		return Utils.INSTANCE;
	}
	
	private Utils() {
		
	}
	
	/**
	 * Allows to find the good INSTANCE of LaunchConfiguration corresponding at
	 * name
	 * 
	 * @param configName
	 *            Name of LaunchConfiguration
	 * @return An INSTANCE of launchConfiguration corresponding at name
	 */
	public ILaunchConfiguration getLaunchConfigurationFromName(
			final String configName) {
		ILaunchConfiguration configuration = null;
		try {
			for (ILaunchConfiguration config : DebugPlugin.getDefault()
					.getLaunchManager().getLaunchConfigurations()) {
				if (config.getName().equals(configName)) {
					configuration = config;
					break;
				}
			}
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.Utils_unknonwError, e);
			Activator.getDefault().getLog().log(status);
		}
		return configuration;
	}

	
}
