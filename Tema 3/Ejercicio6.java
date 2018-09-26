/**
* Tema 3	
* Ejercicio 6
*
* Escribe un programa que calcule el área de un triangulo.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio6 {

  public static void main (String[] args) {
  System.out.println ("Este programa calcula el área de un triangulo, por favor introduzca la base");
  double base = Double.parseDouble( System.console().readLine() );
  
  System.out.println ("Introduzca la altura");
  double altura = Double.parseDouble( System.console().readLine() );

  double area = base * altura / 2;
  
  System.out.println ("El área del triangulo es: " + area);
  }
}

  
  
