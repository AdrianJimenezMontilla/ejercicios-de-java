/**
* Tema 3	
* Ejercicio1
*
* Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio1 {

  public static void main (String[] args) {

  System.out.println ("Introduzca un número");
  
  int numero1 = Integer.parseInt( System.console().readLine() );
  
  
  System.out.println ("Introduzca el segundo número");
  
  int numero2 = Integer.parseInt( System.console().readLine() );
  
  
  int resultado = numero1 * numero2;
  
  System.out.println ("El resultado de la multiplicación entre " + numero1 + " y " + numero2 + " es " + resultado);
  }
}
