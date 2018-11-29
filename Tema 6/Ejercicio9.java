/**
*  Capitulo 6
* 
* Ejercicio 9
* 
* Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio9 {
  public static void main(String[] args) {
  
    int numero = 0;
    int cuentaNumeros = 0;
  
    while (numero != 24) {
    
      numero = (int)(Math.random() * 51) * 2;
      System.out.print (numero + " ");
      cuentaNumeros++;
    }
    System.out.print ("\nSe han generado " + cuentaNumeros + " numeros");
  }
}
