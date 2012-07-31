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

import java.io.File;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.actions.DiscoverKdmModelFromJavaProject;
import org.eclipse.gmt.modisco.java.actions.TranslateJavaModelToKdm;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.Converter;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class ConverterImpl implements Converter {

	private final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
	private final IJavaProject javaProject;
	private IPath path;
	private final ModelServices model;

	public ConverterImpl(final IJavaProject javaProjectParameter, final ModelServices modelParameter) {
		this.javaProject = javaProjectParameter;
		this.model = modelParameter;
		try {
			if (this.javaProject != null) {
				IResource resource = this.javaProject.getCorrespondingResource();
				if (resource != null) {
					this.path = resource.getLocation().addTrailingSeparator()
							.append(this.javaProject.getElementName());
				}
			}
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}
	}

	public void convertJavaProjectToUml2() {
		Job job = new Job(Messages.ConverterImpl_0) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = Status.OK_STATUS;
				MoDiscoLogHandler logHandler = new MoDiscoLogHandler(ConverterImpl.this.path
						.addFileExtension("log").toString()); //$NON-NLS-1$
				ConverterImpl.this.logger.addHandler(logHandler);
				try {
					ChainedTransformationLauncher launcher = new ChainedTransformationLauncher();
					/*
					 * steps : 1. from the specific model to the KDM model, with a potential user
					 * transformation 2. <optional> transformations on the KDM model -> refining
					 * mode... input parameters:kdm and output:kdm 3. from the KDM model to the UML
					 * model, with a potential user transformation 4. <optional> transformations on
					 * the UML model -> refining mode... parameters umlOutput:uml, umlInput:uml and
					 * kdmInput:kdm
					 */
					ModelplexDiscoverer discoverer = ConverterImpl.this.model.getDiscoverer();
					/* first step */
					Resource kdmModel = null;
					URI kdmModelUri = URI.createFileURI(ConverterImpl.this.path.addFileExtension(
							"kdm").toString()); //$NON-NLS-1$
					if (discoverer.getToKdm().isCustom()) {
						String transformationPath = discoverer.getToKdm().getTransformationPath();
						URL transformation = new File(transformationPath).toURI().toURL();
						DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
						Resource j2se5Model = javaDiscoverer.discoverElement(
								ConverterImpl.this.javaProject, (URI) null);
						// resource shall have been saved
						TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
						kdmModel = kdmTranslater.getKDMModelFromJavaModelWithCustomTransformation(
								j2se5Model.getURI(), transformation, kdmModelUri);
					} else {
						DiscoverKdmModelFromJavaProject javaDiscoverer = new DiscoverKdmModelFromJavaProject();
						kdmModel = javaDiscoverer.discoverElement(ConverterImpl.this.javaProject,
								kdmModelUri);
					}

					/* second step */
					for (AtlTransformation atlTransformation : discoverer.getToKdm()
							.getChainedTransformations()) {
						System.out.println("Additional transformation for KDM : " //$NON-NLS-1$
								+ atlTransformation);
						launcher.launchKdmToKdmTransformation(atlTransformation, kdmModelUri,
								kdmModelUri);
					}

					/* third step */
					KdmToUmlConverter converter = new KdmtoUmlConverterImpl();
					URI outputURI = URI.createFileURI(ConverterImpl.this.path.addFileExtension(
							"uml").toString()); //$NON-NLS-1$
					if (discoverer.getToUml().isCustom()) {
						String transformationPath = discoverer.getToUml().getTransformationPath();
						URL transformation = new File(transformationPath).toURI().toURL();
						converter.getUML2ModelFromKDMModelWithCustomTransformation(
								kdmModel.getURI(), false, transformation, outputURI);
					} else {
						converter.getUML2ModelFromKDMModel(kdmModel, false, outputURI);
					}

					/* fourth step */
					for (AtlTransformation atlTransformation : discoverer.getToUml()
							.getChainedTransformations()) {
						System.out.println("Additional transformation for UML : " //$NON-NLS-1$
								+ atlTransformation);
						launcher.launchUmlToUmlTransformation(atlTransformation, outputURI,
								kdmModelUri, outputURI);
					}
				} catch (Exception e) {
					result = Status.CANCEL_STATUS;
					MoDiscoLogger.logError(e,
							ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
				}

				ConverterImpl.this.logger.removeHandler(logHandler);
				logHandler.close();
				try {
					ConverterImpl.this.javaProject.getCorrespondingResource().refreshLocal(1, null);
				} catch (Exception e1) {
					// give up
				}
				return result;
			}
		};
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
							IFile ifile = root.getFileForLocation(ConverterImpl.this.path
									.addFileExtension("uml")); //$NON-NLS-1$
							if (ifile.exists()) {
								IWorkbenchPage page = PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow().getActivePage();
								IDE.openEditor(page, ifile);
							}
						} catch (PartInitException e) {
							MoDiscoLogger.logError(e,
									ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
						}
					}
				});
			}
		});
		job.schedule();
	}

}
