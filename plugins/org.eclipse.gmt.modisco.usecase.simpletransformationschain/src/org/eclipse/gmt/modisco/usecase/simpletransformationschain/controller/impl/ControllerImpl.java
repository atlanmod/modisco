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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.impl;

import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.Converter;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.TransformationExporter;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelReadWriteServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;
import org.eclipse.jdt.core.IJavaProject;

public class ControllerImpl implements ControllerServices {

	private final IJavaProject javaProject;
	private TransformationExporter transformationExporter;
	private Converter converter;
	private final ModelReadWriteServices modelServices;

	public ControllerImpl(final IJavaProject javaProjectParameter,
			final ModelReadWriteServices modelServicesParameter) {
		this.javaProject = javaProjectParameter;
		this.modelServices = modelServicesParameter;
	}

	public TransformationExporter getTransformationExporter() {
		if (this.transformationExporter == null) {
			this.transformationExporter = new TransformationExporterImpl(getModelServices());
		}
		return this.transformationExporter;
	}

	public Converter getConverter() {
		if (this.converter == null) {
			this.converter = new ConverterImpl(this.javaProject, this.modelServices);
		}
		return this.converter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * getModelServices()
	 */
	public ModelServices getModelServices() {
		return this.modelServices;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * createAdditionalTransformation(java.lang.String,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain
	 * .model.modelplex.ModelplexTransformation)
	 */
	public void createAdditionalTransformation(final String additionalTransformationPath,
			final ModelplexTransformation modelplexTransformation) {
		this.modelServices.createAdditionalTransformation(additionalTransformationPath,
				modelplexTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * deleteAdditionalTransformation
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.AtlTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.ModelplexTransformation)
	 */
	public void deleteAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation) {
		this.modelServices.deleteAdditionalTransformation(additionalTransformation,
				modelplexTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * updateAdditionalTransformation
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.AtlTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.ModelplexTransformation, boolean)
	 */
	public void updateAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation, final boolean selected) {
		additionalTransformation.setSelected(selected);
		this.modelServices.updateAdditionalTransformation(additionalTransformation,
				modelplexTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * updateAdditionalTransformation
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.AtlTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model
	 * .modelplex.ModelplexTransformation, java.lang.String)
	 */
	public void updateAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation, final String transformationPath) {
		additionalTransformation.setTransformationPath(transformationPath);
		this.modelServices.updateAdditionalTransformation(additionalTransformation,
				modelplexTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * downAdditionalTransformation
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * modelplex.AtlTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * modelplex.ModelplexTransformation)
	 */
	public void downAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation) {
		int index = modelplexTransformation.getChainedTransformations().indexOf(
				additionalTransformation);
		if (index < (modelplexTransformation.getChainedTransformations().size() - 1)) {
			modelplexTransformation.getChainedTransformations().remove(additionalTransformation);
			modelplexTransformation.getChainedTransformations().add(index + 1,
					additionalTransformation);

			this.modelServices.updateModelplexTransformation(modelplexTransformation);
		} // else nothing to do
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices#
	 * upAdditionalTransformation
	 * (org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .AtlTransformation,
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void upAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation) {
		int index = modelplexTransformation.getChainedTransformations().indexOf(
				additionalTransformation);
		if (index > 0) {
			modelplexTransformation.getChainedTransformations().remove(additionalTransformation);
			modelplexTransformation.getChainedTransformations().add(index - 1,
					additionalTransformation);

			this.modelServices.updateModelplexTransformation(modelplexTransformation);
		} // else nothing to do
	}

}
