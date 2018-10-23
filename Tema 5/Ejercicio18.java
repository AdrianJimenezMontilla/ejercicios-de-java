/**
 *  Capitulo 5
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio18 {
  public static void main(String[] args) {
  
    System.out.println("Introduce un numero");
    
    int numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un numero");
    
    int numero2 = Integer.parseInt(System.console().readLine());
    
    if(numero1 == numero2) {
      System.out.println("Los números introducidos no son válidos, deben ser distintos.");
    }
    
    if (numero1 > numero2) {
      int aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    
    for (int i = numero1; i <= numero2; i += 7) {
    System.out.print(i + " ");
    }
    
    
  }
}
    
    
    
