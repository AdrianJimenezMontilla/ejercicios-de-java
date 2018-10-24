/**
* 5. Bucles
*
* 20. Igual que el ejercicio anterior pero esta vez se debe pintar una
*
* pirámide hueca.
*
* @author Adrian Jimenez Montilla
*/

public class Ejercicio20 {
  public static void main(String[] args) {
  
    System.out.println("Introduce la altura");
    
    int h = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el relleno");
    
    String relleno = System.console().readLine();
    
    int altura = 1;
    
    int espacioInterno = 0;
    
    int espacios = h -1;
    
    int linea = 0;
    
    while (altura < h) {
    
      for (linea = 1; linea <= espacios; linea++) {
      
        System.out.print (" ");
      }
      
      System.out.print(relleno); 

      for (linea = 1; linea < espacioInterno; linea++) {
      
        System.out.print (" ");
      }
      
      if (altura > 1) {
        System.out.print(relleno);
      }
        System.out.println();
        altura++;
        espacios--;
        espacioInterno+=2;
    }
    
    for (linea = 1; linea < altura*2; linea++) {
      
        System.out.print (relleno);
      
    }
  }
}

