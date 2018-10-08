/**
 *  Capitulo 4
 * 
 * Ejercicio 17
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por
 * teclado.
 * 
 *  @author Adrian Jimenez Montilla
 */

public class Ejercicio17 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa dice la ultima cifra de un numero");
		
		System.out.println ("Introduce un numero");
		
		int numero = Integer.parseInt(System.console().readLine());
		
		numero = numero % 10;
		
		System.out.println ("La ultima cifra del numero introducido es: " + numero);
		
	}
}
