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

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author matteo
 */
public class LoginSessionBean implements SessionBean {
    private PersonLocalHome personHome;
    private MailLocalHome mailHome;
    
    private SessionContext context;
    
    // <editor-fold defaultstate="collapsed" desc="EJB infrastructure methods. Click the + sign on the left to edit the code.">;

    // TODO Add code to acquire and use other enterprise resources (DataSource, JMS, enterprise bean, Web services)
    // TODO Add business methods or web service operations

    /**
     * @see javax.ejb.SessionBean#setSessionContext(javax.ejb.SessionContext)
     */
    public void setSessionContext(SessionContext aContext) {
        context = aContext;
    }
    
    /**
     * @see javax.ejb.SessionBean#ejbActivate()
     */
    public void ejbActivate() {
        
    }
    
    /**
     * @see javax.ejb.SessionBean#ejbPassivate()
     */
    public void ejbPassivate() {
        
    }
    
    /**
     * @see javax.ejb.SessionBean#ejbRemove()
     */
    public void ejbRemove() {
        
    }
    
    // </editor-fold>;

    /**
     * See section 7.10.3 of the EJB 2.0 specification
     * See section 7.11.3 of the EJB 2.1 specification
     */
    public void ejbCreate() {

        try {
            
            Context initial = new InitialContext();
            
            this.mailHome = (MailLocalHome) initial.lookup("java:comp/env/ejb/Mail");
            this.personHome = (PersonLocalHome) initial.lookup("java:comp/env/ejb/Person");
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        
    }

    public void addUser(String username, String password, String mail) {
        PersonLocal p = null;
        try {
            p = personHome.findByPrimaryKey(username);
        } catch (FinderException ex) {
        }
        
        if (p == null) {
            try {
                p = personHome.create(username);
                p.setPassword(password);
                
            } catch (CreateException ex) {
                ex.printStackTrace();
                return;
            }
        }

        try {
            MailLocal m = mailHome.create(mail);
            m.setName(p);
        } catch (CreateException ex) {
            ex.printStackTrace();
            return;
        }
    }

    public boolean checkUser(String username, String password) {
        PersonLocal p = null;
        
        try {
            p = personHome.findByPrimaryKey(username);
            return (p != null) && (p.getPassword().equals(password));
        } catch (FinderException ex) {
            return false;
        }

    }

    public boolean checkMail(String mail, String password) {
        try {

            MailLocal m = mailHome.findByPrimaryKey(mail);
            
            if (m == null) return false;
            if(m.getName() == null) return false;
            return (m.getName().getPassword().equals(password));
        } catch (FinderException ex) {
            return false;
        }
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "EJB Methods > Add Business Method" or "Web Service > Add Operation")
    
}
