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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> It represents root transformations in discoverer chain. These root
 * transformations cannot being deselected, yet they are customizable. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#isCustom
 * <em>Custom</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#getChainedTransformations
 * <em>Chained Transformations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexTransformation()
 * @model
 * @generated
 */
public interface ModelplexTransformation extends AtlTransformation {
	/**
	 * Returns the value of the '<em><b>Custom</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> It indicates if it is the default root
	 * transformation or a customized one (if customized, a transformation path shall have been
	 * provided). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Custom</em>' attribute.
	 * @see #setCustom(boolean)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexTransformation_Custom()
	 * @model
	 * @generated
	 */
	boolean isCustom();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#isCustom
	 * <em>Custom</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Custom</em>' attribute.
	 * @see #isCustom()
	 * @generated
	 */
	void setCustom(boolean value);

	/**
	 * Returns the value of the '<em><b>Chained Transformations</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation}
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chained Transformations</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Chained Transformations</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexTransformation_ChainedTransformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtlTransformation> getChainedTransformations();

} // ModelplexTransformation
