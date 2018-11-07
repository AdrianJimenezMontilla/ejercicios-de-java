/**
*  Capitulo 7
* 
* Ejercicio 4
* 
* Define tres arrays de 20 números enteros cada una, con nombres numero ,
* cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
* array cuadrado se deben almacenar los cuadrados de los valores que hay en el
* array numero . En el array cubo se deben almacenar los cubos de los valores que
* hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
* en tres columnas.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio4 {
  public static void main(String[] args) {
  
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    System.out.println(" n   │ n2    │ n3\n─────┼───────┼─────────");
      for (i = 0; i < 20; i++) {
        System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
      }
  }
}
