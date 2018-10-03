/**
* Tema 3	
* Ejercicio 8
*
* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
* suficiente, bien, notable o sobresaliente).
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio8 {

  public static void main(String[] args) {
  
    System.out.println("Introduce la primera nota");
    
    Double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la segunda nota");
    
    Double segundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la tercera nota");
    
    Double terceraNota = Double.parseDouble(System.console().readLine());
    
    double notaMedia = (primeraNota + segundaNota + terceraNota) /3;
    
    
    if (notaMedia < 5) {
      System.out.print("Insuficiente");
    }
    if ((notaMedia > 5) && (notaMedia < 6)) {
      System.out.println ("Suficiciente");
    }
    if ((notaMedia > 6) && (notaMedia < 7)) {
      System.out.println ("Bien");
    }
    if ((notaMedia > 7) && (notaMedia < 9)) {
      System.out.println ("Notable");
    }
    if (notaMedia > 9) {
      System.out.println ("Sobresaliente");
    }
    
    System.out.println("La media es " + notaMedia);
    
  }
}
    
