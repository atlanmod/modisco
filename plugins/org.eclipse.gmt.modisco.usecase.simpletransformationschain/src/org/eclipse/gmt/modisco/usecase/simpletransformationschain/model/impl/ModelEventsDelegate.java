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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEventsSubscribe;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;

/**
 * @author Gabriel Barbier
 * 
 */
public class ModelEventsDelegate implements ModelEvents, ModelEventsSubscribe {

	private final List<ModelEvents> modelEventsList = new ArrayList<ModelEvents>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents#
	 * chainedTransformationAdded
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void chainedTransformationAdded(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation additionalTransformation) {
		for (ModelEvents modelEvents : this.modelEventsList) {
			modelEvents.chainedTransformationAdded(modelplexTransformation,
					additionalTransformation);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEventsSubscribe#subscribe
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents)
	 */
	public void subscribe(final ModelEvents modelEvents) {
		this.modelEventsList.add(modelEvents);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEventsSubscribe#unsubscribe
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents)
	 */
	public void unsubscribe(final ModelEvents modelEvents) {
		this.modelEventsList.remove(modelEvents);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents#
	 * chainedTransformationRemoved
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * modelplex.ModelplexTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation)
	 */
	public void chainedTransformationRemoved(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation removedTransformation) {
		for (ModelEvents modelEvents : this.modelEventsList) {
			modelEvents
					.chainedTransformationRemoved(modelplexTransformation, removedTransformation);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents#
	 * chainedTransformationUpdated
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * modelplex.ModelplexTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation)
	 */
	public void chainedTransformationUpdated(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation updatedTransformation) {
		for (ModelEvents modelEvents : this.modelEventsList) {
			modelEvents
					.chainedTransformationUpdated(modelplexTransformation, updatedTransformation);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents#
	 * modelplexTransformationUpdated
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.ModelplexTransformation)
	 */
	public void modelplexTransformationUpdated(final ModelplexTransformation modelplexTransformation) {
		for (ModelEvents modelEvents : this.modelEventsList) {
			modelEvents.modelplexTransformationUpdated(modelplexTransformation);
		}
	}

}
