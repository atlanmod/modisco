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
package org.eclipse.gmt.modisco.omg.kdm.event.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.gmt.modisco.omg.kdm.event.AbstractEventRelationship;
import org.eclipse.gmt.modisco.omg.kdm.event.Event;
import org.eclipse.gmt.modisco.omg.kdm.event.EventAction;
import org.eclipse.gmt.modisco.omg.kdm.event.EventPackage;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.event.impl.EventActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.event.impl.EventActionImpl#getEventRelation <em>Event Relation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.event.impl.EventActionImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.event.impl.EventActionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.event.impl.EventActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.event.impl.EventActionImpl#getEventElement <em>Event Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventActionImpl extends KDMEntityImpl implements EventAction {
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
	 * The cached value of the '{@link #getEventRelation() <em>Event Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEventRelationship> eventRelation;

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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> implementation;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventElement() <em>Event Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> eventElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventPackage.Literals.EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, EventPackage.EVENT_ACTION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEventRelationship> getEventRelation() {
		if (eventRelation == null) {
			eventRelation = new EObjectContainmentEList<AbstractEventRelationship>(AbstractEventRelationship.class, this, EventPackage.EVENT_ACTION__EVENT_RELATION);
		}
		return eventRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, EventPackage.EVENT_ACTION__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, EventPackage.EVENT_ACTION__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT_ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEventElement() {
		if (eventElement == null) {
			eventElement = new EObjectContainmentEList<Event>(Event.class, this, EventPackage.EVENT_ACTION__EVENT_ELEMENT);
		}
		return eventElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventPackage.EVENT_ACTION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				return ((InternalEList<?>)getEventRelation()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
				return ((InternalEList<?>)getEventElement()).basicRemove(otherEnd, msgs);
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
			case EventPackage.EVENT_ACTION__SOURCE:
				return getSource();
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				return getEventRelation();
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				return getAbstraction();
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				return getImplementation();
			case EventPackage.EVENT_ACTION__KIND:
				return getKind();
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
				return getEventElement();
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
			case EventPackage.EVENT_ACTION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				getEventRelation().clear();
				getEventRelation().addAll((Collection<? extends AbstractEventRelationship>)newValue);
				return;
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case EventPackage.EVENT_ACTION__KIND:
				setKind((String)newValue);
				return;
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
				getEventElement().clear();
				getEventElement().addAll((Collection<? extends Event>)newValue);
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
			case EventPackage.EVENT_ACTION__SOURCE:
				getSource().clear();
				return;
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				getEventRelation().clear();
				return;
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				getAbstraction().clear();
				return;
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case EventPackage.EVENT_ACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
				getEventElement().clear();
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
			case EventPackage.EVENT_ACTION__SOURCE:
				return source != null && !source.isEmpty();
			case EventPackage.EVENT_ACTION__EVENT_RELATION:
				return eventRelation != null && !eventRelation.isEmpty();
			case EventPackage.EVENT_ACTION__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case EventPackage.EVENT_ACTION__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case EventPackage.EVENT_ACTION__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case EventPackage.EVENT_ACTION__EVENT_ELEMENT:
				return eventElement != null && !eventElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //EventActionImpl
