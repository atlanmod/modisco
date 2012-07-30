/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.facet.ui;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author Gregoire DUPE (Mia-Software)
 * 
 */
public class ImageProvider {
	private static final String MODEL_QUERY_SET = "icons/facetSet.png"; //$NON-NLS-1$
	private static final String MODEL_QUERY = "icons/facet.png"; //$NON-NLS-1$

	private static ImageProvider singleton = new ImageProvider();
	private Image facetSet;
	private Image facet;

	public static ImageProvider getSingleton() {
		return ImageProvider.singleton;
	}

	public Image getFacetSet() {
		if (this.facetSet == null) {
			this.facetSet = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
					ImageProvider.MODEL_QUERY_SET).createImage();
		}
		return this.facetSet;
	}

	public Image getFacet() {
		if (this.facet == null) {
			this.facet = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
					ImageProvider.MODEL_QUERY).createImage();
		}
		return this.facet;
	}

}
