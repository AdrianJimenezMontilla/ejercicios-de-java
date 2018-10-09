/**
 *  Capitulo 5
 * 
 Ejercicio 8
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 *@author Adrian Jimenez Montilla
 */
 
 public class Ejercicio8 {
    
  public static void main(String[] args) {
  
    System.out.println ("Introduce un numero para mostrar su tabla de multiplicar");
    
    int numero = Integer.parseInt(System.console().readLine());
    int multiplo = 0;
    
    for (int i = 0; i <= 10; i++) {
    
      multiplo = numero * i;
      
      System.out.println (numero + " x " + i + " = " + multiplo);
      
      }
    }
  }
