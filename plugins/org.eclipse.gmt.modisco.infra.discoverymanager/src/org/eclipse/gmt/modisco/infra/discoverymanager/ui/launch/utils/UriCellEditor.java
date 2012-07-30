/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;

/**
 * 
 * @author fgiquel
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class UriCellEditor extends DialogCellEditor {

	/**
	 * Opens a dialog box under the given parent control and returns the
	 * dialog's value when it closes, or <code>null</code> if the dialog was
	 * canceled or no selection was made in the dialog.
	 * <p>
	 * This framework method must be implemented by concrete subclasses. It is
	 * called when the user has pressed the button and the dialog box must pop
	 * up.
	 * </p>
	 * 
	 * @param cellEditorWindow
	 *            the parent control cell editor's window so that a subclass can
	 *            adjust the dialog box accordingly
	 * @return the selected value, or <code>null</code> if the dialog was
	 *         canceled or no selection was made in the dialog
	 */
	@Override
	protected Object openDialogBox(final Control cellEditorWindow) {
		URI targetUri = null;
		SaveAsDialog saveAsDialog = new SaveAsDialog(PlatformUI.createDisplay().getActiveShell());

		Object value = this.getValue();
		if (value != null) {
			try {
				URI originalUri = URI.createURI(value.toString());
				if (originalUri.isPlatformResource()) {
					IPath originalPath = new Path(originalUri.path());
					IFile originalFile = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(originalPath);
					saveAsDialog.setOriginalFile(originalFile);
				}
			} catch (IllegalArgumentException iae) {
				MoDiscoLogger.logInfo(iae, DiscoveryManager.getDefault());
			}
		}
		// Open the wizard dialog
		if (saveAsDialog.open() == Window.OK) {
			IPath targetPath = saveAsDialog.getResult();
			targetUri = URI.createPlatformResourceURI(targetPath.toString(), true);
		}
		return targetUri;
	}
}
