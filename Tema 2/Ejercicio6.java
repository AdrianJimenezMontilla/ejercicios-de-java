/**
* Tema 2
* Ejercicio 6
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio6 {

  public static void main (String[] args) {
  
    double baseImponible = 12.70;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
}
