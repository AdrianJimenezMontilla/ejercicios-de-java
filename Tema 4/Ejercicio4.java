/**
* Tema 3	
* Ejercicio 4
*
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio4 {

  public static void main (String[] args) {
  
  int sueldo;
  
  System.out.println ("Introduzca cuantas horas ha trabajado");
  
  int horas = Integer.parseInt( System.console().readLine() );
 
  
  if (horas < 40) {
    sueldo = 12 * horas;
  } else {
    sueldo = (40 * 12) + (horas - 40) * 16;
  }
  
  System.out.println ("El salario semanal del empleado es: " + sueldo + " euros ");
  }
}
