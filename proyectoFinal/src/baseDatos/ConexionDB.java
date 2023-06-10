/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;


import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yoel
 */
public class ConexionDB {
    
    private String url = "jdbc:postgresql://proyecto-01-programacion-01.postgres.database.azure.com:5432/postgres";
    private Properties properties = new Properties();
    private static Connection conn = null;
    
    private ConexionDB () {
        properties.setProperty("user", "olijoel0411");
        properties.setProperty("password", "Guatemala2020.");
        
        try {
            conn = DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
               ConexionDB c = new ConexionDB();
               return c.conn;
        }
        else {
            return conn ;
        }
    }
    public static void main(String[] args) {
      Connection conn = ConexionDB.getConnection();
    }

    
}
