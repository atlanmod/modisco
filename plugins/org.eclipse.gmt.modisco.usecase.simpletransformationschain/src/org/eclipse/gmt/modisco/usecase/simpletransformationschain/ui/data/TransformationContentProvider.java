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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author Gabriel Barbier
 * 
 */
public class TransformationContentProvider implements ITreeContentProvider, ModelEvents {
	private final List<ElementDisplay> transformations = new ArrayList<ElementDisplay>();

	public TransformationContentProvider() {
	}

	public final List<ElementDisplay> getTransformations() {
		return this.transformations;
	}

	public Object[] getChildren(final Object parentElement) {
		return null;
	}

	public Object getParent(final Object element) {
		return null;
	}

	public boolean hasChildren(final Object element) {
		return false;
	}

	public Object[] getElements(final Object inputElement) {
		// System.out.println("getElements (" + inputElement + ")");

		return this.transformations.toArray();
	}

	public void dispose() {

	}

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// System.out.println("inputChanged (" + viewer + ", " +
		// oldInput + ", " + newInput + ")");
		if (newInput instanceof ModelplexTransformation) {
			this.transformations.clear();
			ModelplexTransformation model = (ModelplexTransformation) newInput;
			// initialize transformations tree
			for (AtlTransformation additionalTransformation : model.getChainedTransformations()) {
				TransformationDisplay display = new TransformationDisplay(additionalTransformation);
				this.transformations.add(display);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# chainedTransformationAdded
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void chainedTransformationAdded(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation additionalTransformation) {
		TransformationDisplay display = new TransformationDisplay(additionalTransformation);
		this.transformations.add(display);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# chainedTransformationRemoved
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation)
	 */
	public void chainedTransformationRemoved(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation removedTransformation) {
		ElementDisplay display = null;
		for (ElementDisplay temp : this.transformations) {
			if (temp.getModelElement() == removedTransformation) {
				display = temp;
			}
		}
		this.transformations.remove(display);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# chainedTransformationUpdated
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation)
	 */
	public void chainedTransformationUpdated(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation updatedTransformation) {
		for (ElementDisplay display : this.transformations) {
			if (display.getModelElement() == updatedTransformation) {
				display.refresh();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# modelplexTransformationUpdated
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void modelplexTransformationUpdated(final ModelplexTransformation modelplexTransformation) {
		/*
		 * Called when order of additional transformations has changed
		 */
		final List<ElementDisplay> temp = new ArrayList<ElementDisplay>(this.transformations);
		this.transformations.clear();
		for (AtlTransformation transformation : modelplexTransformation.getChainedTransformations()) {
			for (ElementDisplay display : temp) {
				if (display.getModelElement() == transformation) {
					this.transformations.add(display);
				}
			}
		}
	}
}
