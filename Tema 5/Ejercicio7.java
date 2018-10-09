/**
 *  Capitulo 5
 * 
 Ejercicio 7
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 * mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 * ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 *@author Adrian Jimenez Montilla
 */
 
 public class Ejercicio7 {
    
  public static void main(String[] args) {
  
  int intentos = 0;
  int codigoCaja = 1234;

    System.out.println ("Combinacion de la caja fuerte.");

    while (intentos < 4) {

      System.out.println ("Por favor introduzca el numero de la combinación.");
      codigoCaja = Integer.parseInt(System.console().readLine());

      if (codigoCaja == 1234) {

      System.out.println ("La caja fuerte se ha abierto satisfactoriamente.");
        intentos = 4;
      } else {

        System.out.println ("Lo siento, esa no es la combinacion.");
      }

      intentos++;
    }

  }
}
