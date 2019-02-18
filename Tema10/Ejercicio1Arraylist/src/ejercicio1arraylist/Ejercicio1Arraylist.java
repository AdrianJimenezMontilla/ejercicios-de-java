/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1arraylist;
import java.util.ArrayList;
/**
 *
 * @author pc21
 */
public class Ejercicio1Arraylist {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();
    
    a.add("Adrian");
    a.add("Jose");
    a.add("Salvador");
    a.add("Federico");
    a.add("Daniel");
    a.add("David");
    a.add("Juan Jose");
    
    System.out.println("Contenido de la lista: ");

    for(String nombre : a) {
      System.out.println(nombre);
    }
    
    // TODO code application logic here
  }
  
  
}
