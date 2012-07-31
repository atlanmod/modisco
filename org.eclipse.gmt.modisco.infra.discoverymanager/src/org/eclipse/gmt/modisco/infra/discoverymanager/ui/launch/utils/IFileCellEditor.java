/**
 * Copyright (c) 2009 Mia-Software.
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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class IFileCellEditor extends DialogCellEditor {

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
		IFile result = null;
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				cellEditorWindow.getShell(), lp, cp);
		dialog.setAllowMultiple(false);
		dialog.setTitle(Messages.IFileCellEditor_0);
		dialog.setMessage(Messages.IFileCellEditor_1);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.setValidator(new ISelectionStatusValidator() {

			public IStatus validate(final Object[] selection) {
				IStatus result2 = Status.CANCEL_STATUS;
				if (selection != null) {
					result2 = Status.OK_STATUS;
					for (Object object : selection) {
						if (!(object instanceof IFile)) {
							result2 = Status.CANCEL_STATUS;
						}
					}
				}
				return result2;
			}
		});
		if (dialog.open() == Window.OK) {
			Object selection = dialog.getFirstResult();
			if (selection instanceof IFile) {
				result = (IFile) selection;
			}
		}
		return result;
	}

}
