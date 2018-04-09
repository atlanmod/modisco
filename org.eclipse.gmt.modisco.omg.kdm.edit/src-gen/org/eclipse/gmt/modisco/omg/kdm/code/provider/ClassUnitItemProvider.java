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

import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassUnitItemProvider extends DatatypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUnitItemProvider(AdapterFactory adapterFactory) {
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

			addIsAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassUnit_isAbstract_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassUnit_isAbstract_feature", "_UI_ClassUnit_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CodePackage.Literals.CLASS_UNIT__IS_ABSTRACT,
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
			childrenFeatures.add(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT);
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
	 * This returns ClassUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassUnit")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassUnit_type") : //$NON-NLS-1$
			getString("_UI_ClassUnit_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ClassUnit.class)) {
			case CodePackage.CLASS_UNIT__IS_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodePackage.CLASS_UNIT__CODE_ELEMENT:
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
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createComputationalObject()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCompilationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSharedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createLanguageUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCodeAssembly()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createControlElement()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCallableUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createMethodUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDataElement()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createStorableUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createItemUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createIndexUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createMemberUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createParameterUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createValueList()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCharType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createOrdinalType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDecimalType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createScaledType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createFloatType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBitType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBitstringType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createOctetType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createOctetstringType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createEnumeratedType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCompositeType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createChoiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createRecordType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createDerivedType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createRangeType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createBagType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTypeUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createSynonymUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createClassUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createInterfaceUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTemplateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createTemplateType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.CLASS_UNIT__CODE_ELEMENT,
				 CodeFactory.eINSTANCE.createCodeElement()));
	}

}
