/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.kdm.browser.extension.platform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.AbstractNameProvider;
import org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformElement;
import org.eclipse.gmt.modisco.omg.kdm.platform.AbstractPlatformRelationship;
import org.eclipse.gmt.modisco.omg.kdm.platform.BindsTo;
import org.eclipse.gmt.modisco.omg.kdm.platform.DataManager;
import org.eclipse.gmt.modisco.omg.kdm.platform.DefinedBy;
import org.eclipse.gmt.modisco.omg.kdm.platform.DeployedComponent;
import org.eclipse.gmt.modisco.omg.kdm.platform.DeployedResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.DeployedSoftwareSystem;
import org.eclipse.gmt.modisco.omg.kdm.platform.ExecutionResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.ExternalActor;
import org.eclipse.gmt.modisco.omg.kdm.platform.FileResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Loads;
import org.eclipse.gmt.modisco.omg.kdm.platform.LockResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Machine;
import org.eclipse.gmt.modisco.omg.kdm.platform.ManagesResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.MarshalledResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.MessagingResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.NamingResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformAction;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformElement;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformEvent;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformModel;
import org.eclipse.gmt.modisco.omg.kdm.platform.PlatformRelationship;
import org.eclipse.gmt.modisco.omg.kdm.platform.Process;
import org.eclipse.gmt.modisco.omg.kdm.platform.ReadsResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Requires;
import org.eclipse.gmt.modisco.omg.kdm.platform.ResourceType;
import org.eclipse.gmt.modisco.omg.kdm.platform.RuntimeResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Spawns;
import org.eclipse.gmt.modisco.omg.kdm.platform.StreamResource;
import org.eclipse.gmt.modisco.omg.kdm.platform.Thread;
import org.eclipse.gmt.modisco.omg.kdm.platform.WritesResource;

/**
 * @generated
 */
public class NameProvider extends AbstractNameProvider {
	// Start of user code for additional methods and attributes

	// End of user code

	// Start of user code name attribute for Process
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getProcessName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Thread
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getThreadName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for NamingResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getNamingResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MarshalledResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMarshalledResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MessagingResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMessagingResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for FileResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getFileResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ExecutionResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExecutionResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for LockResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getLockResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for StreamResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getStreamResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataManager
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataManagerName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PlatformEvent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPlatformEventName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ExternalActor
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExternalActorName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RuntimeResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRuntimeResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PlatformModel
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPlatformModelName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ResourceType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getResourceTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PlatformAction
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPlatformActionName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for BindsTo
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getBindsToName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Requires
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRequiresName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ManagesResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getManagesResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ReadsResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getReadsResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for WritesResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getWritesResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DefinedBy
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDefinedByName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DeployedComponent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDeployedComponentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DeployedSoftwareSystem
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDeployedSoftwareSystemName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Machine
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMachineName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DeployedResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDeployedResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Loads
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getLoadsName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Spawns
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSpawnsName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PlatformElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPlatformElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PlatformRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPlatformRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractPlatformElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractPlatformElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractPlatformRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractPlatformRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code

	/**
	 * @generated
	 */
	public NameProvider() {
		//
	}

	/**
	 * @return the name that must be displayed for the given {@link EObject}, or
	 *         <code>null</code> to keep the default name (or let another
	 *         {@link NameProvider} provide the name)
	 * 
	 * @generated
	 */
	public String getName(final EObject eObject) {
		String result = getDefaultName(eObject);
		if (eObject instanceof Process) {
			result = getProcessName(eObject);
		} else if (eObject instanceof Thread) {
			result = getThreadName(eObject);
		} else if (eObject instanceof NamingResource) {
			result = getNamingResourceName(eObject);
		} else if (eObject instanceof MarshalledResource) {
			result = getMarshalledResourceName(eObject);
		} else if (eObject instanceof MessagingResource) {
			result = getMessagingResourceName(eObject);
		} else if (eObject instanceof FileResource) {
			result = getFileResourceName(eObject);
		} else if (eObject instanceof ExecutionResource) {
			result = getExecutionResourceName(eObject);
		} else if (eObject instanceof LockResource) {
			result = getLockResourceName(eObject);
		} else if (eObject instanceof StreamResource) {
			result = getStreamResourceName(eObject);
		} else if (eObject instanceof DataManager) {
			result = getDataManagerName(eObject);
		} else if (eObject instanceof PlatformEvent) {
			result = getPlatformEventName(eObject);
		} else if (eObject instanceof ExternalActor) {
			result = getExternalActorName(eObject);
		} else if (eObject instanceof RuntimeResource) {
			result = getRuntimeResourceName(eObject);
		} else if (eObject instanceof PlatformModel) {
			result = getPlatformModelName(eObject);
		} else if (eObject instanceof ResourceType) {
			result = getResourceTypeName(eObject);
		} else if (eObject instanceof PlatformAction) {
			result = getPlatformActionName(eObject);
		} else if (eObject instanceof BindsTo) {
			result = getBindsToName(eObject);
		} else if (eObject instanceof Requires) {
			result = getRequiresName(eObject);
		} else if (eObject instanceof ManagesResource) {
			result = getManagesResourceName(eObject);
		} else if (eObject instanceof ReadsResource) {
			result = getReadsResourceName(eObject);
		} else if (eObject instanceof WritesResource) {
			result = getWritesResourceName(eObject);
		} else if (eObject instanceof DefinedBy) {
			result = getDefinedByName(eObject);
		} else if (eObject instanceof DeployedComponent) {
			result = getDeployedComponentName(eObject);
		} else if (eObject instanceof DeployedSoftwareSystem) {
			result = getDeployedSoftwareSystemName(eObject);
		} else if (eObject instanceof Machine) {
			result = getMachineName(eObject);
		} else if (eObject instanceof DeployedResource) {
			result = getDeployedResourceName(eObject);
		} else if (eObject instanceof Loads) {
			result = getLoadsName(eObject);
		} else if (eObject instanceof Spawns) {
			result = getSpawnsName(eObject);
		} else if (eObject instanceof PlatformElement) {
			result = getPlatformElementName(eObject);
		} else if (eObject instanceof PlatformRelationship) {
			result = getPlatformRelationshipName(eObject);
		} else if (eObject instanceof AbstractPlatformElement) {
			result = getAbstractPlatformElementName(eObject);
		} else if (eObject instanceof AbstractPlatformRelationship) {
			result = getAbstractPlatformRelationshipName(eObject);
		}
		return result;
	}

}
