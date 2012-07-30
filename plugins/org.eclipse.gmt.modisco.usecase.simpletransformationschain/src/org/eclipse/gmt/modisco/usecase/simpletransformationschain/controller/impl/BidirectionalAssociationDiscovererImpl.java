/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.impl;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.UriUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.BidirectionalAssociationDiscoverer;
import org.eclipse.m2m.atl.common.ATLLaunchConstants;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;

/**
 * @author GBarbier
 * 
 */
public class BidirectionalAssociationDiscovererImpl implements BidirectionalAssociationDiscoverer {

	private final String umlMMUri = "http://www.eclipse.org/uml2/2.1.0/UML"; //$NON-NLS-1$

	public void discoverBidirectionalAssociations(final URI umlSourceUri, final URI umlTargetUri)
			throws ATLCoreException {
		final URL transformation = this.getClass().getResource("transformations/UML2Copy.asm"); //$NON-NLS-1$
		final URL superimposedTransformation = this.getClass().getResource(
				"transformations/BidirectionalAssociation.asm"); //$NON-NLS-1$

		Map<String, String> modelHandlers = new HashMap<String, String>();
		String umlMetaModelName = "uml"; //$NON-NLS-1$
		modelHandlers.put(umlMetaModelName, "UML2"); //$NON-NLS-1$

		Map<String, Object> launcherOptions = new HashMap<String, Object>();
		launcherOptions.put(ATLLaunchConstants.OPTION_MODEL_HANDLER, modelHandlers);

		String launcherName = ATLLaunchConstants.REGULAR_VM_NAME;
		final ILauncher launcher = CoreService.getLauncher(launcherName);
		launcher.initialize(launcherOptions);

		ModelFactory factory = CoreService
				.createModelFactory(launcher.getDefaultModelFactoryName());

		IInjector injector = CoreService.getInjector(factory.getDefaultInjectorName());
		IExtractor extractor = CoreService.getExtractor(factory.getDefaultExtractorName());

		// load the UML metamodel
		Map<String, Object> referenceModelOptions = new HashMap<String, Object>();
		referenceModelOptions.put("modelHandlerName", modelHandlers.get(umlMetaModelName)); //$NON-NLS-1$
		referenceModelOptions.put("modelName", umlMetaModelName); //$NON-NLS-1$
		referenceModelOptions.put("path", this.umlMMUri); //$NON-NLS-1$
		IReferenceModel umlMM = factory.newReferenceModel(referenceModelOptions);
		injector.inject(umlMM, this.umlMMUri);

		// load the input UML model
		Map<String, Object> modelOptions = new HashMap<String, Object>();
		String inModelName = "umlInput"; //$NON-NLS-1$
		modelOptions.put("modelName", inModelName); //$NON-NLS-1$
		modelOptions.put("path", UriUtils.toString(umlSourceUri)); //$NON-NLS-1$
		modelOptions.put("newModel", false); //$NON-NLS-1$
		IModel input = factory.newModel(umlMM, modelOptions);
		injector.inject(input, UriUtils.toString(umlSourceUri));
		launcher.addInModel(input, inModelName, umlMetaModelName);

		// load the output UML model
		modelOptions = new HashMap<String, Object>();
		inModelName = "OUT"; //$NON-NLS-1$
		modelOptions.put("modelName", inModelName); //$NON-NLS-1$
		if (umlTargetUri == null) {
			modelOptions.put("path", UriUtils.toString(umlSourceUri)); //$NON-NLS-1$
		} else {
			modelOptions.put("path", UriUtils.toString(umlTargetUri)); //$NON-NLS-1$
		}
		modelOptions.put("newModel", true); //$NON-NLS-1$
		IModel outputInstance = factory.newModel(umlMM, modelOptions);
		launcher.addOutModel(outputInstance, inModelName, umlMetaModelName);

		/*
		 * wrap the transformation in a new Thread in order to get an empty execution stack
		 */
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("continueAfterError", "true"); //$NON-NLS-1$ //$NON-NLS-2$
		options.put("printExecutionTime", "true"); //$NON-NLS-1$ //$NON-NLS-2$

		Job transformationThread = new Job(Messages.BidirectionalAssociationDiscovererImpl_11) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = Status.OK_STATUS;
				try {
					launcher.launch(ILauncher.RUN_MODE, monitor, options,
							transformation.openStream(), superimposedTransformation.openStream());
				} catch (IOException e) {
					result = Status.CANCEL_STATUS;
					MoDiscoLogger.logError(e,
							ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
				}

				return result;
			}
		};
		transformationThread.schedule();
		try {
			transformationThread.join();
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}
		if (umlTargetUri == null) {
			extractor.extract(outputInstance, UriUtils.toString(umlSourceUri));
		} else {
			extractor.extract(outputInstance, UriUtils.toString(umlTargetUri));
		}

	}
}
