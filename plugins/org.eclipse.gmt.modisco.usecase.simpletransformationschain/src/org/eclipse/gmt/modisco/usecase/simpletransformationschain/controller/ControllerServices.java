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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;

/**
 * @author Gabriel Barbier
 * 
 */
public interface ControllerServices extends ControllerNavigationServices {

	public void createAdditionalTransformation(String additionalTransformationPath,
			ModelplexTransformation modelplexTransformation);

	public void deleteAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation);

	public void updateAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation, boolean selected);

	public void updateAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation, String transformationPath);

	public void upAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation);

	public void downAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation);

}
