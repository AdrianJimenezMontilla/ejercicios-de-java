/**
 *  Capitulo 4
 * 
 * Ejercicio 20
 * 
 * Realiza un programa que diga si un número entero positivo introducido por teclado es
 * capicúa. Se permiten números de hasta 5 cifras.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
  public class Ejercicio20 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa detecta si un numero es capicua.");
		
    System.out.println ("Introduce un numero");
    
    int numero = Integer.parseInt(System.console().readLine());
    boolean capicua = false;
    
    if (numero > 9 && numero < 100) {
			
			if ((numero / 10) == (numero % 10)) {
				
				capicua = true;
				
			}
						
		}else if (numero > 99 && numero < 1000) {
			
			if ((numero / 100) == (numero % 10)) {
				
				capicua = true;
				
			}		
			
		}else if (numero > 999 && numero < 10000) {
			
			if ((numero / 1000) == (numero % 10) && ((numero / 100) % 10) == ((numero / 10) % 10)) {
				
				capicua = true;
				
			}			
			
		}else if (numero > 9999 && numero < 100000) {
			
			if ((numero / 10000) == (numero % 10) && ((numero / 1000) % 10) == ((numero / 10) % 10)) {
				
				capicua = true;
				
			}			
		
		}else if (numero >= 100000) {
			
			System.out.println ("El numero es mayor de 5 digitos.");
			
		}
		
		if (capicua == true) {
			
		System.out.println ("El numero introducido es capicua.");
		
	  }else {
			
			System.out.println ("El numero introducido no es capicua.");
			
		}
	}
}
