package alternos;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Alternos {

    //metodo 1 acomoda el nombre

    public String AcomodaNombre(String nombre) {
        //hacer minuscula todas las letras
       nombre.toLowerCase();
        String[] nombres = nombre.split(" ");

        String nombreAc = "";
        for (int i = 0; i < nombres.length; i++) {
            int n = nombres[i].length();
            nombreAc = nombreAc + nombres[i].substring(0, 1).toUpperCase() + nombres[i].substring(1, n) + " ";
        }
        return nombreAc;
    }

    //devuelve verdadero cuando el texto es numerico
    public boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    } //Comprueba si el texto es un número

    //limitar teclado a solo numeros   
    public void limitarTeclado(JTextField texto) {
        texto.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && ( caracter != '.' )) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }
    
 
        public void limitarTecladoDni(JTextField texto) {
        texto.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }

    //metodo general para limpiar cajas

    public void LimpiarCajas(JPanel panel) {
        for (int i = 0; i < panel.getComponents().length; i++) {
            if (panel.getComponents()[i] instanceof JTextField) {
                JTextField caja = (JTextField) panel.getComponents()[i];
                caja.setText("");

            }
            if (panel.getComponents()[i] instanceof JComboBox) {
                JComboBox cbo = (JComboBox) panel.getComponents()[i];
                cbo.setSelectedIndex(-1);

            }

        }
    }

    //regresa false cuando hay un campo vacio y verdadero cuando esta correcto

    public boolean Probar(JPanel panel) {
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
                    }
                }

            }
        }
        return verificacion;
    }
   //regresa falso cuando el dni es incorrecto 
    public boolean ComprobarDni(String dni){
      boolean retorno = false;
       int num = dni.length();
      if(num  == 8){
          retorno = true;
      }
      
      return retorno;
    }
    

}
