/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base.de.datos.uec;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Santiago
 */
public class ConnectSQL {
    
    Connection con = null;
    public Connection ConnectDBSQL(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/uec_alumnos","Radeon9550","Zoidiano0!");
            System.out.println("Conencion Realizada");
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null," Error"+ e);
        }
        
        return con;
    }
    //=======================================Otra secuencia de Connecion DB===============================================================
    
   /* public Connection ConnectDBSQL(String User, String Password,String DB){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+DB,User,Password);
            System.out.println("Conencion Realizada");
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null," Error"+ e);
        }
        
        return con;
    }
    */
}
