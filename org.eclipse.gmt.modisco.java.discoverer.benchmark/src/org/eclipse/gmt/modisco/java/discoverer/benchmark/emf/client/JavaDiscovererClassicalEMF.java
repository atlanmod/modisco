/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client;

import java.util.Properties;

import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component
 */
@Deprecated
public class JavaDiscovererClassicalEMF extends DiscoverJavaModelFromJavaProjectEMFStat {
	@Override
	protected Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(MM_VARIANT, "Classic EObject"); //$NON-NLS-1$
		return properties;
	}

	@Override
	public JavaFactory getEFactory() {
		return org.eclipse.gmt.modisco.java.emf.classic.JavaFactory.eINSTANCE;
	}
}
