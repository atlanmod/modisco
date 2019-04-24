/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp25.JspConfigType;
import org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp25.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jsp Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspConfigTypeImpl#getTaglib <em>Taglib</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspConfigTypeImpl#getJspPropertyGroup <em>Jsp Property Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspConfigTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JspConfigTypeImpl extends EObjectImpl implements JspConfigType {
	/**
	 * The cached value of the '{@link #getTaglib() <em>Taglib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaglib()
	 * @generated
	 * @ordered
	 */
	protected EList<TaglibType> taglib;

	/**
	 * The cached value of the '{@link #getJspPropertyGroup() <em>Jsp Property Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJspPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<JspPropertyGroupType> jspPropertyGroup;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JspConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.JSP_CONFIG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaglibType> getTaglib() {
		if (taglib == null) {
			taglib = new EObjectContainmentEList<TaglibType>(TaglibType.class, this, Webapp25Package.JSP_CONFIG_TYPE__TAGLIB);
		}
		return taglib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JspPropertyGroupType> getJspPropertyGroup() {
		if (jspPropertyGroup == null) {
			jspPropertyGroup = new EObjectContainmentEList<JspPropertyGroupType>(JspPropertyGroupType.class, this, Webapp25Package.JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP);
		}
		return jspPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_CONFIG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.JSP_CONFIG_TYPE__TAGLIB:
				return ((InternalEList<?>)getTaglib()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP:
				return ((InternalEList<?>)getJspPropertyGroup()).basicRemove(otherEnd, msgs);
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
			case Webapp25Package.JSP_CONFIG_TYPE__TAGLIB:
				return getTaglib();
			case Webapp25Package.JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP:
				return getJspPropertyGroup();
			case Webapp25Package.JSP_CONFIG_TYPE__ID:
				return getId();
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
			case Webapp25Package.JSP_CONFIG_TYPE__TAGLIB:
				getTaglib().clear();
				getTaglib().addAll((Collection<? extends TaglibType>)newValue);
				return;
			case Webapp25Package.JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP:
				getJspPropertyGroup().clear();
				getJspPropertyGroup().addAll((Collection<? extends JspPropertyGroupType>)newValue);
				return;
			case Webapp25Package.JSP_CONFIG_TYPE__ID:
				setId((String)newValue);
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
			case Webapp25Package.JSP_CONFIG_TYPE__TAGLIB:
				getTaglib().clear();
				return;
			case Webapp25Package.JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP:
				getJspPropertyGroup().clear();
				return;
			case Webapp25Package.JSP_CONFIG_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Webapp25Package.JSP_CONFIG_TYPE__TAGLIB:
				return taglib != null && !taglib.isEmpty();
			case Webapp25Package.JSP_CONFIG_TYPE__JSP_PROPERTY_GROUP:
				return jspPropertyGroup != null && !jspPropertyGroup.isEmpty();
			case Webapp25Package.JSP_CONFIG_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //JspConfigTypeImpl
