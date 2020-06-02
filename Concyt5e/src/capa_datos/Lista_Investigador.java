
package capa_datos;

import TListas.TLista;
import TListas.TListaEn;
import static capa_datos.ListaUnio_pi.datos;
import static capa_datos.listaProyecto.datos;
import capa_negocio.Investigador;
import capa_negocio.Proyecto;
public class Lista_Investigador {
     public static TLista datos = new TListaEn();
   
   public static Object obtener(int i){
      return datos.Obtener(i);
   }
    public static void LLenarLista(){
  
       TLista lista = Archivo.ObtenerInvestigador();
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
      public static Object buscarProyecto(String codInvestigador){
          Investigador objInvestigador=null;
          TLista lista = new TListaEn();
          lista = Investigador.Consultar();
       for (int i = 0; i <lista.Cantidad(); i++) {
           objInvestigador = (Investigador) lista.Obtener(i);
           
           if(objInvestigador.getCodInvestigador().equalsIgnoreCase(codInvestigador)){
               return objInvestigador;
           }
       }
       return objInvestigador;
   }
}
