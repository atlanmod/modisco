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
package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Atl Transformation</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> It represents a transformation (using ATL technology). <!--
 * end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#getTransformationPath
 * <em>Transformation Path</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#isSelected
 * <em>Selected</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getAtlTransformation()
 * @model
 * @generated
 */
public interface AtlTransformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation Path</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> It indicates absolute path of
	 * transformation file (*.asm). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Transformation Path</em>' attribute.
	 * @see #setTransformationPath(String)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getAtlTransformation_TransformationPath()
	 * @model
	 * @generated
	 */
	String getTransformationPath();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#getTransformationPath
	 * <em>Transformation Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transformation Path</em>' attribute.
	 * @see #getTransformationPath()
	 * @generated
	 */
	void setTransformationPath(String value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> To indicate if current transformation should be
	 * used in discoverer chain. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getAtlTransformation_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#isSelected
	 * <em>Selected</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // AtlTransformation
