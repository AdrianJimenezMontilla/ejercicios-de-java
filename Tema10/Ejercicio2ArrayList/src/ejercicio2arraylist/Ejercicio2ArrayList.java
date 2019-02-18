/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2arraylist;
import java.util.ArrayList;
/**
 *
 * @author pc21
 */
public class Ejercicio2ArrayList {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int suma = 0;
    int minimo = 100;
    int maximo = 0;
    int tamano = (int)(Math.random() * 11 + 10);
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    for (int i = 0; i < tamano; i++) {
      a.add((int)(Math.random()*101));
    }
    System.out.println("Lista: " + a);

    for(int n : a) {       
      suma += n;        
      
      if(n < minimo) {
        minimo = n;
      }
      
      if(n > maximo) {
        maximo = n;
      }
     }

    System.out.println("La suma total es : " + suma);
    System.out.println("La media es : " + suma / tamano);
    System.out.println("El mínimo es : " + minimo);
    System.out.println("El máximo es : " + maximo);         
  }// TODO code application logic here
  }
  

