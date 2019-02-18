/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author pc21
 */
public class Ejercicio6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashMap<String, String> usuarios = new HashMap<>();
    usuarios.put("adrian","adrian");
    usuarios.put("admin","admin");
    
    String usuario;
    String clave;
    boolean entra = false;
    int oportunidades = 3;
    
    System.out.println ("Por favor introduzca usuari y contraseña");
    Scanner s = new Scanner(System.in);
    do {
      System.out.print("Usuario");
      usuario = s.nextLine();
      System.out.println("Contraseña");
      clave = s.nextLine();
      
      if (usuarios.containsKey(usuario)) {
        if (usuarios.get(usuario).equals(clave)) {
          System.out.println("Ha accedido al area restringida");
          entra = true;
        } else {
            System.out.println("Contraseña incorrecta");
        }
      } else {
        System.out.println("El usuario no existe");
      }
      oportunidades--;
      
      if (!entra && (oportunidades > 0)) {
        System.out.println("Le quedan " + (oportunidades) + " oportunidades");
      }
      
    } while ((!entra) && (oportunidades > 0));

    if (!entra){
      System.out.print("Lo siento, no tiene acceso al área restringida");
      
        }
         
       }
    
    }
    // TODO code application logic here
  
  

