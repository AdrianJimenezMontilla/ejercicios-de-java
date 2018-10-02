/**
* Tema 3	
* Ejercicio 12
*
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
* examen de la asignatura Programación para obtener la media deseada. Hay
* que tener en cuenta que la nota del primer examen cuenta el 40% y la del
* segundo examen un 60%.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio12 {
  public static void main(String[] args) {
  System.out.println("Introduce la nota del primer examen");
  double primerExamen = Double.parseDouble(System.console().readLine());
  System.out.println ("¿Qué nota quieres sacar en el trimestre?");
  double notaTrimestre = Double.parseDouble(System.console().readLine());
  double resultado = ((notaTrimestre * 100) - (primerExamen * 40)) / 60;
  System.out.println ("Para tener " + notaTrimestre + " en el trimestre necesitas sacar un " + resultado + " en el segundo examen.");
  }
}
