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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodePackage;

import org.eclipse.gmt.modisco.omg.kdm.core.provider.KDMEntityItemProvider;
import org.eclipse.gmt.modisco.omg.kdm.core.provider.KdmEditPlugin;

import org.eclipse.gmt.modisco.omg.kdm.source.SourceFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractCodeElementItemProvider extends KDMEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeElementItemProvider(AdapterFactory adapterFactory) {
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

			addEntryFlowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entry Flow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryFlowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractCodeElement_entryFlow_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCodeElement_entryFlow_feature", "_UI_AbstractCodeElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CodePackage.Literals.ABSTRACT_CODE_ELEMENT__ENTRY_FLOW,
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
			childrenFeatures.add(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__SOURCE);
			childrenFeatures.add(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__COMMENT);
			childrenFeatures.add(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractCodeElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractCodeElement_type") : //$NON-NLS-1$
			getString("_UI_AbstractCodeElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(AbstractCodeElement.class)) {
			case CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE:
			case CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT:
			case CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
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
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__SOURCE,
				 SourceFactory.eINSTANCE.createSourceRef()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__COMMENT,
				 CodeFactory.eINSTANCE.createCommentUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createParameterTo()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createImplements()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createImplementationOf()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createHasType()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createExtends()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createExpands()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createGeneratedFrom()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createIncludes()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createVariantTo()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createRedefines()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createVisibleIn()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createImports()));

		newChildDescriptors.add
			(createChildParameter
				(CodePackage.Literals.ABSTRACT_CODE_ELEMENT__CODE_RELATION,
				 CodeFactory.eINSTANCE.createCodeRelationship()));
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
