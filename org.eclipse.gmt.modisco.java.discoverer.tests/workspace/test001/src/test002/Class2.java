/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *******************************************************************************/
package test002;

import test002.Class1.Class4;

public class Class2 {
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class4 c4 = c1.new Class4();
	}

	public class Class3 {

	}
}
