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
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.gmt.modisco.infra.discoverymanager.handlers.DiscovererHandler;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
class MenuListenerHandler implements SelectionListener {

	private final DiscovererHandler discoverer;
	private final Object[] sources;

	// private final Shell shell;

	/**
	 * @param discovererParameter
	 * @param sourceParameter
	 * @param targetUriParameter
	 */
	MenuListenerHandler(final DiscovererHandler discovererParameter,
			final Object[] sourceParameter, final URI targetUriParameter) {
		this.discoverer = discovererParameter;
		this.sources = sourceParameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse
	 * .swt.events.SelectionEvent)
	 */
	public void widgetDefaultSelected(final SelectionEvent e) {
		// we will not use this method
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt
	 * .events.SelectionEvent)
	 */
	public void widgetSelected(final SelectionEvent event) {
		for (final Object source : this.sources) {
			Job job = new Job(Messages.MenuListenerHandler_0) {

				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
					MenuListenerHandler.this.getDiscoverer().discoverElement(source, parameters);
					return Status.OK_STATUS;
				}

			};
			job.schedule();
		}
	}

	DiscovererHandler getDiscoverer() {
		return this.discoverer;
	}

}
