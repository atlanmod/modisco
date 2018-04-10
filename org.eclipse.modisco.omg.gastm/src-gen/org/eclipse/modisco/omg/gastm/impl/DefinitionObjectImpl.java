/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modisco.omg.gastm.DefinitionObject;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DefinitionObjectImpl extends GASTMSyntaxObjectImpl implements DefinitionObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getDefinitionObject();
	}

} //DefinitionObjectImpl
