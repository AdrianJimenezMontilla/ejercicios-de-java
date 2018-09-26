/**
* Tema 3	
* Ejercicio 8
*
* Escribe un programa que calcule el salario semanal de un empleado en base
* a las horas trabajadas, a razón de 12 euros la hora.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio8 {

  public static void main (String[] args) {
  
  System.out.println ("Introduzca cuantas horas ha trabajado");
  int horas = Integer.parseInt( System.console().readLine() );
  int salario = 12;
  int resultado = salario * horas;
  
  System.out.println ("El salario semanal del empleado base a las horas trabajadas es: " + resultado + " euros ");
  }
}
