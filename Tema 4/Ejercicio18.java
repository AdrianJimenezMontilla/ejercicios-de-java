/**
 *  Capitulo 4
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido
 * por teclado. Se permiten números de hasta 5 cifras.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
  public class Ejercicio18 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa dice la primera cifra de un numero de maximo 5 cifras");
    
    System.out.println ("Introduce un numero");
    
    int numero, primera = 0;
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      primera = numero;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      primera = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      primera = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      primera = numero / 1000;
    }
    
    if ( numero >= 10000 ) {
      primera = numero / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primera);
  }
}
