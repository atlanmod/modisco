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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> To store informations of Modeplex discoveries.
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexFactory
 * @model kind="package"
 * @generated
 */
public interface ModelplexPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "modelplex"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://modelplex/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "modelplex"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ModelplexPackage eINSTANCE = org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl
	 * <em>Discoverer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getModelplexDiscoverer()
	 * @generated
	 */
	int MODELPLEX_DISCOVERER = 0;

	/**
	 * The feature id for the '<em><b>To Kdm</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_DISCOVERER__TO_KDM = 0;

	/**
	 * The feature id for the '<em><b>To Uml</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_DISCOVERER__TO_UML = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_DISCOVERER__KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_DISCOVERER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Discoverer</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_DISCOVERER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.AtlTransformationImpl
	 * <em>Atl Transformation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.AtlTransformationImpl
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getAtlTransformation()
	 * @generated
	 */
	int ATL_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Transformation Path</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATL_TRANSFORMATION__TRANSFORMATION_PATH = 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATL_TRANSFORMATION__SELECTED = 1;

	/**
	 * The number of structural features of the '<em>Atl Transformation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATL_TRANSFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexTransformationImpl
	 * <em>Transformation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexTransformationImpl
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getModelplexTransformation()
	 * @generated
	 */
	int MODELPLEX_TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Transformation Path</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_TRANSFORMATION__TRANSFORMATION_PATH = ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_TRANSFORMATION__SELECTED = ModelplexPackage.ATL_TRANSFORMATION__SELECTED;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_TRANSFORMATION__CUSTOM = ModelplexPackage.ATL_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chained Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS = ModelplexPackage.ATL_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELPLEX_TRANSFORMATION_FEATURE_COUNT = ModelplexPackage.ATL_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
	 * <em>Discoverer Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getDiscovererKind()
	 * @generated
	 */
	int DISCOVERER_KIND = 3;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer
	 * <em>Discoverer</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Discoverer</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer
	 * @generated
	 */
	EClass getModelplexDiscoverer();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToKdm
	 * <em>To Kdm</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>To Kdm</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToKdm()
	 * @see #getModelplexDiscoverer()
	 * @generated
	 */
	EReference getModelplexDiscoverer_ToKdm();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToUml
	 * <em>To Uml</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>To Uml</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getToUml()
	 * @see #getModelplexDiscoverer()
	 * @generated
	 */
	EReference getModelplexDiscoverer_ToUml();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getKind
	 * <em>Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getKind()
	 * @see #getModelplexDiscoverer()
	 * @generated
	 */
	EAttribute getModelplexDiscoverer_Kind();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer#getName()
	 * @see #getModelplexDiscoverer()
	 * @generated
	 */
	EAttribute getModelplexDiscoverer_Name();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation
	 * <em>Transformation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation
	 * @generated
	 */
	EClass getModelplexTransformation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#isCustom
	 * <em>Custom</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Custom</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#isCustom()
	 * @see #getModelplexTransformation()
	 * @generated
	 */
	EAttribute getModelplexTransformation_Custom();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#getChainedTransformations
	 * <em>Chained Transformations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Chained Transformations</em>
	 *         '.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation#getChainedTransformations()
	 * @see #getModelplexTransformation()
	 * @generated
	 */
	EReference getModelplexTransformation_ChainedTransformations();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation
	 * <em>Atl Transformation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Atl Transformation</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation
	 * @generated
	 */
	EClass getAtlTransformation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#getTransformationPath
	 * <em>Transformation Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Transformation Path</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#getTransformationPath()
	 * @see #getAtlTransformation()
	 * @generated
	 */
	EAttribute getAtlTransformation_TransformationPath();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#isSelected
	 * <em>Selected</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation#isSelected()
	 * @see #getAtlTransformation()
	 * @generated
	 */
	EAttribute getAtlTransformation_Selected();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
	 * <em>Discoverer Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Discoverer Kind</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
	 * @generated
	 */
	EEnum getDiscovererKind();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelplexFactory getModelplexFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl
		 * <em>Discoverer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getModelplexDiscoverer()
		 * @generated
		 */
		EClass MODELPLEX_DISCOVERER = ModelplexPackage.eINSTANCE.getModelplexDiscoverer();

		/**
		 * The meta object literal for the '<em><b>To Kdm</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODELPLEX_DISCOVERER__TO_KDM = ModelplexPackage.eINSTANCE
				.getModelplexDiscoverer_ToKdm();

		/**
		 * The meta object literal for the '<em><b>To Uml</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODELPLEX_DISCOVERER__TO_UML = ModelplexPackage.eINSTANCE
				.getModelplexDiscoverer_ToUml();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODELPLEX_DISCOVERER__KIND = ModelplexPackage.eINSTANCE
				.getModelplexDiscoverer_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODELPLEX_DISCOVERER__NAME = ModelplexPackage.eINSTANCE
				.getModelplexDiscoverer_Name();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexTransformationImpl
		 * <em>Transformation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexTransformationImpl
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getModelplexTransformation()
		 * @generated
		 */
		EClass MODELPLEX_TRANSFORMATION = ModelplexPackage.eINSTANCE.getModelplexTransformation();

		/**
		 * The meta object literal for the '<em><b>Custom</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODELPLEX_TRANSFORMATION__CUSTOM = ModelplexPackage.eINSTANCE
				.getModelplexTransformation_Custom();

		/**
		 * The meta object literal for the '<em><b>Chained Transformations</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS = ModelplexPackage.eINSTANCE
				.getModelplexTransformation_ChainedTransformations();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.AtlTransformationImpl
		 * <em>Atl Transformation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.AtlTransformationImpl
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getAtlTransformation()
		 * @generated
		 */
		EClass ATL_TRANSFORMATION = ModelplexPackage.eINSTANCE.getAtlTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformation Path</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATL_TRANSFORMATION__TRANSFORMATION_PATH = ModelplexPackage.eINSTANCE
				.getAtlTransformation_TransformationPath();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATL_TRANSFORMATION__SELECTED = ModelplexPackage.eINSTANCE
				.getAtlTransformation_Selected();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
		 * <em>Discoverer Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind
		 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexPackageImpl#getDiscovererKind()
		 * @generated
		 */
		EEnum DISCOVERER_KIND = ModelplexPackage.eINSTANCE.getDiscovererKind();

	}

} // ModelplexPackage
