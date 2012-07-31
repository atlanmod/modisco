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
public interface MailLocalHome extends EJBLocalHome {

    org.eclipse.gmt.modisco.usecase.polimi.auth.MailLocal findByPrimaryKey(java.lang.String key)  throws FinderException;
    
    org.eclipse.gmt.modisco.usecase.polimi.auth.MailLocal create(java.lang.String key)  throws CreateException;

    Collection findByMail(String mail) throws FinderException;

}
