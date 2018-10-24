/**
*  Capitulo 5
* 
* Ejercicio 23
* 
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
* @author Adrian Jimenez Montilla
*/
 
 public class Ejercicio23 {
  public static void main(String[] args) {
  
    System.out.println("Introduce una serie de numeros");
    
    int numero;
    int suma = 0;
    int elementos = 0;
    
    do {
      numero = Integer.parseInt(System.console().readLine());
      suma += numero;
      elementos++;
    } while (suma <= 1000);
    
    System.out.println("Ha introducido un total de " + elementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / elementos + ".");
  }
}

    
    
