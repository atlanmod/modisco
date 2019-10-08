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
package varargs;

public class VarArgs1 {

	public static void main(String[] args) {
		int passed = 0;
		int failed = 0;
		for (String className : args) {
			try {
				Class c = Class.forName(className);
				c.getMethod("test").invoke(c.newInstance());
				passed++;
			} catch (Exception ex) {
				System.out.printf("%s failed: %s%n", className, ex);
				failed++;
			}
		}
		System.out.printf("passed=%d; failed=%d%n", passed, failed);
	}
}
