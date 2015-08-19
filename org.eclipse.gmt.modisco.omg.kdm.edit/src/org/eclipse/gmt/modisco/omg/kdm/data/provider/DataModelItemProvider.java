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
package org.eclipse.gmt.modisco.omg.kdm.data.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmt.modisco.omg.kdm.core.provider.KdmEditPlugin;

import org.eclipse.gmt.modisco.omg.kdm.data.DataFactory;
import org.eclipse.gmt.modisco.omg.kdm.data.DataModel;
import org.eclipse.gmt.modisco.omg.kdm.data.DataPackage;

import org.eclipse.gmt.modisco.omg.kdm.kdm.provider.KDMModelItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.data.DataModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataModelItemProvider extends KDMModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT);
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
	 * This returns DataModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataModel")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataModel_type") : //$NON-NLS-1$
			getString("_UI_DataModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(DataModel.class)) {
			case DataPackage.DATA_MODEL__DATA_ELEMENT:
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
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createDataResource()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createIndexElement()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createReferenceKey()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createDataContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createRelationalSchema()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createRelationalTable()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createRelationalView()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createDataEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createXMLSchema()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createComplexContentType()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createAllContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createSeqContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createChoiceContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createContentItem()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createGroupContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createContentRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createSimpleContentType()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createExtendedDataElement()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createContentAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createDataSegment()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.DATA_MODEL__DATA_ELEMENT,
				 DataFactory.eINSTANCE.createContentElement()));
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
