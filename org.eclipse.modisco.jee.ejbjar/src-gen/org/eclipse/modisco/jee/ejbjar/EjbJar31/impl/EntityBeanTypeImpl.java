/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DataSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JavaIdentifierType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Bean Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getCmpVersion <em>Cmp Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getAbstractSchemaName <em>Abstract Schema Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getCmpField <em>Cmp Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.EntityBeanTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityBeanTypeImpl extends EObjectImpl implements EntityBeanType {
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
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayNameType> displayName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<IconType> icon;

	/**
	 * The cached value of the '{@link #getEjbName() <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected EjbNameType ejbName;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType mappedName;

	/**
	 * The cached value of the '{@link #getHome() <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected HomeType home;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected RemoteType remote;

	/**
	 * The cached value of the '{@link #getLocalHome() <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHome()
	 * @generated
	 * @ordered
	 */
	protected LocalHomeType localHome;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected LocalType local;

	/**
	 * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected EjbClassType ejbClass;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected PersistenceTypeType persistenceType;

	/**
	 * The cached value of the '{@link #getPrimKeyClass() <em>Prim Key Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimKeyClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType primKeyClass;

	/**
	 * The cached value of the '{@link #getReentrant() <em>Reentrant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReentrant()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType reentrant;

	/**
	 * The cached value of the '{@link #getCmpVersion() <em>Cmp Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmpVersion()
	 * @generated
	 * @ordered
	 */
	protected CmpVersionType cmpVersion;

	/**
	 * The cached value of the '{@link #getAbstractSchemaName() <em>Abstract Schema Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSchemaName()
	 * @generated
	 * @ordered
	 */
	protected JavaIdentifierType abstractSchemaName;

	/**
	 * The cached value of the '{@link #getCmpField() <em>Cmp Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmpField()
	 * @generated
	 * @ordered
	 */
	protected EList<CmpFieldType> cmpField;

	/**
	 * The cached value of the '{@link #getPrimkeyField() <em>Primkey Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimkeyField()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String primkeyField;

	/**
	 * The cached value of the '{@link #getEnvEntry() <em>Env Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvEntryType> envEntry;

	/**
	 * The cached value of the '{@link #getEjbRef() <em>Ejb Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbRefType> ejbRef;

	/**
	 * The cached value of the '{@link #getEjbLocalRef() <em>Ejb Local Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbLocalRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbLocalRefType> ejbLocalRef;

	/**
	 * The cached value of the '{@link #getServiceRef() <em>Service Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRefType> serviceRef;

	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRefType> resourceRef;

	/**
	 * The cached value of the '{@link #getResourceEnvRef() <em>Resource Env Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceEnvRefType> resourceEnvRef;

	/**
	 * The cached value of the '{@link #getMessageDestinationRef() <em>Message Destination Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDestinationRefType> messageDestinationRef;

	/**
	 * The cached value of the '{@link #getPersistenceContextRef() <em>Persistence Context Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceContextRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PersistenceContextRefType> persistenceContextRef;

	/**
	 * The cached value of the '{@link #getPersistenceUnitRef() <em>Persistence Unit Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PersistenceUnitRefType> persistenceUnitRef;

	/**
	 * The cached value of the '{@link #getPostConstruct() <em>Post Construct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConstruct()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCallbackType> postConstruct;

	/**
	 * The cached value of the '{@link #getPreDestroy() <em>Pre Destroy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDestroy()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCallbackType> preDestroy;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceType> dataSource;

	/**
	 * The cached value of the '{@link #getSecurityRoleRef() <em>Security Role Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleRefType> securityRoleRef;

	/**
	 * The cached value of the '{@link #getSecurityIdentity() <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityIdentity()
	 * @generated
	 * @ordered
	 */
	protected SecurityIdentityType securityIdentity;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryType> query;

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
	protected EntityBeanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getEntityBeanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		if (icon == null) {
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbNameType getEjbName() {
		return ejbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbName(EjbNameType newEjbName, NotificationChain msgs) {
		EjbNameType oldEjbName = ejbName;
		ejbName = newEjbName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME, oldEjbName, newEjbName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(EjbNameType newEjbName) {
		if (newEjbName != ejbName) {
			NotificationChain msgs = null;
			if (ejbName != null)
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME, newEjbName, newEjbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedName(XsdStringType newMappedName, NotificationChain msgs) {
		XsdStringType oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(XsdStringType newMappedName) {
		if (newMappedName != mappedName) {
			NotificationChain msgs = null;
			if (mappedName != null)
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType getHome() {
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(HomeType newHome, NotificationChain msgs) {
		HomeType oldHome = home;
		home = newHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__HOME, oldHome, newHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(HomeType newHome) {
		if (newHome != home) {
			NotificationChain msgs = null;
			if (home != null)
				msgs = ((InternalEObject)home).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__HOME, null, msgs);
			if (newHome != null)
				msgs = ((InternalEObject)newHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__HOME, null, msgs);
			msgs = basicSetHome(newHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__HOME, newHome, newHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType getRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemote(RemoteType newRemote, NotificationChain msgs) {
		RemoteType oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE, oldRemote, newRemote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(RemoteType newRemote) {
		if (newRemote != remote) {
			NotificationChain msgs = null;
			if (remote != null)
				msgs = ((InternalEObject)remote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE, null, msgs);
			if (newRemote != null)
				msgs = ((InternalEObject)newRemote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE, null, msgs);
			msgs = basicSetRemote(newRemote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE, newRemote, newRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType getLocalHome() {
		return localHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalHome(LocalHomeType newLocalHome, NotificationChain msgs) {
		LocalHomeType oldLocalHome = localHome;
		localHome = newLocalHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME, oldLocalHome, newLocalHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHome(LocalHomeType newLocalHome) {
		if (newLocalHome != localHome) {
			NotificationChain msgs = null;
			if (localHome != null)
				msgs = ((InternalEObject)localHome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME, null, msgs);
			if (newLocalHome != null)
				msgs = ((InternalEObject)newLocalHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME, null, msgs);
			msgs = basicSetLocalHome(newLocalHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME, newLocalHome, newLocalHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType getLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal(LocalType newLocal, NotificationChain msgs) {
		LocalType oldLocal = local;
		local = newLocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL, oldLocal, newLocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(LocalType newLocal) {
		if (newLocal != local) {
			NotificationChain msgs = null;
			if (local != null)
				msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL, null, msgs);
			if (newLocal != null)
				msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL, null, msgs);
			msgs = basicSetLocal(newLocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL, newLocal, newLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType getEjbClass() {
		return ejbClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClass(EjbClassType newEjbClass, NotificationChain msgs) {
		EjbClassType oldEjbClass = ejbClass;
		ejbClass = newEjbClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS, oldEjbClass, newEjbClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(EjbClassType newEjbClass) {
		if (newEjbClass != ejbClass) {
			NotificationChain msgs = null;
			if (ejbClass != null)
				msgs = ((InternalEObject)ejbClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS, null, msgs);
			if (newEjbClass != null)
				msgs = ((InternalEObject)newEjbClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS, null, msgs);
			msgs = basicSetEjbClass(newEjbClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS, newEjbClass, newEjbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceType(PersistenceTypeType newPersistenceType, NotificationChain msgs) {
		PersistenceTypeType oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE, oldPersistenceType, newPersistenceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(PersistenceTypeType newPersistenceType) {
		if (newPersistenceType != persistenceType) {
			NotificationChain msgs = null;
			if (persistenceType != null)
				msgs = ((InternalEObject)persistenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE, null, msgs);
			if (newPersistenceType != null)
				msgs = ((InternalEObject)newPersistenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE, null, msgs);
			msgs = basicSetPersistenceType(newPersistenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE, newPersistenceType, newPersistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getPrimKeyClass() {
		return primKeyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimKeyClass(FullyQualifiedClassType newPrimKeyClass, NotificationChain msgs) {
		FullyQualifiedClassType oldPrimKeyClass = primKeyClass;
		primKeyClass = newPrimKeyClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS, oldPrimKeyClass, newPrimKeyClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimKeyClass(FullyQualifiedClassType newPrimKeyClass) {
		if (newPrimKeyClass != primKeyClass) {
			NotificationChain msgs = null;
			if (primKeyClass != null)
				msgs = ((InternalEObject)primKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS, null, msgs);
			if (newPrimKeyClass != null)
				msgs = ((InternalEObject)newPrimKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS, null, msgs);
			msgs = basicSetPrimKeyClass(newPrimKeyClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS, newPrimKeyClass, newPrimKeyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getReentrant() {
		return reentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReentrant(TrueFalseType newReentrant, NotificationChain msgs) {
		TrueFalseType oldReentrant = reentrant;
		reentrant = newReentrant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT, oldReentrant, newReentrant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(TrueFalseType newReentrant) {
		if (newReentrant != reentrant) {
			NotificationChain msgs = null;
			if (reentrant != null)
				msgs = ((InternalEObject)reentrant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT, null, msgs);
			if (newReentrant != null)
				msgs = ((InternalEObject)newReentrant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT, null, msgs);
			msgs = basicSetReentrant(newReentrant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT, newReentrant, newReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionType getCmpVersion() {
		return cmpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmpVersion(CmpVersionType newCmpVersion, NotificationChain msgs) {
		CmpVersionType oldCmpVersion = cmpVersion;
		cmpVersion = newCmpVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION, oldCmpVersion, newCmpVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmpVersion(CmpVersionType newCmpVersion) {
		if (newCmpVersion != cmpVersion) {
			NotificationChain msgs = null;
			if (cmpVersion != null)
				msgs = ((InternalEObject)cmpVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION, null, msgs);
			if (newCmpVersion != null)
				msgs = ((InternalEObject)newCmpVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION, null, msgs);
			msgs = basicSetCmpVersion(newCmpVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION, newCmpVersion, newCmpVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaIdentifierType getAbstractSchemaName() {
		return abstractSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSchemaName(JavaIdentifierType newAbstractSchemaName, NotificationChain msgs) {
		JavaIdentifierType oldAbstractSchemaName = abstractSchemaName;
		abstractSchemaName = newAbstractSchemaName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME, oldAbstractSchemaName, newAbstractSchemaName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractSchemaName(JavaIdentifierType newAbstractSchemaName) {
		if (newAbstractSchemaName != abstractSchemaName) {
			NotificationChain msgs = null;
			if (abstractSchemaName != null)
				msgs = ((InternalEObject)abstractSchemaName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME, null, msgs);
			if (newAbstractSchemaName != null)
				msgs = ((InternalEObject)newAbstractSchemaName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME, null, msgs);
			msgs = basicSetAbstractSchemaName(newAbstractSchemaName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME, newAbstractSchemaName, newAbstractSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmpFieldType> getCmpField() {
		if (cmpField == null) {
			cmpField = new EObjectContainmentEList<CmpFieldType>(CmpFieldType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__CMP_FIELD);
		}
		return cmpField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getPrimkeyField() {
		return primkeyField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimkeyField(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newPrimkeyField, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldPrimkeyField = primkeyField;
		primkeyField = newPrimkeyField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD, oldPrimkeyField, newPrimkeyField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimkeyField(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newPrimkeyField) {
		if (newPrimkeyField != primkeyField) {
			NotificationChain msgs = null;
			if (primkeyField != null)
				msgs = ((InternalEObject)primkeyField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD, null, msgs);
			if (newPrimkeyField != null)
				msgs = ((InternalEObject)newPrimkeyField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD, null, msgs);
			msgs = basicSetPrimkeyField(newPrimkeyField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD, newPrimkeyField, newPrimkeyField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		if (envEntry == null) {
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__ENV_ENTRY);
		}
		return envEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbRefType> getEjbRef() {
		if (ejbRef == null) {
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__EJB_REF);
		}
		return ejbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbLocalRefType> getEjbLocalRef() {
		if (ejbLocalRef == null) {
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__EJB_LOCAL_REF);
		}
		return ejbLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRefType> getServiceRef() {
		if (serviceRef == null) {
			serviceRef = new EObjectContainmentEList<ServiceRefType>(ServiceRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__SERVICE_REF);
		}
		return serviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		if (resourceRef == null) {
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_REF);
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceEnvRefType> getResourceEnvRef() {
		if (resourceEnvRef == null) {
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_ENV_REF);
		}
		return resourceEnvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationRefType> getMessageDestinationRef() {
		if (messageDestinationRef == null) {
			messageDestinationRef = new EObjectContainmentEList<MessageDestinationRefType>(MessageDestinationRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF);
		}
		return messageDestinationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistenceContextRefType> getPersistenceContextRef() {
		if (persistenceContextRef == null) {
			persistenceContextRef = new EObjectContainmentEList<PersistenceContextRefType>(PersistenceContextRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF);
		}
		return persistenceContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistenceUnitRefType> getPersistenceUnitRef() {
		if (persistenceUnitRef == null) {
			persistenceUnitRef = new EObjectContainmentEList<PersistenceUnitRefType>(PersistenceUnitRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF);
		}
		return persistenceUnitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPostConstruct() {
		if (postConstruct == null) {
			postConstruct = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__POST_CONSTRUCT);
		}
		return postConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPreDestroy() {
		if (preDestroy == null) {
			preDestroy = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__PRE_DESTROY);
		}
		return preDestroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceType> getDataSource() {
		if (dataSource == null) {
			dataSource = new EObjectContainmentEList<DataSourceType>(DataSourceType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__DATA_SOURCE);
		}
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_ROLE_REF);
		}
		return securityRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityIdentityType getSecurityIdentity() {
		return securityIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityIdentity(SecurityIdentityType newSecurityIdentity, NotificationChain msgs) {
		SecurityIdentityType oldSecurityIdentity = securityIdentity;
		securityIdentity = newSecurityIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY, oldSecurityIdentity, newSecurityIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityIdentity(SecurityIdentityType newSecurityIdentity) {
		if (newSecurityIdentity != securityIdentity) {
			NotificationChain msgs = null;
			if (securityIdentity != null)
				msgs = ((InternalEObject)securityIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY, null, msgs);
			if (newSecurityIdentity != null)
				msgs = ((InternalEObject)newSecurityIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY, null, msgs);
			msgs = basicSetSecurityIdentity(newSecurityIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY, newSecurityIdentity, newSecurityIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryType> getQuery() {
		if (query == null) {
			query = new EObjectContainmentEList<QueryType>(QueryType.class, this, EjbJar31Package.ENTITY_BEAN_TYPE__QUERY);
		}
		return query;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ENTITY_BEAN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.ENTITY_BEAN_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__HOME:
				return basicSetHome(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE:
				return basicSetRemote(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME:
				return basicSetLocalHome(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL:
				return basicSetLocal(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE:
				return basicSetPersistenceType(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS:
				return basicSetPrimKeyClass(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT:
				return basicSetReentrant(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION:
				return basicSetCmpVersion(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME:
				return basicSetAbstractSchemaName(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_FIELD:
				return ((InternalEList<?>)getCmpField()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD:
				return basicSetPrimkeyField(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__SERVICE_REF:
				return ((InternalEList<?>)getServiceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return ((InternalEList<?>)getMessageDestinationRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return ((InternalEList<?>)getPersistenceContextRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return ((InternalEList<?>)getPersistenceUnitRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__POST_CONSTRUCT:
				return ((InternalEList<?>)getPostConstruct()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRE_DESTROY:
				return ((InternalEList<?>)getPreDestroy()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY:
				return basicSetSecurityIdentity(null, msgs);
			case EjbJar31Package.ENTITY_BEAN_TYPE__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
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
			case EjbJar31Package.ENTITY_BEAN_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.ENTITY_BEAN_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar31Package.ENTITY_BEAN_TYPE__ICON:
				return getIcon();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME:
				return getMappedName();
			case EjbJar31Package.ENTITY_BEAN_TYPE__HOME:
				return getHome();
			case EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE:
				return getRemote();
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME:
				return getLocalHome();
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL:
				return getLocal();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS:
				return getEjbClass();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE:
				return getPersistenceType();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS:
				return getPrimKeyClass();
			case EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT:
				return getReentrant();
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION:
				return getCmpVersion();
			case EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME:
				return getAbstractSchemaName();
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_FIELD:
				return getCmpField();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD:
				return getPrimkeyField();
			case EjbJar31Package.ENTITY_BEAN_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__SERVICE_REF:
				return getServiceRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return getMessageDestinationRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return getPersistenceContextRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return getPersistenceUnitRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__POST_CONSTRUCT:
				return getPostConstruct();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRE_DESTROY:
				return getPreDestroy();
			case EjbJar31Package.ENTITY_BEAN_TYPE__DATA_SOURCE:
				return getDataSource();
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbJar31Package.ENTITY_BEAN_TYPE__QUERY:
				return getQuery();
			case EjbJar31Package.ENTITY_BEAN_TYPE__ID:
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
			case EjbJar31Package.ENTITY_BEAN_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__HOME:
				setHome((HomeType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS:
				setPrimKeyClass((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT:
				setReentrant((TrueFalseType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION:
				setCmpVersion((CmpVersionType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME:
				setAbstractSchemaName((JavaIdentifierType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_FIELD:
				getCmpField().clear();
				getCmpField().addAll((Collection<? extends CmpFieldType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD:
				setPrimkeyField((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__SERVICE_REF:
				getServiceRef().clear();
				getServiceRef().addAll((Collection<? extends ServiceRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				getMessageDestinationRef().addAll((Collection<? extends MessageDestinationRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				getPersistenceContextRef().addAll((Collection<? extends PersistenceContextRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				getPersistenceUnitRef().addAll((Collection<? extends PersistenceUnitRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				getPostConstruct().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				getPreDestroy().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends DataSourceType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends QueryType>)newValue);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ID:
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
			case EjbJar31Package.ENTITY_BEAN_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ICON:
				getIcon().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__HOME:
				setHome((HomeType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE:
				setRemote((RemoteType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL:
				setLocal((LocalType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS:
				setPrimKeyClass((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT:
				setReentrant((TrueFalseType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION:
				setCmpVersion((CmpVersionType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME:
				setAbstractSchemaName((JavaIdentifierType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_FIELD:
				getCmpField().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD:
				setPrimkeyField((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__SERVICE_REF:
				getServiceRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__DATA_SOURCE:
				getDataSource().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__QUERY:
				getQuery().clear();
				return;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ID:
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
			case EjbJar31Package.ENTITY_BEAN_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__MAPPED_NAME:
				return mappedName != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__HOME:
				return home != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__REMOTE:
				return remote != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL_HOME:
				return localHome != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__LOCAL:
				return local != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_CLASS:
				return ejbClass != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_TYPE:
				return persistenceType != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIM_KEY_CLASS:
				return primKeyClass != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__REENTRANT:
				return reentrant != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_VERSION:
				return cmpVersion != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ABSTRACT_SCHEMA_NAME:
				return abstractSchemaName != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__CMP_FIELD:
				return cmpField != null && !cmpField.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRIMKEY_FIELD:
				return primkeyField != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__SERVICE_REF:
				return serviceRef != null && !serviceRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return messageDestinationRef != null && !messageDestinationRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return persistenceContextRef != null && !persistenceContextRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return persistenceUnitRef != null && !persistenceUnitRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__POST_CONSTRUCT:
				return postConstruct != null && !postConstruct.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__PRE_DESTROY:
				return preDestroy != null && !preDestroy.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__SECURITY_IDENTITY:
				return securityIdentity != null;
			case EjbJar31Package.ENTITY_BEAN_TYPE__QUERY:
				return query != null && !query.isEmpty();
			case EjbJar31Package.ENTITY_BEAN_TYPE__ID:
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

} //EntityBeanTypeImpl
