/**
 *  Capitulo 5
 * 
 * Ejercicio 15
 * 
 * 16. Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad..
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio16 {
  public static void main(String[] args) {
  
    System.out.println("Introduce un numero entero y veremos si es primo");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    boolean esPrimo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
  }
}
    
