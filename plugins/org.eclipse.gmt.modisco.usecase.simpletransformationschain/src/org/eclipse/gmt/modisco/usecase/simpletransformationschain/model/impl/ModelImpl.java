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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.impl;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelEventsSubscribe;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelReadWriteServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexFactory;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

/**
 * @author Gabriel Barbier
 * 
 */
public class ModelImpl implements ModelReadWriteServices {

	private final ModelplexFactory factory = ModelplexFactory.eINSTANCE;
	private String discovererPath;
	private ModelplexDiscoverer discoverer;
	private final ModelEventsDelegate delegate = new ModelEventsDelegate();

	/**
	 * @param javaProject
	 */
	public ModelImpl(final IJavaProject javaProject) {
		/*
		 * Before initializing the discoverer, we will verify the existence of a modelplex
		 * properties file
		 */
		try {
			IPath path = javaProject.getCorrespondingResource().getLocation()
					.addTrailingSeparator().append(javaProject.getElementName())
					.addFileExtension("modelplex"); //$NON-NLS-1$
			this.discovererPath = path.toString();
			if (path.toFile().exists()) {
				Resource modelplexModel = new XMIResourceImpl();
				modelplexModel.setURI(URI.createFileURI(this.discovererPath));
				try {
					modelplexModel.load(null);
					for (EObject eObject : modelplexModel.getContents()) {
						if (eObject instanceof ModelplexDiscoverer) {
							this.discoverer = (ModelplexDiscoverer) eObject;
						}
					}
				} catch (IOException e) {
					defaultInit(DiscovererKind.JAVA);
					MoDiscoLogger.logError(e,
							ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
				}
			} else {
				defaultInit(DiscovererKind.JAVA);
			}
		} catch (JavaModelException e1) {
			MoDiscoLogger.logError(e1, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}

	}

	private final void defaultInit(final DiscovererKind kind) {
		/*
		 * Initialization of the discoverer: 1. The discoverer is always made of two base
		 * transformations: - from a specific metamodel to the KDM metamodel - from the KDM
		 * metamodel to the UML metamodel 2. and we know the type of the discoverer
		 */
		this.discoverer = this.factory.createModelplexDiscoverer();
		this.discoverer.setKind(kind);
		this.discoverer.setToKdm(this.factory.createModelplexTransformation());
		this.discoverer.setToUml(this.factory.createModelplexTransformation());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * ModelServices#getDiscoverer()
	 */
	public ModelplexDiscoverer getDiscoverer() {
		return this.discoverer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * ModelServices#persistDiscoverer()
	 */
	public void persistDiscoverer() {
		try {
			URI discovererURI = URI.createFileURI(this.discovererPath);
			ResourceSet rs = new ResourceSetImpl();
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			final Resource newModelResource = rs.createResource(discovererURI);
			newModelResource.getContents().add(this.discoverer);
			newModelResource.save(null);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * ModelReadWriteServices#createAdditionalTransformation(java.lang.String, org
	 * .eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void createAdditionalTransformation(final String additionalTransformationPath,
			final ModelplexTransformation modelplexTransformation) {
		AtlTransformation additionalTransformation = this.factory.createAtlTransformation();
		additionalTransformation.setSelected(true);
		additionalTransformation.setTransformationPath(additionalTransformationPath);
		modelplexTransformation.getChainedTransformations().add(additionalTransformation);
		this.delegate.chainedTransformationAdded(modelplexTransformation, additionalTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.
	 * ModelServices#getModelEventsSubscribe()
	 */
	public ModelEventsSubscribe getModelEventsSubscribe() {
		return this.delegate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model. ModelReadWriteServices
	 * #deleteAdditionalTransformation(org.eclipse.gmt.modisco
	 * .usecase.simpletransformationschain.model.modelplex.AtlTransformation, org
	 * .eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void deleteAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation) {
		additionalTransformation.setSelected(false);
		modelplexTransformation.getChainedTransformations().remove(additionalTransformation);
		this.delegate.chainedTransformationRemoved(modelplexTransformation,
				additionalTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model. ModelReadWriteServices
	 * #updateAdditionalTransformation(org.eclipse.gmt.modisco
	 * .usecase.simpletransformationschain.model.modelplex.AtlTransformation, org
	 * .eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex
	 * .ModelplexTransformation)
	 */
	public void updateAdditionalTransformation(final AtlTransformation additionalTransformation,
			final ModelplexTransformation modelplexTransformation) {
		this.delegate.chainedTransformationUpdated(modelplexTransformation,
				additionalTransformation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model. ModelReadWriteServices
	 * #updateModelplexTransformation(org.eclipse.gmt.modisco .usecase.simpletransformationschain
	 * .model.modelplex.ModelplexTransformation)
	 */
	public void updateModelplexTransformation(final ModelplexTransformation modelplexTransformation) {
		this.delegate.modelplexTransformationUpdated(modelplexTransformation);
	}

}
