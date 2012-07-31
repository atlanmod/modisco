/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.builder;

public class OpenResourceException extends Exception {

	private static final long serialVersionUID = -6769716703759676898L;

	public OpenResourceException() {
		super();
	}

	public OpenResourceException(final String message) {
		super(message);
	}

	public OpenResourceException(final Throwable cause) {
		super(cause);
	}

	public OpenResourceException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
