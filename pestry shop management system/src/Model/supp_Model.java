/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Madhavi
 */
public class supp_Model {

   
    public void insertsupp(String suppname, String  supp_product, String suppcontact,String suppdescription) {
        try {
            
       
           Connection con=DataLayer.DBconnection.getConnection();
          String sql="insert into tblsuppliar(suppname, supp_product, suppcontact,suppdescription)values(?,?,?,?)";
          PreparedStatement pst=con.prepareStatement(sql);
        // pst.setInt(1, userid);
          pst.setString(1,suppname);
          pst.setString(2,supp_product);
          pst.setString(3,suppcontact);
           pst.setString(4,suppdescription);
          if(suppname.equals("")&&supp_product.equals("")&&suppcontact.equals("")&&suppdescription.equals("")){
               JOptionPane.showMessageDialog(null,"Please enter Suppliar details");
           }
           else  if(suppname.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter supp name");
           }
            else  if(supp_product.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter product");
           }
              else  if(suppcontact.equals("")){
               JOptionPane.showMessageDialog(null, "can not blank phone number");
           }
              else  if(suppcontact.matches("^[0-9]*^")&&suppcontact.length()==10){
               JOptionPane.showMessageDialog(null, "Please enter Phone number");
           }
                else  if(suppdescription.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter description");
           }
          else{
          int UpdateRowount=pst.executeUpdate();
          if (UpdateRowount > 0) {
              JOptionPane.showMessageDialog(null,"succesful");
    System.out.println("3 successfully!");}
              }
        } catch (Exception e) {
            System.out.println("FF");
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }


}
