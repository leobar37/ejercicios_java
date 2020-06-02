package logica_de_negocios;

import TListas.*;
import capaDatos.ListaDocentes;

public class Docente {

    private String nombre;
    private String sexo;
    private int edad;
    private String carrera;
    private String nivelEstudios;
    private int tiempoDocencia;

    // El método constructor reemplaza todos los set
    public Docente(String nombre, String sexo, int edad, String carrera, String nivelEstudios, int tiempoDocencia) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.carrera = carrera;
        this.nivelEstudios = nivelEstudios;
        this.tiempoDocencia = tiempoDocencia;
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

    public String getCarrera() {
        return carrera;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public int getTiempoDocencia() {
        return tiempoDocencia;
    }

    //Te devuelve los objetos guardados en la lista dinamica
    public static TLista consultarTodos() throws Exception {
        return ListaDocentes.consultar();
    }

    public static TLista ListarNivelEstudio(String nivel) throws Exception {
        TLista listaFiltrada = new TListaDin();
        TLista lista;
        lista = Docente.consultarTodos();

        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getNivelEstudios().equalsIgnoreCase(nivel)) {
                listaFiltrada.Adicionar(objDocente);
            }
        }
        return listaFiltrada;
    }

    //a.	Número de docentes por nivel de estudios.
    public static int[] docentesNivelEstudios() throws Exception {
        TLista lista = Docente.consultarTodos();
        int cNivel[] = new int[3];

        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getNivelEstudios().equalsIgnoreCase("Titulo")) {
                cNivel[0]++;
            } else {
                if (objDocente.getNivelEstudios().equalsIgnoreCase("Maestría")) {
                    cNivel[1]++;
                } else {
                    cNivel[2]++;
                }
            }

        }
        return cNivel;
    }

    //       b.	Mostrar los docentes dada la carrera profesional
    public static TLista ListarCarrera(String carrera) throws Exception {
        TLista listaFiltrada = new TListaDin();
        TLista lista = Docente.consultarTodos();

        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getCarrera().equalsIgnoreCase(carrera)) {
                listaFiltrada.Adicionar(objDocente);
            }
        }
        return listaFiltrada;
    }

    //       c.	Qué docente con doctorado, tiene el mayor tiempo en la docencia.
    public static TLista consultarMayorTiempo() throws Exception {
        TLista listaFiltrada = new TListaDin();
        TLista lista;
        int mayor = 0;
        lista = Docente.ListarNivelEstudio("Doctorado");
        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getTiempoDocencia() > mayor) {
                mayor = objDocente.getTiempoDocencia();
            }
        }
        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getTiempoDocencia() == mayor) {
                listaFiltrada.Adicionar(objDocente);
            }
        }
        return listaFiltrada;
    }

    //       d.	Cuál es el promedio de edad de los docentes en cada carrera profesional
    public static float calculaPromedio(String carrera) throws Exception {
        int suma = 0, cCarrera = 0;
        float promedio;
        TLista lista = Docente.consultarTodos();

        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getCarrera().equalsIgnoreCase(carrera)) {
                suma += objDocente.getEdad();
                cCarrera++;
            }
        }
        if (cCarrera > 0) {
            promedio = (float) suma / cCarrera;
        } else {
            promedio = 0.0f;
        }
        return promedio;
    }

    public static TLista reporteMenortiempo(int tiempo) {
        TLista ListaFiltrada = new TListaDin();
        TLista lista= ListaDocentes.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Docente objDocente = (Docente) lista.Obtener(i);
            if (objDocente.getTiempoDocencia()<tiempo){
                ListaFiltrada.Adicionar(objDocente);
            }
        }
        return ListaFiltrada;
    }
    //Mostrar el numero de docentes, cuya edad sea mayor o igual a 65 años.
    public static int numerodedocentes(){
        TLista  lista = ListaDocentes.consultar();
        int contador = 0 ;
        for(int i=0; i<lista.Cantidad();i++){
            Docente obj = (Docente) lista.Obtener(i);
            if (obj.getEdad()>=65) {
                contador++ ;
            }
        }
        return contador;   
    }
}
