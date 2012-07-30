/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.internal.ui.export;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Tools box. It's a singleton
 * 
 * @author Nicolas Payneau
 * @deprecated
 */
@Deprecated
public final class Common {

	private static Common common = null;

	private Common() {
		// This class is a singleton
	}

	/**
	 * Allows to retrieve a point allowing to center our shell
	 * 
	 * @parameter shell Our shell which we want to center
	 * @parameter display The display on which open the shell
	 * @return Return a point
	 */
	public Point centerShell(final Display display, final Shell shell) {
		Rectangle rect = display.getClientArea();
		Point size = shell.getSize();
		int x = (rect.width - size.x) / 2;
		int y = (rect.height - size.y) / 2;
		return new Point(x, y);
	}

	/**
	 * Allows to refresh the package explorer
	 */
	public void refreshPackageExplorer() {
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
					IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	/**
	 * Allows to retrieve the singleton
	 * 
	 * @return Return the singleton
	 */
	public static Common getInstance() {
		if (Common.common == null) {
			Common.common = new Common();
		}
		return Common.common;
	}
}
