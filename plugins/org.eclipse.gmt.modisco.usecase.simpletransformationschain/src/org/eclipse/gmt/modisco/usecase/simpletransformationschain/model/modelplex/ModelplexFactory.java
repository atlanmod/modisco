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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage
 * @generated
 */
public interface ModelplexFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ModelplexFactory eINSTANCE = org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Discoverer</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Discoverer</em>'.
	 * @generated
	 */
	ModelplexDiscoverer createModelplexDiscoverer();

	/**
	 * Returns a new object of class '<em>Transformation</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	ModelplexTransformation createModelplexTransformation();

	/**
	 * Returns a new object of class '<em>Atl Transformation</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Atl Transformation</em>'.
	 * @generated
	 */
	AtlTransformation createAtlTransformation();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelplexPackage getModelplexPackage();

} // ModelplexFactory
