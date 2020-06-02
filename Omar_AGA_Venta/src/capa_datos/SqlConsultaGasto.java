package capa_datos;

import TListas.TLista;
import TListas.TListaEn;
import capa_negocio.Gasto;
import capa_negocio.Usuario;

import capa_negocio.tipo_Gasto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlConsultaGasto extends Conexion {

    public TLista ConsultarTiposGasto() {
        TLista tipoGastoLis = new TListaEn();
        PreparedStatement pr;
        ResultSet rs;
        Connection con;
        try {
            con = geConnection();
            pr = con.prepareStatement("select * from tipo_gasto");
            rs = pr.executeQuery();
            while (rs.next()) {

                tipo_Gasto tipo_gasto = new tipo_Gasto();
                tipo_gasto.setIdtIPO(rs.getInt("idtipo_gasto"));
                tipo_gasto.setNombre(rs.getString("nombre_gasto"));
                tipo_gasto.setDescripcion(rs.getString("descripcion"));
                tipoGastoLis.Adicionar(tipo_gasto);

            }

            con.close();
        } catch (Exception ex) {
            System.err.println("Error " + ex);
        }
        return tipoGastoLis;
    }

    public boolean RegistrarGastotipo(tipo_Gasto us) {
        PreparedStatement ps = null;
        Connection con = geConnection();
        try {
            ps = con.prepareStatement("insert into tipo_gasto(nombre_gasto,descripcion) values(?,?)");
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getDescripcion());

            ps.executeUpdate();

            con.close();
            return true;
        } catch (Exception ex) {
            System.err.println("Error " + ex);
            return false;
        }
    }
    //elimina un tipo de gasto 
    public boolean eliminarGasto(int id) {
        PreparedStatement pr = null;

        Connection con = null;
        try {
            con = geConnection();
            pr = con.prepareStatement("delete from tipo_gasto where idtipo_gasto = ?");
            pr.setInt(1, id);
            if (pr.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public boolean Modificar(int id, tipo_Gasto us) {
        PreparedStatement ps = null;
        Connection con = geConnection();
        try {
            ps = con.prepareStatement("update tipo_gasto set nombre_gasto = ? ,descripcion= ? where idtipo_gasto  = ?");
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getDescripcion());
            ps.setInt(3, us.getIdtIPO());
            if (ps.executeUpdate() > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error " + ex);
            return false;
        }
    }
    ///Consultas de gasto//
    //llenar lista de Gastos 

    public TLista ConsultarGastos() {
        TLista GastoLis = new TListaEn();
        PreparedStatement pr;
        ResultSet rs;
        Connection con;
        try {
            con = geConnection();
            pr = con.prepareStatement("select * from gasto");
            rs = pr.executeQuery();
            //idGASTO,monto,descripcion,idtipo_gasto,fecha_realizacion
            
            while (rs.next()) {
                Gasto obj = new Gasto();
                obj.setIdTipoGasto(rs.getInt("idtipo_gasto"));
                obj.setDescripcion(rs.getString("descripcion"));
                obj.setMonto(rs.getFloat("monto"));
                obj.setIdGasto(rs.getInt("idGASTO"));
                obj.setRealizacion(rs.getDate("fecha_realizacion"));
                String fecha =convertirFechaString(rs.getDate("fecha_realizacion"));
                 
                GastoLis.Adicionar(obj);

            }

            con.close();
        } catch (Exception ex) {
            System.err.println("Error " + ex);
        }
        return GastoLis;
    }
	
public String convertirFechaString(Date date){
	
   Format formatter = new SimpleDateFormat("yyyy-MM-dd");
	
   return formatter.format(date);
	
}
    //insertar Gastos 

    public boolean RegistrarGasto(Gasto us) {
        PreparedStatement ps = null;
        Connection con = geConnection();
        try {
            ps = con.prepareStatement("insert into gasto(monto,descripcion,idtipo_gasto,fecha_realizacion) values(?,?,?,?)");
            ps.setFloat(1, us.getMonto());
            ps.setString(2, us.getDescripcion());
            ps.setInt(3, us.getIdTipoGasto());
            ps.setDate(4, (Date) us.getRealizacion());

            if (ps.executeUpdate() > 0) {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error " + ex);
            return false;
        }
    }
    
    //modificar un Gasto
public boolean ModificarGasto(int id, Gasto us) {
        PreparedStatement ps = null;
        Connection con = geConnection();
        try {
        //    idGASTO,monto,descripcion,idtipo_gasto,fecha_realizacion
            ps = con.prepareStatement("update gasto set monto = ? ,descripcion= ?,fecha_realizacion = ?,idtipo_gasto = ? where idGASTO = ?");
            ps.setFloat(1, us.getMonto());
            ps.setString(2, us.getDescripcion());
            ps.setInt(3, us.getIdTipoGasto());
            ps.setDate(3, (Date) us.getRealizacion());
            ps.setInt(4, us.getIdTipoGasto());
            ps.setInt(5, id);
                   
            if (ps.executeUpdate() > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error " + ex);
            return false;
        }
    }
   public boolean eliminarGast(int id) {
        PreparedStatement pr = null;

        Connection con = null;
        try {
            con = geConnection();
            pr = con.prepareStatement("delete from gasto where idGASTO= ?;");
            pr.setInt(1, id);
            if (pr.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
