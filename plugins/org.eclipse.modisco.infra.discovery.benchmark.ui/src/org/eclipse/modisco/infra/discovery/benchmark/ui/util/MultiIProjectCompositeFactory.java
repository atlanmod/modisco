/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.ui.util;

import org.eclipse.emf.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.emf.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.infra.discovery.benchmark.api.IProjectSet;
import org.eclipse.swt.widgets.Composite;

/**
 * Composite editor factory for the list of projects
 * @author Guillaume Doux
 *
 */
public class MultiIProjectCompositeFactory implements ICompositeEditorFactory<IProjectSet> {

	@Override
	public Class<IProjectSet> getHandledType() {
		return IProjectSet.class;
	}

	@Override
	public AbstractCellEditorComposite<IProjectSet> createCompositeEditor(
			final Composite parent, final int style) {
		return new MultiIProjectComposite(parent, style);
	}

}
