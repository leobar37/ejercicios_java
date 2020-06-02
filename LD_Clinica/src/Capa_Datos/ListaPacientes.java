/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Datos;

import TListas.TLista;
import TListas.TListaDin;

/**
 *
 * @author laboratorio_computo
 */
public class ListaPacientes {
  static TLista objetos =new TListaDin();
  
  public static TLista consultar(){
    return objetos;
  }
  
  public static void adicionar(Object c){
     objetos.Adicionar(c);
      
  }
}

