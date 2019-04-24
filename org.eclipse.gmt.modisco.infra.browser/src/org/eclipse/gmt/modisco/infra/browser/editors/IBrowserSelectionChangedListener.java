/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.editors;

import org.eclipse.jface.viewers.ISelectionChangedListener;

/**
 * Listeners on the Model Browser implementing this interface will receive
 * selection events with the original proxy objects (whereas listeners merely
 * implementing ISelectionChangedListener will receive the Ecore model elements
 * underlying the selected elements)
 */
public interface IBrowserSelectionChangedListener extends ISelectionChangedListener {
	// empty interface: used for tagging
}
