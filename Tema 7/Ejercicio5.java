/**
*  Capitulo 7
* 
* Ejercicio 5
* 
* Escribe un programa que pida 10 números por teclado y que luego muestre
* los números introducidos junto con las palabras “máximo” y “mínimo” al lado
* del máximo y del mínimo respectivamente.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio5 {
  public static void main(String[] args) {
  
    int[] numero = new int[10];
    int i;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    for (i = 0; i < 10; i++) {
      System.out.println ("Introduzca 10 numeros con intros de por medio");
      numero[i] = Integer.parseInt(System.console().readLine());
      
        if (numero[i] < minimo) {
          minimo = numero[i];
        }
        if (numero[i] > maximo) {
          maximo = numero[i];
        }
    }
    System.out.println();
    
    for (i = 0; i < 10;i++) {
      System.out.println(numero[i]);
        if (numero[i] == maximo) {
          System.out.println("Maximo");
        }
        if (numero[i] == minimo) {
          System.out.println("minimo");
        }
        System.out.println();
    
    }
  }
}
