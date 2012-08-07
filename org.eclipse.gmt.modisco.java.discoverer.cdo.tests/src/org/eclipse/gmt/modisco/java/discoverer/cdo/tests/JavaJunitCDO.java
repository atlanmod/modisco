/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.java.discoverer.cdo.tests;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.cdo.derby.DerbyCDOServer;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.discoverer.cdo.JavaDiscovererCDO;
import org.eclipse.gmt.modisco.java.discoverer.tests.Activator;
import org.eclipse.gmt.modisco.java.discoverer.tests.JavaJUnitEMF;
import org.eclipse.jdt.core.IJavaProject;
import org.junit.AfterClass;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class JavaJunitCDO extends JavaJUnitEMF {

	private final int port = 2036;
	private static DerbyCDOServer server;

	@SuppressWarnings("deprecation")
	@Override
	protected void loadResource(final IJavaProject javaProject) {
		try {
			if (JavaJunitCDO.server == null) {
				JavaJunitCDO.server = new DerbyCDOServer();
				JavaJunitCDO.server.start("db" + System.currentTimeMillis(), //$NON-NLS-1$
						this.port);
			}
			// ILaunch iLaunch = launch(serverClass.getSimpleName(), port);
			synchronized (JavaJunitCDO.server) {
				long before = System.currentTimeMillis();
				while (!JavaJunitCDO.server.isStarted()) {
					JavaJunitCDO.server.wait(100);
				}
				System.out
						.println("CDO server took " + (System.currentTimeMillis() - before) + " ms to start"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
					"Starting discovery"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
			JavaDiscovererCDO discoverer = new JavaDiscovererCDO() {
				@Override
				protected void terminate(final Resource r) {
					// leave the session opened
				}
			};
			discoverer.setPort(this.port);
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE,
					Boolean.valueOf(true));

			Resource resource = null;
			// int nTries = 3;
			// while (resource == null && nTries-- > 0) {
			// }
			discoverer.discoverElement(javaProject, parameters);
			resource = (Resource) parameters
					.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);

			if (resource == null) {
				throw new IllegalStateException(
						"Resource is null : error in discovery"); //$NON-NLS-1$
			}
			setResource(resource);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	@AfterClass
	public static void stopServer() {
		JavaJunitCDO.server.stop();
	}
}
