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

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.TransformationExporter;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IDE;

public class TransformationExporterImpl implements TransformationExporter {

	private final ModelServices modelServices;

	TransformationExporterImpl(final ModelServices modelServicesParameter) {
		this.modelServices = modelServicesParameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.converter.kdm2uml2.controller.TransformationExporter
	 * #exportKdmToUml2Transformation()
	 */
	public void exportKdmToUmlTransformation() {

		SaveAsDialog dialog = new SaveAsDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell());
		dialog.setTitle(Messages.TransformationExporterImpl_0);
		// dialog.setMessage("Select destination file in an ATL project.");
		dialog.open();
		IPath path = dialog.getResult();
		if (path.getFileExtension() == null || !path.getFileExtension().equals("atl")) { //$NON-NLS-1$
			path = path.addFileExtension("atl"); //$NON-NLS-1$
		}
		String asmPath = path.removeFileExtension().addFileExtension("asm").makeAbsolute() //$NON-NLS-1$
				.toString();
		this.modelServices.getDiscoverer().getToUml().setCustom(true);
		this.modelServices.getDiscoverer().getToUml().setTransformationPath(asmPath);

		KdmToUmlConverter converter = new KdmtoUmlConverterImpl();
		converter.exportKdmToUmlTransformation(path);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.TransformationExporter
	 * #exportSpecificToKdmTransformation()
	 */
	public void exportSpecificToKdmTransformation() {
		SaveAsDialog dialog = new SaveAsDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell());
		dialog.setTitle(Messages.TransformationExporterImpl_4);
		// dialog.setMessage("Select destination file in an ATL project.");
		dialog.open();
		IPath path = dialog.getResult();
		if (path.getFileExtension() == null || !path.getFileExtension().equals("atl")) { //$NON-NLS-1$
			path = path.addFileExtension("atl"); //$NON-NLS-1$
		}
		String asmPath = path.removeFileExtension().addFileExtension("asm").makeAbsolute() //$NON-NLS-1$
				.toString();
		this.modelServices.getDiscoverer().getToKdm().setCustom(true);
		this.modelServices.getDiscoverer().getToKdm().setTransformationPath(asmPath);

		if (this.modelServices.getDiscoverer().getKind() == DiscovererKind.JAVA) {
			exportJavaToKdmTransformation(path);
		}
	}

	private void exportJavaToKdmTransformation(final IPath path) {
		IPath atlPath = path;
		final InputStream transfoFileStream = org.eclipse.modisco.java.discoverer.internal.JavaActivator.class.getResourceAsStream(
				"internal/resources/transformations/javaToKdm.atl"); //$NON-NLS-1$
		if (atlPath.getFileExtension() == null || !atlPath.getFileExtension().equals("atl")) { //$NON-NLS-1$
			atlPath = atlPath.addFileExtension("atl"); //$NON-NLS-1$
		}
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(atlPath);
		final IProject destinationProject = file.getProject();
		Job job = new Job("exporting ATL transformation") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					/*
					 * whatever method is used, the transfoFileStream flow will be correctly closed
					 */
					if (file.exists()) {
						file.setContents(transfoFileStream, IResource.FORCE, monitor);
					} else {
						file.create(transfoFileStream, IResource.FORCE, monitor);
					}
				} catch (CoreException e) {
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		// when copy job is done, open the file
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							destinationProject.refreshLocal(IResource.DEPTH_INFINITE,
									new NullProgressMonitor());
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							IDE.openEditor(page, file);
						} catch (Exception e) {
							MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
						}
					}
				});
			}
		});
		job.schedule();
	}
}
