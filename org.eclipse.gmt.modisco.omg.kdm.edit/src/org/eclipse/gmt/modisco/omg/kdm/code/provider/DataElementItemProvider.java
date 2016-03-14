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
package org.eclipse.gmt.modisco.omg.kdm.code.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodePackage;
import org.eclipse.gmt.modisco.omg.kdm.code.DataElement;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataElementItemProvider extends ComputationalObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementItemProvider(AdapterFactory adapterFactory) {
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
			addExtPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
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
				 getString("_UI_DataElement_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DataElement_type_feature", "_UI_DataElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CodePackage.Literals.DATA_ELEMENT__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ext feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataElement_ext_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DataElement_ext_feature", "_UI_DataElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CodePackage.Literals.DATA_ELEMENT__EXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataElement_size_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DataElement_size_feature", "_UI_DataElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CodePackage.Literals.DATA_ELEMENT__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT);
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
	 * This returns DataElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataElement")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataElement_type") : //$NON-NLS-1$
			getString("_UI_DataElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(DataElement.class)) {
			case CodePackage.DATA_ELEMENT__EXT:
			case CodePackage.DATA_ELEMENT__SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodePackage.DATA_ELEMENT__CODE_ELEMENT:
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
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCharType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createOrdinalType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDecimalType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createScaledType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createFloatType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBitType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBitstringType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createOctetType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createOctetstringType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createEnumeratedType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createChoiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createRecordType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDerivedType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createRangeType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBagType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTypeUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSynonymUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createClassUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createInterfaceUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTemplateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.DATA_ELEMENT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTemplateType()));
	}

}
