/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *    Romain Dervaux (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.io.java.binding;

/**
 * {@code Binding} representing a Java entity which is unresolved.
 *@deprecated the whole plug-in is replaced by "org.eclipse.modisco.java.discoverer" (without the "gmt" part)
 */
@Deprecated
public class UnresolvedBinding extends Binding {
	
	public UnresolvedBinding(final String name) {
		super(name);
	}
	
	@Override
	public boolean isUnresolved() {
		return true;
	}
}
