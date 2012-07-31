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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Discoverer</b></em>'. <!--
 * end-user-doc -->
 * 
 * <!-- begin-model-doc --> It represents a discoverer chain, from source code to Uml model. <!--
 * end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToKdm
 * <em>To Kdm</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToUml
 * <em>To Uml</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getKind
 * <em>Kind</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getName
 * <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexDiscoverer()
 * @model
 * @generated
 */
public interface ModelplexDiscoverer extends EObject {
	/**
	 * Returns the value of the '<em><b>To Kdm</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> link to root transformation from specific
	 * model to Kdm model. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>To Kdm</em>' containment reference.
	 * @see #setToKdm(ModelplexTransformation)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexDiscoverer_ToKdm()
	 * @model containment="true"
	 * @generated
	 */
	ModelplexTransformation getToKdm();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToKdm
	 * <em>To Kdm</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>To Kdm</em>' containment reference.
	 * @see #getToKdm()
	 * @generated
	 */
	void setToKdm(ModelplexTransformation value);

	/**
	 * Returns the value of the '<em><b>To Uml</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> link to root transformation from Kdm model
	 * to Uml model. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>To Uml</em>' containment reference.
	 * @see #setToUml(ModelplexTransformation)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexDiscoverer_ToUml()
	 * @model containment="true"
	 * @generated
	 */
	ModelplexTransformation getToUml();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToUml
	 * <em>To Uml</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>To Uml</em>' containment reference.
	 * @see #getToUml()
	 * @generated
	 */
	void setToUml(ModelplexTransformation value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute. The literals are from the
	 * enumeration
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind}
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
	 * @see #setKind(DiscovererKind)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexDiscoverer_Kind()
	 * @model
	 * @generated
	 */
	DiscovererKind getKind();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getKind
	 * <em>Kind</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DiscovererKind value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#getModelplexDiscoverer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModelplexDiscoverer
