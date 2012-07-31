/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.gmt.modisco.infra.discoverymanager.handlers.DiscovererHandler;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplay;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplayImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.parametersdisplay.DiscovererParametersComposite;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.utils.ParameterUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscoverersMainTab extends AbstractLaunchConfigurationTab implements DiscovererUpdate {

	private Group sourceGroup = null;
	private Text sourceElementText = null;
	private Button sourceElementButton = null;
	private Group discovererKindGroup = null;
	private Group targetModelGroup = null;
	private Combo discovererKindCombo = null;
	private Label discoverKindLabel = null;
	private Composite rootContainer = null;
	private DiscovererParametersComposite parametersContainer = null;

	private final List<DiscoveryParameterDisplay> displayParameters = new ArrayList<DiscoveryParameterDisplay>();

	/**
	 * This method initializes parametersContainer
	 */
	private final void createDiscovererParametersContainer() {
		this.parametersContainer = new DiscovererParametersComposite(this.rootContainer, SWT.NONE);
	}

	/**
	 * This method initializes sourceGroup
	 * 
	 */
	private final void createSourceGroup() {
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessVerticalSpace = false;
		gridData.grabExcessHorizontalSpace = true;
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		this.sourceGroup = new Group(this.rootContainer, SWT.NONE);
		this.sourceGroup.setToolTipText(Messages.DiscoverersMainTab_0);
		this.sourceGroup.setLayout(gridLayout);
		this.sourceGroup.setLayoutData(gridData);
		this.sourceGroup.setText(Messages.DiscoverersMainTab_1);
		this.sourceElementText = new Text(this.sourceGroup, SWT.BORDER);
		this.sourceElementText.setLayoutData(gridData2);
		this.sourceElementText.addModifyListener(new org.eclipse.swt.events.ModifyListener() {
			public void modifyText(final org.eclipse.swt.events.ModifyEvent e) {
				update();
			}
		});
		this.sourceElementButton = new Button(this.sourceGroup, SWT.NONE);
		this.sourceElementButton.setText(Messages.DiscoverersMainTab_2);
		this.sourceElementButton
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
						sourceBrowseEvent();
					}
				});
	}

	/**
	 * This method initializes discovererKindGroup
	 * 
	 */
	private final void createDiscovererKindGroup() {
		GridData gridData11 = new GridData();
		gridData11.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData11.grabExcessHorizontalSpace = true;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.grabExcessHorizontalSpace = true;
		this.discovererKindGroup = new Group(this.rootContainer, SWT.NONE);
		this.discovererKindGroup.setLayout(new GridLayout());
		this.discovererKindGroup.setLayoutData(gridData11);
		this.discovererKindGroup.setText(Messages.DiscoverersMainTab_3);
		this.discoverKindLabel = new Label(this.discovererKindGroup, SWT.NONE);
		this.discoverKindLabel.setText(Messages.DiscoverersMainTab_4);
		this.discovererKindCombo = new Combo(this.discovererKindGroup, SWT.READ_ONLY);
		this.discovererKindCombo.setLayoutData(gridData1);
		this.discovererKindCombo
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
						updateDiscovererParametersContainer(null);
						update();
					}
				});
	}

	/**
	 * 
	 */
	protected final void updateDiscovererParametersContainer(
			final ILaunchConfiguration configuration) {
		String kind = this.discovererKindCombo.getText();
		Discoverer discoverer = DiscoveryManager.getDefault().getDiscoverer(kind);
		this.displayParameters.clear();
		if (discoverer != null) {
			for (DiscoveryParameter parameter : discoverer.getDiscovererParameters()) {
				DiscoveryParameterDisplay displayParameter = new DiscoveryParameterDisplayImpl(
						parameter, this);
				this.displayParameters.add(displayParameter);
				ParameterUtils.getInstance().updateParameterValue(displayParameter, configuration);
			}
			this.parametersContainer.updateDiscoveryParameters(this.displayParameters);
		} else {
			setErrorMessage(Messages.DiscoverersMainTab_5);
		}
	}

	/**
	 * This method initializes targetModelGroup
	 * 
	 */
	private final void createTargetModelGroup() {
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData4.grabExcessHorizontalSpace = true;
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.numColumns = 1;
		this.targetModelGroup = new Group(this.rootContainer, SWT.NONE);
		this.targetModelGroup.setText(Messages.DiscoverersMainTab_6);
		this.targetModelGroup.setLayoutData(gridData4);
		this.targetModelGroup.setLayout(gridLayout2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	public void createControl(final Composite parent) {
		this.rootContainer = new Composite(parent, SWT.NULL);
		// this.rootContainer.setLayout(new GridLayout(1, false));
		// this.rootContainer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
		// true, true));
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		this.rootContainer.setLayout(gridLayout);
		this.rootContainer.setLayoutData(gridData);

		createDiscovererKindGroup();
		createSourceGroup();
		createTargetModelGroup();
		createDiscovererParametersContainer();

		// initialize list of discoverers kind
		initializeDiscoverersKindList();

		// set the control to be displayed in tab
		setControl(this.rootContainer);
	}

	private final void initializeDiscoverersKindList() {
		for (DiscovererHandler handler : DiscoveryManager.getDefault().getDiscovererHandlers()) {
			this.discovererKindCombo.add(handler.getName());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return Messages.DiscoverersMainTab_7;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(final ILaunchConfiguration configuration) {
		try {
			String kind = configuration.getAttribute(DiscovererLaunchConstants.discovererKind, ""); //$NON-NLS-1$
			if (kind.length() > 0) {
				// we suppose that corresponding discover has been registered
				this.discovererKindCombo.setText(kind);
			}
			String sourcePath = configuration.getAttribute(
					DiscovererLaunchConstants.discovererSourcePath, ""); //$NON-NLS-1$
			if (sourcePath.length() > 0) {
				this.sourceElementText.setText(sourcePath);
			}
			updateDiscovererParametersContainer(configuration);
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, DiscoveryManager.getDefault());
		}

		update();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		String kind = this.discovererKindCombo.getText();
		if (kind.length() > 0) {
			configuration.setAttribute(DiscovererLaunchConstants.discovererKind, kind);
			saveDisplayParameter(configuration);
		}
		String sourcePath = this.sourceElementText.getText();
		configuration.setAttribute(DiscovererLaunchConstants.discovererSourcePath, sourcePath);
	}

	/**
	 * 
	 * @param configuration
	 */
	private final void saveDisplayParameter(final ILaunchConfigurationWorkingCopy configuration) {
		for (DiscoveryParameterDisplay parameter : this.displayParameters) {
			ParameterUtils.getInstance().serializeParameterValue(parameter, configuration);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		// Empty
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		boolean result = true;
		setErrorMessage(null);
		setMessage(null);

		try {
			String kind = launchConfig.getAttribute(DiscovererLaunchConstants.discovererKind, ""); //$NON-NLS-1$
			String sourcePath = launchConfig.getAttribute(
					DiscovererLaunchConstants.discovererSourcePath, ""); //$NON-NLS-1$
			if (kind.length() > 0) {
				Discoverer discoverer = DiscoveryManager.getDefault().getDiscoverer(kind);
				if (discoverer != null) {
					result = validateSourcePath(sourcePath, discoverer);
					if (result) {
						result = validateDisplayParameters();
					}
				} else {
					result = false;
					setErrorMessage(Messages.DiscoverersMainTab_12);
				}
			} else {
				result = false;
				setMessage(Messages.DiscoverersMainTab_13);
			}

		} catch (Exception e) {
			MoDiscoLogger.logError(e, DiscoveryManager.getDefault());
		}
		return result;
	}

	/**
	 * @return whether all required parameters are filled in
	 */
	private final boolean validateDisplayParameters() {
		boolean result = true;
		/*
		 * Just verify that all required parameters have been filled. In further
		 * developments, we will also validate the value. Perhaps, we will have
		 * to ask each discoverer to provide a validator.
		 */
		for (DiscoveryParameterDisplay parameter : this.displayParameters) {
			if (parameter.isRequired()) {
				result = result && (parameter.getValue() != null);
			}
		}
		if (!result) {
			setMessage(Messages.DiscoverersMainTab_14);
		}
		return result;
	}

	private final boolean validateSourcePath(final String sourcePath, final Discoverer discoverer) {
		boolean result = true;
		if (sourcePath.length() > 0) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IPath rootPath = root.getFullPath();
			if (rootPath.isValidPath(sourcePath)) {
				IPath path = rootPath.append(sourcePath);
				/*
				 * It could be a file, a folder or a project ...
				 */
				try {

					IContainer iproject = null;
					String containerKind = "project"; //$NON-NLS-1$
					if (path.segmentCount() == 1) {
						iproject = root.getProject(sourcePath);
					} else {
						iproject = root.getFolder(path);
						containerKind = "folder"; //$NON-NLS-1$
					}
					if ((iproject != null) && (iproject.exists())) {
						if (!discoverer.isApplicableTo(iproject)) {
							result = false;
							setErrorMessage(Messages.DiscoverersMainTab_17 + containerKind);
						}
					} else {
						IFile ifile = root.getFile(path);
						if ((ifile != null) && (ifile.exists())) {
							if (!discoverer.isApplicableTo(ifile)) {
								result = false;
								setErrorMessage(Messages.DiscoverersMainTab_18);
							}
						} else {
							result = false;
							setErrorMessage(Messages.DiscoverersMainTab_19);
						}
					}
				} catch (IllegalArgumentException iae) {
					result = false;
					setErrorMessage(iae.getMessage());
				}
			} else {
				result = false;
				setErrorMessage(Messages.DiscoverersMainTab_20);
			}
		} else {
			result = false;
			setMessage(Messages.DiscoverersMainTab_21);
		}
		return result;
	}

	final void sourceBrowseEvent() {
		String sourcePath = this.sourceElementText.getText();

		ElementTreeSelectionDialog elementTreeSelectionDialog = new ElementTreeSelectionDialog(
				getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		elementTreeSelectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		elementTreeSelectionDialog.setMessage("Select a source element"); //$NON-NLS-1$
		elementTreeSelectionDialog.setAllowMultiple(false);
		elementTreeSelectionDialog.setDoubleClickSelects(true);

		String kind = this.discovererKindCombo.getText();
		final Discoverer discoverer = DiscoveryManager.getDefault().getDiscoverer(kind);

		elementTreeSelectionDialog.setValidator(new ISelectionStatusValidator() {
			public IStatus validate(final Object[] selection) {
				IStatus ret = Status.CANCEL_STATUS;
				if (selection.length == 1) {
					if ((discoverer == null) || (discoverer.isApplicableTo(selection[0]))) {
						ret = Status.OK_STATUS;
					}
				}
				return ret;
			}
		});
		elementTreeSelectionDialog.open();
		Object result = elementTreeSelectionDialog.getFirstResult();

		if ((result != null) && (result instanceof IResource)) {
			IResource currentFile = (IResource) result;
			sourcePath = currentFile.getFullPath().toString();
		}

		this.sourceElementText.setText(sourcePath);
		update();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.DiscovererUpdate
	 * #update()
	 */
	public void update() {
		updateLaunchConfigurationDialog();
	}

}
