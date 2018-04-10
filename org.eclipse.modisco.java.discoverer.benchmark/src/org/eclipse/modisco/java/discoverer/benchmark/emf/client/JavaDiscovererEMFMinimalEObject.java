/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark.emf.client;

import java.util.Properties;

import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;

public class JavaDiscovererEMFMinimalEObject extends DiscoverJavaModelFromJavaProjectEMFStat {

	@Override
	protected Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.MM_VARIANT, "Minimal EObject"); //$NON-NLS-1$
		return properties;
	}

	@Override
	public JavaFactory getEFactory() {
		return org.eclipse.gmt.modisco.java.emf.JavaFactory.eINSTANCE;
	}
}
