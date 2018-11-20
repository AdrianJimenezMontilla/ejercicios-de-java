/**
*  Capitulo 7
* 
* Ejercicio 6
* 
* Modifica el programa anterior de tal forma que no se repita ningún número en
* el array.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    
    int num [] [] = new int[6] [10];
    int fila;
    int columna;
    boolean repetido;
    int i;
    
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        do {
          num [fila] [columna] = (int)(Math.random() * 1001);
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i /10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
      
    }
    
    
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int maximoFila = 0;
    int maximoColumna = 0;
    int minimoFila = 0;
    int minimoColumna = 0;
    
    
    System.out.println ("Esta tabla de rellenara de numeros aleatorios");
    
    
    
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%7d ", num[fila][columna]);
        
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          minimoFila = fila;
          minimoColumna = columna;
        }
    
    
    
        if ( num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          maximoFila = fila;
          maximoColumna = columna;
        }
      }
    }
    
    
    
    System.out.println ("El maximo es: " + maximo +  " y se encuentra en la fila: " + maximoFila +  " columna: " +  maximoColumna);
    System.out.println ("El minimo es: " + minimo +  " y se encuentra en la fila: " + minimoFila + " columna " + minimoColumna);
    
  }
}
