/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author pc21
 */
public class Ejercicio3ArrayList {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Integer> a = new ArrayList<>();
    int num;
    System.out.println("Introduzca 10 números enteros: ");
    
    for (int i = 0; i < 10; i++) {
      num = Integer.parseInt(s.nextLine());
      a.add(num);
              
    }   

    System.out.println("Lista original: " + a);

    Collections.sort(a);

    System.out.println("Lista ordenada de menor a mayor: " + a);
  }
  
}
