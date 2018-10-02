/**
* Tema 4	
* Ejercicio 1
*
* Escribe un programa que pida por teclado un día de la semana y que diga qué
* asignatura toca a primera hora ese día.
*
* @author: Adrian Jimenez Montilla
*
*/


public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.println ("Introduce un dia de la semana");

    String dia = System.console().readLine();


      switch (dia) {

      case "lunes":
        System.out.println ("Entorno de desarollo");
        break;
      case "martes":
        System.out.println ("Sistemas informaticos");
        break;
      case "miercoles":
        System.out.println ("Programacion");
        break;
      case "jueves":
        System.out.println ("Programacion");
        break;
      case "viernes":
        System.out.println ("Sistemas informaticos");
        break;
      case "sabado":
        System.out.println ("Ese dia no hay nada");
        break;
      case "domingo":
        System.out.println ("Ese dia no hay nada");
        break;
      default:
        System.out.println ("No existe ese dia");
      }
    }
  }
         
 

