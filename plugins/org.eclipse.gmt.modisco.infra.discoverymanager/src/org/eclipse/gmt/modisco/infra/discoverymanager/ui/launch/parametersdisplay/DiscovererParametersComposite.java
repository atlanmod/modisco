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

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.parametersdisplay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplay;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscovererParametersComposite extends Composite {

	private static final class InnerParametersGroup {

		private ParametersTableComposite parametersGroup = null;
		private ExpandItem parametersItem = null;

		InnerParametersGroup() {
			// Empty
		}

		/**
		 * This method initializes inParametersGroup
		 * 
		 */
		void createInParametersGroup(final ExpandBar parametersBar,
				final List<DiscoveryParameterDisplay> discoveryParameters, final String message) {
			this.parametersGroup = new ParametersTableComposite(parametersBar, SWT.NONE,
					discoveryParameters);
			this.parametersItem = new ExpandItem(parametersBar, SWT.NONE, 0);
			this.parametersItem.setText(message);
			this.parametersItem.setHeight(this.parametersGroup
					.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
			this.parametersItem.setControl(this.parametersGroup);
			this.parametersItem.setExpanded(!discoveryParameters.isEmpty());
		}

		void updateDisplayParameters(final List<DiscoveryParameterDisplay> discoveryParameters) {
			this.parametersGroup.updateDisplayParameters(discoveryParameters);
			this.parametersItem.setHeight(this.parametersGroup
					.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
			if (discoveryParameters.size() > 0) {
				this.parametersItem.setExpanded(true);
			} else {
				this.parametersItem.setExpanded(false);
			}
		}
	}

	private Group discovererParametersGroup = null;
	private InnerParametersGroup inGroup = null;
	private InnerParametersGroup inoutParametersGroup = null;
	private InnerParametersGroup outParametersGroup = null;
	private ExpandBar parametersBar = null;

	private List<DiscoveryParameterDisplay> discoveryParameters;

	public DiscovererParametersComposite(final Composite parent, final int style) {
		super(parent, style);
		this.discoveryParameters = Collections.emptyList();
		initialize();
	}

	private final void initialize() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		setLayoutData(gridData);
		setLayout(gridLayout);
		createDiscovererParametersGroup();
	}

	/**
	 * This method initializes discovererParametersGroup
	 * 
	 */
	private final void createDiscovererParametersGroup() {
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalAlignment = GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		this.discovererParametersGroup = new Group(this, SWT.NONE);
		this.discovererParametersGroup.setText(Messages.DiscovererParametersComposite_2);
		this.discovererParametersGroup.setLayoutData(gridData1);
		this.parametersBar = new ExpandBar(this.discovererParametersGroup, SWT.V_SCROLL);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		this.parametersBar.setLayoutData(gridData);
		this.createOutParametersGroup();
		this.createInoutParametersGroup();
		this.createInParametersGroup();
		this.discovererParametersGroup.setLayout(new GridLayout());
	}

	/**
	 * This method initializes inParametersGroup
	 * 
	 */
	private final void createInParametersGroup() {
		this.inGroup = new InnerParametersGroup();
		this.inGroup.createInParametersGroup(this.parametersBar, getInDiscoveryParameters(),
				Messages.DiscovererParametersComposite_0);
	}

	private final List<DiscoveryParameterDisplay> getInDiscoveryParameters() {
		List<DiscoveryParameterDisplay> inParameters = new ArrayList<DiscoveryParameterDisplay>();
		for (DiscoveryParameterDisplay parameter : this.discoveryParameters) {
			if (parameter.getParameterDirectionKind() == DiscoveryParameterDirectionKind.in) {
				inParameters.add(parameter);
			}
		}
		return inParameters;
	}

	/**
	 * This method initializes inoutParametersGroup
	 * 
	 */
	private final void createInoutParametersGroup() {
		this.inoutParametersGroup = new InnerParametersGroup();
		this.inoutParametersGroup.createInParametersGroup(this.parametersBar,
				getInDiscoveryParameters(), Messages.DiscovererParametersComposite_1);
	}

	private final List<DiscoveryParameterDisplay> getInOutDiscoveryParameters() {
		List<DiscoveryParameterDisplay> inoutParameters = new ArrayList<DiscoveryParameterDisplay>();
		for (DiscoveryParameterDisplay parameter : this.discoveryParameters) {
			if (parameter.getParameterDirectionKind() == DiscoveryParameterDirectionKind.inout) {
				inoutParameters.add(parameter);
			}
		}
		return inoutParameters;
	}

	/**
	 * This method initializes outParametersGroup
	 * 
	 */
	private final void createOutParametersGroup() {
		this.outParametersGroup = new InnerParametersGroup();
		this.outParametersGroup.createInParametersGroup(this.parametersBar,
				getInDiscoveryParameters(), Messages.DiscovererParametersComposite_3);
	}

	private final List<DiscoveryParameterDisplay> getOutDiscoveryParameters() {
		List<DiscoveryParameterDisplay> outParameters = new ArrayList<DiscoveryParameterDisplay>();
		for (DiscoveryParameterDisplay parameter : this.discoveryParameters) {
			if (parameter.getParameterDirectionKind() == DiscoveryParameterDirectionKind.out) {
				outParameters.add(parameter);
			}
		}
		return outParameters;
	}

	/**
	 * @param displayParameters
	 */
	public void updateDiscoveryParameters(final List<DiscoveryParameterDisplay> displayParameters) {
		this.discoveryParameters = displayParameters;
		this.inGroup.updateDisplayParameters(getInDiscoveryParameters());
		this.inoutParametersGroup.updateDisplayParameters(getInOutDiscoveryParameters());
		this.outParametersGroup.updateDisplayParameters(getOutDiscoveryParameters());
	}

} // @jve:decl-index=0:visual-constraint="10,10"
