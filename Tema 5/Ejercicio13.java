/**
 *  Capitulo 5
 * 
 * Ejercicio 13
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio13 {
  public static void main(String[] args) {
  
    System.out.println("Introduce 10 numeros positivos o negativos");
    
      int positivo = 0;
      int negativo = 0;
      
        for (int i = 0; i < 10; i++) {
          if (Integer.parseInt(System.console().readLine()) < 0) {
            negativo++;
          } else {
            positivo++;
          }
        }
          System.out.println ("Has introducido numeros " + positivo + "positivos y " + negativo + "numeros negativos");
          }
        }
