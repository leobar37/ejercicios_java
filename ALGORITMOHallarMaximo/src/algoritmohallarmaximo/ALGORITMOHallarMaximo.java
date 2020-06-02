/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmohallarmaximo;

import com.sun.prism.j2d.J2DPipeline;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class ALGORITMOHallarMaximo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MetodoBurbuja();
        
        
        
    }
    public void minMax(){
        
        int[] myList = {5,4,8,18,3,2,9};
		Scanner obtenerNumero = new Scanner(System.in);
		int i, max, min, suma;
 
		min=max=myList[0];
 
		for(i = 0; i < myList.length; i++)
		{
			if(min>myList[i])
			{
				min=myList[i];
			}
			if(max<myList[i])
			{
				max=myList[i];
			}
		}
 
		System.out.println("El máximo es " + max + " y el minimo es " + min);
    }
  public static void MetodoBurbuja(){
      Scanner entrada =new Scanner(System.in);
       
      int taman = Integer.parseInt( JOptionPane.showInputDialog("Hola  digita el numero"));
      int  areglo[] = new int[taman];
      for(int i = 0; i<areglo.length; i++){
          System.out.println("Digite el numero "+(i+1));
          areglo[i] = entrada.nextInt();
      }
      //-----------------------Burbuja -----------------//
      for (int i = 0; i < areglo.length-1; i++) {//5
          for (int j = 0; j < areglo.length-1; j++) {
              if(areglo[j]> areglo[j+1]){
                  int aux = areglo[j];
                  areglo[j] = areglo[j+1];
                  areglo[j+1] = aux;
              }
          }            
      }
        for(int i = 0; i<areglo.length; i++){
          System.out.println(""+areglo[i]);
          
      }
      
      
      
  } 
    
}
