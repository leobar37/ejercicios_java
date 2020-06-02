package Capa_Negocio;

public class ValorIncidencia {

    private int cont;
    private String tipo;

    public ValorIncidencia(String tipo) {
        this.tipo = tipo;
        this.cont = 0;
    }

    public ValorIncidencia(int cont, String tipo) {
        this.cont = cont;
        this.tipo = tipo;
    }

    public void aumentar(int i) {
        this.cont = this.cont + i;
    }

    public int getCont() {
        return cont;
    }

    public String getTipo() {
        return tipo;
    }

    public static void main(String[] args) {
        String  uwu = "";
        ValorIncidencia obj2 = new ValorIncidencia(5, "enfermeria");
        ValorIncidencia obj5 = new ValorIncidencia(50, "me encontre");
        ValorIncidencia obj6 = new ValorIncidencia(50, "encontre");
        ValorIncidencia obj7 = new ValorIncidencia(50, "hoal");
        ValorIncidencia obj3 = new ValorIncidencia(8, "mecanica");
        ValorIncidencia obj4 = new ValorIncidencia(3, "mecanica");

        ValorIncidencia arre[] = {obj2, obj3, obj4, obj5, obj6,obj7};
        int valor = 0;
        ValorIncidencia retorno = null;
        for (int i = 0; i < arre.length; i++) {
            ValorIncidencia aux = arre[i];
            if (aux.getCont() >= valor) {
                valor = aux.getCont();
                retorno = aux;
            }
        }
        for (int i = 0; i < arre.length; i++) {
            ValorIncidencia aux = arre[i];
             if((retorno.getCont() == aux.getCont()) && (!aux.getTipo().equalsIgnoreCase(retorno.getTipo()))){
                uwu =  uwu +"%"+ aux.getTipo();
             }
        }

        System.out.println("el valor mayor es: " + uwu);
    }
}
