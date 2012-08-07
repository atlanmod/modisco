/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.benchmark.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Report;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.RunBenchmark;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.junit.Assert;
import org.junit.Test;

/**
 * @deprecated use org.eclipse.modisco.java.discover.benchmark.tests component
 */
@Deprecated
public class JavaDiscovererBenchmarkTest {
	private static final String PROJECT_NAME = "benchmark_discovery"; //$NON-NLS-1$

	@Test(timeout = 15 * 60 * 1000)
	public void test001() throws CoreException, IOException {
		if (Boolean.parseBoolean(System.getenv().get("skip.long.junit.tests"))) {
			throw new RuntimeException("skipped");
		}

		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject iProject = ws.getRoot().getProject(
				JavaDiscovererBenchmarkTest.PROJECT_NAME);
		ProjectUtils.create(iProject, new NullProgressMonitor());
		String filePath = "src/" + this.getClass().getName().replace('.', '/') + ".java"; //$NON-NLS-1$ //$NON-NLS-2$
		FileUtils.copyFileFromBundle(filePath, iProject, filePath, Activator
				.getDefault().getBundle());
		RunBenchmark benchmark = new RunBenchmark();
		IJavaProject aJavaProject = JavaCore.create(iProject);
		benchmark.createReport(aJavaProject);
		File reportFile = benchmark.getStatProject()
				.getFile(Report.HTMLREPORT_FILE_NAME).getLocation().toFile();

		Assert.assertTrue("Following output file has not been found : " //$NON-NLS-1$
				+ reportFile.toString(), reportFile.exists());
	}
}
