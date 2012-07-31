/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
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
public interface ModelEvents {
	public void chainedTransformationAdded(ModelplexTransformation modelplexTransformation,
			AtlTransformation additionalTransformation);

	public void chainedTransformationRemoved(ModelplexTransformation modelplexTransformation,
			AtlTransformation removedTransformation);

	public void chainedTransformationUpdated(ModelplexTransformation modelplexTransformation,
			AtlTransformation updatedTransformation);

	public void modelplexTransformationUpdated(ModelplexTransformation modelplexTransformation);
}
