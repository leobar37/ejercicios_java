/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Negocios;

import Capa_DATOS.ListaPasajero;
import TListas.TLista;
import TListas.TListaEn;
import java.util.Date;

public class Pasajero {

    private String codigo_Reser;
    private String dni;
    private String nombre;
    private String fecha;
    private String tipo_vuelo;
    private String tipo_pasajero;
    private String cabina;
    private float costo;

    public Pasajero(String codigo_Reser, String dni, String nombre, String fecha, String tipo_vuelo, String tipo_pasajero, String cabina, float costo) {
        this.codigo_Reser = codigo_Reser;
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo_vuelo = tipo_vuelo;
        this.tipo_pasajero = tipo_pasajero;
        this.cabina = cabina;
        this.costo = costo;
    }

    public Pasajero(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getCabina() {
        return cabina;
    }

    public float getCosto() {
        return costo;
    }

    public String getCodigo_Reser() {
        return codigo_Reser;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public String getTipo_pasajero() {
        return tipo_pasajero;
    }

    public static TLista consultar() {
        return ListaPasajero.consultar();
    }

    //--------------- Reportes ------------------------------------// 
    //b.Dado el nombre del pasajero, mostrar los vuelos desarrollados.
    public static TLista ConsultVuelo(String nombre) {
        TLista retorno = new TListaEn();
        TLista lista = new TListaEn();
        Pasajero pasajero;
        lista = Pasajero.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            pasajero = (Pasajero) lista.Obtener(i);
            if (pasajero.getNombre().equalsIgnoreCase(nombre)) {
                retorno.Adicionar(pasajero);
            }
        }
        return retorno;
    }
   //c Dado el tipo de cabina, mostrar ordenado 
    //ascendentemente por costo del pasaje.

    public static TLista MostrarCabina(String tipo) {
        TLista retorno = new TListaEn();
        ListaEnlazadaOrdenada ordenLi = new ListaEnlazadaOrdenada();
        TLista lista = new TListaEn();
        Pasajero pasajero;
        lista = Pasajero.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            pasajero = (Pasajero) lista.Obtener(i);
            if (pasajero.getCabina().equalsIgnoreCase(tipo)) {
                ordenLi.insertarOrden(pasajero);
            }
        }
        retorno = ordenLi.obtenerLista();
        return retorno;
    }
   //Dada la fecha y el tipo de vuelo, mostrar los pasajeros que viajaron.
  public static TLista MostrarPorFecha(String fecha,String vuelo){
     TLista retorno = new TListaEn();
     TLista lista = new TListaEn();
     lista = Pasajero.consultar();
        Pasajero pas;
        for (int i = 0; i < lista.Cantidad(); i++) {
            pas = (Pasajero) lista.Obtener(i);
           if(pas.getFecha().equalsIgnoreCase(fecha)  && pas.getTipo_vuelo().equalsIgnoreCase(vuelo)){
             retorno.Adicionar(pas);
           }
        }
     
    return retorno; 
  }
  
  
  public static int  MostrarNumeroxPasajero(String tipo){
     int contPas = 0;
     
     TLista  lista = new TListaEn();
     lista = Pasajero.consultar();
     Pasajero objPas;
      for (int i = 0; i < lista.Cantidad(); i++) {
          objPas = (Pasajero) lista.Obtener(i);
          
       if(objPas.getTipo_pasajero().equalsIgnoreCase(tipo)){
           contPas++;
       }  
  
      }
      return contPas;
  }
  public static TLista PasajeroMayorCosto(){
        TLista retorno = new TListaEn();
     TLista lista = new TListaEn();
     ListaEnlazadaOrdenada ordenLi = new ListaEnlazadaOrdenada();
     lista = Pasajero.consultar();
        Pasajero pas;
        for (int i = 0; i < lista.Cantidad(); i++) {
            pas = (Pasajero) lista.Obtener(i);
            ordenLi.insertarOrden(pas);
      
        }
    retorno = ordenLi.obtenerLista();
    return retorno;
      
  }
  
}
