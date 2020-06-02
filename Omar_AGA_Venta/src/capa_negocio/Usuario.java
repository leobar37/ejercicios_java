/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_negocio;

public class Usuario {
  private int idPersona;
  private int tipo_usuario;
  private String nombre;
  private String nombre_Usuario;
  private String dni;
  private String contraseña;
    public Usuario() {
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
   
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  
 

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public String getDni() {
        return dni;
    }
  
}
