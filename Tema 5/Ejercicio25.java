/**
 *
 *
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 *
 * @author Adrian Jimenez Montilla
 */
 
 
 public class Ejercicio25 {
   public static void main(String[] args) {
  
    System.out.println (" Introduzca un numero ");
    int n = Integer.parseInt(System.console().readLine());
    
    long volteado = 0;
    
    while(n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n = n / 10;
    }
    System.out.println(" El numero dado la vueelta es " + volteado);
  }
}
