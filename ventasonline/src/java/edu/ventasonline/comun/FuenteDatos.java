/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ventasonline.comun;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Toshiba
 */
public class FuenteDatos {
  
private  static  EntityManager cm=null;
public static  EntityManager getEntityManager(){
    if(cm==null||!cm.isOpen()){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ventasonlinePU");
        cm=emf.createEntityManager();
    }
    return cm;
}
}
