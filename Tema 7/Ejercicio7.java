/**
*  Capitulo 7
* 
* Ejercicio 7
* 
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
* muestre por pantalla separados por espacios. El programa pedirá entonces
* por teclado dos valores y a continuación cambiará todas las ocurrencias del
* primer valor por el segundo en la lista generada anteriormente. Los números
* que se han cambiado deben aparecer entrecomillados.
* @author Adrian Jimenez Montilla
*/


public class Ejercicio7 {
  public static void main(String[] args) {
  
    int[] numero = new int[100];
    int i;
    
    for (i = 0; i < 100;i++) {
      numero[i] = (int)(Math.random()*21);
      System.out.print (numero[i] + " ");
    }
    System.out.print("Introduzca un numero de los que han salido ");
    int valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce el valor por el cual quieres cambiarlo ");
    int valor2 = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    for (i = 0; i < 100;i++) {
      if (numero[i] == valor1) {
        numero[i] = valor2;
        System.out.print ("\"" + numero[i] + "\" ");
      } else {
        System.out.print(numero[i] + " ");
      }
    }
    

  }
}
