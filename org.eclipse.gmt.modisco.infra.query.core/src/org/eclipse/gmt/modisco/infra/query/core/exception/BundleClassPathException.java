/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.core.exception;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.osgi.framework.Bundle;

public class BundleClassPathException extends ModelQueryException {

	private static final long serialVersionUID = 8664502897169666916L;

	private final IProject project;
	private final Bundle bundle;

	private final IPath outputLocation;

	public IProject getProject() {
		return this.project;
	}

	public Bundle getBundle() {
		return this.bundle;
	}

	public IPath getOutputLocation() {
		return this.outputLocation;
	}

	public BundleClassPathException(final IProject project, final IPath outputLocation,
			final Bundle localBundle) {
		super(
				"The output location of the Java project '" + project.getName() + "' was not found in its Bundle-ClassPath: \"" + outputLocation + //$NON-NLS-1$//$NON-NLS-2$
						"\". This prevents the Java queries implementations it contains from being loaded."); //$NON-NLS-1$
		this.project = project;
		this.outputLocation = outputLocation;
		this.bundle = localBundle;
	}
}
