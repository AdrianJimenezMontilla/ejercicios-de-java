/**
*  Capitulo 5
* 
* Ejercicio 24
* 
* Escribe un programa que lea un número n e imprima una pirámide de números
* con n filas como en la siguiente figura:
* @author Adrian Jimenez Montilla
*/
 
 public class Ejercicio24 {
  public static void main(String[] args) {
  
    System.out.println("Introduce un numero");
    
    int h = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = h -1;
    int linea = 0;
    
    while (altura <= h) {
    
      for (linea = 1; linea <= espacios; linea++) {
        System.out.print (" ");
      }
      
      for (linea = 1; linea < altura; linea++) {
        System.out.print(linea);
      }
      
      for (linea = altura; linea > 0; linea--) {
        System.out.print (linea);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
      
    }
  }
}
