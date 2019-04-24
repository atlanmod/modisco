/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.tests;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class ProjectUtilsTest {


	@Test
	public void importBundle() throws CoreException, IOException {
		Bundle bundle = Platform.getBundle("org.eclipse.core.runtime"); //$NON-NLS-1$
		ProjectUtils.importPlugin(bundle);
	}
}
