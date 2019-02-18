/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc21
 */
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {

  public static void main(String[] args) {
    
    ArrayList<Carta> c = new ArrayList<Carta>();
    
    Carta cartaAux = new Carta();
    c.add(cartaAux);
    
    for (int i = 0; i < 9; i++) {
      do {
        cartaAux = new Carta();      
      } while (c.contains(cartaAux));
      
      c.add(cartaAux);
    }
    
    Collections.sort(c);
    
    for (Carta miCarta: c) {
      System.out.println(miCarta);
    }
  }
}

