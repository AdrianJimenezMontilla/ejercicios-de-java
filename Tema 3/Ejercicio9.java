/**
* Tema 3	
* Ejercicio 9
*
* Escribe un programa que calcule el volumen de un cono según la
* fórmula V = (1/3)πr^2h
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {
  
  double PI = 3.141592654;
  System.out.println("Introduzca la altura");
  double altura = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca el radio");
  double radio = Double.parseDouble(System.console().readLine());
  double volumen = (1.0/3.0) * PI * radio * radio * altura;
  System.out.println("El volumen del cono es de " +  volumen + " cm³");
  }
}



  
