/**
*  Capitulo 7
* 
* Ejercicio 3
* 
* Modifica el programa anterior de tal forma que los números que se introducen
* en el array se generen de forma aleatoria (valores entre 100 y 999).
* @author Adrian Jimenez Montilla
*/

public class Ejercicio3 {
  public static void main(String[] args) {
  
    int num [] [] = new int[4] [5];
    int fila;
    int columna;
    int sumaFila;
    int sumaColumna;
    int sumaTotal= 0;
    
    System.out.println ("Numeros generados aleatoriamente entre el 100 y 999");
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        num [fila] [columna] = (int)(Math.random() * 900) + 100;
      }
    }
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf ("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    for (columna = 0;columna < 5;columna++) {
      System.out.print ("----------");
    }
    System.out.println ("----------");
    
    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
