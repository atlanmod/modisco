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
package org.eclipse.modisco.jee.ejbjar.EjbJar21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Destination Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The message-destination-linkType is used to link a message
 * 	destination reference or message-driven bean to a message
 * 	destination.
 * 
 * 	The Assembler sets the value to reflect the flow of messages
 * 	between producers and consumers in the application.
 * 
 * 	The value must be the message-destination-name of a message
 * 	destination in the same Deployment File or in another
 * 	Deployment File in the same J2EE application unit.
 * 
 * 	Alternatively, the value may be composed of a path name
 * 	specifying a Deployment File containing the referenced
 * 	message destination with the message-destination-name of the
 * 	destination appended and separated from the path name by
 * 	"#". The path name is relative to the Deployment File
 * 	containing Deployment Component that is referencing the
 * 	message destination.  This allows multiple message
 * 	destinations with the same name to be uniquely identified.
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMessageDestinationLinkType()
 * @model extendedMetaData="name='message-destination-linkType' kind='simple'"
 * @generated
 */
public interface MessageDestinationLinkType extends org.eclipse.modisco.jee.ejbjar.EjbJar21.String {
} // MessageDestinationLinkType
