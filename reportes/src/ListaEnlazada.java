
public class ListaEnlazada {
    private int indice;
    protected Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
        indice=0;

    }
   public int cantidad(){
       return 0;
   }
    public ListaEnlazada agregarInicio(Object dato) {
        indice++;
        Nodo nuevo;
        nuevo = new Nodo(dato);
       
        nuevo.referencia = primero;
        primero = nuevo;
        return this;

    }

    public void agregarl(Object dato) {
        Nodo nodoF;//nodo que se establecera en el final
        nodoF = new Nodo(dato);//dato del nodo final
        nodoF.referencia = null;//su referencia va ser nula por que es el ultimo
        if (primero == null) {//si no hay un elemento es establecera primer
            primero = nodoF;
            return;
        }
        Nodo aux;
        //recorrer el hasta que este sea el ultmimo menos 1
        for (aux = primero; aux.referencia != null; aux = aux.getReferencia());
        aux.setReferencia(nodoF);
        indice++;

    }

    public Persona buscar(String dni) {
        Nodo nodo = primero;
        Persona obj;
        Persona retor = null;
        boolean encontrado = false;
        while (nodo != null && !encontrado) {
            obj = (Persona) nodo.dato;
            encontrado = (obj.getDni().equals(dni));
            if (encontrado) {
                retor = obj;
            }

            nodo = nodo.referencia;
        }
        return retor;
    }

    public void Eliminar(Object dato) {
        boolean encontrado = false;
        Nodo actual = primero;
        Nodo anterior = null;

        while (actual != null && !encontrado) {
            encontrado = (actual.dato == dato);
            if (!encontrado) {
                anterior = actual;
                actual = actual.referencia;
            }

            if (actual != null) {

                if (actual == primero) {
                    primero = actual.referencia;

                } else {
                    anterior.setReferencia(actual.referencia);

                }
            }
        }

    }

    public void verLista() {
        Nodo nodov;
        nodov = primero;

        while (nodov != null) {
            int obj = (int) nodov.dato;
            System.out.println(obj);
            nodov = nodov.referencia;
        }
    }

    public static void main(String[] args) {
      ListaEnlazadaOrdenada obj = new ListaEnlazadaOrdenada();
      obj.insertarOrden(5);
      obj.insertarOrden(3);
      obj.insertarOrden(8);
      obj.insertarOrden(6);
      obj.insertarOrden(4);
      obj.insertarOrden(1);
      obj.verLista();
      

    }

}
