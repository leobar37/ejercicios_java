/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author JOSE
 */
public class probar {
    public static void main(String[] args) {
        System.out.println("hola");
        ListaEnlazadaOrdenada lista = new ListaEnlazadaOrdenada();
        Pasajero obj1 = new Pasajero("arturo", 150);
        Pasajero obj2 = new Pasajero("arturo", 180);
        Pasajero obj3 = new Pasajero("arturo", 70);
        Pasajero obj4 = new Pasajero("arturo", 500);
        Pasajero obj5 = new Pasajero("arturo", 80);
        Pasajero obj6 = new Pasajero("arturo", 20);
      
        lista.insertarOrden(obj1);
        lista.insertarOrden(obj2);
        lista.insertarOrden(obj3);
        lista.insertarOrden(obj4);
        lista.insertarOrden(obj5);
        lista.insertarOrden(obj6);
        lista.verLista();
    }
}
