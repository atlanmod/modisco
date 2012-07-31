/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow.internal.engine;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.WorkflowExecution;

/** @deprecated */
@Deprecated
public class EngineFactoryImpl implements EngineFactory {

	private Map<String, WorkflowExecution> workflowEngines;
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.internal.engine.EngineFactory#getEngine(java.lang.String)
	 */
	public WorkflowExecution getEngine(final String engineId) {
		// return this.getWorkflowEngines().get(engineId);
		return new WorkflowExecutionImpl();
	}

	private final Map<String, WorkflowExecution> getWorkflowEngines() {
		if (this.workflowEngines == null) {
			this.workflowEngines = new HashMap<String, WorkflowExecution>();
			initializeWorkflowEngines();
		}
		return this.workflowEngines;
	}
	/**
	 * Load the plug-in to refer the point extension
	 * Constant.nameExtensionPointWorkflow
	 */
	private void initializeWorkflowEngines() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry
				.getExtensionPoint(Constants.nameExtensionPointWorkflowEngine);

		for (IExtension extension : point.getExtensions()) {
			for (IConfigurationElement element : extension
					.getConfigurationElements()) {
				// We take into account the first extension
				if (element.getName().equals(
						Constants.workflowExecutionExtensionPointWorkflow)) {
					try {
						getWorkflowEngines().put(extension
								.getUniqueIdentifier(),
								(WorkflowExecution) element
										.createExecutableExtension("class")); //$NON-NLS-1$
					} catch (Throwable e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			}
		}
	}
}
