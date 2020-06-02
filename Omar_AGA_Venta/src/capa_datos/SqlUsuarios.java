
package capa_datos;

import capa_negocio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class SqlUsuarios extends Conexion{
    
    public boolean  RegistrarUsuario(Usuario us){
        PreparedStatement ps = null;
        Connection con = geConnection();
        try{
          ps = con.prepareStatement("insert into usuario(nombre,dni,nombre_usuario,idtipo_usuario,contraseña) values(?,?,?,?,?)");
          ps.setString(1, us.getNombre());
          ps.setString(2, us.getDni());
          ps.setString(3, us.getNombre_Usuario());
          ps.setInt(4,us.getTipo_usuario());
          ps.setString(5, us.getContraseña());
          ps.executeUpdate();
          
          con.close();
          return true;
        }catch (Exception ex){
            System.err.println("Error "+ex);
            return false;
        }   
    }
    public int  Verificar(String  us){
        PreparedStatement ps = null;
        Connection con = geConnection();
  
           ResultSet rs = null;
        try{
          ps = con.prepareStatement("select count(idUsuario)  from usuario where nombre_usuario = ?");
          ps.setString(1, us);
          rs = ps.executeQuery();
          if(rs.next()){
             return rs.getInt(1);       
          }
          con.close();
           return 1;
          
        }catch (Exception ex){
            System.err.println("Error "+ex);
            return 1;
        }
    
    }
    public boolean iniciarSesion(Usuario us){
       PreparedStatement pr = null;
       ResultSet rs  = null;
       try{
          Connection conexion = geConnection();
           pr = conexion.prepareStatement("select idUsuario,nombre, dni,idtipo_usuario,contraseña,nombre_usuario from usuario where nombre_usuario=?");
           pr.setString(1, us.getNombre_Usuario());
           rs = pr.executeQuery();
           if(rs.next()){
              if(us.getContraseña().equalsIgnoreCase(rs.getString("contraseña")) && (us.getNombre_Usuario().equals(rs.getString("nombre_usuario")))){
                  us.setIdPersona(rs.getInt("idUsuario"));
                  us.setDni(rs.getString("dni"));
                  us.setNombre("nombre");
                  return true;
              }else{
                  return false;
              }
           }
          conexion.close();
          return false;
       }catch(Exception ex){
           return false;
       }  
    }
    public void TablaUsuarios(JTable tabla){
       Connection con;
        PreparedStatement pr;
       ResultSet rs;
        DefaultTableModel modelo = new DefaultTableModel(){
                @Override
         public boolean isCellEditable(int row,int column){
             return false;
         }
     
        };
       
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("dni");
        modelo.addColumn("usuario");
        modelo.addColumn("contraseña");
        modelo.addColumn("tipo");
        
        
        // (id, nombre,dni,usuario,contraseña,usuario)
        try{
          con = geConnection();
         pr = con.prepareStatement("select us.idUsuario, us.nombre,us.dni,us.nombre_usuario,us.contraseña,tip.usuario from usuario as us inner join tipo_usuario as tip on us.idtipo_usuario = tip.idtipo_usuario");
         rs = pr.executeQuery();
         while(rs.next()){
             Object fila[] = new Object[6];
             for (int i = 0; i <6; i++) {
                if((i+1)==5){
                   String contraseña = Hash.getHash(rs.getString(5),"md5");
                  
                }
                fila[i] = rs.getObject(i+1);
             }
             modelo.addRow(fila);
         }
         tabla.setModel(modelo);
         con.close();
        }catch(Exception ex){
            System.err.println("Error"+ex);
        }
     
   }
    public boolean eliminar(int id) {
         PreparedStatement pr = null;
         
         Connection con = null;
         try{
             con = geConnection();
             pr = con.prepareStatement("delete from usuario  where idUsuario = ?");
             pr.setInt(1, id);
             if( pr.executeUpdate() > 0){
              return true;
             }else{
                 return false;
             }   
         }catch(Exception ex){
              System.err.println("Error, "+ex);
              return false;
         }finally{
             try {
                 con.close();
             } catch (SQLException ex) {
                 Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         
     }  
    public boolean Modificar(int id,Usuario us){
         PreparedStatement ps = null;
        Connection con = geConnection();
        try{
          ps = con.prepareStatement(" update usuario set nombre = ?,dni=?,nombre_usuario=?,idtipo_usuario=?,contraseña = ?  where idUsuario = ?;");
          ps.setString(1, us.getNombre());
          ps.setString(2, us.getDni());
          ps.setString(3, us.getNombre_Usuario());
          ps.setInt(4,us.getTipo_usuario());
          ps.setString(5, us.getContraseña());
          ps.setInt(6, id);
          if(ps.executeUpdate() > 0){
               con.close();
              return true;
          }else{
               con.close();
              return false;
          }
 
        }catch (Exception ex){
            System.err.println("Error "+ex);
            return false;
        }   
    } 
} 
