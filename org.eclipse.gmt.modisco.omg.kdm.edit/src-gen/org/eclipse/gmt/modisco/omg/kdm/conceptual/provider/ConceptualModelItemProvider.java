/**
 * Copyright (c) 2009 Hatha Systems, and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 */
package org.eclipse.gmt.modisco.omg.kdm.conceptual.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualFactory;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualModel;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage;

import org.eclipse.gmt.modisco.omg.kdm.core.provider.KdmEditPlugin;

import org.eclipse.gmt.modisco.omg.kdm.kdm.provider.KDMModelItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualModelItemProvider extends KDMModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConceptualModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConceptualModel")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConceptualModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConceptualModel_type") : //$NON-NLS-1$
			getString("_UI_ConceptualModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConceptualModel.class)) {
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createTermUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createConceptualContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createFactUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createBehaviorUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createRuleUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createScenarioUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createConceptualElement()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT,
				 ConceptualFactory.eINSTANCE.createConceptualRole()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KdmEditPlugin.INSTANCE;
	}

}
