/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {

    HashMap<String, String> m = new HashMap<>();

    m.put("perro", "dog");
    m.put("gato", "cat");      
    m.put("azul", "blue");
    m.put("negro", "black");
    m.put("blanco", "white");
    m.put("verde", "green");
    m.put("naranja", "orange");
    m.put("viento", "wind");
    m.put("rosa", "pink");
    m.put("mira", "look");
    m.put("teclado", "keyboard");
    m.put("estadio", "arena");
    m.put("calumnia", "aspersion");
    m.put("aguacate", "avocado");
    m.put("cuerpo", "body");
    m.put("concurso", "contest");
    m.put("cena", "dinner");
    m.put("salida", "exit");
    m.put("lenteja", "lentil");
    m.put("cacerola", "pan");
    m.put("pastel", "pie");
    m.put("membrillo", "quince");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca una palabra en español: ");
    String palabraIntro = s.nextLine().toLowerCase();

    if (m.containsKey(palabraIntro)) {
      System.out.println(palabraIntro + " en inglés es " + m.get(palabraIntro));
    } else {
      System.out.print("Lo siento, no conozco esa palabra.");
    }
  }
}