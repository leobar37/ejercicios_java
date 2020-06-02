package Capa_Negocios;

import TListas.TLista;
import TListas.TListaEn;


public class ListaEnlazadaOrdenada  {
    private Nodo primero;
    private Object dato;

    public ListaEnlazadaOrdenada() {
       this.primero = null;
    }
    public ListaEnlazadaOrdenada insertarOrden(Pasajero dato) {
        /*logica de la lista enlazada
          1. verifica si el primer nodo esta vacio 
          2. verificar si tiene dos elementos y si este es menor 
          3. recorrer toda la lista en busca de el espacio donde este sea menor
          4. enlazar el tercer nodo hacia el segundo  
        */
      Nodo nuevo = new Nodo(dato);
      Pasajero obj = (Pasajero)nuevo.dato;
      
      if(primero == null){
       primero= nuevo;          
       }else{
           Pasajero aux = (Pasajero)primero.getDato();       
           if(obj.getCosto() < aux.getCosto()){
           nuevo.setReferencia(primero);
           primero = nuevo;
       }else{
          Nodo actual, anterior;
          anterior = actual = primero;
           aux = (Pasajero)actual.dato;
           
          while((actual.getReferencia() != null) && (obj.getCosto() > aux.getCosto())){
             anterior = actual;
             actual = actual.getReferencia();
             aux = (Pasajero)actual.dato;
             }
           if(obj.getCosto() > aux.getCosto()){
               anterior = actual;
           }
            
          nuevo.setReferencia(anterior.getReferencia());
          anterior.setReferencia(nuevo);
        }
 
      }
        return this;

    }
    public TLista  obtenerLista(){
        TLista lista = new TListaEn();
        Nodo nodov;
        nodov = primero;
        while (nodov != null) {
            Pasajero obj = (Pasajero)nodov.getDato();
            lista.Adicionar(obj);
            System.out.println(obj.getCosto());
            nodov = nodov.referencia;
        }
        return lista;
    }
    

}
