/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.uicore.internal.adapters;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * Associates a unique integer with each model element (lazily, when the adapter is created)
 */
public class ElementIDAdapter extends AdapterImpl implements ElementID {

	private static long lastID = 0;
	private final long id;

	public ElementIDAdapter() {
		this.id = ElementIDAdapter.lastID++;
	}

	@Override
	public boolean isAdapterForType(final Object type) {
		return (type == ElementID.class);
	}

	public long getID() {
		return this.id;
	}
}
