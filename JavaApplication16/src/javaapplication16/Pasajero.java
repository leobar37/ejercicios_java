/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;


import java.util.Date;

public class Pasajero {

    private String codigo_Reser;
    private String dni;
    private String nombre;
    private Date fecha;
    private String tipo_vuelo;
    private String tipo_pasajero;
    private String cabina;
    private float costo;

    public Pasajero(String codigo_Reser, String dni, String nombre, Date fecha, String tipo_vuelo, String tipo_pasajero, String cabina, float costo) {
        this.codigo_Reser = codigo_Reser;
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo_vuelo = tipo_vuelo;
        this.tipo_pasajero = tipo_pasajero;
        this.cabina = cabina;
        this.costo = costo;
    }

    public Pasajero(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    
    public String getCabina() {
        return cabina;
    }

    public float getCosto() {
        return costo;
    }

    public String getCodigo_Reser() {
        return codigo_Reser;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public String getTipo_pasajero() {
        return tipo_pasajero;
    }

   

  //--------------- Reportes ------------------------------------// 

}
