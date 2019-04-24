/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRankingMeasurementRelationship()
 * @model
 * @generated
 */
public interface RankingMeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Grade#getRankingTo <em>Ranking To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Grade)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRankingMeasurementRelationship_From()
	 * @see org.eclipse.modisco.omg.smm.Grade#getRankingTo
	 * @model opposite="rankingTo" required="true"
	 * @generated
	 */
	Grade getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Grade value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRankingFrom <em>Ranking From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DimensionalMeasurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRankingMeasurementRelationship_To()
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRankingFrom
	 * @model opposite="rankingFrom" required="true"
	 * @generated
	 */
	DimensionalMeasurement getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DimensionalMeasurement value);

} // RankingMeasurementRelationship
