/**
 *  Capitulo 5
 * 
 * Ejercicio 19
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio19 {
  public static void main(String[] args) {
  
    System.out.println("Introduce la altura");
    
    int h = Integer.parseInt(System.console().readLine());
    
    String relleno = System.console().readLine();
    
    int altura =1;
    
    int espacios = h -1;
    
    int linea = 1;
    
    while (altura <= h) {
    
      for (int i = 1; i <= espacios; i++ ) {
        System.out.print (" ");
      }
      
      for (int i = 1; i <= linea; i++ ) {
        System.out.print(relleno);
      }
      System.out.println("");
      
      altura++;
      espacios--;
      linea+=2;
    }
  }
}

