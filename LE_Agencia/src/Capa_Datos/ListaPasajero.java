
package Capa_Datos;

import TListas.TLista;
import TListas.TListaEn;


public class ListaPasajero {
   static TLista objetos = new TListaEn();
   
   public static void adicionar(Object pas){
       objetos.Adicionar(pas);
   }
   public static TLista consultar(){
       return objetos;
   }
}
