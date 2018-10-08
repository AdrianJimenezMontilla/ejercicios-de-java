/**
 *  Capitulo 4
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por
 * teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. 
 * El programa debe permitir al usuario mediante un menú elegir si el vértice de la 
 * pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 * 
 *  @author Adrian Jimenez Montilla
 */

  public class Ejercicio15 {
	public static void main(String[] args) {

		
		System.out.println ("Este crea piramides con simbolos y orientacion elegidos por el usuario");
    System.out.println ("Introduce el simbolo, numero o letra de la que se compondra la piramide");
    
    String x = System.console().readLine();
    
    System.out.println ("Introduce la orientacion de la piramide" +  
							"\n 1: Vertice hacia arriba" + 
							"\n 2: Vertice hacia abajo"  +
							"\n 3: Vertice hacia la derecha" +
              "\n 4: Vertice hacia la izquierda.");
              
    int orientacion = Integer.parseInt(System.console().readLine());
    
    switch (orientacion) {
			
			case 1: 
			
			System.out.println ("    "  + x +
								"\n   "  + x + x + x +
								"\n  "    + x + x + x + x + x +
								"\n " + x + x + x + x + x + x + x +
								"\n" + x + x + x + x + x + x + x + x + x);
			break;
			
			case 2:
				
			System.out.println (x + x + x + x + x + x + x + x + x +
								"\n " + x + x + x + x + x + x + x +
								"\n  " + x + x + x + x + x +
								"\n   " + x + x + x +
								"\n    " + x);
								
			break;
			
			case 3: 
			
			System.out.println (x +
								"\n" + x + x +
								"\n" + x + x + x +
								"\n" + x + x + x + x +
								"\n" + x + x + x + x + x +
								"\n" + x + x + x + x +
								"\n" + x + x + x +
								"\n" + x + x +
								"\n" + x);
								
			break; 
			
			case 4:
			
			System.out.println ("\n    " + x +
								"\n   " + x + x +
								"\n  " + x + x + x +
								"\n " + x + x + x + x + 
								"\n" + x + x + x + x + x +
								"\n " + x + x + x + x +
								"\n  " + x + x + x +
								"\n   " + x + x +
								"\n    " + x);
			
			break;
			
			default:
			
			System.out.println ("El numero introducido para el menu es incorrecto");
			
		}

		
	}
}
