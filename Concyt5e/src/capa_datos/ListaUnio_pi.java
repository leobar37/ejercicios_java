package capa_datos;

import TListas.TLista;
import TListas.TListaEn;
import capa_negocio.Investigador;
import capa_negocio.Proyecto;
import static capa_negocio.Proyecto.Consultar;
import capa_negocio.Union_PI;

public class ListaUnio_pi {

    public static TLista datos = new TListaEn();

    public static Object obtener(int i) {
        return datos.Obtener(i);
    }

    public static void adicionar(Object c) {
        datos.Adicionar(c);
    }

    public static void LLenarLista() {
        TLista lista = Archivo.ObtenerUnion_PI();
        for (int i = 0; i < lista.Cantidad(); i++) {
            datos.Adicionar(lista.Obtener(i));
        }
    }

    public static TLista consultar() {
        return datos;
    }

    //dado el codigoInvestigador que retorne todos sus proyectos
    public static TLista BuscarInvestigador(String codInvestigador) {
        TLista retorno = new TListaEn();
        TLista lista = new TListaEn();
        lista = consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Union_PI objPI = (Union_PI) lista.Obtener(i);
            if (objPI.getCodInvestigador().equalsIgnoreCase(codInvestigador)) {
                Proyecto objProyecto = (Proyecto) listaProyecto.buscarProyecto(objPI.getCodProyecto());
                retorno.Adicionar(objProyecto);
            }
        }
        return retorno;
    }

    //dado el codigo de proyecto retorne los investigadores que estan trabajando en el 
    public static TLista BuscarProyectos(String codProyectos) {
        TLista retorno = new TListaEn();
        TLista lista = new TListaEn();
        lista = consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Union_PI objPI = (Union_PI) lista.Obtener(i);
            if (objPI.getCodProyecto().equalsIgnoreCase(codProyectos)) {
                Investigador objInvestigador = (Investigador) Lista_Investigador.buscarProyecto(objPI.getCodInvestigador());
                retorno.Adicionar(objInvestigador);
            }
        }
        return retorno;
    }

    public static TLista InvestigadorxUniversidad() {
        TLista lista = new TListaEn();
        TLista listaFil = new TListaEn();
        lista = listaProyecto.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objProyecto = (Proyecto) lista.Obtener(i);
            TLista listanueva = ListaUnio_pi.BuscarProyectos(objProyecto.getCodProyecto());
            int cont = 0;
            for (int j = 0; j < listanueva.Cantidad(); j++) {
                Investigador objInvestigador = (Investigador) listanueva.Obtener(j);
                if (objInvestigador.getUniversidad().equalsIgnoreCase("USAT")) {
                    cont++;
                }
            }
            if (cont > 0) {
                listaFil.Adicionar(objProyecto);
            }

        }
        return listaFil;
    }

}
