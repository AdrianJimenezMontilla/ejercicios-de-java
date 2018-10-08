/**
 *  Capitulo 4
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 * segundos que faltan para llegar a la medianoche.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio11 {

  public static void main(String[] args) {
  
    System.out.println ("Introduce la hora");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println ("Introduce los minutos");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos = (24 * 360) - ((hora * 360) + (minutos * 60));
    
    System.out.println ("Faltan " + segundos + " segundos para medianoche");
    
    if (segundos == 0) {
			System.out.println ("Ya es medianoche");
		}
	}
}
