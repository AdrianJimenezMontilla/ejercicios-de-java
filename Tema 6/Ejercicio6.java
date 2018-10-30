/**
*  Capitulo 6
* 
* Ejercicio 6
* 
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto
* @author Adrian Jimenez Montilla
*/

public class Ejercicio6 {
  public static void main(String[] args) {
  
  int clave = (int)(Math.random() * 101);
  int oportunidades = 5;
  int numeroIntroducido;
  boolean acertado = false;
  
  System.out.println (" Adivina el numero que estoy pensando");
  
    
  do {
    System.out.println (" Introduce un numero del 0 al 100");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    oportunidades--;
  
    if ((numeroIntroducido > clave) && (oportunidades > 0)) {
      System.out.println ("La clave es menor al " + numeroIntroducido);
      System.out.println (" Te quedan " + oportunidades + " oportunidades ");
    }
    if ((numeroIntroducido < clave) && (oportunidades > 0)) {
      System.out.println ("La clave es mayor al " + numeroIntroducido);
      System.out.println ("Te quedan " + oportunidades + " oportunidades ");
    }
    if (numeroIntroducido == clave) {
      acertado = true;
      System.out.println ("Enhorabuena has acertado");
    }
    
  } while (!acertado && (oportunidades > 0));
  
  if (!acertado) {
     System.out.println ("Lo siento no has acertado, el numero que estaba pensando era el " + clave);
  }
}
}


  
