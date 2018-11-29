/**
*  Capitulo 7
* 
* Ejercicio 11
* 
* Realiza un programa que pida 10 números por teclado y que los almacene en un array.
* A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
* Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
* el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
* Al final se debe mostrar el array resultante.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio11 {
  public static void main(String[] args) {
  
    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    System.out.println("Introduzca 10 números");
    
    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
      esPrimo = true;
      for (j = 2; j < n[i] - 1; j++) {
        if (n[i] % j == 0) {
          esPrimo = false;
        }
      }
    
    if (esPrimo) {
      primo[primos++] = n[i];
    } else {
      noPrimo[noPrimos++] = n[i];
    }
  }
  for (i = 0; i < primos; i++) {
    n[i] = primo[i];
  }
  for (i = primos; i < primos + noPrimos; i++) {
    n[i] = noPrimo[i - primos];
  }
  System.out.println("\n\nArray con los primos al principio:");
  System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
  System.out.print("│ Índice ");
   for (i = 0; i < 10; i++) {
     System.out.printf("│%4d ", i);
   }
  System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
  System.out.print("│ Valor  ");
   for (i = 0; i < 10; i++) {
     System.out.printf("│%4d ", n[i]);
   }
   System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}

  
  
  
  
