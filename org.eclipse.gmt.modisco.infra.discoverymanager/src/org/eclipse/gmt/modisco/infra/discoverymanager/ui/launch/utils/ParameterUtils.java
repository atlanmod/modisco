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
 */

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.data.DiscoveryParameterDisplay;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * @author gbarbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public final class ParameterUtils {

	private static final ParameterUtils INSTANCE = new ParameterUtils();

	private ParameterUtils() {
		// Empty
	}

	public static ParameterUtils getInstance() {
		return ParameterUtils.INSTANCE;
	}

	private Map<Class<?>, Class<? extends CellEditor>> discovererCellEditors;

	@SuppressWarnings("unchecked")
	private Map<Class<?>, Class<? extends CellEditor>> getDiscovererCellEditors() {
		if (this.discovererCellEditors == null) {
			this.discovererCellEditors = new HashMap<Class<?>, Class<? extends CellEditor>>();
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry
					.getExtensionPoint("org.eclipse.gmt.modisco.cellcontenteditors"); //$NON-NLS-1$

			for (IExtension extension : point.getExtensions()) {
				for (IConfigurationElement element : extension.getConfigurationElements()) {
					String targetType = element.getAttribute("targetType"); //$NON-NLS-1$
					String editorImplementation = element.getAttribute("editorImplementation"); //$NON-NLS-1$
					if ((targetType != null) && (editorImplementation != null)) {
						try {
							Class<?> targetTypeClass = Class.forName(targetType);
							Class<? extends CellEditor> editorClass = (Class<? extends CellEditor>) Class
									.forName(editorImplementation);

							this.discovererCellEditors.put(targetTypeClass, editorClass);
						} catch (ClassNotFoundException e) {
							String message = "A problem occured when instantiating discoverer cell editor configuration: " + element.getValue(); //$NON-NLS-1$
							IStatus status = new Status(IStatus.WARNING,
									DiscoveryManager.PLUGIN_ID, message, e);
							DiscoveryManager.getDefault().getLog().log(status);
						}
					} else {
						String message = "A problem occured when retrieving discoverer cell editor configuration: " + element.getValue(); //$NON-NLS-1$
						IStatus status = new Status(IStatus.WARNING, DiscoveryManager.PLUGIN_ID,
								message);
						DiscoveryManager.getDefault().getLog().log(status);
					}
				}
			}
		}
		return this.discovererCellEditors;
	}

	@SuppressWarnings("unchecked")
	public Object deserializeParameterValue(final DiscoveryParameter parameter,
			final ILaunchConfiguration configuration) {
		Object result = null;
		Class<?> type = parameter.getType();
		try {
			// test if configuration contains a value for this parameter
			if (configuration.hasAttribute(parameter.getName())) {
				// different options are available to retrieve the value
				if (type.equals(String.class)) {
					String value = configuration.getAttribute(parameter.getName(), ""); //$NON-NLS-1$
					result = value;
				} else if ((type.equals(Integer.TYPE)) || (type.equals(Integer.class))) {
					int value = configuration.getAttribute(parameter.getName(), 0);
					result = new Integer(value);
				} else if ((type.equals(Boolean.TYPE)) || (type.equals(Boolean.class))) {
					boolean value = configuration.getAttribute(parameter.getName(), false);
					result = new Boolean(value);
				} else if (List.class.isAssignableFrom(type)) {
					List<?> value = configuration.getAttribute(parameter.getName(),
							Collections.emptyList());
					result = value;
				} else if (Set.class.isAssignableFrom(type)) {
					Set<Object> value = new HashSet<Object>();
					List<Object> list = configuration.getAttribute(parameter.getName(),
							Collections.emptyList());
					value.addAll(list);
					result = value;
				} else if (Map.class.isAssignableFrom(type)) {
					Map<?, ?> value = configuration.getAttribute(parameter.getName(),
							Collections.emptyMap());
					result = value;
				} else if (IFile.class.isAssignableFrom(type)) {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					String value = configuration.getAttribute(parameter.getName(), ""); //$NON-NLS-1$
					IFile ifile = root.getFile(new Path(value));
					result = ifile;
				} else if (IContainer.class.isAssignableFrom(type)) {
					String value = configuration.getAttribute(parameter.getName(), ""); //$NON-NLS-1$
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					// two possibilities, a project (IProject) or a folder
					// (IFolder)
					if (root.getLocation().isValidSegment(value)) {
						// it should be a project
						IProject iproject = root.getProject(value);
						result = iproject;
					} else {
						IFolder ifolder = root.getFolder(new Path(value));
						result = ifolder;
					}
				} else if (URI.class.isAssignableFrom(type)) {
					String value = configuration.getAttribute(parameter.getName(), ""); //$NON-NLS-1$
					URI uri = URI.createURI(value);
					result = uri;
				}
				// else {
				// TODO Object not managed, we have to retrieve a
				// ParameterFactory from an extension point
				// }
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, DiscoveryManager.getDefault());
		}
		return result;
	}

	/**
	 * 
	 * @param parameter
	 * @param configuration
	 */
	public void updateParameterValue(final DiscoveryParameterDisplay parameter,
			final ILaunchConfiguration configuration) {
		if (configuration != null) {
			Object value = deserializeParameterValue(parameter, configuration);
			parameter.setValue(value);
		}
	}

	/**
	 * 
	 * @param parameter
	 * @param configuration
	 */
	public void serializeParameterValue(final DiscoveryParameterDisplay parameter,
			final ILaunchConfigurationWorkingCopy configuration) {
		Object value = parameter.getValue();
		Class<?> type = parameter.getType();
		if (value != null) {
			// different options are available to retrieve the value
			if (type.equals(String.class)) {
				configuration.setAttribute(parameter.getName(), (String) value);
			} else if ((type.equals(Integer.TYPE)) || (type.equals(Integer.class))) {
				configuration.setAttribute(parameter.getName(), ((Integer) value).intValue());
			} else if ((type.equals(Boolean.TYPE)) || (type.equals(Boolean.class))) {
				configuration.setAttribute(parameter.getName(), ((Boolean) value).booleanValue());
			} else if (List.class.isAssignableFrom(type)) {
				configuration.setAttribute(parameter.getName(), (List<?>) value);
			} else if (Set.class.isAssignableFrom(type)) {
				List<Object> list = new ArrayList<Object>();
				list.addAll((Set<?>) value);
				configuration.setAttribute(parameter.getName(), list);
			} else if (Map.class.isAssignableFrom(type)) {
				configuration.setAttribute(parameter.getName(), (Map<?, ?>) value);
			} else if (IFile.class.isAssignableFrom(type)) {
				IFile ifile = (IFile) value;
				configuration.setAttribute(parameter.getName(), ifile.getFullPath().toString());
			} else if (IContainer.class.isAssignableFrom(type)) {
				if (value instanceof IFolder) {
					IFolder ifolder = (IFolder) value;
					configuration.setAttribute(parameter.getName(), ifolder.getFullPath()
							.toString());
				} else {
					IProject iproject = (IProject) value;
					configuration.setAttribute(parameter.getName(), iproject.getName());
				}
			} else if (URI.class.isAssignableFrom(type)) {
				URI uri = (URI) value;
				if (uri.isPlatform()) {
					configuration.setAttribute(parameter.getName(), uri.toPlatformString(true));
				} else if (uri.isFile()) {
					configuration.setAttribute(parameter.getName(), uri.toFileString());
				} else {
					configuration.setAttribute(parameter.getName(), uri.toString());
				}
			} else {
				// Object not managed, we have to retrieve a ParameterFactory
				// from an extension point
				configuration.setAttribute(parameter.getName(), value.toString());
			}
		} else {
			configuration.removeAttribute(parameter.getName());
		}
	}

	public boolean canEdit(final DiscoveryParameterDisplay parameter) {
		boolean result = false;
		Class<?> type = parameter.getType();
		for (Class<?> keyType : this.getDiscovererCellEditors().keySet()) {
			if (keyType.isAssignableFrom(type)) {
				result = true;
			}
		}
		return result;
	}

	public CellEditor getCellEditor(final DiscoveryParameterDisplay parameter,
			final Composite parent) {
		CellEditor cellEditor = null;
		Class<?> type = parameter.getType();
		Class<? extends CellEditor> cellEditorClass = getDiscovererCellEditors().get(type);
		try {
			CellEditor cellEditorTemp = cellEditorClass.newInstance();
			cellEditorTemp.create(parent);
			cellEditor = cellEditorTemp;
		} catch (SecurityException e) {
			String message = "A problem occured when instantiating discoverer cell editor : " + cellEditorClass; //$NON-NLS-1$
			IStatus status = new Status(IStatus.WARNING, DiscoveryManager.PLUGIN_ID, message, e);
			DiscoveryManager.getDefault().getLog().log(status);
		} catch (IllegalArgumentException e) {
			String message = "A problem occured when instantiating discoverer cell editor : " + cellEditorClass; //$NON-NLS-1$
			IStatus status = new Status(IStatus.WARNING, DiscoveryManager.PLUGIN_ID, message, e);
			DiscoveryManager.getDefault().getLog().log(status);
		} catch (InstantiationException e) {
			String message = "A problem occured when instantiating discoverer cell editor : " + cellEditorClass; //$NON-NLS-1$
			IStatus status = new Status(IStatus.WARNING, DiscoveryManager.PLUGIN_ID, message, e);
			DiscoveryManager.getDefault().getLog().log(status);
		} catch (IllegalAccessException e) {
			String message = "A problem occured when instantiating discoverer cell editor : " + cellEditorClass; //$NON-NLS-1$
			IStatus status = new Status(IStatus.WARNING, DiscoveryManager.PLUGIN_ID, message, e);
			DiscoveryManager.getDefault().getLog().log(status);
		}
		return cellEditor;
	}

	public void initializeValueFromEditingSupport(final DiscoveryParameterDisplay parameter,
			final Object value) {
		parameter.setValue(value);
	}

	public Object retrieveValueForEditingSupport(final DiscoveryParameterDisplay parameter) {
		Object result = null;
		result = parameter.getValue();
		return result;
	}
}
