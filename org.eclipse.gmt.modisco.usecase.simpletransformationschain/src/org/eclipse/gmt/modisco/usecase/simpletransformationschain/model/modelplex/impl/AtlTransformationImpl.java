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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Atl Transformation</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.AtlTransformationImpl#getTransformationPath
 * <em>Transformation Path</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.AtlTransformationImpl#isSelected
 * <em>Selected</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AtlTransformationImpl extends EObjectImpl implements AtlTransformation {
	/**
	 * The default value of the '{@link #getTransformationPath() <em>Transformation Path</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransformationPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationPath() <em>Transformation Path</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransformationPath()
	 * @generated
	 * @ordered
	 */
	protected String transformationPath = AtlTransformationImpl.TRANSFORMATION_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = AtlTransformationImpl.SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AtlTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelplexPackage.Literals.ATL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTransformationPath() {
		return this.transformationPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransformationPath(final String newTransformationPath) {
		String oldTransformationPath = this.transformationPath;
		this.transformationPath = newTransformationPath;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH,
					oldTransformationPath, this.transformationPath));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSelected() {
		return this.selected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSelected(final boolean newSelected) {
		boolean oldSelected = this.selected;
		this.selected = newSelected;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.ATL_TRANSFORMATION__SELECTED, oldSelected, this.selected));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH:
			return getTransformationPath();
		case ModelplexPackage.ATL_TRANSFORMATION__SELECTED:
			return isSelected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH:
			setTransformationPath((String) newValue);
			return;
		case ModelplexPackage.ATL_TRANSFORMATION__SELECTED:
			setSelected((Boolean) newValue);
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
		case ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH:
			setTransformationPath(AtlTransformationImpl.TRANSFORMATION_PATH_EDEFAULT);
			return;
		case ModelplexPackage.ATL_TRANSFORMATION__SELECTED:
			setSelected(AtlTransformationImpl.SELECTED_EDEFAULT);
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
		case ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH:
			return AtlTransformationImpl.TRANSFORMATION_PATH_EDEFAULT == null ? this.transformationPath != null
					: !AtlTransformationImpl.TRANSFORMATION_PATH_EDEFAULT
							.equals(this.transformationPath);
		case ModelplexPackage.ATL_TRANSFORMATION__SELECTED:
			return this.selected != AtlTransformationImpl.SELECTED_EDEFAULT;
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
		result.append(" (transformationPath: "); //$NON-NLS-1$
		result.append(this.transformationPath);
		result.append(", selected: "); //$NON-NLS-1$
		result.append(this.selected);
		result.append(')');
		return result.toString();
	}

} // AtlTransformationImpl
