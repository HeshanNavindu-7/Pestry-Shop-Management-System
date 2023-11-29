/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.supp_Model;

/**
 *
 * @author Madhavi
 */
public class supp_controller {
   public void suppinput(String suppname, String  supp_product, String suppcontact,String suppdescription){
       supp_Model a1=new supp_Model();
       a1.insertsupp( suppname, supp_product, suppcontact,suppdescription);
        
       
    } 

 


}
