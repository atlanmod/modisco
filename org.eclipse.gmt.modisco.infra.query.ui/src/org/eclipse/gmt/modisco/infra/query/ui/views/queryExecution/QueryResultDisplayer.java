/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.ui.views.queryExecution;

import java.util.List;

import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryResult;

/**
 * Implemented by a view or editor that wants to be used to display the results
 * of a model query.
 */
public interface QueryResultDisplayer {
	void displayQueryResult(final List<ModelQueryResult> result);
}
