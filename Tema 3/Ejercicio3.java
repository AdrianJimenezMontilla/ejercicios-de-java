/**
* Tema 3	
* Ejercicio 3
*
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio3 {

  public static void main (String[] args) {
  
  System.out.println ("Introduce la cantidad de pesetas que desea convertir a euros");
  
  int pesetas = Integer.parseInt( System.console().readLine() );
  
  double euros = 0.006;
  
  double resultado = pesetas * euros;
  
  System.out.println (pesetas + " pesetas " + " son " + resultado + " euros ");
  }
}
  
  
