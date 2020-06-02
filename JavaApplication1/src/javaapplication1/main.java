/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class main {
    public void main(String [] args){
      

      
        int a = Integer.parseInt(JOptionPane.showInputDialog("intrduce el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("intrduce el segundo numero"));
    
    
         Operacion op = new Operacion();     
         System.out.println("la suma es" + op.sumar(a,b));
         
    }                      
}
