/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas BROS (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.ui.internal.editorInputs;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorInput;

/**
 * For editors that can take a {@link Resource} as an input (supported by the
 * MoDisco model browser)
 */
public interface IResourceEditorInput extends IEditorInput {
	Resource getResource();
}
