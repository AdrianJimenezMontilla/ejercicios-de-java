/**
*  Capitulo 6
* 
* Ejercicio 3
* 
* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
* de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio3 {
  public static void main(String[] args) {
  
  String carta = "";
  String palo = "";
  
  int numeroPalo = (int)(Math.random()*4) + 1;
  
  switch (numeroPalo) {
  
    case 1:
      palo = "Oros";
      break;
    case 2:
      palo = "Copas";
      break;
    case 3:
      palo = "Espadas";
      break;
    case 4:
      palo = "Bastos";
      break;
    default:
  }
  
  int numeroCarta = (int)(Math.random()*12) + 1;
  
  switch (numeroCarta) {
    
    case 1:
      carta = "As";
      break;
    case 10:
      carta = "Sota";
      break;
    case 11:
      carta = "Caballo";
      break;
    case 12:
      carta = "Rey";
      break;
    default:
      carta = String.valueOf(numeroCarta);
  }
  
  System.out.println (carta + " de " + palo);
}
}
  
