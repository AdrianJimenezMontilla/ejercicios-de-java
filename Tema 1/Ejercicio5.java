/**
* Ejercicio 5
*
* @author Adrian Jimenez Montilla
*/

public class Ejercicio5 { 

  public static void main(String[] args) {

  String rojo = "\033[31m";
  String azul = "\033[34m";
  String blanco = "\033[37m";


  System.out.println(rojo + "\tLunes" + "\tMartes" + "\tMiercoles" + "\tJueves" + "\tViernes");
  System.out.println(azul + "8:15" + blanco + "\tED" + "\tSIN" + "\tPRO" + "\t" +"\tPRO" + "\tSIN");
  System.out.println(azul + "9:15" + blanco + "\tLM" + "\tSIN" + "\tPRO" + "\t" +"\tPRO" + "\tSIN");
  System.out.println(azul + "10:15" + blanco + "\tLM" + "\tSIN" + "\tPRO" + "\t" +"\tED" + "\tSIN");
  System.out.println(azul + "11:45" + blanco + "\tBB.DD" + "\tPRO" + "\tBB.DD" + "\t" +"\tED" + "\tFOL"); 
  System.out.println(azul + "12:45" + blanco + "\tBB.DD" + "\tPRO" + "\tBB.DD" + "\t" + "\tLM" + "\tFOL");
  System.out.println(azul + "13:45" + blanco + "\tBB.DD" + "\tPRO" + "\tBB.DD" + "\t" + "\tLM" + "\tFOL");

  }

}
