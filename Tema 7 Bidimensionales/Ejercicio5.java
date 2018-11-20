/**
*  Capitulo 7
* 
* Ejercicio 5
* 
* Realiza un programa que rellene un array de 6 filas por 10 columnas con
* números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
* A continuación, el programa deberá dar la posición tanto del máximo como
* del mínimo.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    
    int num [] [] = new int[6] [10];
    int fila;
    int columna;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int maximoFila = 0;
    int maximoColumna = 0;
    int minimoFila = 0;
    int minimoColumna = 0;
    
    System.out.println ("Esta tabla de rellenara de numeros aleatorios");
    
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        num [fila] [columna] = (int)(Math.random() * 1001);
        System.out.printf ("%5d   ", num[fila][columna]);
        
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
