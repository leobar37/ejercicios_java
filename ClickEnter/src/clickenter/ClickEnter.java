import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface ClickEnterListener extends ActionListener, KeyListener {
     
     @Override
     default public void actionPerformed( ActionEvent e ) {
         System.out.println("ap");
     }
     @Override
     default public void keyPressed( KeyEvent ke ) {        
         if (ke.getKeyCode() == KeyEvent.VK_ENTER) {            
             realAction();
             System.out.println("hola");
         }
      }
     @Override
     default public void keyReleased( KeyEvent ke ) {}
     @Override
     default public void keyTyped( KeyEvent ke ) {}

     void realAction();
}    
 
class Ejemplo {
 
   public static void main( String ... args ) {  
       JFrame f = new JFrame();
       JButton abrir  = new JButton("a") ;
       JButton cerrar = new JButton("b");
       JPanel p = new JPanel();
       p.add(abrir );
       p.add(cerrar);
       f.add(p);
       f.pack();
       f.setVisible(true);
       
       registra( abrir, () -> System.out.println("Abriendo"));    
       registra( cerrar, () -> System.out.println("Cerrando"));
    }

   public static void registra( JButton b, ClickEnterListener cel ) {
        b.addActionListener(cel);
        // por default la tecla espacio esta registrada como action
        // listener, con esto se desasocia
       // b.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0),"" );
        b.addKeyListener(cel);
    }
}