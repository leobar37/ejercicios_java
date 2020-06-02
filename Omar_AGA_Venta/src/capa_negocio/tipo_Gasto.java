/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_negocio;

import TListas.TLista;
import TListas.TListaEn;

import capa_datos.SqlConsultaGasto;
import javax.swing.DefaultComboBoxModel;

public class tipo_Gasto {

    private int idtIPO;
    private String nombre;
    private String descripcion;

    public int getIdtIPO() {
        return idtIPO;
    }

    public void setIdtIPO(int idtIPO) {
        this.idtIPO = idtIPO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    //****Reportes********************//
    public static TListas.TLista ConsultarTipoGasto() {
        SqlConsultaGasto consulta = new SqlConsultaGasto();

        return consulta.ConsultarTiposGasto();
    }

    public static boolean ConsultarExistencias(String name) {
        TLista lista = new TListaEn();
        lista = tipo_Gasto.ConsultarTipoGasto();
        boolean verificacion = true;
        tipo_Gasto obj;
        for (int i = 0; i < lista.Cantidad(); i++) {
            obj = (tipo_Gasto) lista.Obtener(i);
            if (obj.getNombre().equalsIgnoreCase(name)) {
                verificacion = false;
            }
        }
        return verificacion;
    }

    public static tipo_Gasto buscarDescripcion(int id) {
        TLista lista = new TListaEn();
        lista = tipo_Gasto.ConsultarTipoGasto();
        tipo_Gasto obj;
        tipo_Gasto retorno = null;
        for (int i = 0; i < lista.Cantidad(); i++) {
            obj = (tipo_Gasto) lista.Obtener(i);
            int idTipo = obj.getIdtIPO();
            if (id == idTipo) {
                retorno = obj;
            }

        }
        return retorno;
    }

    //listar tipo de gastos en Jcombobox   

    public static void LLenar(DefaultComboBoxModel obj) {
        TLista lista = new TListaEn();
        lista = tipo_Gasto.ConsultarTipoGasto();
        tipo_Gasto objtipo;
        obj.addElement("tipos de Gasto");
        for (int i = 0; i < lista.Cantidad(); i++) {
            objtipo = (tipo_Gasto) lista.Obtener(i);
            obj.addElement(objtipo);
        }

    }
    public static void EncontrarJcombo(String nombre){
        
    }

}
