/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dantebasso.rmonitor.helper;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@ApplicationScoped
@Default
public class PersistenceManager {
    
    protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("rmonitor");
    protected static PersistenceManager instance;
    
    public EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
    
    public static PersistenceManager getInstance() {
        if (instance == null) instance = new PersistenceManager();
        return instance;
    }
    
}
