/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Add_user_Model {
    
    public void insertuser(String username,String password,String role) {
        try {
            
       
           Connection con=DataLayer.DBconnection.getConnection();
          String sql="insert into tbl_adduser(user_name,password,role)values(?,?,?)";
          PreparedStatement pst=con.prepareStatement(sql);
        // pst.setInt(1, userid);
          pst.setString(1,username);
          pst.setString(2,password);
          pst.setString(3,role);
          if(username.equals("")&&password.equals("")&&role.equals("Select")){
               JOptionPane.showMessageDialog(null,"Please enter user name and password");
           }
           else  if(username.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter user name and password");
           }
            else  if(password.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter password");
           }
              else  if(role.equals("Select")){
               JOptionPane.showMessageDialog(null, "Please enter role");
           }
          else{
          int UpdateRowount=pst.executeUpdate();
          if (UpdateRowount > 0) {
              JOptionPane.showMessageDialog(null,"succesful");
    System.out.println("3 successfully!");}
          else{
          JOptionPane.showMessageDialog(null,"not updateted");
         
          }
          }
        } catch (Exception e) {
            System.out.println("FF");
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
       public void updateuser(int userid,String username,String password,String role) {
//           try {
//           Connection con=DataLayer.DBconnection.getConnection(); 
//        PreparedStatement pst;
//            String q="Update tbl_adduser set  user_name= '"+ txt_username_add.getText()+"', password = '"+txt_password_add.getText() +"', role = '"+cmb_role.getSelectedItem() +"' where user_id = '"+ txt_userid.getText() +"'";
//            pst=con.prepareStatement(q);
//            pst.execute();
//       
//        } catch (Exception e) {   JOptionPane.showMessageDialog(null,e.getMessage());
//        }
//     Connection con=DataLayer.DBconnection.getConnection();
//          String sql="";
//          PreparedStatement pst=con.prepareStatement(sql);
//        // pst.setInt(1, userid);
//        
//          
//          int UpdateRowount=pst.executeUpdate();
//          if (UpdateRowount > 0) {
//              JOptionPane.showMessageDialog(null,"succesful");
//    System.out.println("3 successfully!");}
//       
//        } catch (Exception e) {
//            System.out.println("FF");
//            JOptionPane.showMessageDialog(null,e.getMessage());
//        }
       }
}

