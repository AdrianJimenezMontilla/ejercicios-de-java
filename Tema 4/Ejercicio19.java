/**
 *  Capitulo 4
 * 
 * Ejercicio 19
 * 
 *Realiza un programa que nos diga cuántos dígitos tiene un número entero 
 *que puede serpositivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
  public class Ejercicio19 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa dice el numero de digitos que tiene el numero introducido");
		
    System.out.println ("Introduce un numero");
    
    int numero = Integer.parseInt(System.console().readLine());
		int digitos = 1;
		
		if (numero > 9 && numero < 100 || numero < -9 && numero > -100) {
			
			digitos = 2;
			
		}else if (numero > 99 && numero < 1000 || numero < -99 && numero > -1000) {
			
			digitos = 3;
			
		}else if (numero > 999 && numero < 10000 || numero < -999 && numero > -10000) {
			
			digitos = 4;
			
		}else if (numero > 9999 && numero < 100000 || numero < -9999 && numero > -100000) {
			
			digitos = 5;
		
		}else if (numero >= 100000 || numero <= -100000) {
			
			System.out.println ("El numero es mayor de 5 digitos.");
			
		}
		
		System.out.println ("El numero introducido tiene: " + digitos + " digitos.");
	}
}
