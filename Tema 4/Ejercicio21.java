/**
*  Capitulo 4
* 
* Ejercicio 5
* 
* Calcula la nota de un trimestre de la asignatura Programación. El programa
* pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
* Si la media de los dos controles da un número mayor o igual a 5, el alumno
* está aprobado y se mostrará la media. En caso de que la media sea un número
* menor que 5, el alumno habrá tenido que hacer el examen de recuperación
* que se califica como apto o no apto, por tanto se debe preguntar al usuario
* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
* resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
* mantiene la nota media anterior.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio21 {
  public static void main(String[] args) {
  
  double nota1;
  double nota2;
  System.out.println (" Nota del primer control ");
  nota1 = Integer.parseInt(System.console().readLine());
  
  System.out.println (" Nota del segundo control ");
  nota2 = Integer.parseInt(System.console().readLine());
  double suma = nota1 + nota2;
  double media = suma / 2;
  
  if (media >= 5) {
    System.out.println (" Tu nota de programacion es; " + media);
    
  }
  if (media < 5) {
    System.out.println (" ¿Cual ha sido el resultado de la recuperacion, apto o no apto?");
    String recuperacion = System.console().readLine();
    if (recuperacion.equals("apto")) {
      System.out.println (" Tu nota de programacion es 5");
    }
    if (recuperacion.equals("no apto")) {
      System.out.println("Tu nota de programacion es: " + media);
    }
  }
}
}
