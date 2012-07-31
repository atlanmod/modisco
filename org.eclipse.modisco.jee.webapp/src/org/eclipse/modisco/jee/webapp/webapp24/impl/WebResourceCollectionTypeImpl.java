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
package org.eclipse.modisco.jee.webapp.webapp24.impl;

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

import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.HttpMethodType;
import org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Resource Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.WebResourceCollectionTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebResourceCollectionTypeImpl extends EObjectImpl implements WebResourceCollectionType {
	/**
	 * The cached value of the '{@link #getWebResourceName() <em>Web Resource Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebResourceName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp24.String webResourceName;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<UrlPatternType> urlPattern;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<HttpMethodType> httpMethod;

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
	protected WebResourceCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.WEB_RESOURCE_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp24.String getWebResourceName() {
		return webResourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebResourceName(org.eclipse.modisco.jee.webapp.webapp24.String newWebResourceName, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp24.String oldWebResourceName = webResourceName;
		webResourceName = newWebResourceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME, oldWebResourceName, newWebResourceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebResourceName(org.eclipse.modisco.jee.webapp.webapp24.String newWebResourceName) {
		if (newWebResourceName != webResourceName) {
			NotificationChain msgs = null;
			if (webResourceName != null)
				msgs = ((InternalEObject)webResourceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME, null, msgs);
			if (newWebResourceName != null)
				msgs = ((InternalEObject)newWebResourceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME, null, msgs);
			msgs = basicSetWebResourceName(newWebResourceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME, newWebResourceName, newWebResourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlPatternType> getUrlPattern() {
		if (urlPattern == null) {
			urlPattern = new EObjectContainmentEList<UrlPatternType>(UrlPatternType.class, this, Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN);
		}
		return urlPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HttpMethodType> getHttpMethod() {
		if (httpMethod == null) {
			httpMethod = new EObjectContainmentEList<HttpMethodType>(HttpMethodType.class, this, Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD);
		}
		return httpMethod;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME:
				return basicSetWebResourceName(null, msgs);
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN:
				return ((InternalEList<?>)getUrlPattern()).basicRemove(otherEnd, msgs);
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD:
				return ((InternalEList<?>)getHttpMethod()).basicRemove(otherEnd, msgs);
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
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME:
				return getWebResourceName();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN:
				return getUrlPattern();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD:
				return getHttpMethod();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__ID:
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
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME:
				setWebResourceName((org.eclipse.modisco.jee.webapp.webapp24.String)newValue);
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN:
				getUrlPattern().clear();
				getUrlPattern().addAll((Collection<? extends UrlPatternType>)newValue);
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD:
				getHttpMethod().clear();
				getHttpMethod().addAll((Collection<? extends HttpMethodType>)newValue);
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__ID:
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
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME:
				setWebResourceName((org.eclipse.modisco.jee.webapp.webapp24.String)null);
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN:
				getUrlPattern().clear();
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD:
				getHttpMethod().clear();
				return;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__ID:
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
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__WEB_RESOURCE_NAME:
				return webResourceName != null;
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__URL_PATTERN:
				return urlPattern != null && !urlPattern.isEmpty();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__HTTP_METHOD:
				return httpMethod != null && !httpMethod.isEmpty();
			case Webapp24Package.WEB_RESOURCE_COLLECTION_TYPE__ID:
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

} //WebResourceCollectionTypeImpl
