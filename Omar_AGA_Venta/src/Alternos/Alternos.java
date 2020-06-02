/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alternos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Alternos {
  //metodo 1 acomoda el nombre
  public static  String  AcomodaNombre(String nombre){
    //hacer minuscula todas las letras

     String[] nombres = nombre.split(" ");
       

     String nombreAc ="";
     for(int i =0;i<nombres.length;i++){
         int n = nombres[i].length();
         nombreAc = nombreAc + nombres[i].substring(0,1).toUpperCase() + nombres[i].substring(1,n) +" ";
     }
    return nombreAc; 
   } 

   //devuelve verdadero cuando el texto es numerico
    public static  boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
     } //Comprueba si el texto es un número

  //limitar teclado a solo numeros   
  public static  void limitarTeclado(JTextField texto) {
        texto.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != '.')) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }
  //metodo general para limpiar cajas
    public static void LimpiarCajas(JPanel panel){
      for(int i =0;i<panel.getComponents().length;i++){
          if(panel.getComponents()[i] instanceof JTextField){
              JTextField caja = (JTextField)panel.getComponents()[i];
              caja.setText("");
             
             
          }
          if(panel.getComponents()[i] instanceof JComboBox){
              JComboBox cbo = (JComboBox)panel.getComponents()[i];
              cbo.setSelectedIndex(-1);
            
          }
          if(panel.getComponents()[i] instanceof JTextArea){
              JTextArea textArea = (JTextArea) panel.getComponents()[i] ;
              textArea.setText("");
          }
            if(panel.getComponents()[i] instanceof JPasswordField){
                       JPasswordField campoContraseña = (JPasswordField)panel.getComponents()[i];
                       campoContraseña.setText("");
                     
                     }
          
      }
     }
    //regresa false cuando hay un campo vacio y verdadero cuando esta correcto
    public static boolean Probar(JPanel panel){
         boolean verificacion = true;
         for (int i = 0; i < panel.getComponents().length; i++) {
             
             if (panel.getComponents()[i] instanceof JTextField) {
                 JTextField caja = (JTextField) panel.getComponents()[i];
                   if (caja.getText().equals("")) {
                      
                         verificacion = false;
                     }

             } else {
                 if (panel.getComponents()[i] instanceof JComboBox) {
                     JComboBox cbo = (JComboBox) panel.getComponents()[i];
                     if (cbo.getSelectedIndex() == -1) {
                       
                         verificacion = false;
                           System.out.println("aqui"+verificacion);
                     }
                 }else{
                      if(panel.getComponents()[i] instanceof JPasswordField){
                       JPasswordField campoContraseña = (JPasswordField)panel.getComponents()[i];
                       String contraseña = new String(campoContraseña.getPassword());
                        if(contraseña.equals("") || contraseña.length() <=5){
                          verificacion = false;   
                        }
                     
                     }
                 }

             }
                    
                     
         }
     return  verificacion;
     }   
    //este metodo es parecido al anterior due necesario por un proble del Jcombobox
    public static boolean ProbarsinJcombo(JPanel panel){
         boolean verificacion = true;
         for (int i = 0; i < panel.getComponents().length; i++) {
             
             if (panel.getComponents()[i] instanceof JTextField) {
                 JTextField caja = (JTextField) panel.getComponents()[i];
                   if (caja.getText().equals("")) {
                      
                         verificacion = false;
                     }

             } else {
                 if (panel.getComponents()[i] instanceof JComboBox) {
                     JComboBox cbo = (JComboBox) panel.getComponents()[i];
                     if (cbo.getSelectedIndex() == -1) {
                       
                         //verificacion = false;
                           //System.out.println("aqui"+verificacion);
                     }
                 }else{
                      if(panel.getComponents()[i] instanceof JPasswordField){
                       JPasswordField campoContraseña = (JPasswordField)panel.getComponents()[i];
                       String contraseña = new String(campoContraseña.getPassword());
                        if(contraseña.equals("") || contraseña.length() <=5){
                          verificacion = false;   
                        }
                     
                     }
                 }

             }
                    
                     
         }
     return  verificacion;
     }   
}
