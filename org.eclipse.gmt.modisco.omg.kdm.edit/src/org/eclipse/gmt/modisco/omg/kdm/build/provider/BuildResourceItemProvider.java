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
package org.eclipse.gmt.modisco.omg.kdm.build.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmt.modisco.omg.kdm.build.BuildFactory;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildResource;

import org.eclipse.gmt.modisco.omg.kdm.core.provider.KDMEntityItemProvider;
import org.eclipse.gmt.modisco.omg.kdm.core.provider.KdmEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.build.BuildResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildResourceItemProvider extends KDMEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildResourceItemProvider(AdapterFactory adapterFactory) {
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

			addImplementationPropertyDescriptor(object);
			addGroupedBuildPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BuildResource_implementation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BuildResource_implementation_feature", "_UI_BuildResource_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 BuildPackage.Literals.BUILD_RESOURCE__IMPLEMENTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grouped Build feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupedBuildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BuildResource_groupedBuild_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BuildResource_groupedBuild_feature", "_UI_BuildResource_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 BuildPackage.Literals.BUILD_RESOURCE__GROUPED_BUILD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION);
			childrenFeatures.add(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT);
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
	 * This returns BuildResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BuildResource")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BuildResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BuildResource_type") : //$NON-NLS-1$
			getString("_UI_BuildResource_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(BuildResource.class)) {
			case BuildPackage.BUILD_RESOURCE__BUILD_RELATION:
			case BuildPackage.BUILD_RESOURCE__BUILD_ELEMENT:
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
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createLinksTo()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createConsumes()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createBuildRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createSuppliedBy()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createProduces()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createSupportedBy()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.ABSTRACT_BUILD_ELEMENT__BUILD_RELATION,
				 BuildFactory.eINSTANCE.createDescribedBy()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildResource()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createSymbolicLink()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createSupplier()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildElement()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildStep()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_RESOURCE__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildProduct()));
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
