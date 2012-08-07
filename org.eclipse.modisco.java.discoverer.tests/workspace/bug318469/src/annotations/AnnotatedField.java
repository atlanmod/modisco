/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *******************************************************************************/
package annotations;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

public class AnnotatedField {


	private static final long serialVersionUID = 1L;

	@XmlElements({
		@XmlElement(name="XXX", type=AnnotatedField.class)
	})
	private List<Object> objects;
}
