/**
*  Capitulo 7
* 
* Ejercicio 14
* 
* Escribe un programa que pida 8 palabras y las almacene en un array. A
* continuación, las palabras correspondientes a colores se deben almacenar al
* comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
* auxiliares como quieras. Los colores que conoce el programa deben estar en
* otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
* blanco y morado.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String[] palabra = new String[8];
    String[] resultado = new String[8];
    
    System.out.println("Introduzca 8 palabras");
    
    int j = 0;
    
    for (int i = 0; i < 8;i++) {
      palabra[i] = System.console().readLine();
      
      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }
    for (int i = 0; i < 8; i++) {
      boolean esColor = false;
      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }
      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }
    System.out.println("\n\nArray original:");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│ %d", i);
    }
    for (String p : palabra) {
      System.out.printf("│%-8s", p);
    }
    System.out.println("\n\nArray resultado:");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│%d", i);
    }
    for (String r : resultado) {
      System.out.printf("│%-8s", r);
    }
  }
}
    
