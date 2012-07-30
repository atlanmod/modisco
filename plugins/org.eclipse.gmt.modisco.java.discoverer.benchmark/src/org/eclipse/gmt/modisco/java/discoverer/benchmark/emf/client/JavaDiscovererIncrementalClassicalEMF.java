/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client;

import java.util.Properties;

import org.eclipse.gmt.modisco.java.discoverer.benchmark.Messages;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.JavaReaderEMFStat;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.io.java.JavaReader;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component
 */
@Deprecated
public class JavaDiscovererIncrementalClassicalEMF extends DiscoverJavaModelFromJavaProjectEMFStat {
	@Override
	protected JavaReader getJavaReader(final boolean isIncremental) {
		JavaReaderEMFStat javaReader = new JavaReaderEMFStat(getEFactory(), true);
		javaReader.setStatistics(this.getStatistics());
		return javaReader;
	}

	@Override
	public Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.ALGO_VARIANT,
				Messages.JavaDiscoverIncrementalClassicalEMF_0);
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.MM_VARIANT, "Classic EObject"); //$NON-NLS-1$
		return properties;
	}

	@Override
	public JavaFactory getEFactory() {
		return org.eclipse.gmt.modisco.java.emf.classic.JavaFactory.eINSTANCE;
	}
}
