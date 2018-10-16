/**
 *  Capitulo 5
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio15 {
  public static void main(String[] args) {
  
    System.out.println("Introduce una base");
    
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el exponente");
    
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia;
    int exponente2;
    
    for (int i = 1; i <= exponente; i++) {
      potencia = 1;
      exponente2 = i;
      
      for (int j = 0; j  < exponente2; j++) {
        potencia *= base;
      }
        System.out.println (base + " elevado " + i +  " = " + potencia);
    }
  }
}

  
