/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Code Synchronization
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.extensions.listeners;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IStatusLineManager;

public interface DoubleClickListener {

	public abstract void synchronizeEObject(EObject eObjet, IStatusLineManager statusLineManager);

}
