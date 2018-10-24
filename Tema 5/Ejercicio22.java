/**
*  Capitulo 5
* 
* Ejercicio 22 
* 
* uestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
* @author Adrian Jimenez Montilla
*/
 
 public class Ejercicio22 {
  public static void main(String[] args) {
  
    System.out.println("Este programa muestra los numeros primos de 2 a 100");
    
    boolean primo = true;
    
    for (int i = 2; i <= 100; i++) {
    
    
      primo = true;
      for (int j = 2; j < i; i++) {
        if (i % j == 0) {
          primo = false;
          }
        }
        if (primo) {
        System.out.print(i + " ");
        }
    }
    System.out.println();
  }
}
