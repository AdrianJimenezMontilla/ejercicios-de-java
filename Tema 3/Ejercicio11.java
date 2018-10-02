/**
* Tema 3	
* Ejercicio 11
*
* Realiza un conversor de kb a mb.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {
  System.out.println("Conversor de kb a mb");
  System.out.println("Introduzca la cantidad de kb que desea convertir");
  double kb = Double.parseDouble(System.console().readLine());
  System.out.println("son " + kb /1024 + "mb");
  }
}
  
