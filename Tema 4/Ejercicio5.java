/**
* Tema 3	
* Ejercicio 5
*
* Realiza un programa que resuelva una ecuación de primer grado
* (del tipo ax + b = 0).
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio5 {
 
    public static void main(String[] args) {
    
      System.out.print("Introduzca el valor de a: ");
      
      Double a = Double.parseDouble(System.console().readLine());
      
      System.out.print("Introduzca el valor de b: ");
      
      Double b = Double.parseDouble(System.console().readLine());
      
      if (a == 0) {
          System.out.println("Esa ecuación no tiene solución real.");
        } else {
        
        System.out.println("x = " + (-b/a));
        }
        
      }
      
  }
