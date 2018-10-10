/**
 *  Capitulo 5
 * 
 * Ejercicio 9
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo
 * de dato que se utilice ( int o long ).
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio9 {
  public static void main(String[] args) {
  
    System.out.println("Cuenta los digitos de un numero introducido por teclado");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    int numDigito = 1;
    
    int numeroOriginal = numero;
    
    while (numero > 10) {
      
    
      numero /= 10;
      
      numDigito++;
    }
    System.out.println ("El numero " + numeroOriginal + " introducido tiene " + numDigito + " cifras ");
    }
  }
