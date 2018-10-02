/**
* Tema 3	
* Ejercicio 10
*
* Realiza un conversor de Mb a Kb.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {
  System.out.println("Conversor de Mb a Kb");
  System.out.println("Introduzca la cantidad de Mb que desea convertir");
  double mb = Double.parseDouble(System.console().readLine());
  System.out.println("mb son:" + mb * 1024 + "kb");
  }
}
