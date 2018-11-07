/**
*  Capitulo 7
* 
* Ejercicio 3
* 
* Escribe un programa que lea 10 números por teclado y que luego los muestre
* en orden inverso, es decir, el primero que se introduce es el último en
* mostrarse y viceversa.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio3 {
  public static void main(String[] args) {
  
    int[] numero = new int[10];
    int i;
    
    for (i = 0; i < 10; i++) {
      
      System.out.println ("Introduce numeros con el intro");
      
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println ("Los numeros al reves son los siguientes: ");
    for (i = 9; i >= 0; i--) {
      System.out.println (numero[i]);
    }
  }
}
      
      
  
  
