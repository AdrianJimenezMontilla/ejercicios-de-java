/**
 *  Capitulo 5
 * 
 * Ejercicio 10
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio10 {
  public static void main(String[] args) {
  
    System.out.println("Este programa calcula la media de un conjunto de numeros introducidos.");
    
      int numeroIntroducido = 0;
      int contador = 0;
      int suma = 0;
      
      while  (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      contador++;
      suma = suma + numeroIntroducido;
      }
      
      System.out.println ("La media de los numeros " + (suma - numeroIntroducido) / (contador -1));
    }
  }
      
      
