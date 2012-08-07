package org.eclipse.modisco.infra.discovery.core.tests;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.tests.discoverers.AbstractDiscovererSubClass;
import org.junit.Test;

public class TestAbstractDiscoverer {

	@Test
	public void testAbstractDiscoverer() {

		AbstractDiscovererSubClass aDiscoverer = new AbstractDiscovererSubClass();

		// Test isAjavaFileWithExtension()
		IFile badSource = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path("myProject/myFile.noext")); //$NON-NLS-1$

		Assert.assertFalse(aDiscoverer.isApplicableTo(badSource));

		IFile goodSource = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path("myProject/myFile.ext")); //$NON-NLS-1$
		Assert.assertTrue(aDiscoverer.isApplicableTo(goodSource));

		// Test isApplicableTo launched from discoverElement()
		try {
			aDiscoverer.discoverElement(badSource, new NullProgressMonitor());
			Assert.fail("Should have detected a wrong source"); //$NON-NLS-1$
		} catch (DiscoveryException e) {
			// ok
		}

		// Test parameters values cheching from discoverElement()
		try {
			aDiscoverer.discoverElement(goodSource, new NullProgressMonitor());
			Assert.fail("Should have detected a missing parameter DISCO_IN"); //$NON-NLS-1$
		} catch (DiscoveryException e) {
			// ok
		}

		// Test again parameters values cheching from discoverElement()
		aDiscoverer.setMyDiscoIn("value1"); //$NON-NLS-1$
		try {
			aDiscoverer.discoverElement(goodSource, new NullProgressMonitor());
		} catch (DiscoveryException e) {
			Assert.fail("Should not detect functional problem for this discovery"); //$NON-NLS-1$
		}
	}
}
