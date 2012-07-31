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

package org.eclipse.gmt.modisco.usecase.polimi.blog;

import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;

/**
 *
 * @author matteo
 */
public interface PostLocalHome extends EJBLocalHome {

    org.eclipse.gmt.modisco.usecase.polimi.blog.PostLocal findByPrimaryKey(java.lang.Integer key)  throws FinderException;
    
    org.eclipse.gmt.modisco.usecase.polimi.blog.PostLocal create(java.lang.Integer key)  throws CreateException;

    Collection findById(Integer id) throws FinderException;

    Collection findByUsername(String username) throws FinderException;

    Collection findByTitle(String title) throws FinderException;

    Collection findByBody(String body) throws FinderException;

}
