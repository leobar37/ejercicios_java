package Capa_Negocio;

import TListas.TLista;
import TListas.TListaDin;
import Capa_Datos.ListaPacientes;

public class Paciente {

    private String nombre;
    private String sexo;
    private int edad;
    private String tipo;
    private String tratamiento;
    private float costo_consulta;

    public Paciente(String nombre, String sexo, int edad, String tipo, String tratamiento, float costo_consulta) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.tipo = tipo;
        this.tratamiento = tratamiento;
        this.costo_consulta = costo_consulta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public float getCosto_consulta() {
        return costo_consulta;
    }

    public static TLista consultar() {
        return ListaPacientes.consultar();
    }
    //-----------Reportes------------------//
    //pacientes por tipo  

    public static TLista mostrarPacientesporTipo(String tipo) {
        TLista retorno = new TListaDin();
        TLista lista = new TListaDin();
        Paciente paciente;
        lista = Paciente.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            paciente = (Paciente) lista.Obtener(i);
            if (paciente.getTipo().equalsIgnoreCase(tipo)) {
                retorno.Adicionar(paciente);
            }
        }
        return retorno;
    }

    //Dado el tratamiento mostrar los pacientes de menor y mayor edad
    

    public static int[] mostrarPacientesporEdadTratamiento(String tratamiento) {
        int retorno[] = new int[2];
        int contMayores = 0;
        int contMenores = 0;
        TLista lista = new TListaDin();
        Paciente paciente;
        lista = Paciente.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            paciente = (Paciente) lista.Obtener(i);
           if(paciente.getTratamiento().equalsIgnoreCase(tratamiento)){
            if (paciente.getEdad() >= 18) {
                contMayores++;
            } else {
                contMenores++;
            }
           }
        }
        retorno[0] = contMayores;
        retorno[1] = contMenores;
        return retorno;

    }

    //motrar promedio de los hombre y las mujeres
    public static int[] mostrarPacientesSexo() {
        int retorno[] = new int[2];
        int contMujeres = 0;
        int contVarones = 0;
        int acumuladorMuj = 0;
        int acumuladorVar = 0;
        TLista lista = new TListaDin();
        Paciente paciente;
        lista = Paciente.consultar();
        int total = lista.Cantidad();
        for (int i = 0; i < lista.Cantidad(); i++) {
            paciente = (Paciente) lista.Obtener(i);

            if (paciente.getSexo().equalsIgnoreCase("Femenino")) {
                contMujeres++;
                acumuladorMuj = acumuladorMuj + paciente.getEdad();

            } else {
                contVarones++;
                acumuladorVar = acumuladorVar + paciente.getEdad();
            }

        }
        try{
           retorno[0] = contMujeres / acumuladorMuj;  
        }catch(ArithmeticException ex){
            retorno[0] = 0;
        }
       
        try{
          retorno[1] = contVarones / acumuladorVar;  
        }catch(ArithmeticException ex){
          retorno[1] = 0;  
        }

        return retorno;

    }
    //mostrar  por mayor tiempo de consulta 

    public static TLista mostrarPacienteMayorCosto() {

        float costo;
        Paciente retorno = null;
        TLista lista = new TListaDin();//lista que recorre
        Paciente paciente; //paciente actual
        TLista milista = new TListaDin();
        lista = Paciente.consultar();
        
        if(lista.Cantidad() != 0){
                    Paciente objUltimo = (Paciente) lista.Obtener(lista.Cantidad());
        
        costo = objUltimo.getCosto_consulta();
        for (int i = lista.Cantidad() - 1; i > 0; i++) {
            paciente = (Paciente) lista.Obtener(i); //paciente actual
            if (paciente.getTipo().equalsIgnoreCase("ortodoncia")) {
                if (paciente.getCosto_consulta() < costo) {
                    costo = paciente.getCosto_consulta();
                }
            }

        }
        for (int i = 0; i <lista.Cantidad(); i++) {
            paciente = (Paciente) lista.Obtener(i); //paciente actual
            if (paciente.getTipo().equalsIgnoreCase("ortodoncia")) {
                if (paciente.getCosto_consulta() == costo) {
                    System.out.println("entro aqui" + paciente.getNombre());
                    milista.Adicionar(paciente);

                }
            }
        }
        }

        return milista;

    }

    public static String incidencia() {
        String incidencias = "";
        Paciente paciente; //paciente actual
        TLista milista = new TListaDin();
        milista = Paciente.consultar();
       if(milista.Cantidad() != 0){
            int con1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        for (int i = 0; i < milista.Cantidad(); i++) {
            Paciente pas = (Paciente) milista.Obtener(i);
            if (pas.getTipo().equalsIgnoreCase("extracción de diente")) {
                con1++;
            }
            if (pas.getTipo().equalsIgnoreCase("endodoncia")) {
                cont2++;
            }
            if (pas.getTipo().equalsIgnoreCase("curacion simple")) {
                cont3++;
            }
            if (pas.getTipo().equalsIgnoreCase("ortodoncia")) {
                cont4++;
            }

        }
        ValorIncidencia obj1 = new ValorIncidencia("extracción de diente");
        obj1.aumentar(con1);
        ValorIncidencia obj2 = new ValorIncidencia("endodoncia");
        obj2.aumentar(cont2);
        ValorIncidencia obj3 = new ValorIncidencia("curacion simple");
        obj3.aumentar(cont3);
        ValorIncidencia obj4 = new ValorIncidencia("ortodoncia");
        obj4.aumentar(cont4);
        ValorIncidencia arre[] = {obj1, obj2, obj3, obj4};
        int valor = 0;
        ValorIncidencia retorno = null;
        for (int i = 0; i < arre.length; i++) {
            ValorIncidencia aux = arre[i];
            if (aux.getCont() > valor) {
                valor = aux.getCont();
                retorno = aux;
            }
        }
        for (int i = 0; i < arre.length; i++) {
            ValorIncidencia aux = arre[i];
            if ((retorno.getCont() == aux.getCont()) && (!aux.getTipo().equalsIgnoreCase(retorno.getTipo()))) {
                incidencias = incidencias + aux.getTipo()+"%";
            }
        }

      
       }
       return incidencias;  
    }


}
