/**
*  Capitulo 6
* 
* Ejercicio 4
* 
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
* rados por espacios.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio4 {
  public static void main(String[] args) {
  
  int numero;
  
  for (int i = 0; i < 20; i++) {
    numero = (int)(Math.random() * 11);
    System.out.print (numero + " ");
    }
  }
}
