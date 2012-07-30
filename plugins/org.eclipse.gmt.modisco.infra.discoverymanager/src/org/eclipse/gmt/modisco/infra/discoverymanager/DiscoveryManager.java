/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.discoverymanager;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.handlers.DiscovererHandler;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class DiscoveryManager extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.gmt.modisco.infra.discoverymanager"; //$NON-NLS-1$

	// The shared instance
	private static DiscoveryManager plugin;

	/**
	 * The constructor
	 */
	public DiscoveryManager() {
		// Empty
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		context.getBundle();
		DiscoveryManager.plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		DiscoveryManager.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static DiscoveryManager getDefault() {
		return DiscoveryManager.plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(final String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(DiscoveryManager.PLUGIN_ID, path);
	}

	private List<DiscovererHandler> discoverers;

	/**
	 * Accessor to all discoverers registered in DiscoverersManager through
	 * extensions.
	 * 
	 * @return the list of discoverers available in registry
	 */
	public List<? extends Discoverer> getDiscoverers() {
		return getDiscovererHandlers();
	}

	/**
	 * Technical accessor : Accessor to all discoverers registered in
	 * DiscoverersManager through extensions. Except that a discoverer handler
	 * provides also informations available in extension (name, path).
	 * 
	 * @return the list of discoverers available in registry
	 */
	public List<DiscovererHandler> getDiscovererHandlers() {
		if (this.discoverers == null) {
			this.discoverers = new ArrayList<DiscovererHandler>();
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry.getExtensionPoint(Constants.discovererExtensionPoint);

			for (IExtension extension : point.getExtensions()) {
				for (IConfigurationElement element : extension.getConfigurationElements()) {
					String discovererClass = element.getAttribute("class"); //$NON-NLS-1$
					if (discovererClass != null) {
						try {

							Discoverer discoverer = (Discoverer) element
									.createExecutableExtension("class"); //$NON-NLS-1$
							DiscovererHandler handler = new DiscovererHandler(discoverer);

							String discovererName = element.getAttribute("name"); //$NON-NLS-1$
							if (discovererName == null) {
								handler.setName(discoverer.toString());
							} else {
								handler.setName(discovererName);
							}

							String discovererPath = element.getAttribute("path"); //$NON-NLS-1$
							if (discovererPath != null) {
								String[] paths = discovererPath.split("/"); //$NON-NLS-1$
								handler.setPaths(paths);
							}

							String iconPath = element.getAttribute("icon"); //$NON-NLS-1$
							if (iconPath != null) {
								Bundle b = Platform.getBundle(extension.getNamespaceIdentifier());
								URL url = b.getResource(iconPath);
								handler.setImageIcon(ImageDescriptor.createFromURL(url)
										.createImage());
							}
							this.discoverers.add(handler);
						} catch (CoreException e) {
							String message = "A problem occured when instantiating discoverer configuration: " + element.getValue(); //$NON-NLS-1$
							MoDiscoLogger.logWarning(e, message, DiscoveryManager.getDefault());
						}
					} else {
						String message = "A problem occured when retrieving discoverer configuration: " + element.getValue(); //$NON-NLS-1$
						MoDiscoLogger.logWarning(message, DiscoveryManager.getDefault());
					}
				}
			}
		}
		return this.discoverers;
	}

	/**
	 * Accessor to one discoverer registered in DiscoverersManager through
	 * extensions.
	 * 
	 * @param discovererName
	 *            name of a discoverer
	 * @return the discoverer with specified name, or null if there is no
	 *         discoverer registered with specified name.
	 */
	public Discoverer getDiscoverer(final String discovererName) {
		Discoverer result = null;
		for (DiscovererHandler handler : getDiscovererHandlers()) {
			if (handler.getName().equals(discovererName)) {
				result = handler;
			}
		}
		return result;
	}
}
