/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_datos;

import TListas.TLista;
import TListas.TListaEn;
import static capa_datos.ListaUnio_pi.datos;
import static capa_datos.Lista_Investigador.datos;
import capa_negocio.Proyecto;



public class listaProyecto {
   public static TLista datos = new TListaEn();
   
   public static Object obtener(int i){
      return datos.Obtener(i);
   }
   public static void LLenarLista(){
    TLista lista = Archivo.ObtenerProyectos();
       for (int i = 0; i < lista.Cantidad(); i++) {
           datos.Adicionar(lista.Obtener(i));
       }
   }
   public static void adicionar(Object c){
       datos.Adicionar(c);
   }
   public static TLista consultar(){
      return datos;
   }
   public static Object buscarProyecto(String codProyecto){
       Proyecto objProyecto = null;
       TLista lista = new TListaEn();
       lista = Proyecto.Consultar();
       for (int i = 0; i <lista.Cantidad(); i++) {
           objProyecto = (Proyecto) lista.Obtener(i);
           
           if(objProyecto.getCodProyecto().equalsIgnoreCase(codProyecto)){
               return objProyecto;
           }
       }
       return objProyecto;
   }
}
