/**
* Tema 3	
* Ejercicio2
*
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio2 {

  public static void main (String[] args) {
  
  System.out.println ("Introduce la cantidad de euros que desea convertir en pesetas");
  
  int euros = Integer.parseInt( System.console().readLine() );
  
  int pesetas = 166;
  
  int resultado = euros * pesetas;
  
  System.out.println (euros + " euros " + " son " + resultado + " pesetas ");
  }
}
