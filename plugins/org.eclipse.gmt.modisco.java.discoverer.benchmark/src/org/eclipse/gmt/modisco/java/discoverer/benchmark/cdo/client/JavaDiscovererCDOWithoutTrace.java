/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.client;

import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.cdo.server.Server;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Messages;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.server.DerbyCDOServerNoAudits;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.jdt.core.IJavaProject;

import com.ibm.icu.text.SimpleDateFormat;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component
 */
@Deprecated
public class JavaDiscovererCDOWithoutTrace extends BenchmarkJavaDiscovererCDO {

	private static final long SLEEP_TIME = 20000;

	@Override
	public Resource getResource(final String resourceName, final IJavaProject javaProject) {
		try {
			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Starting server: " //$NON-NLS-1$
					+ DerbyCDOServerNoAudits.class.getSimpleName());
			Activator.getDefault().getLog().log(status);
			Server server = new DerbyCDOServerNoAudits();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
			server.start("db" + formatter.format(System.currentTimeMillis()), this.getPort()); //$NON-NLS-1$
			// ILaunch iLaunch = launch(serverClass.getSimpleName(), port);
			Thread.sleep(JavaDiscovererCDOWithoutTrace.SLEEP_TIME);
			IStatus status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Starting discovery"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status2);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return super.getResource(resourceName, javaProject);
	}

	@Override
	protected Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.ALGO_VARIANT,
				Messages.JavaDiscovererCDOWithoutTrace_0);
		return properties;
	}
}
