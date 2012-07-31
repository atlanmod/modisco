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
package org.eclipse.gmt.modisco.infra.query.core.internal.validation;

import java.util.HashSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;

public class UniqueName extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext ctx) {
		HashSet<String> names = new HashSet<String>();
		ModelQuerySet modelQuerySet = (ModelQuerySet) ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		if (eType == EMFEventType.NULL) {
			for (ModelQuery modelQuery : modelQuerySet.getQueries()) {
				if (names.contains(modelQuery.getName())) {
					return ctx.createFailureStatus(modelQuery.getName());
				}
				names.add(modelQuery.getName());
			}
		}
		return ctx.createSuccessStatus();
	}

}
