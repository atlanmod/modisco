/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugo Bruneliere (INRIA) - initial API and implementation
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.data;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.swt.graphics.Image;

/**
 * @author Gabriel Barbier
 * 
 */
public class TransformationDisplay implements ElementDisplay {

	private final Image icone;
	private String name;
	private final AtlTransformation transformation;

	public TransformationDisplay(final AtlTransformation transformationParameter) {
		this.transformation = transformationParameter;
		this.icone = ModelplexKnowledgeDiscoveryFrameworkPlugin.getImageDescriptor(
				"resources/images/operation.gif").createImage(); //$NON-NLS-1$
		IPath path = new Path(this.transformation.getTransformationPath());
		this.name = path.lastSegment();
	}

	public Image getImage() {
		return this.icone;
	}

	public String getName() {
		return this.name;
	}

	public AtlTransformation getModelElement() {
		return this.transformation;
	}

	public void refresh() {
		IPath path = new Path(this.transformation.getTransformationPath());
		this.name = path.lastSegment();
	}
}
