/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginA1;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class koneksiDB {
    public static Connection conn(){
        try {
          Class.forName("com.mysql.jdbc.Driver");
            Connection konek = DriverManager.getConnection
                ("jdbc:mysql://localhost/perusahaan","root","");
            return konek;     
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        } 
    }   
 }
