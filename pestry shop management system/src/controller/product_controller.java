/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.product_Model;

/**
 *
 * @author Madhavi
 */
public class product_controller {
     public void productinput(String itemname,String catogary,String quantity,String unitprice){
       product_Model a1=new product_Model();
      a1.insertproduct(itemname, catogary,quantity,unitprice);
        System.out.println("2contriler done");
       
    }



 
}
