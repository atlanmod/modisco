/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.uicore.examples.cnf;

import org.eclipse.gmt.modisco.infra.browser.uicore.CustomizableModelLabelProvider;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class MoDiscoLabelProvider extends CustomizableModelLabelProvider {
	public MoDiscoLabelProvider() {
		super(Activator.getDefault().getCustomizationManager());
	}
}
