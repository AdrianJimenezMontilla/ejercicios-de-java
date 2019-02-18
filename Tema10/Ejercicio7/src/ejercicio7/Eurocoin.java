/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.ArrayList;
/**
 *
 * @author pc21
 */
public class Eurocoin {
  public static void main(String[] args) {
    ArrayList<Moneda> monedas = new ArrayList<>();
    
    Moneda monedaAux = new Moneda();
    monedas.add(monedaAux);
    
    String ultimaPosicion = monedaAux.getPosicion();
    String ultimaCantidad = monedaAux.getCantidad();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));
      
      monedas.add(monedaAux);
      ultimaPosicion = monedaAux.getPosicion();
      ultimaCantidad = monedaAux.getCantidad();
    }
    
    for (Moneda mo : monedas) {
      System.out.println(mo);
    }
  }
}
