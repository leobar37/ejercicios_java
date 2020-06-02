package capa_negocio;

import TListas.TLista;
import TListas.TListaEn;
import capa_datos.SqlConsultaGasto;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import sun.security.jca.GetInstance;

public class Gasto {

    private int idGasto;
    private float monto;
    private String descripcion;
    private int idTipoGasto;
    private Date realizacion;

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTipoGasto() {
        return idTipoGasto;
    }

    public void setIdTipoGasto(int idTipoGasto) {
        this.idTipoGasto = idTipoGasto;
    }

    public Date getRealizacion() {
        return realizacion;
    }

    public void setRealizacion(Date realizacion) {
        this.realizacion = realizacion;
    }

    //******Procesos del Gasto*******//
    public static TLista Consultar() {
        SqlConsultaGasto consulta = new SqlConsultaGasto();

        return consulta.ConsultarGastos();
    }

    public static boolean ConsultarExistencias(String name) {
        TLista lista = new TListaEn();
        lista = Gasto.Consultar();
        boolean verificacion = true;
        Gasto obj;
        for (int i = 0; i < lista.Cantidad(); i++) {
            obj = (Gasto) lista.Obtener(i);
            if (obj.getDescripcion().equalsIgnoreCase(name)) {
                verificacion = false;
            }
        }
        return verificacion;
    }

    public static Gasto buscarGasto(int id) {
        TLista lista = new TListaEn();
        lista = Gasto.Consultar();
        Gasto obj;
        Gasto retorno = null;
        for (int i = 0; i < lista.Cantidad(); i++) {
            obj = (Gasto) lista.Obtener(i);
            int idTipo = obj.idGasto;
            if (id == idTipo) {
                retorno = obj;
            }
        }
        return retorno;

    }
    //buscar por tipo de gasto
    public static TLista BuscarXtipo(int idTipoGasto) {
        TLista lista = new TListaEn();
        lista = Gasto.Consultar();
        TLista retorno = new TListaEn();
        Gasto objGasto;
        for (int i = 0; i < lista.Cantidad(); i++) {
            objGasto = (Gasto) lista.Obtener(i);
            if (objGasto.getIdTipoGasto() == idTipoGasto) {
                retorno.Adicionar(objGasto);
            }
        }
        return retorno;
    }
//retorna una lista de acuerdo a un intervalo de fechas determinado 
    public static TLista GastosEnIntervaloTiempo(Date fecha_inicio, Date fecha_fin) {
        TLista listaResult = new TListaEn();//lista resultado
        TLista lista = new TListaEn();//lista de gastos
        lista = Gasto.Consultar();//llenar la lista
        java.util.List<Date> listFechas = new java.util.ArrayList<Date>();//lista de fechas
        listFechas = getIntervaloFechas(fecha_inicio, fecha_fin);
        for (int i = 0; i < listFechas.size(); i++) {
            Date tiempo = listFechas.get(i);//fecha encontrada
            String fechaActual = convertir(tiempo);//fecha en formato String
            for (int j = 0; j < lista.Cantidad(); j++) {//recorre la lista normal en busca de coincidencias
                Gasto objGasto = (Gasto) lista.Obtener(j);
                if (objGasto.getRealizacion() != null) {//por si el gasto es nulo y no salte el error
                    Date fechaCom = objGasto.getRealizacion();//fecha del objeto 
                    String fec = convertir(fechaCom);//convierto a String        
                    if (fechaActual.equalsIgnoreCase(fec)) {//si la fecha coincide entonces me interesa xd
                        listaResult.Adicionar(objGasto);
                    }
                }
            }
        }
        return listaResult;
    }

    public static String convertir(Date time) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        return formato.format(time);
    }

    public static java.util.List<Date> getIntervaloFechas(java.util.Date fecha_inicio, java.util.Date fecha_fin) {
        Calendar fechaInicio = Calendar.getInstance();//convertir la fechas a calendar por que es mas comodo manejar fechas
        fechaInicio.setTime(fecha_inicio);
        Calendar fechaFin = Calendar.getInstance();
        fechaFin.setTime(fecha_fin);
        java.util.List<Date> listaFechas = new java.util.ArrayList<Date>();
        while (!fechaInicio.after(fechaFin)) {
            listaFechas.add(fechaInicio.getTime());
            fechaInicio.add(Calendar.MONTH, 1);
        }
     //   System.out.println("" + listaFechas.size());
        return listaFechas;
    }
   
}
