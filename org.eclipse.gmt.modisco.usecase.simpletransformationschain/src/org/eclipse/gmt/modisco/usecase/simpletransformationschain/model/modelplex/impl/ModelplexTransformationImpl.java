/**
 * ******************************************************************************
 *  Copyright (c) 2009, 2011 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 * ******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexTransformationImpl#isCustom
 * <em>Custom</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexTransformationImpl#getChainedTransformations
 * <em>Chained Transformations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ModelplexTransformationImpl extends AtlTransformationImpl implements
		ModelplexTransformation {
	/**
	 * The default value of the '{@link #isCustom() <em>Custom</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #isCustom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustom() <em>Custom</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #isCustom()
	 * @generated
	 * @ordered
	 */
	protected boolean custom = ModelplexTransformationImpl.CUSTOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChainedTransformations()
	 * <em>Chained Transformations</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getChainedTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<AtlTransformation> chainedTransformations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModelplexTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelplexPackage.Literals.MODELPLEX_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCustom() {
		return this.custom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCustom(final boolean newCustom) {
		boolean oldCustom = this.custom;
		this.custom = newCustom;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_TRANSFORMATION__CUSTOM, oldCustom, this.custom));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<AtlTransformation> getChainedTransformations() {
		if (this.chainedTransformations == null) {
			this.chainedTransformations = new EObjectContainmentEList<AtlTransformation>(
					AtlTransformation.class, this,
					ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS);
		}
		return this.chainedTransformations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS:
			return ((InternalEList<?>) getChainedTransformations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CUSTOM:
			return isCustom();
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS:
			return getChainedTransformations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CUSTOM:
			setCustom((Boolean) newValue);
			return;
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS:
			getChainedTransformations().clear();
			getChainedTransformations().addAll((Collection<? extends AtlTransformation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CUSTOM:
			setCustom(ModelplexTransformationImpl.CUSTOM_EDEFAULT);
			return;
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS:
			getChainedTransformations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CUSTOM:
			return this.custom != ModelplexTransformationImpl.CUSTOM_EDEFAULT;
		case ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS:
			return this.chainedTransformations != null && !this.chainedTransformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (custom: "); //$NON-NLS-1$
		result.append(this.custom);
		result.append(')');
		return result.toString();
	}

} // ModelplexTransformationImpl
