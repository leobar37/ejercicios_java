
package capa_negocio;

import capa_datos.Archivo;
import java.io.Serializable;

public class Investigador implements Serializable{
    private String codInvestigador;
    private String nombre;
    private int edad;
    private String sexo;
    private String universidad;

    public Investigador(String codInvestigador, String nombre, int edad, String sexo, String universidad) {
        this.codInvestigador = codInvestigador;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.universidad = universidad;
    }

    public String getCodInvestigador() {
        return codInvestigador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUniversidad() {
        return universidad;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    public static TListas.TLista  Consultar(){
       return Archivo.ObtenerInvestigador();
    }

}
