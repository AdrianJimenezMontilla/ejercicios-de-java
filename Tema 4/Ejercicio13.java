/**
 *  Capitulo 4
 * 
 * Ejercicio 13
 * 
 *Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 
 public class Ejercicio13 {
  public static void main(String[] args) {
  
  System.out.println ("Este programa ordena los numeros introducidos");
  
  int aux = 0;
  
  System.out.println ("Introduce el primer numero");
  int a = Integer.parseInt(System.console().readLine());
  
  System.out.println ("Introduce el segundo numero");
  int b = Integer.parseInt(System.console().readLine());
  
  System.out.println ("Introduce el tercer numero");
  int c = Integer.parseInt(System.console().readLine());
  
  if (a > b) {
			
			aux = a;
			a = b;
			b = aux;
			
		}
		
		if (b > c) {
			
			aux = b;
			b = c;
			c = aux;
		}
		
		if (a > b) {
			
			aux = a;
			a = b;
			b = aux;
  }

 System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
