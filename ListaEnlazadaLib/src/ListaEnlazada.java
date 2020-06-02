
public class ListaEnlazada {
 /*     _                 _                      _                      _____   _____ 
 | |__    _     _    | |       ___     ___  | |__     __ _   _ __  |___ /  |___  |
 | '_ \  | | | |    |   |      / _ \   / _ \ | '_ \   / _` | | '__|   |_ \     / / 
 | |_) | | |_| |  |   |___  | (_) | |  __/ | |_) | | (_| | | |     ___) |   / /  
 |_.__/   \__,|    |_____|  \___/   \___| |_.__/   \__,_| |_|    |____/   /_/   
          |___/ 
*/

    protected Nodo primero;
    private int cantidad;
    
    public ListaEnlazada() {
        primero = null;
        cantidad = 0;
    }
   //inserta al final de la lista  
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setReferencia(primero);
        primero = nuevo;
        cantidad++;
    }
  //   
    public void agregar(Object dato) {
        Nodo nuevoF = new Nodo(dato);
        nuevoF.referencia = null;
        if (primero == null) {
            primero = nuevoF;
            cantidad++;
            return;
        }
        Nodo aux;
        for (aux = primero; aux.getReferencia() != null; aux = aux.getReferencia()) {
        }
        aux.setReferencia(nuevoF);
        cantidad++;
    }
    
    public int tamaño() {
        return cantidad;
    }
    
    public Object Buscar(int pos) {
        Nodo aux = null;
        if (pos == 0) {
            aux = primero;
            return aux.dato;
        } else {
            aux = primero;
            if (pos > 0 && (pos <= cantidad)) {
                for (int i = 0; i < pos; i++) {
                    aux = aux.getReferencia();
                }
            }
            return aux.dato;
        }
    }
    //dado el objeto retorna su posicion
    public int BucarPos(Object dato){
         for (int i = 0; i < cantidad; i++) {
              Object com =  Buscar(i);
              if(com == dato){
                  return i;
              }
        }
        return -1;
    }
    //dado el objecto lo elimina
    public void EliminarO(Object dato) {
        Nodo anterior, actual;
        boolean encontrado = false;
        actual = primero;
        anterior = null;
        while (actual != null && !encontrado) {
            encontrado = actual.getDato() == dato;
            if (!encontrado) {
                anterior = actual;
                actual = actual.referencia;
            }
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.getReferencia();
                cantidad--;
            } else {
                anterior.setReferencia(actual.getReferencia());
                cantidad--;
            }
            
        }
        
    }
    //elimina dada la posicion
    public void Eliminar(int pos) {
        Nodo actual, anterior;
        actual = primero;
        anterior = null;
        if (pos == 0) {
            primero = actual.referencia;
        } else {
            
            if (pos > 0 && pos <= cantidad) {
                for (int i = 0; i < pos; i++) {
                    anterior = actual;
                    actual = actual.referencia;
                }
                if (pos == cantidad) {
                    anterior = actual;
                    anterior = null;
                } else {
                    anterior.setReferencia(actual.getReferencia());
                }
            }
            
        }
        
    }

}
