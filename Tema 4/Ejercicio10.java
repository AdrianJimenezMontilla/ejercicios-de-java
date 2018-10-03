/**
* Tema 3	
* Ejercicio 10
*
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de
* nacimiento.
*
* @author: Adrian Jimenez Montilla
*
*/

public class Ejercicio10 {

  public static void main(String[] args) {
  
    System.out.println ("Introduce el dia");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.println ("Introduce el mes");
    int mes = Integer.parseInt(System.console().readLine());
    String horoscopo = "";
    
    switch(mes) {
      case 1:
        if (dia < 21) {
        horoscopo = "Capricornio";
        } else {
        horoscopo = "Acuario";
        }
        break;
      
      case 2:
        if (dia < 20) {
        horoscopo ="Acuario";
        } else {
        horoscopo = "Piscis";
        }
        break;
        
      case 3:
        if (dia < 21) {
        horoscopo = "Piscis";
        } else {
        horoscopo = "Aries";
        }
        break;
        
      case 4:
        if (dia < 21){
        horoscopo = "Aries";
        } else {
        horoscopo = "Tauro";
        }
        break;
        
      case 5:
        if (dia < 21) {
        horoscopo = "Tauro";
        } else {
        horoscopo = "Geminis";
        }
        break;
      
      case 6:
        if (dia < 21) {
        horoscopo = "Geminis";
        } else {
        horoscopo = "Cáncer";
        }
        break;
      
      case 7:
        if (dia < 21) {
        horoscopo = "Cáncer";
        } else {
        horoscopo = "Leo";
        }
        break;
        
      case 8:
        if (dia < 21) {
        horoscopo = "Leo";
        } else {
        horoscopo = "Virgo";
        }
        break;
      
      case 9:
        if (dia < 21) {
        horoscopo = "Virgo";
        } else {
        horoscopo = "Libra";
        }
        break;
      
      case 10:
        if (dia < 21) {
        horoscopo = "Libra";
        } else {
        horoscopo = "Escorpio";
        }
        break;
        
      case 11:
        if (dia < 21) {
        horoscopo = "Escorpio";
        } else {
        horoscopo = "Sagiatario";
        }
        break;
        
      case 12:
        if (dia < 21) {
        horoscopo = "Sagitario";
        } else {
        horoscopo = "Capricornio";
        }
        break;
      default:
    }
    System.out.print("Tu horoscopo es  " + horoscopo);
  }
}
      
      
