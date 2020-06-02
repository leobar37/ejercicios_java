
package Aplicacion;


public class Generador {
   
    public static String GenerarDni(){
       String numeroSr  =  "";
        for (int i = 0; i < 8; i++) {
            int numero = (int)(Math.random()*10); 
            if(i == 0 && numero == 0){
               int aux = (int)(Math.random()*8+1); 
               numero = aux;
            } 
            numeroSr  =  numeroSr + numero;
        }
        return  numeroSr;
    }
      public static String GenerarRuc(){
       String numeroSr  =  "";
        for (int i = 0; i < 11; i++) {
            int numero = (int)(Math.random()*10); 
            if(i == 0 && numero == 0){
               int aux = (int)(Math.random()*8+1); 
               numero = aux;
            } 
            numeroSr  =  numeroSr + numero;
        }
        return  numeroSr;
    }
        public static String GeneraTelefono(){
       String numeroSr  =  "9";
        for (int i = 0; i < 8; i++) {
            int numero = (int)(Math.random()*10); 
            if(i == 0 && numero == 0){
               int aux = (int)(Math.random()*8+1); 
               numero = aux;
            } 
            numeroSr  =  numeroSr + numero;
        }
        return  numeroSr;
    }
      
   
    public static void main(String[] args) {
        String s;
        
        for (int i = 0; i < 10; i++) {
          
            System.out.println("S2"+i);
        }
        
    }
}
