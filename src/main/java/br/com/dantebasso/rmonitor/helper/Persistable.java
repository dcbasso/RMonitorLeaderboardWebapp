/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dantebasso.rmonitor.helper;

import javax.persistence.EntityManager;

public interface Persistable {
    
     public void refreshReferences(EntityManager em);
}
