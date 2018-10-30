/**
*  Capitulo 6
* 
* Ejercicio 7
* 
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto
* @author Adrian Jimenez Montilla
*/

public class Ejercicio7 {
  public static void main(String[] args) {
  
    int columnas = 3;
    int resultado;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) {
        columnas = 1;
      }
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultado = (int)(Math.random() * 3) + 1;
        switch (resultado) {
          case 1:
            System.out.print("1 |");
            break;
          case 2:
            System.out.print("2 |");
            break;
          case 3:
            System.out.print("X |");
            break;
          default:
        }
      }
    }
  }
}
