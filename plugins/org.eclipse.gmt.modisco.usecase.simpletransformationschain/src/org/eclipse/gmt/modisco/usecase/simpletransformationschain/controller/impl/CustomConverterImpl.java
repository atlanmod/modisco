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
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFramework;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.CustomConverter;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class CustomConverterImpl implements CustomConverter {

	private final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
	private final IJavaProject javaProject;
	private IPath path;

	public CustomConverterImpl(final IJavaProject javaProjectParameter) {
		this.javaProject = javaProjectParameter;
		try {
			if (this.javaProject != null) {
				IResource resource = this.javaProject.getCorrespondingResource();
				if (resource != null) {
					this.path = resource.getLocation().addTrailingSeparator()
							.append(this.javaProject.getElementName()).addFileExtension("uml"); //$NON-NLS-1$
				}
			}
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}
	}

	public void convertJavaProjectToUml2WithCustomTransformation(
			final String customTransformationPath) {
		// try {
		Job job = new Job(Messages.CustomConverterImpl_1) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = null;
				MoDiscoLogHandler logHandler = new MoDiscoLogHandler(
						CustomConverterImpl.this.path.toString() + ".log"); //$NON-NLS-1$
				CustomConverterImpl.this.logger.addHandler(logHandler);
				try {
					URI outputURI = URI.createFileURI(CustomConverterImpl.this.path.toString());
					ModelplexKnowledgeDiscoveryFramework discoverer = new ModelplexKnowledgeDiscoveryFramework();
					// Resource uml2Model =
					discoverer.getUML2ModelFromJavaSource(CustomConverterImpl.this.javaProject,
							outputURI);

					result = Status.OK_STATUS;
				} catch (Exception e) {
					result = Status.CANCEL_STATUS;
				} finally {
					CustomConverterImpl.this.logger.removeHandler(logHandler);
					logHandler.close();
					try {
						CustomConverterImpl.this.javaProject.getCorrespondingResource()
								.refreshLocal(1, null);
					} catch (Exception e1) {
						// give up
					}
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
							IFile ifile = root.getFileForLocation(CustomConverterImpl.this.path);
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
		// } catch (MalformedURLException e2) {
		// System.err.println("Problem with transformation file " + customTransformationPath);
		// }
	}

}
