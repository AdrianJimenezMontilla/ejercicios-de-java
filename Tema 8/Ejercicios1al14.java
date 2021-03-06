/**
 * 8. Funciones
 *
 * Ejercicios 1 a 14
 *
 * @author Adrian Jimenez Montilla
 */
 
import matematicas.varias;

public class Ejercicios1al14 {

  public static void main(String[] args) {
    // Es Capicua //
    if (matematicas.varias.esCapicua(49)) {
      System.out.println("El 49 es capicúa");
    }

    if (matematicas.varias.esCapicua(767)) {
      System.out.println("El 767 es capicúa");
    }
    // Es primo //
    if (matematicas.varias.esPrimo(7)) {
      System.out.println("El 7 es primo ");
    }
    if (matematicas.varias.esPrimo(25)) {
      System.out.println("El 25 es primo ");
    }
    // Siguiente primo
    System.out.println ("El siguiente primo a 7 es: " + matematicas.varias.siguientePrimo(7));
    System.out.println ("El siguiente primo a 25 es: " + matematicas.varias.siguientePrimo(25));
    
    // Voltea el numero //
    System.out.println ("El 9 volteado es " + matematicas.varias.voltea(9));
    System.out.println ("El 56789 volteado es " + matematicas.varias.voltea(56789));
    
    // Potencia de un numero //
    System.out.println ("2 elevado a 8 es: " + matematicas.varias.potencia(2, 8));
    System.out.println ("9 elevado a 5 es: " + matematicas.varias.potencia(9, 5));
    
    // Cuenta los digitos //
    System.out.println ("el numero 250 tiene: " + matematicas.varias.digitos(250));
    System.out.println ("El numero 5760789 tiene: " + matematicas.varias.digitos(5760789));
    
    // digitoN //
    System.out.println ("En la posicion 4 del 45678 esta el : " + matematicas.varias.digitoN(45678, 4));
    System.out.println ("En la posicion 3 del 23456789 esta el : " + matematicas.varias.digitoN(23456789, 3));
    
    // Posicion de digitos //
    System.out.println ("En el 45678 el digito 6 esta en la posicion: " + matematicas.varias.posicionDeDigito(45678, 6));
    System.out.println ("En el 98765432 el digito 3 esta en la posicion: " + matematicas.varias.posicionDeDigito(98765432, 3));
    
    //Quira por detras //
    System.out.println ("Si al 45678 le quito por detras 2, se queda como: " + matematicas.varias.quitaPorDetras(45678, 2));
    System.out.println ("Si al 98765432 le quito por detras 6, se queda como: " + matematicas.varias.quitaPorDetras(98765432, 6));
    
    // Pega por detras //
    System.out.println ("Si al 230 le pego el 25 POR DETRAS se queda como: " + matematicas.varias.pegaPorDetras(230, 25));
    System.out.println ("Si al 230356 le pego el 870 POR DETRAS se queda como: " + matematicas.varias.pegaPorDetras(230356 , 870));
    // Pega por delante //
    System.out.println ("Si al 230 le pego el 25 POR DELANTE se queda como: " + matematicas.varias.pegaPorDelante(230, 25));
    System.out.println ("Si al 230356 le pego el 870 POR DELANTE se queda como: " + matematicas.varias.pegaPorDelante(230356 , 870));
    
    //Pega dos numeros //
    System.out.println ("Si al 230 le pego el 25 se queda como: " + matematicas.varias.juntaNumeros(230, 25));
    System.out.println ("Si al 230356 le pego el 870 se queda como: " + matematicas.varias.juntaNumeros(230356 , 870));
    
    
  }
}
