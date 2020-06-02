/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_negocio;

import capa_datos.Archivo;
import java.io.Serializable;


public class Union_PI implements Serializable{
    private String  codProyecto;
    private String codInvestigador;

    public Union_PI(String codProyecto, String codInvestigador) {
        this.codProyecto = codProyecto;
        this.codInvestigador = codInvestigador;
    }

    public String getCodProyecto() {
        return codProyecto;
    }

    public String getCodInvestigador() {
        return codInvestigador;
    }
     public static TListas.TLista  Consultar(){
       return Archivo.ObtenerUnion_PI();
    } 
}
