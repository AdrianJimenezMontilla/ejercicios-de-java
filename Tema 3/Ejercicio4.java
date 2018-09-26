/**
* Tema 3	
* Ejercicio 4
*
* Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio4 {

  public static void main (String[] args) {
  
  System.out.println ("Introduce un número");
  int numero1 = Integer.parseInt( System.console().readLine() );
  
  System.out.println ("Introduce otro número");
  int numero2 = Integer.parseInt( System.console().readLine() );
  
  int suma = numero1 + numero2;
  int resta = numero1 - numero2;
  int multiplicacion = numero1 * numero2;
  double division = numero1 / numero2;
  
  System.out.println ("La suma de estos número es: " + suma);
  System.out.println ("La resta de estos número es: " + resta);
  System.out.println ("La multiplicación de estos número es: " + multiplicacion);
  System.out.println ("La division de estos número es: " + division);
  }
}
