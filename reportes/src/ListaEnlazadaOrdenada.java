
public class ListaEnlazadaOrdenada extends ListaEnlazada {

    public ListaEnlazadaOrdenada() {
        super();
    }

    public ListaEnlazadaOrdenada insertarOrden(Object dato) {   
      Nodo nuevo = new Nodo(dato);
     int  aux = (int)dato;
      if(primero == null){
        primero = nuevo;          
       }else if(aux < (int)primero.getDato()){
           nuevo.setReferencia(primero);
           primero = nuevo;
       }else{
          Nodo actual, anterior;
          anterior = actual = primero;          
          while((actual.getReferencia() != null) && (aux > (int)actual.getDato())){
             anterior = actual;
             actual = actual.getReferencia();
             }
           if(aux > (int)actual.getDato()){
               anterior = actual;
           }
          nuevo.setReferencia(anterior.getReferencia());
          anterior.setReferencia(nuevo);
        }
        return this;
    }

}
