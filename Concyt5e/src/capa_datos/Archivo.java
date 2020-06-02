/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_datos;

import TListas.TLista;
import TListas.TListaEn;
import capa_negocio.Investigador;
import capa_negocio.Proyecto;
import capa_negocio.Union_PI;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {
    
    //flujos para Proyectos
    public static void GuardarProyectos(TListas.TLista lista){
        try {
            FileOutputStream flujoSalida = new FileOutputStream("proyectos.bin");
            ObjectOutputStream flujo = new ObjectOutputStream(flujoSalida);
            for (int i = 0; i < lista.Cantidad(); i++) {
                Proyecto objProyecto=(Proyecto) lista.Obtener(i);
                flujo.writeObject(objProyecto);
                System.out.println("guarde"+objProyecto.getCodProyecto());
            }
            flujo.close();
            flujoSalida.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public static  TListas.TLista ObtenerProyectos(){
        TLista lista = new TListaEn();
        try {
            FileInputStream flujoEntrada = new FileInputStream("proyectos.bin");
            ObjectInputStream flujo = new ObjectInputStream(flujoEntrada);
            while(true){
                Proyecto objProyecto = (Proyecto) flujo.readObject();
                 lista.Adicionar(objProyecto);
                 System.out.println("lei"+objProyecto.getTitulo());
            }
          
        }catch(EOFException ex){
        return lista;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;     
    }
  //flujos para la interseccion
       public static void GuardarUnio_PI(TListas.TLista lista){
        try {
            FileOutputStream flujoSalida = new FileOutputStream("union.bin");
            ObjectOutputStream flujo = new ObjectOutputStream(flujoSalida);
            for (int i = 0; i < lista.Cantidad(); i++) {
                Union_PI objPI = (Union_PI) lista.Obtener(i);
                System.out.println("guarde"+objPI.getCodInvestigador()+objPI.getCodProyecto());
                flujo.writeObject(objPI);
                
            }
            flujo.close();
            flujoSalida.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
       public static  TListas.TLista ObtenerUnion_PI(){
        TLista lista = new TListaEn();
        try {
            FileInputStream flujoEntrada = new FileInputStream("union.bin");
            ObjectInputStream flujo = new ObjectInputStream(flujoEntrada);
            while(true){
              Union_PI objPI= (Union_PI) flujo.readObject();
                 lista.Adicionar(objPI);
                 System.out.println("lei"+objPI.getCodInvestigador()+objPI.getCodProyecto());
            }
        }catch(EOFException ex){
        return lista ;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;     
    }
  //flujos para Investigador  
         public static void GuardarInvestigador(TListas.TLista lista){
        try {
            FileOutputStream flujoSalida = new FileOutputStream("investigador.bin");
            ObjectOutputStream flujo = new ObjectOutputStream(flujoSalida);
            for (int i = 0; i < lista.Cantidad(); i++) {
                Investigador objInvestigador = (Investigador) lista.Obtener(i);
                flujo.writeObject(objInvestigador);
                System.out.println("agrego"+objInvestigador.getNombre());
            }
            flujo.close();
            flujoSalida.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
       public static  TListas.TLista ObtenerInvestigador(){
        TLista lista = new TListaEn();
        try {
            FileInputStream flujoEntrada = new FileInputStream("investigador.bin");
            ObjectInputStream flujo = new ObjectInputStream(flujoEntrada);
            while(true){
              Investigador objInvestigador= (Investigador) flujo.readObject();
                 lista.Adicionar(objInvestigador);
            }
        }catch(EOFException ex){
        return lista;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;     
    }
    public static void llenarListas(){
        ListaUnio_pi.LLenarLista();
        Lista_Investigador.LLenarLista();
        listaProyecto.LLenarLista();
        System.out.println("se llenaron las listas");
    }     
}
