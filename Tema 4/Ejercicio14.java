/**
 *  Capitulo 4
 * 
 * Ejercicio 14
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 *  @author Adrian Jimenez Montilla
 */
 

  public class Ejercicio14 {
    public static void main(String[] args) {
		
		System.out.println ("Este programa detecta si el numero introducido es par y divisible por 5.");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2) == 0) {
			
			System.out.println ("El numero " + numero + " es par.");
			
		} else {
			
			System.out.println ("El numero " + numero + " no es par.");
			
		}
		
		if ((numero % 5) == 0) {
			
			System.out.println ("El numero " + numero + " es divisible entre 5.");
			
		} else {
			
			System.out.println ("El numero " + numero + " no es divisible entre 5.");
			
		}
		
	}
}
