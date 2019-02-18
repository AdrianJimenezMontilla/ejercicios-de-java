/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author pc21
 */
public class Ejercicio4Arraylist {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    ArrayList<String> a = new ArrayList<>();
    
    String palabra;
    
    System.out.println("Introduzca 10 palabras: ");
    
    for (int i = 0; i < 10; i++) {
      palabra = s.nextLine();
      a.add(palabra);
    }
    
    System.out.println("Lista original: " + a);
    
    Collections.sort(a);
    
    System.out.println("Lista ordenada: " + a);
  }
  
}
