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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getMacroUnit()
 * @model
 * @generated
 */
public interface MacroUnit extends PreprocessorDirective {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.modisco.omg.kdm.code.MacroKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroKind
	 * @see #setKind(MacroKind)
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getMacroUnit_Kind()
	 * @model
	 * @generated
	 */
	MacroKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.MacroKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MacroKind value);

} // MacroUnit
