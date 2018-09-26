/**
* Tema 3	
* Ejercicio 5
*
* Escribe un programa que calcule el área de un rectángulo.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio5 {

  public static void main (String[] args) {
  
  System.out.println ("Este programa calcula el área de un rectangulo, por favor introduzca la base");
  double base = Double.parseDouble( System.console().readLine() );
  
  System.out.println ("Ahora introduzca la altura");
  double altura = Double.parseDouble( System.console().readLine() );
  
  double area = base * altura;
  
  System.out.println ("El área del rectángulo es: " + area);
  }
}
