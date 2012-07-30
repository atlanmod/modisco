/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.internal.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.internal.engine.CreatePluginProject;
import org.eclipse.gmt.modisco.workflow.internal.ui.export.Common;
import org.eclipse.gmt.modisco.workflow.internal.ui.export.ExportDialog;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * This class defines the export tab
 * 
 * @author Nicolas Payneau
 * @deprecated
 */
@Deprecated
public class MoDiscoExportTab extends AbstractLaunchConfigurationTab {

	private ScrolledComposite scrollContainer;
	private Composite rootContainer;
	private String idWorkflow;
	private Combo comboEngine;
	private final List<String> idEngineList;
	private Button buttonExportDiscoverer;
	private Button buttonExportModelInternal;
	private ILaunchConfiguration currentConfiguration;

	/**
	 * Constructor
	 */
	public MoDiscoExportTab() {
		this.idEngineList = new ArrayList<String>();
	}

	public void createControl(final Composite parent) {
		this.scrollContainer = new ScrolledComposite(parent, SWT.H_SCROLL
				| SWT.V_SCROLL);
		this.scrollContainer.setExpandHorizontal(true);
		this.scrollContainer.setExpandVertical(true);

		this.rootContainer = new Composite(this.scrollContainer, SWT.NULL);
		GridLayout layoutRoot = new GridLayout();
		this.rootContainer.setLayout(layoutRoot);
		layoutRoot.numColumns = 1;
		layoutRoot.verticalSpacing = 9;
		this.scrollContainer.setContent(this.rootContainer);

		createGroupWorkflowType();
		createGroupExport();

		initializeCombo();
		setControl(this.rootContainer);
		setControl(this.scrollContainer);
	}

	/**
	 * Allows to create the group to select an engine type.
	 */
	private void createGroupWorkflowType() {
		Group groupWorkflow = new Group(this.rootContainer, SWT.NULL);
		groupWorkflow.setText(Messages.MoDiscoExportTab_0);
		GridLayout layoutGroup = new GridLayout();
		groupWorkflow.setLayout(layoutGroup);
		layoutGroup.numColumns = 3;
		layoutGroup.verticalSpacing = 9;
		GridData gdHoriz = new GridData(GridData.FILL_HORIZONTAL);
		groupWorkflow.setLayoutData(gdHoriz);

		Label labelWorkflow = new Label(groupWorkflow, SWT.NONE);
		labelWorkflow.setText(Messages.MoDiscoExportTab_1);
		labelWorkflow.pack();

		this.comboEngine = new Combo(groupWorkflow, SWT.READ_ONLY);
		this.comboEngine.setLayoutData(gdHoriz);
		this.comboEngine.pack();
		this.comboEngine.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				MoDiscoExportTab.this.setIdWorkflow(MoDiscoExportTab.this
						.getIdEngineList().get(
								MoDiscoExportTab.this.getComboEngine()
										.getSelectionIndex()));
				updateLaunchConfigurationDialog();
			}
		});
	}

	/**
	 * Allows to create a group to export our engine (As a discoverer or as a
	 * file)
	 */
	private void createGroupExport() {
		GridData gdText = new GridData();
		gdText.horizontalAlignment = SWT.END;
		GridData gdLabel = new GridData();
		gdLabel.horizontalSpan = 2;
		gdLabel.grabExcessHorizontalSpace = true;
		Group groupExport = createGroup(this.rootContainer,
				Messages.MoDiscoExportTab_2, 3, 2, GridData.FILL_HORIZONTAL);
		Label nameDiscoverer = new Label(groupExport, SWT.NULL);
		nameDiscoverer.setText(Messages.MoDiscoExportTab_3);
		this.buttonExportDiscoverer = createPushButton(groupExport,
				Messages.MoDiscoExportTab_4, Activator.getImageDescriptor(
						Constants.pathExportImage).createImage()); 
		this.buttonExportDiscoverer
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(final SelectionEvent e) {
						MoDiscoExportTab.this.exportDiscoverer();
					}
				});
		nameDiscoverer.setLayoutData(gdLabel);
		this.buttonExportDiscoverer.setLayoutData(gdText);
		
		GridData gdLabel2 = new GridData();
		gdLabel2.horizontalSpan = 2;
		Label modelInternalLabel = new Label(groupExport, SWT.NULL);
		modelInternalLabel.setText(Messages.MoDiscoExportTab_9);
		modelInternalLabel.setLayoutData(gdLabel2);
		this.buttonExportModelInternal = createPushButton(
				groupExport, Messages.MoDiscoExportTab_10, Activator
						.getImageDescriptor(Constants.pathExportImage)
						.createImage());
		this.buttonExportModelInternal
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(final SelectionEvent e) {
						MoDiscoExportTab.this
								.handleExportLocationButtonSelected();
						Common.getInstance().refreshPackageExplorer();
					}
				});
		this.buttonExportModelInternal.setLayoutData(gdText);
	}

	/**
	 * Creates a Group widget
	 * @param parent the parent composite to add this group to
	 * @param text the text for the heading of the group
	 * @param columns the number of columns within the group
	 * @param hspan the horizontal span the group should take up on the parent
	 * @param fill the style for how this composite should fill into its parent
	 * @return the new group
	 * @since 3.2
	 * 
	 */
	private final Group createGroup(final Composite parent, final String text, final int columns, final int hspan, final int fill) {
    	Group g = new Group(parent, SWT.NONE);
    	g.setLayout(new GridLayout(columns, false));
    	g.setText(text);
    	g.setFont(parent.getFont());
    	GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
    	g.setLayoutData(gd);
    	return g;
    }
	
	/**
	 * Allows to export the MoDiscoWorkflow in discoverer plug-in project
	 */
	void exportDiscoverer() {
		IStatus status = verifyNameToExportDiscoverer();
		if (status.isOK()) {
			ExportDialog dialog = new ExportDialog(this.currentConfiguration
					.getName(), getShell());
			dialog.open();
			if (dialog.isExport()) {
				exportMoDiscoWorkflowToDiscovererProject(
						dialog.getProjectName(), dialog.getSymbolicName(),
						dialog.getBaseName());
			}
		} else {
			MessageDialog.openError(getShell(), Messages.MoDiscoExportTab_12,
					status.getMessage() + Messages.MoDiscoExportTab_13);
		}
	}

	/**
	 * Allows to create a discoverer project from a MoDiscoWorkflow
	 * 
	 * @param projectName
	 *            Name of project
	 * @param basePackageName
	 *            Package base name
	 */
	private final void exportMoDiscoWorkflowToDiscovererProject(
			final String projectName, final String symbolicName,
			final String basePackageName) {
		try {
			new CreatePluginProject(symbolicName,
					basePackageName, getWorkflowModel());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}
	/**
	 * Allows to verify if all element name of workflow are valid to define a
	 * class name
	 * 
	 * @return Status of MoDiscoWorks
	 */
	private final IStatus verifyNameToExportDiscoverer() {
		for (Element modiscoWork : getWorkflowModel().getAllElements()) {
			IStatus status = JavaConventions.validateIdentifier(modiscoWork.getName(),
					JavaCore.COMPILER_SOURCE, JavaCore.COMPILER_COMPLIANCE);
			if (!status.isOK()) {
				return status;
			}
		}
		return Status.OK_STATUS;
	}
	
	public String getName() {
		return Messages.MoDiscoExportTab_14;
	}

	public void initializeFrom(final ILaunchConfiguration configuration) {
		this.currentConfiguration = configuration;
		try {
			this.comboEngine.select(this.idEngineList.indexOf(configuration
					.getAttribute(Constants.idWorkflow,
							Constants.idMinimaliste)));
			this.idWorkflow = configuration.getAttribute(
					Constants.idWorkflow,
					Constants.idMinimaliste);
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(Constants.idWorkflow,
				this.idWorkflow);
	}

	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		//
	}

	@Override
	public Image getImage() {
		return Activator.getImageDescriptor(Constants.pathExportImage)
				.createImage();
	}

	/**
	 * Allows to initialize the combo engine type
	 */
	private void initializeCombo() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry
				.getExtensionPoint(Constants.nameExtensionPointWorkflowEngine);

		for (IExtension extension : point.getExtensions()) {
			for (IConfigurationElement element : extension
					.getConfigurationElements()) {
				if (element.getName().equals(
						Constants.workflowCoreExtensionPointWorkflow)) {
					this.comboEngine.add(element.getAttribute("name")); //$NON-NLS-1$
					this.idEngineList.add(extension.getUniqueIdentifier());
				}
			}
		}
	}

	/**
	 * Handles the shared location button being selected
	 */
	void handleExportLocationButtonSelected() {
		IContainer currentContainer = ResourcesPlugin.getWorkspace().getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), currentContainer, false,
				Messages.MoDiscoExportTab_16);
		dialog.showClosedProjects(false);
		dialog.open();
		Object[] results = dialog.getResult();
		if ((results != null) && (results.length > 0)
				&& (results[0] instanceof IPath)) {
			IPath path = (IPath) results[0];
			path = path.addTrailingSeparator().append(getWorkflowModel().getName()).addFileExtension(Constants.extensionMoDiscoWorkflow);
			URI targetUri = URI.createPlatformResourceURI(path.toString(), true);
			getWorkflowModel().exportWorkflow(targetUri);
			Common.getInstance().refreshPackageExplorer();
		}
	}

	/**
	 * Allows to retrieve the controller of MoDiscoWorkflow
	 * 
	 * @return The controller of MoDIscoWorkflow
	 */
	private final WorkflowModel getWorkflowModel() {
		WorkflowModel controller = null;
		for (ILaunchConfigurationTab tab : getLaunchConfigurationDialog()
				.getTabs()) {
			if (tab instanceof WorkflowTab) {
				controller = ((WorkflowTab) tab).getWorkflowModel();
				break;
			}
		}
		return controller;
	}

	public void setIdWorkflow(final String idWorkflow) {
		this.idWorkflow = idWorkflow;
	}

	public List<String> getIdEngineList() {
		return this.idEngineList;
	}

	public Combo getComboEngine() {
		return this.comboEngine;
	}
}
