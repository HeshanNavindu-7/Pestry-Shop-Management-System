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
public class product_Model {



   
    public void insertproduct(String itemname,String catogary,String quantity,String unitprice) {
        try {
            
       
           Connection con=DataLayer.DBconnection.getConnection();
          String sql="insert into tblproduct(item_name,catogary,quantity,unit_prie)values(?,?,?,?)";
          PreparedStatement pst=con.prepareStatement(sql);
      //  pst.setString(1, itemid);
          pst.setString(1,itemname);
             
        pst.setString(2, catogary);
         
          pst.setString(3,quantity);
                    pst.setString(4,unitprice);
                    if(itemname.equals("")&&catogary.equals("Select")&&quantity.equals("")&&unitprice.equals("")){
               JOptionPane.showMessageDialog(null,"Please enter product details");
           }
           else  if(itemname.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter item name ");
           }
               else  if( catogary.equals("Select")){
               JOptionPane.showMessageDialog(null, "Please enter catogary");
           }
            else  if(quantity.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter quantity");
           }
            else  if(Integer.parseInt(quantity)<0){
                           JOptionPane.showMessageDialog(null, "Please enter quantty>0");
                          
            }
                     else  if(unitprice.equals("")){
               JOptionPane.showMessageDialog(null, "unit price can not be blank");
           }else  if(Integer.parseInt(unitprice)<0){
                           JOptionPane.showMessageDialog(null, "Please enter unit price>0");
                          
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
