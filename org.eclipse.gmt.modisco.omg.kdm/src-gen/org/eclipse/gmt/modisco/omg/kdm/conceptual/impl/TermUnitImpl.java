/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.conceptual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualRelationship;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.TermUnit;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.impl.TermUnitImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.impl.TermUnitImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.impl.TermUnitImpl#getConceptualRelation <em>Conceptual Relation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.impl.TermUnitImpl#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermUnitImpl extends KDMEntityImpl implements TermUnit {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> implementation;

	/**
	 * The cached value of the '{@link #getConceptualRelation() <em>Conceptual Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConceptualRelationship> conceptualRelation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.TERM_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, ConceptualPackage.TERM_UNIT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, ConceptualPackage.TERM_UNIT__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConceptualRelationship> getConceptualRelation() {
		if (conceptualRelation == null) {
			conceptualRelation = new EObjectContainmentEList<AbstractConceptualRelationship>(AbstractConceptualRelationship.class, this, ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION);
		}
		return conceptualRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, ConceptualPackage.TERM_UNIT__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				return ((InternalEList<?>)getConceptualRelation()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
				return getSource();
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				return getImplementation();
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				return getConceptualRelation();
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				return getAbstraction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				getConceptualRelation().addAll((Collection<? extends AbstractConceptualRelationship>)newValue);
				return;
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
				getSource().clear();
				return;
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				return;
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				getAbstraction().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
				return source != null && !source.isEmpty();
			case ConceptualPackage.TERM_UNIT__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
				return conceptualRelation != null && !conceptualRelation.isEmpty();
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermUnitImpl
