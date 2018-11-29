/**
*  Capitulo 7
* 
* Ejercicio 10
* 
* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
* y que los almacene en un array. El programa debe ser capaz de pasar todos
* los números pares a las primeras posiciones del array (del 0 en adelante) y
* todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
* es necesario.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio10 {
  public static void main(String[] args) {
  
    int[] numero = new int[20];
    int i;
    int j;
    int k;
    int aux;
    
    for (i = 0; i < 20;i++) {
      numero[i] = (int)(Math.random() * 101);
      System.out.print (numero[i] + " ");
    }
    
    for (i = 0; i < 20; i++) {
      j = i;
      while ((numero[j++] % 2 != 0) && (j < 20));
      if (j < 20) {
        for (k = j - 1; k > i; k--) {
          aux = numero[k];
          numero[k] = numero[k - 1];
          numero[k - 1] = aux;
        }
      }
    }
    System.out.println("\nArray con los pares al principio:");
    for (i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
  }
}
