/**
*  Capitulo 7
* 
* Ejercicio 9
* 
* Ejercicio 9
* Realiza un programa que pida 8 números enteros y que luego muestre esos
* números junto con la palabra “par” o “impar” según proceda.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio9 {
  public static void main(String[] args) {
  
    int[] numero = new int[8];
    int i;
    
    for (i = 0; i < 8; i++) {
      System.out.println ("Introduzca 8 numeros");
      numero [i] = Integer.parseInt(System.console().readLine());
    }
    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
  }
}
