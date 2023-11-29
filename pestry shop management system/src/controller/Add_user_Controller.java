/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Add_user_Model;



public class Add_user_Controller {
  
    public void adduserinput(String username,String password,String role){
       Add_user_Model a1=new Add_user_Model();
       a1.insertuser( username, password, role);
        System.out.println("2contriler done");
       
    }
     public void adduserupdate(int userid,String username,String password,String role){
       Add_user_Model a1=new Add_user_Model();
       a1.updateuser(userid, username, password, role);
    }



    public void adduserupdate(String username, String password, String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
