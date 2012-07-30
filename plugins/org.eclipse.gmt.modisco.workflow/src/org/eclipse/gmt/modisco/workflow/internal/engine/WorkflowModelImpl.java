/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow.internal.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.Activator;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.Messages;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.WorkflowModelEvents;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.WorkflowImpl;


/** @deprecated */
@Deprecated
public class WorkflowModelImpl extends WorkflowImpl implements WorkflowModel {

	private final WorkflowModelNotifier notifier = new WorkflowModelNotifier();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEventsSubscribe#subscribe(
	 * org.eclipse.debug.ui.workflow.WorkflowModelEvents)
	 */
	public void subscribe(final WorkflowModelEvents listener) {
		this.notifier.subscribe(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEventsSubscribe#unsubscribe
	 * (org.eclipse.debug.ui.workflow.WorkflowModelEvents)
	 */
	public void unsubscribe(final WorkflowModelEvents listener) {
		this.notifier.unsubscribe(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.workflow.WorkflowModel#getElement(int)
	 */
	public Element getElement(final int index) {
		return getElements().get(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.workflow.WorkflowModel#getAllElements()
	 */
	public List<Element> getAllElements() {
		return getElements();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModel#addElement(org.eclipse.debug
	 * .ui.workflow.model.workflow.Element)
	 */
	public void addElement(final Element element) {
		getElements().add(element);
		this.notifier.notifyElementAdded(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.workflow.WorkflowModel#setElement(int,
	 * org.eclipse.debug.ui.workflow.model.workflow.Element)
	 */
	public void setElement(final int index, final Element element) {
		getElements().set(index, element);
		this.notifier.notifyElementInserted(index, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.workflow.WorkflowModel#upElement(int)
	 */
	public void upElement(final int indexSelected) {
		Element element = getElements().get(indexSelected);
		element.setIndex(indexSelected - 1);
		Element alterElement = getElements().get(indexSelected - 1);
		alterElement.setIndex(indexSelected);
		getElements().set(indexSelected - 1, element);
		getElements().set(indexSelected, alterElement);

		this.notifier.notifyElementInserted(indexSelected, alterElement);
		this.notifier.notifyElementInserted(indexSelected - 1, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.workflow.WorkflowModel#downElement(int)
	 */
	public void downElement(final int indexSelected) {
//		Element element = this.getElements().get(indexSelected);
//		element.setIndex(indexSelected + 1);
//		Element alterElement = this.getElements().get(indexSelected + 1);
//		alterElement.setIndex(indexSelected);
//		this.getElements().set(indexSelected + 1, element);
//		this.getElements().set(indexSelected, alterElement);

//		this.notifier.notifyElementInserted(indexSelected, alterElement);
//		this.notifier.notifyElementInserted(indexSelected + 1, element);
		getElements().move(indexSelected + 1, indexSelected);
		this.notifier.notifyElementInserted(indexSelected, getElement(indexSelected));
		this.notifier.notifyElementInserted(indexSelected + 1, getElement(indexSelected + 1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.workflow.WorkflowModel#removeElement(int)
	 */
	public void removeElement(final int index) {
		getElements().remove(index);
		this.notifier.notifyElementRemoved(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModel#initialization(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@SuppressWarnings("unchecked")
	public void initialization(final ILaunchConfiguration configuration) {
		try {
			setName(configuration.getName());
			
			// list of work
			getElements().clear();
			getElements().addAll(
					stringListToElementList(configuration.getAttribute(
							Constants.attributeWorkflowListMinimalist, new ArrayList<String>())));
			for (Element element : getElements()) {
				this.notifier.notifyElementAdded(element);
			}
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					Messages.WorkflowModelImpl_unknownError, e);
			Activator.getDefault().getLog().log(status);
		}
	}

	/**
	 * Allows to transform a string list to element list
	 * 
	 * @param stringList
	 *            String list source
	 * @return Created element list
	 */
	private final List<Element> stringListToElementList(final List<String> stringList) {
		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < stringList.size(); i = i + 3) {
			Element element = null;
			// if it'is a Composite
			if (stringList.get(i + 2).equals(Constants.launchTypeOfWorkflow)) {
				element = ModiscoworkflowFactory.eINSTANCE.createWorkflow();
			} else {
				element = ModiscoworkflowFactory.eINSTANCE.createWork();
			}
			element.setName(stringList.get(i));
			element.setIndex(Integer.parseInt(stringList.get(i + 1)));
			element.setType(stringList.get(i + 2));
			elements.add(element);
		}
		return elements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModel#save(org.eclipse.debug.core
	 * .ILaunchConfigurationWorkingCopy)
	 */
	public void save(final ILaunchConfigurationWorkingCopy configuration) {
		// adjust the name (in the model)
		setName(configuration.getName());
		// update the list of works (from the model)
		List<String> listString = new ArrayList<String>();
		for (Element element : getElements()) {
			listString.add(element.getName());
			listString.add(Integer.toString(element.getIndex()));
			listString.add(element.getType());
		}
		configuration.setAttribute(Constants.attributeWorkflowListMinimalist, listString);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#moveResource(java.lang.String)
	 */
	public void moveResource(final String path) {
		assert (true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#removeResource(java.lang.String)
	 */
	public void removeResource(final String resourcePath) {
		assert (true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#exportWorkflow(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String)
	 */
	public void exportWorkflow(final URI outputUri) {
		Resource resource = null;
		ResourceSet resSet = new ResourceSetImpl();
		resource = resSet.createResource(outputUri);
		resource.getContents().add(this);
		try {
			resource.save(null);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#synchronization(java.util.List)
	 */
	public void synchronization(final List<Element> elements) {
		assert (true);
	}

}
