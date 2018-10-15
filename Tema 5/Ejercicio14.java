/**
 *  Capitulo 5
 * 
 * Ejercicio 14
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio14 {
  public static void main(String[] args) {
  
    System.out.println("Introduce una base");
    
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.println ("Ahora introduce un exponente");
    
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + " elevado a " + exponente + " = " + potencia);
  }
}
