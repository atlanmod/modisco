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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.TextCellEditor;

/**
 * @author gbarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class ListCellEditor extends TextCellEditor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.TextCellEditor#doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		String value = this.text.getText();
		List<String> result = null;
		if ((value != null) && (value.length() > 0)) {
			result = new ArrayList<String>();
			String[] parts = value.split(","); //$NON-NLS-1$
			for (String part : parts) {
				result.add(part.trim());
			}
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.TextCellEditor#doSetValue(java.lang.Object)
	 */
	@Override
	protected void doSetValue(final Object value) {
		String result = ""; //$NON-NLS-1$
		if (value != null) {
			if (value instanceof List<?>) {
				StringBuffer buffer = new StringBuffer();

				Iterator<?> i = ((List<?>) value).iterator();
				boolean hasNext = i.hasNext();
				while (hasNext) {
					Object o = i.next();
					buffer.append(String.valueOf(o));
					hasNext = i.hasNext();
					if (hasNext) {
						buffer.append(", "); //$NON-NLS-1$
					}
				}

				result = buffer.toString();
			} else {
				result = String.valueOf(value);
			}
		}
		super.doSetValue(result);
	}

}
