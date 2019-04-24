/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.CompositeType#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getCompositeType()
 * @model
 * @generated
 */
public interface CompositeType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Item Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.code.ItemUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Unit</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getCompositeType_ItemUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemUnit> getItemUnit();

} // CompositeType
