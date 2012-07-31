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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.viewers.TextCellEditor;

/**
 * @author gbarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class MapCellEditor extends TextCellEditor {
	private final String separator = ","; //$NON-NLS-1$
	private final String initializer = "="; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.TextCellEditor#doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		String value = this.text.getText();
		Map<String, String> result = null;
		if ((value != null) && (value.length() > 0)) {
			result = new HashMap<String, String>();
			String[] parts = value.split(this.separator);
			for (String part : parts) {
				int index = part.indexOf(this.initializer);
				if (index != -1) {
					String key = part.substring(0, index);
					String stringValue = part.substring(index + 1);
					result.put(key.trim(), stringValue.trim());
				}
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
	@SuppressWarnings("unchecked")
	@Override
	protected void doSetValue(final Object value) {
		String result = ""; //$NON-NLS-1$
		if (value != null) {
			if (value instanceof Map<?, ?>) {
				StringBuffer buffer = new StringBuffer();

				Iterator<Entry<String, String>> i = ((Map<String, String>) value).entrySet()
						.iterator();
				boolean hasNext = i.hasNext();
				while (hasNext) {
					Entry<String, String> e = i.next();
					String key = e.getKey();
					String stringValue = e.getValue();
					buffer.append(key);
					buffer.append(this.initializer);
					buffer.append(stringValue);
					hasNext = i.hasNext();
					if (hasNext) {
						buffer.append(this.separator);
						buffer.append(" "); //$NON-NLS-1$
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
