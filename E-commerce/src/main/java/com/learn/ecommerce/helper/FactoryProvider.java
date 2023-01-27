/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.ecommerce.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryProvider {
    
    
    
    public static SessionFactory factory;
    
    public static SessionFactory getFactory(){
        
        if (factory==null) {
       
          
            factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    
        
        }
        return factory;
        
    }
    
    
    public void closeFactory(){
    
        if(factory.isOpen()){
            factory.close();
        }
        
        
}
    
  
}

