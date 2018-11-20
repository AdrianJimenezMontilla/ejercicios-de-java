/**
*  Capitulo 7
* 
* Ejercicio 4
* 
* Modifica el programa anterior de tal forma que las sumas parciales y la suma
* total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
* que el ordenador se queda “pensando” antes de mostrar los números.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio4 {
  public static void main(String[] args) 
    throws InterruptedException {
  
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
        Thread.sleep(100);
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
      Thread.sleep(300);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
