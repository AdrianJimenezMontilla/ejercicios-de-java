/**
 *  Capitulo 5
 * 
 * Ejercicio 6
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle do while.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio6 {
  public static void main(String[] args) {
  
    System.out.println("Este programa muestra los numeros del 320 al 160");
      
      int i = 320;
      
      do {
        System.out.println (i);
        i-= 20;
      } while (i > 159);
    }
  }
  
