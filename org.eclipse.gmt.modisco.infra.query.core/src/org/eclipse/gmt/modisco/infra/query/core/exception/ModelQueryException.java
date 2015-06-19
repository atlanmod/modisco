/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.infra.query.core.exception;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ModelQueryException extends Exception {

	private static final long serialVersionUID = -3203874059325745157L;

	public ModelQueryException(final String message) {
		super(message);
	}

	public ModelQueryException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ModelQueryException(final Throwable cause) {
		super(cause);
	}

}
