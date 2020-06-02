
package capa_datos;


import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    public static String url = "jdbc:mysql://localhost:3306/tienda?autoReconnet=true&useSSL=false";
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
