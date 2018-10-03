/**
* Tema 3	
* Ejercicio 6
*
* Realiza un programa que calcule el √
* tiempo que tardará en caer un objeto desde
* 2
* una altura h. Aplica la fórmula t = 2h
* g siendo g = 9.81m/s
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio6 {

    final static double g = 9.81;
 
    public static void main(String[] args) {
    
      System.out.println("Introduzca la altura desde la que cae el objeto");
      
      Double h = Double.parseDouble(System.console().readLine());
      
      double tiempo = Math.sqrt(2*h/g);
      
      System.out.print("Tarda " + tiempo + " segundos en caer");
      }
    }
      
      

    
    
