/**
 *  Capitulo 5
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio11 {
  public static void main(String[] args) {
  
    System.out.println("Cuadrado y el cubo de los 5 primeros numeros.");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int contador = numero; contador < numero + 5; contador++) {
    
      System.out.printf("%4d %6d %8d\n", contador, contador * contador, contador * contador * contador);
    }
  }
}
  
