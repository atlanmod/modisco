/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.eclipse.gmt.modisco.xml.emf.impl.ElementImpl;
import org.eclipse.modisco.jee.jsp.JSPAction;
import org.eclipse.modisco.jee.jsp.JspPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSP Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.JSPActionImpl#isIsTagFragment <em>Is Tag Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSPActionImpl extends ElementImpl implements JSPAction {
	/**
	 * The default value of the '{@link #isIsTagFragment() <em>Is Tag Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTagFragment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TAG_FRAGMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTagFragment() <em>Is Tag Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTagFragment()
	 * @generated
	 * @ordered
	 */
	protected boolean isTagFragment = IS_TAG_FRAGMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSPActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JspPackage.Literals.JSP_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTagFragment() {
		return isTagFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTagFragment(boolean newIsTagFragment) {
		boolean oldIsTagFragment = isTagFragment;
		isTagFragment = newIsTagFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.JSP_ACTION__IS_TAG_FRAGMENT, oldIsTagFragment, isTagFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JspPackage.JSP_ACTION__IS_TAG_FRAGMENT:
				return isIsTagFragment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JspPackage.JSP_ACTION__IS_TAG_FRAGMENT:
				setIsTagFragment((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JspPackage.JSP_ACTION__IS_TAG_FRAGMENT:
				setIsTagFragment(IS_TAG_FRAGMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JspPackage.JSP_ACTION__IS_TAG_FRAGMENT:
				return isTagFragment != IS_TAG_FRAGMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTagFragment: "); //$NON-NLS-1$
		result.append(isTagFragment);
		result.append(')');
		return result.toString();
	}

} //JSPActionImpl
