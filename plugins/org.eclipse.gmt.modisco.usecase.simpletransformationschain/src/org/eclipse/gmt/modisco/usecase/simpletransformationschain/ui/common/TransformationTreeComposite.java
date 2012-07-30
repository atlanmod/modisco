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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.common;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEvents;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.data.ElementDisplay;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.data.TransformationContentProvider;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.data.TransformationLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * This class handles the tree of additional transformations: selected transformations (done
 * locally) and display of transformations (done in class {@link TransformationContentProvider}).
 * 
 * @author Gabriel Barbier
 * 
 */
public class TransformationTreeComposite extends Composite implements ModelEvents,
		ICheckStateListener {

	private CheckboxTreeViewer additionalTransformationsTreeViewer = null;
	private TransformationContentProvider transformationContentProvider;
	private final ModelplexTransformation model;
	private final ControllerServices controller;

	public TransformationTreeComposite(final Composite parent, final int style,
			final ControllerServices controllerParameter,
			final ModelplexTransformation modelParameter) {
		super(parent, style);
		this.controller = controllerParameter;
		this.model = modelParameter;
		initialize();
	}

	private void initialize() {

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessVerticalSpace = true;

		this.additionalTransformationsTreeViewer = new CheckboxTreeViewer(this, SWT.BORDER);
		this.additionalTransformationsTreeViewer.getTree().setLayoutData(gridData);
		this.additionalTransformationsTreeViewer.getControl().setLayoutData(gridData);

		this.transformationContentProvider = new TransformationContentProvider();
		this.additionalTransformationsTreeViewer
				.setContentProvider(this.transformationContentProvider);

		this.additionalTransformationsTreeViewer
				.setLabelProvider(new TransformationLabelProvider());

		this.additionalTransformationsTreeViewer.setInput(this.model);
		this.additionalTransformationsTreeViewer.setComparator(null);

		initializeCheckedState();
		this.additionalTransformationsTreeViewer.addCheckStateListener(this);

		setLayoutData(gridData);
		setSize(new Point(300, 200));
		setLayout(new GridLayout());
	}

	private final void initializeCheckedState() {
		for (ElementDisplay elementDisplay : this.transformationContentProvider
				.getTransformations()) {
			this.additionalTransformationsTreeViewer.setChecked(elementDisplay, elementDisplay
					.getModelElement().isSelected());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# chainedTransformationAdded
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain .model.modelplex
	 * .ModelplexTransformation)
	 */
	public void chainedTransformationAdded(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation additionalTransformation) {
		if (this.model == modelplexTransformation) {
			this.transformationContentProvider.chainedTransformationAdded(modelplexTransformation,
					additionalTransformation);
			this.additionalTransformationsTreeViewer.refresh(false);
			initializeCheckedState();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICheckStateListener#checkStateChanged(org.eclipse
	 * .jface.viewers.CheckStateChangedEvent)
	 */
	public void checkStateChanged(final CheckStateChangedEvent event) {
		AtlTransformation atlTransformation = ((ElementDisplay) event.getElement())
				.getModelElement();
		// we should now produce the update event
		this.controller.updateAdditionalTransformation(atlTransformation, this.model,
				event.getChecked());
	}

	public ITreeSelection getSelection() {
		return (ITreeSelection) this.additionalTransformationsTreeViewer.getSelection();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# chainedTransformationRemoved
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain .model.modelplex
	 * .ModelplexTransformation, org.eclipse.gmt.modisco.usecase
	 * .simpletransformationschain.model.modelplex.AtlTransformation)
	 */
	public void chainedTransformationRemoved(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation removedTransformation) {
		if (this.model == modelplexTransformation) {
			this.transformationContentProvider.chainedTransformationRemoved(
					modelplexTransformation, removedTransformation);
			this.additionalTransformationsTreeViewer.refresh(false);
			// this.initializeCheckedState();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# chainedTransformationUpdated
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain .model.modelplex
	 * .ModelplexTransformation, org.eclipse.gmt.modisco.usecase
	 * .simpletransformationschain.model.modelplex.AtlTransformation)
	 */
	public void chainedTransformationUpdated(final ModelplexTransformation modelplexTransformation,
			final AtlTransformation updatedTransformation) {
		if (this.model == modelplexTransformation) {
			this.transformationContentProvider.chainedTransformationUpdated(
					modelplexTransformation, updatedTransformation);
			this.additionalTransformationsTreeViewer.refresh();
			initializeCheckedState();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.modelplex.model.ModelEvents# modelplexTransformationUpdated
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain .model.modelplex
	 * .ModelplexTransformation)
	 */
	public void modelplexTransformationUpdated(final ModelplexTransformation modelplexTransformation) {
		if (this.model == modelplexTransformation) {
			this.transformationContentProvider
					.modelplexTransformationUpdated(modelplexTransformation);
			this.additionalTransformationsTreeViewer.refresh();
			initializeCheckedState();
		}
	}
}
