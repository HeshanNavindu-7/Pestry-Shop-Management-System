/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Madhavi
 */
public class DBconnection {
     static Connection con = null;
     static Connection getConnection;
//    public DBconnection(){
//        
//    }

 
    
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pestryshop","root","");
        }catch (ClassNotFoundException | SQLException e){
        }
        return con;
 
}
}