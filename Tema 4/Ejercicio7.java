/**
* Tema 3	
* Ejercicio 7
*
* Realiza un programa que calcule la media de tres notas.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio7 {

  public static void main(String[] args) {
  
    System.out.println("Introduce la primera nota");
    
    Double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la segunda nota");
    
    Double segundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la tercera nota");
    
    Double terceraNota = Double.parseDouble(System.console().readLine());
    
    System.out.println("La media es " + (primeraNota + segundaNota + terceraNota) /3);
    }
  }
    
    
