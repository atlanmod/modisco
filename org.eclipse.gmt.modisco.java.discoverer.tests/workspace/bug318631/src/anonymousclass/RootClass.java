/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package anonymousclass;

/**
 * @author GBarbier
 *
 */
public class RootClass {

	public void aMethod() {
		IBug318631 variable = new IBug318631() {
			
			@Override
			public void testBug318631(String parameter) {
				
			}
		};
	}
}
