/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.java.nousages.cdo.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.WildCardType;
import org.eclipse.gmt.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Wild Card Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.java.nousages.cdo.impl.WildCardTypeImpl#isUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.java.nousages.cdo.impl.WildCardTypeImpl#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WildCardTypeImpl extends TypeImpl implements WildCardType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WildCardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getWildCardType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpperBound() {
		return (Boolean)eGet(JavaPackage.eINSTANCE.getWildCardType_UpperBound(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(boolean newUpperBound) {
		eSet(JavaPackage.eINSTANCE.getWildCardType_UpperBound(), newUpperBound);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess getBound() {
		return (TypeAccess)eGet(JavaPackage.eINSTANCE.getWildCardType_Bound(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(TypeAccess newBound) {
		eSet(JavaPackage.eINSTANCE.getWildCardType_Bound(), newBound);
	}

	public EList<TypeAccess> getUsagesInTypeAccess() {
		// no usages references
		return null;
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usages references
		return null;
	}

} // WildCardTypeImpl
