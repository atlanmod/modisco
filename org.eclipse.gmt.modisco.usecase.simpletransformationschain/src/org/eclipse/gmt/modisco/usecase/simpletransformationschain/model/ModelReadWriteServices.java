/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;

/**
 * @author Gabriel Barbier
 * 
 */
public interface ModelReadWriteServices extends ModelServices {

	public void createAdditionalTransformation(String additionalTransformationPath,
			ModelplexTransformation modelplexTransformation);

	public void deleteAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation);

	public void updateAdditionalTransformation(AtlTransformation additionalTransformation,
			ModelplexTransformation modelplexTransformation);

	public void updateModelplexTransformation(ModelplexTransformation modelplexTransformation);

}
