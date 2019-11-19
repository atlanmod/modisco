/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.queryResultDisplayers;

import java.util.List;

import org.eclipse.gmt.modisco.infra.browser.editors.table.TableEditorFactory;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.gmt.modisco.infra.query.ui.views.queryExecution.QueryResultDisplayer;

public class TableQueryResultDisplayer implements QueryResultDisplayer {

	public TableQueryResultDisplayer() {
		// nothing
	}

	public void displayQueryResult(final List<ModelQueryResult> result) {
		TableEditorFactory.getInstance().openOn(result);
	}

}
