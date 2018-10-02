/**
* Tema 3	
* Ejercicio 3
*
* Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
* diente nombre del día de la semana.
*
* @author: Adrian Jimenez Montilla
*
*/
  public class Ejercicio3 {
    public static void main(String[] args) {
      System.out.println ("Escribe un numero del 1 al 7");
      
      int dia = Integer.parseInt( System.console().readLine() );
      
        switch (dia) {
        
        case 1:
          System.out.println ("Lunes");
          break;
        case 2:
          System.out.println ("Martes");
          break;
        case 3:
          System.out.println ("Miercoles");
          break;
        case 4:
          System.out.println ("Jueves");
          break;
        case 5:
          System.out.println ("Viernes");
          break;
        case 6:
          System.out.println ("Sabado");
          break;
        case 7:
          System.out.println ("Domingo");
          break;
        default:
          System.out.println ("Ese numero no corresponde con ningun dia");
        }
      }
    }
          

