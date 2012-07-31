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

import java.util.List;

import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplay;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class ParametersTableComposite extends Composite {

	private static final int VALUE_MINIMUM_WIDTH = 500;

	private static final int VALUE_WEIGHT = 66;

	private static final int REQUIRED_MINIMUM_WIDTH = 60;

	private static final int REQUIRED_WEIGHT = 8;

	private static final int NAME_MINIMUM_WIDTH = 200;

	private static final int NAME_WEIGHT = 26;

	private TableViewer tableViewer = null;

	// private ParametersTableLabelProvider labelProvider = null;
	private ParametersTableContentProvider contentProvider = null;
	private ParametersTableEditingSupport editingSupport = null;
	@SuppressWarnings("unused")
	private ColumnViewerSorter sorter = null;

	public ParametersTableComposite(final Composite parent, final int style,
			final List<DiscoveryParameterDisplay> discoveryParameters) {
		super(parent, style);
		initialize();
		initializeTableProviders();
		initializeTableContents(discoveryParameters);
	}

	/**
	 * @param discoveryParameters
	 */
	private final void initializeTableContents(
			final List<DiscoveryParameterDisplay> discoveryParameters) {

		DiscoveryParameterDisplay[] parameters = new DiscoveryParameterDisplay[discoveryParameters
				.size()];
		discoveryParameters.toArray(parameters);
		this.tableViewer.setInput(parameters);
	}

	private final void initialize() {
		this.tableViewer = new TableViewer(this, SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalAlignment = GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		this.tableViewer.getTable().setLayoutData(gridData1);
		this.tableViewer.getTable().setHeaderVisible(true);
		this.tableViewer.getTable().setLinesVisible(true);

		TableColumnLayout ad = new TableColumnLayout();
		setLayout(ad);

		TableViewerColumn columnName = new TableViewerColumn(this.tableViewer, SWT.NONE);
		columnName.getColumn().setText(Messages.ParametersTableComposite_0);
		columnName.getColumn().setMoveable(true);
		columnName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				return ((DiscoveryParameterDisplay) element).getName();
			}
		});
		this.sorter = new ColumnViewerSorter(this.tableViewer, columnName);

		ad.setColumnData(columnName.getColumn(), new ColumnWeightData(
				ParametersTableComposite.NAME_WEIGHT, ParametersTableComposite.NAME_MINIMUM_WIDTH));

		TableViewerColumn columnRequired = new TableViewerColumn(this.tableViewer, SWT.NONE);
		// columnRequired.getColumn().setWidth(60);
		columnRequired.getColumn().setText(Messages.ParametersTableComposite_1);
		columnRequired.getColumn().setMoveable(true);
		columnRequired.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				String result = null;
				if (((DiscoveryParameterDisplay) element).isRequired()) {
					result = Messages.ParametersTableComposite_2;
				} else {
					result = Messages.ParametersTableComposite_3;
				}
				return result;
			}
		});
		ad.setColumnData(columnRequired.getColumn(), new ColumnWeightData(
				ParametersTableComposite.REQUIRED_WEIGHT,
				ParametersTableComposite.REQUIRED_MINIMUM_WIDTH));

		TableViewerColumn columnValue = new TableViewerColumn(this.tableViewer, SWT.NONE);
		// columnValue.getColumn().setWidth(500);
		columnValue.getColumn().setText(Messages.ParametersTableComposite_4);
		columnValue.getColumn().setMoveable(true);
		columnValue.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				String result = null;
				if (((DiscoveryParameterDisplay) element).getValue() != null) {
					result = ((DiscoveryParameterDisplay) element).getValue().toString();
				}
				return result;
			}
		});
		this.editingSupport = new ParametersTableEditingSupport(this.tableViewer);
		columnValue.setEditingSupport(this.editingSupport);
		ad.setColumnData(columnValue.getColumn(),
				new ColumnWeightData(ParametersTableComposite.VALUE_WEIGHT,
						ParametersTableComposite.VALUE_MINIMUM_WIDTH));

		TableViewerColumn columnClean = new TableViewerColumn(this.tableViewer, SWT.NONE);
		columnClean.getColumn().setText(Messages.ParametersTableComposite_clean);
		columnClean.getColumn().setMoveable(true);
		// columnClean.getColumn().setAlignment(SWT.CENTER);
		columnClean.setLabelProvider(new CleanColumnLabelProvider());
		columnClean.setEditingSupport(new CleanEditingSupport(this.tableViewer));
		ad.setColumnData(columnClean.getColumn(), new ColumnWeightData(
				ParametersTableComposite.REQUIRED_WEIGHT,
				ParametersTableComposite.REQUIRED_MINIMUM_WIDTH));
		// setLayout(new GridLayout());
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		setLayoutData(gridData);

	}

	private final void initializeTableProviders() {
		// this.labelProvider = new ParametersTableLabelProvider();
		// this.tableViewer.setLabelProvider(this.labelProvider);

		this.contentProvider = new ParametersTableContentProvider();
		this.tableViewer.setContentProvider(this.contentProvider);
	}

	/**
	 * @param discoveryParameters
	 */
	public void updateDisplayParameters(final List<DiscoveryParameterDisplay> discoveryParameters) {
		initializeTableContents(discoveryParameters);
		this.tableViewer.refresh();
		this.setSize(this.tableViewer.getTable().getSize());
		this.pack();
	}

} // @jve:decl-index=0:visual-constraint="10,10"
