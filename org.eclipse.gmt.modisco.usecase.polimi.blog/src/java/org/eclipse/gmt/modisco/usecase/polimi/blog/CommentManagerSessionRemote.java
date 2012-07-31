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

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/**
 *
 * @author matteo
 */
public interface CommentManagerSessionRemote extends EJBObject {

    int post(String username, String password, int postId, String message) throws RemoteException;
    
}
