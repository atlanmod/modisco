/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;

/**
 * 
 * This Class provides a way of weaving a MoDisco Java Model with a MoDisco KDM Source one. Both
 * models are discovered independently and then read to weave some instances like Archive,
 * Compilation Unit ...
 * 
 * See Help contents or http://wiki.eclipse.org/MoDisco/Components/Java/Composition
 * 
 */
public class DiscoverKDMSourceAndJavaModelFromProject extends
		AbstractDiscoverKDMSourceAndJavaModel<IProject> {

	public boolean isApplicableTo(final IProject source) {
		return source.isAccessible();
	}

	@Override
	protected IProject getProject(final IProject source) {
		return source;
	}

	@Override
	protected AbstractDiscoverJavaModelFromProject<IProject> initJavaDiscoverer() {
		return new DiscoverJavaModelFromProject();
	}

	@ParameterInitialValue(name = "ELEMENTS_TO_ANALYZE")
	public static ElementsToAnalyze getElementsToAnalyzeInitialValue(final IProject source) {
		if (source == null) {
			return null;
		}
		return new ElementsToAnalyze(JavaCore.create(source));
	}
}