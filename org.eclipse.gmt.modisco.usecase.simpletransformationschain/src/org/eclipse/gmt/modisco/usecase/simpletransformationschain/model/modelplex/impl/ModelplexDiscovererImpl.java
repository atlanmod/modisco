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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.DiscovererKind;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexDiscoverer;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexPackage;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.ModelplexTransformation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Discoverer</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl#getToKdm
 * <em>To Kdm</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl#getToUml
 * <em>To Uml</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl#getKind
 * <em>Kind</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.modelplex.impl.ModelplexDiscovererImpl#getName
 * <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ModelplexDiscovererImpl extends EObjectImpl implements ModelplexDiscoverer {
	/**
	 * The cached value of the '{@link #getToKdm() <em>To Kdm</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getToKdm()
	 * @generated
	 * @ordered
	 */
	protected ModelplexTransformation toKdm;

	/**
	 * The cached value of the '{@link #getToUml() <em>To Uml</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getToUml()
	 * @generated
	 * @ordered
	 */
	protected ModelplexTransformation toUml;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DiscovererKind KIND_EDEFAULT = DiscovererKind.CSHARP;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DiscovererKind kind = ModelplexDiscovererImpl.KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = ModelplexDiscovererImpl.NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModelplexDiscovererImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelplexPackage.Literals.MODELPLEX_DISCOVERER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelplexTransformation getToKdm() {
		return this.toKdm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetToKdm(final ModelplexTransformation newToKdm,
			NotificationChain msgs) {
		ModelplexTransformation oldToKdm = this.toKdm;
		this.toKdm = newToKdm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM, oldToKdm, newToKdm);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setToKdm(final ModelplexTransformation newToKdm) {
		if (newToKdm != this.toKdm) {
			NotificationChain msgs = null;
			if (this.toKdm != null) {
				msgs = ((InternalEObject) this.toKdm).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM, null, msgs);
			}
			if (newToKdm != null) {
				msgs = ((InternalEObject) newToKdm).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM, null, msgs);
			}
			msgs = basicSetToKdm(newToKdm, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM, newToKdm, newToKdm));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelplexTransformation getToUml() {
		return this.toUml;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetToUml(final ModelplexTransformation newToUml,
			NotificationChain msgs) {
		ModelplexTransformation oldToUml = this.toUml;
		this.toUml = newToUml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML, oldToUml, newToUml);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setToUml(final ModelplexTransformation newToUml) {
		if (newToUml != this.toUml) {
			NotificationChain msgs = null;
			if (this.toUml != null) {
				msgs = ((InternalEObject) this.toUml).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML, null, msgs);
			}
			if (newToUml != null) {
				msgs = ((InternalEObject) newToUml).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE
								- ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML, null, msgs);
			}
			msgs = basicSetToUml(newToUml, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML, newToUml, newToUml));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiscovererKind getKind() {
		return this.kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKind(final DiscovererKind newKind) {
		DiscovererKind oldKind = this.kind;
		this.kind = newKind == null ? ModelplexDiscovererImpl.KIND_EDEFAULT : newKind;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_DISCOVERER__KIND, oldKind, this.kind));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(final String newName) {
		String oldName = this.name;
		this.name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelplexPackage.MODELPLEX_DISCOVERER__NAME, oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM:
			return basicSetToKdm(null, msgs);
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML:
			return basicSetToUml(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM:
			return getToKdm();
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML:
			return getToUml();
		case ModelplexPackage.MODELPLEX_DISCOVERER__KIND:
			return getKind();
		case ModelplexPackage.MODELPLEX_DISCOVERER__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM:
			setToKdm((ModelplexTransformation) newValue);
			return;
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML:
			setToUml((ModelplexTransformation) newValue);
			return;
		case ModelplexPackage.MODELPLEX_DISCOVERER__KIND:
			setKind((DiscovererKind) newValue);
			return;
		case ModelplexPackage.MODELPLEX_DISCOVERER__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM:
			setToKdm((ModelplexTransformation) null);
			return;
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML:
			setToUml((ModelplexTransformation) null);
			return;
		case ModelplexPackage.MODELPLEX_DISCOVERER__KIND:
			setKind(ModelplexDiscovererImpl.KIND_EDEFAULT);
			return;
		case ModelplexPackage.MODELPLEX_DISCOVERER__NAME:
			setName(ModelplexDiscovererImpl.NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_KDM:
			return this.toKdm != null;
		case ModelplexPackage.MODELPLEX_DISCOVERER__TO_UML:
			return this.toUml != null;
		case ModelplexPackage.MODELPLEX_DISCOVERER__KIND:
			return this.kind != ModelplexDiscovererImpl.KIND_EDEFAULT;
		case ModelplexPackage.MODELPLEX_DISCOVERER__NAME:
			return ModelplexDiscovererImpl.NAME_EDEFAULT == null ? this.name != null
					: !ModelplexDiscovererImpl.NAME_EDEFAULT.equals(this.name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(this.kind);
		result.append(", name: "); //$NON-NLS-1$
		result.append(this.name);
		result.append(')');
		return result.toString();
	}

} // ModelplexDiscovererImpl
