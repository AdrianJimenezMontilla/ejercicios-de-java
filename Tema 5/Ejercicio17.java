/**
 *  Capitulo 5
 * 
 * Ejercicio 17
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).* 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio17 {
  public static void main(String[] args) {
  
    System.out.println("Introduce un numero");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero < 0) {
      System.out.println("Debe ser un numero positivo");
    }
    
    int suma = 0;
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }
    System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);
  }
}

