/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.FeatureValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.FeatureValue#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValue()
 * @model abstract="true"
 * @generated
 */
public interface FeatureValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValue_Feature()
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature#getDefaultValue
	 * @model opposite="defaultValue" transient="false" changeable="false"
	 * @generated
	 */
	CustomViewFeature getFeature();

	/**
	 * Returns the value of the '<em><b>Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.infra.browser.custom.FeatureValueCase#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' container reference.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getFeatureValue_Case()
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.FeatureValueCase#getValue
	 * @model opposite="value" transient="false" changeable="false"
	 * @generated
	 */
	FeatureValueCase getCase();

} // FeatureValue
