/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_negocio;

import TListas.TLista;
import TListas.TListaEn;
import capa_datos.Archivo;
import capa_datos.ListaUnio_pi;
import static capa_negocio.Investigador.Consultar;
import java.io.Serializable;


public class Proyecto implements Serializable{
 private String codProyecto;
 private String titulo;
 private String linea_Investigacion;//ciencias médicas, ciencias sociales, tecnología e innovación, medio ambiente y economía
 private int año_publicacion;
 private int duracion;

    public Proyecto(String codProyecto, String titulo, String linea_Investigacion, int año_publicacion, int duracion) {
        this.codProyecto = codProyecto;
        this.titulo = titulo;
        this.linea_Investigacion = linea_Investigacion;
        this.año_publicacion = año_publicacion;
        this.duracion = duracion;
    }

    public String getCodProyecto() {
        return codProyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLinea_Investigacion() {
        return linea_Investigacion;
    }

    public int getAño_publicacion(){
        return año_publicacion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
      public static TListas.TLista  Consultar(){
       return Archivo.ObtenerProyectos();
    }
     public static TListas.TLista Proyectosxaño(int año){
      TListas.TLista lista = Consultar();
      TLista listafil= new TListaEn();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objProyecto = (Proyecto) lista.Obtener(i);
            System.out.println("metod"+objProyecto.titulo);
            if(objProyecto.getAño_publicacion() >= año){
                 listafil.Adicionar(objProyecto);
            }
            
        }
     return listafil;
    }

}
