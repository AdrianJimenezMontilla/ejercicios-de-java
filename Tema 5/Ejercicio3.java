/**
 *  Capitulo 5
 * 
 * Ejercicio 3
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while .
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio3 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra los multiplos de 5 con un bucle do while");
    
    int i = 0;
    
    do {
      System.out.println (i);
      i+=5;
    } while (i < 101);
  }
}
