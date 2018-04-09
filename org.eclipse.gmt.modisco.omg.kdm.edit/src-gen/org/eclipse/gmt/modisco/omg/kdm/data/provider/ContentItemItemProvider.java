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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmt.modisco.omg.kdm.action.ActionFactory;

import org.eclipse.gmt.modisco.omg.kdm.core.provider.KDMEntityItemProvider;
import org.eclipse.gmt.modisco.omg.kdm.core.provider.KdmEditPlugin;

import org.eclipse.gmt.modisco.omg.kdm.data.ContentItem;
import org.eclipse.gmt.modisco.omg.kdm.data.DataFactory;
import org.eclipse.gmt.modisco.omg.kdm.data.DataPackage;

import org.eclipse.gmt.modisco.omg.kdm.source.SourceFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.data.ContentItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentItemItemProvider extends KDMEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentItemItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentItem_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentItem_type_feature", "_UI_ContentItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DataPackage.Literals.CONTENT_ITEM__TYPE,
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
			childrenFeatures.add(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__SOURCE);
			childrenFeatures.add(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION);
			childrenFeatures.add(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION);
			childrenFeatures.add(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT);
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
	 * This returns ContentItem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentItem")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContentItem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentItem_type") : //$NON-NLS-1$
			getString("_UI_ContentItem_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ContentItem.class)) {
			case DataPackage.CONTENT_ITEM__SOURCE:
			case DataPackage.CONTENT_ITEM__DATA_RELATION:
			case DataPackage.CONTENT_ITEM__ABSTRACTION:
			case DataPackage.CONTENT_ITEM__CONTENT_ELEMENT:
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
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__SOURCE,
				 SourceFactory.eINSTANCE.createSourceRef()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createKeyRelation()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createDataRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createTypedBy()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createReferenceTo()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createRestrictionOf()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createExtensionTo()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__DATA_RELATION,
				 DataFactory.eINSTANCE.createDatatypeOf()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createActionElement()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createBlockUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createExceptionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createTryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createCatchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.ABSTRACT_DATA_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createFinallyUnit()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createComplexContentType()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createAllContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createSeqContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createChoiceContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createContentItem()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createGroupContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createContentRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createSimpleContentType()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
				 DataFactory.eINSTANCE.createContentAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.CONTENT_ITEM__CONTENT_ELEMENT,
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
