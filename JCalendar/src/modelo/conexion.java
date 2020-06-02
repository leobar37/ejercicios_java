/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JOSE
 */
public class conexion {
    public static String url = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static String usuario = "root";
    public static String contraseña = "1234";
      public Connection geConnection(){
      Connection conexion=null;
      try{
        Class.forName("com.mysql.jdbc.Driver");
        conexion = (Connection)DriverManager.getConnection(url,usuario,contraseña);
    
      }catch(Exception ex){
          System.err.println("Error, "+ex);
      }
  
   return conexion;
      }
}
