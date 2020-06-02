/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;

/**
 *
 * @author JOSE
 */
public class Paquete_Salida implements Serializable{
  private String mensaje;
  private String ip;
  private String name;

    public Paquete_Salida(String mensaje, String ip, String name) {
        this.mensaje = mensaje;
        this.ip = ip;
        this.name = name;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }
  



}
