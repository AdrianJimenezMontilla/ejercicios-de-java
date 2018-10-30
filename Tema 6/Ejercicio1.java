/**
*  Capitulo 6
* 
* Ejercicio 1
* 
* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
* también la suma total (los puntos que suman entre los tres dados).
* @author Adrian Jimenez Montilla
*/

public class Ejercicio1 {
  public static void main(String[] args) {
  
  int tirada;
  int suma = 0;
  
  for (int i = 0; i < 3; i++) {
    tirada = (int)(Math.random() * 6) + 1;
    
    System.out.println (tirada + " ");
    suma += tirada;
  }
  
  System.out.println ("\nSuma " + suma);
  }
}
