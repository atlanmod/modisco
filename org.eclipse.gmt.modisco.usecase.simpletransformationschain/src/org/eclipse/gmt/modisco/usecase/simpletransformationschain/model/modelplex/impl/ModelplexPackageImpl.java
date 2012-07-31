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
package org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.AtlTransformation;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexFactory;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelplexPackageImpl extends EPackageImpl implements ModelplexPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelplexDiscovererEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelplexTransformationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass atlTransformationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum discovererKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
	 * value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init
	 * init()}, which also performs initialization of the package, or returns the registered
	 * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelplexPackageImpl() {
		super(ModelplexPackage.eNS_URI, ModelplexFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
	 * upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ModelplexPackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should simply access that
	 * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelplexPackage init() {
		if (ModelplexPackageImpl.isInited) {
			return (ModelplexPackage) EPackage.Registry.INSTANCE
					.getEPackage(ModelplexPackage.eNS_URI);
		}

		// Obtain or create and register package
		ModelplexPackageImpl theModelplexPackage = (ModelplexPackageImpl) (EPackage.Registry.INSTANCE
				.get(ModelplexPackage.eNS_URI) instanceof ModelplexPackageImpl ? EPackage.Registry.INSTANCE
				.get(ModelplexPackage.eNS_URI) : new ModelplexPackageImpl());

		ModelplexPackageImpl.isInited = true;

		// Create package meta-data objects
		theModelplexPackage.createPackageContents();

		// Initialize created meta-data
		theModelplexPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelplexPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelplexPackage.eNS_URI, theModelplexPackage);
		return theModelplexPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModelplexDiscoverer() {
		return this.modelplexDiscovererEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModelplexDiscoverer_ToKdm() {
		return (EReference) this.modelplexDiscovererEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModelplexDiscoverer_ToUml() {
		return (EReference) this.modelplexDiscovererEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModelplexDiscoverer_Kind() {
		return (EAttribute) this.modelplexDiscovererEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModelplexDiscoverer_Name() {
		return (EAttribute) this.modelplexDiscovererEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModelplexTransformation() {
		return this.modelplexTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModelplexTransformation_Custom() {
		return (EAttribute) this.modelplexTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModelplexTransformation_ChainedTransformations() {
		return (EReference) this.modelplexTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAtlTransformation() {
		return this.atlTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAtlTransformation_TransformationPath() {
		return (EAttribute) this.atlTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAtlTransformation_Selected() {
		return (EAttribute) this.atlTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getDiscovererKind() {
		return this.discovererKindEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelplexFactory getModelplexFactory() {
		return (ModelplexFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on
	 * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (this.isCreated) {
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.modelplexDiscovererEClass = createEClass(ModelplexPackage.MODELPLEX_DISCOVERER);
		createEReference(this.modelplexDiscovererEClass,
				ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM);
		createEReference(this.modelplexDiscovererEClass,
				ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML);
		createEAttribute(this.modelplexDiscovererEClass,
				ModelplexPackage.MODELPLEX_DISCOVERER__KIND);
		createEAttribute(this.modelplexDiscovererEClass,
				ModelplexPackage.MODELPLEX_DISCOVERER__NAME);

		this.modelplexTransformationEClass = createEClass(ModelplexPackage.MODELPLEX_TRANSFORMATION);
		createEAttribute(this.modelplexTransformationEClass,
				ModelplexPackage.MODELPLEX_TRANSFORMATION__CUSTOM);
		createEReference(this.modelplexTransformationEClass,
				ModelplexPackage.MODELPLEX_TRANSFORMATION__CHAINED_TRANSFORMATIONS);

		this.atlTransformationEClass = createEClass(ModelplexPackage.ATL_TRANSFORMATION);
		createEAttribute(this.atlTransformationEClass,
				ModelplexPackage.ATL_TRANSFORMATION__TRANSFORMATION_PATH);
		createEAttribute(this.atlTransformationEClass,
				ModelplexPackage.ATL_TRANSFORMATION__SELECTED);

		// Create enums
		this.discovererKindEEnum = createEEnum(ModelplexPackage.DISCOVERER_KIND);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have
	 * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (this.isInitialized) {
			return;
		}
		this.isInitialized = true;

		// Initialize package
		setName(ModelplexPackage.eNAME);
		setNsPrefix(ModelplexPackage.eNS_PREFIX);
		setNsURI(ModelplexPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.modelplexTransformationEClass.getESuperTypes().add(getAtlTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(this.modelplexDiscovererEClass, ModelplexDiscoverer.class,
				"ModelplexDiscoverer", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelplexDiscoverer_ToKdm(), getModelplexTransformation(), null, "toKdm", //$NON-NLS-1$
				null, 0, 1, ModelplexDiscoverer.class, !EPackageImpl.IS_TRANSIENT,
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				!EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getModelplexDiscoverer_ToUml(), getModelplexTransformation(), null, "toUml", //$NON-NLS-1$
				null, 0, 1, ModelplexDiscoverer.class, !EPackageImpl.IS_TRANSIENT,
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				!EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getModelplexDiscoverer_Kind(), getDiscovererKind(), "kind", null, 0, 1, //$NON-NLS-1$
				ModelplexDiscoverer.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE,
				EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getModelplexDiscoverer_Name(), this.ecorePackage.getEString(), "name", null, //$NON-NLS-1$
				0, 1, ModelplexDiscoverer.class, !EPackageImpl.IS_TRANSIENT,
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(this.modelplexTransformationEClass, ModelplexTransformation.class,
				"ModelplexTransformation", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelplexTransformation_Custom(), this.ecorePackage.getEBoolean(),
				"custom", null, 0, 1, ModelplexTransformation.class, !EPackageImpl.IS_TRANSIENT, //$NON-NLS-1$
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getModelplexTransformation_ChainedTransformations(), getAtlTransformation(),
				null, "chainedTransformations", null, 0, -1, ModelplexTransformation.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES,
				!EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(this.atlTransformationEClass, AtlTransformation.class, "AtlTransformation", //$NON-NLS-1$
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE,
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtlTransformation_TransformationPath(), this.ecorePackage.getEString(),
				"transformationPath", null, 0, 1, AtlTransformation.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getAtlTransformation_Selected(), this.ecorePackage.getEBoolean(),
				"selected", null, 0, 1, AtlTransformation.class, !EPackageImpl.IS_TRANSIENT, //$NON-NLS-1$
				!EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(this.discovererKindEEnum, DiscovererKind.class, "DiscovererKind"); //$NON-NLS-1$
		addEEnumLiteral(this.discovererKindEEnum, DiscovererKind.CSHARP);
		addEEnumLiteral(this.discovererKindEEnum, DiscovererKind.JAVA);

		// Create resource
		createResource(ModelplexPackage.eNS_URI);
	}

} // ModelplexPackageImpl
