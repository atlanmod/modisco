/** 
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Gregoire DUPE (Mia-Software)
 * Romain Dervaux (Mia-Software)
 */
package annotations;

import java.util.List;

@Deprecated
public class MyAnnotatedClass {
	
	public void myMethod(){
		
		@SuppressWarnings("unchecked")
		List<Integer> lst = returnRawList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List returnRawList(){
		return null;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
