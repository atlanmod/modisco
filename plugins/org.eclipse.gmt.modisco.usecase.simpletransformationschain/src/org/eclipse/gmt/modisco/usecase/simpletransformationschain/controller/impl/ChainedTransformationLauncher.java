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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.impl;

import java.net.MalformedURLException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;

/**
 * @author Gabriel Barbier
 * 
 */
public class ChainedTransformationLauncher {

	public final String kdmMMpath = "uri:http://www.eclipse.org/MoDisco/kdm/action"; //$NON-NLS-1$
	public final String umlMMPath = "uri:http://www.eclipse.org/uml2/2.1.0/UML"; //$NON-NLS-1$

	public Resource launchKdmToKdmTransformation(final AtlTransformation atlTransformation,
			final URI sourceUri, final URI targetUri) throws MalformedURLException {
		// AtlEMFModelHandler modelHandler = (AtlEMFModelHandler) AtlModelHandler
		// .getDefault("EMF");
		//
		// ASMModel kdmMM = null;
		//
		// kdmMM = modelHandler.loadModel("KDM", modelHandler.getMof(),
		// this.kdmMMpath);
		//
		// // Load model instances
		// ASMModel kdmSourceModel = modelHandler.loadModel("kdmInput", kdmMM,
		// sourceUri);
		// // Creates target model
		// ASMModel outputInstance = modelHandler.newModel("kdmOutput",
		// "kdmOutput", kdmMM);
		//
		// // transform!
		// final AtlLauncher launcher = AtlLauncher.getDefault();
		// final Map<String, ASMModel> models = new HashMap<String, ASMModel>();
		// final Map<?, ?> asmParams = Collections.EMPTY_MAP;
		// final List<URL> superimpose = new ArrayList<URL>();
		// final Map<String, String> options = new HashMap<String, String>();
		// final Map<?, ?> libs = Collections.EMPTY_MAP;
		// options.put("continueAfterError", "true");
		// options.put("printExecutionTime", "true");
		//
		// models.put("kdm", kdmMM);
		// models.put("kdmInput", kdmSourceModel);
		//
		// models.put("kdmOutput", outputInstance);
		//
		// /*
		// * encapsulation de la transformation dans un nouveau Thread pour
		// * obtenir une pile d'exécution vide.
		// */
		// // final URL transformation =
		// // this.getClass().getResource("transformations/KDMCopy.asm");
		// final URL superimposedTransformation = new File(atlTransformation
		// .getTransformationPath()).toURI().toURL();
		// // superimpose.add(superimposedTransformation);
		// Job transformationThread = new Job("Additional transformation for Uml") {
		//
		// @Override
		// protected IStatus run(IProgressMonitor monitor) {
		// IStatus result = Status.OK_STATUS;
		// try {
		// launcher.launch(superimposedTransformation, libs, models,
		// asmParams, superimpose, options);
		// } catch (Exception e) {
		// e.printStackTrace();
		// result = Status.CANCEL_STATUS;
		// }
		// return result;
		// }
		//
		// };
		// transformationThread.schedule();
		// try {
		// transformationThread.join();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		//
		// /*
		// * Pour les modèles UML, l'application des profiles et stéréotypes se
		// * fait uniquement lors de la sauvegarde du modèle (notamment pour
		// * éviter de s'emméler les pinceaux avec l'ordre dans lequels ces
		// * opérations doivent être effectuées)
		// */
		// modelHandler.saveModel(outputInstance, targetUri.toString());
		//
		// Resource output = ((ASMEMFModel) outputInstance).getExtent();
		//
		// // dispose ATL resources
		// modelHandler.disposeOfModel(kdmMM);
		//
		// return output;
		return null;
	}

	public Resource launchUmlToUmlTransformation(final AtlTransformation atlTransformation,
			final URI umlSourceUri, final URI kdmSourceUri, final URI targetUri)
			throws MalformedURLException {
		// AtlEMFModelHandler modelHandler = (AtlEMFModelHandler) AtlModelHandler
		// .getDefault("EMF");
		// AtlUML2ModelHandler umlModelHandler = (AtlUML2ModelHandler) AtlModelHandler
		// .getDefault("UML2");
		//
		// ASMModel umlMM = null;
		// ASMModel kdmMM = null;
		//
		// kdmMM = modelHandler.loadModel("KDM", modelHandler.getMof(),
		// this.kdmMMpath);
		// umlMM = umlModelHandler.loadModel("uml", umlModelHandler.getMof(),
		// this.umlMMPath);
		//
		// // Load model instances
		// ASMModel kdmSourceModel = modelHandler.loadModel("kdmInput", kdmMM,
		// kdmSourceUri);
		// ASMModel umlSourceModel = umlModelHandler.loadModel("umlInput", umlMM,
		// umlSourceUri);
		// // Creates target model
		// ASMModel outputInstance = umlModelHandler.newModel("umlOutput", umlMM);
		//
		// // transform!
		// final AtlLauncher launcher = AtlLauncher.getDefault();
		// final Map<String, ASMModel> models = new HashMap<String, ASMModel>();
		// final Map<?, ?> asmParams = Collections.EMPTY_MAP;
		// final List<URL> superimpose = new ArrayList<URL>();
		// final Map<String, String> options = new HashMap<String, String>();
		// final Map<?, ?> libs = Collections.EMPTY_MAP;
		// options.put("continueAfterError", "true");
		// options.put("printExecutionTime", "true");
		//
		// models.put("kdm", kdmMM);
		// models.put("uml", umlMM);
		// models.put("kdmInput", kdmSourceModel);
		// models.put("umlInput", umlSourceModel);
		//
		// models.put("umlOutput", outputInstance);
		//
		// /*
		// * encapsulation de la transformation dans un nouveau Thread pour
		// * obtenir une pile d'exécution vide.
		// */
		// final URL transformation = this.getClass().getResource(
		// "transformations/UML2Copy.asm");
		// URL superimposedTransformation = new File(atlTransformation
		// .getTransformationPath()).toURI().toURL();
		// superimpose.add(superimposedTransformation);
		// Job transformationThread = new Job("Additional transformation for Uml") {
		//
		// @Override
		// protected IStatus run(IProgressMonitor monitor) {
		// IStatus result = Status.OK_STATUS;
		// try {
		// launcher.launch(transformation, libs, models, asmParams,
		// superimpose, options);
		// } catch (Exception e) {
		// e.printStackTrace();
		// result = Status.CANCEL_STATUS;
		// }
		// return result;
		// }
		//
		// };
		// transformationThread.schedule();
		// try {
		// transformationThread.join();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		//
		// /*
		// * Pour les modèles UML, l'application des profiles et stéréotypes se
		// * fait uniquement lors de la sauvegarde du modèle (notamment pour
		// * éviter de s'emméler les pinceaux avec l'ordre dans lequels ces
		// * opérations doivent être effectuées)
		// */
		// umlModelHandler.saveModel(outputInstance, targetUri.toString());
		//
		// Resource output = ((ASMEMFModel) outputInstance).getExtent();
		//
		// // dispose ATL resources
		// modelHandler.disposeOfModel(kdmMM);
		// umlModelHandler.disposeOfModel(umlMM);
		//
		// return output;
		return null;
	}
}
