/**$Id$
 * 
 * *******************************************************************************
 * Copyright (c) 2007 Politecnico di Milano, IST-034466 MOMOCS 
 * All rights reserved. This software and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     1. Matteo Miraz - Politecnico di Milano
 *     
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.polimi.auth;

import java.util.Collection;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;

/**
 *
 * @author matteo
 */
public interface PersonLocalHome extends EJBLocalHome {

    org.eclipse.gmt.modisco.usecase.polimi.auth.PersonLocal findByPrimaryKey(java.lang.String key)  throws FinderException;
    
    org.eclipse.gmt.modisco.usecase.polimi.auth.PersonLocal create(java.lang.String key)  throws CreateException;

    Collection findByName(String name) throws FinderException;

    Collection findByPassword(String password) throws FinderException;

}
