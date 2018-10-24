/**
*  Capitulo 5
* 
* Ejercicio 21 
* 
* Realiza un programa que vaya pidiendo números hasta que se introduzca un numero neg\
* ativo y
*
* nos diga cuantos números se han introducido, la media de los impares y el mayor de l\
* os pares.
*
* El número negativo sólo se utiliza para indicar el final de la introducción de datos\
* pero no
*
* se incluye en el cómputo.
 * @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio21 {
  public static void main(String[] args) {
  
    System.out.println("Introduce numeros enteros, puede terminar introduciendo uno negativo");
    
    int numero;
    int elementos = 0;
    int suma = 0;
    int impar = 0;
    int par = 0;
    
    do {
      numero = Integer.parseInt(System.console().readLine());
    
    if (numero >= 0) {
        elementos++;
        if ((numero %2) == 1) {
          suma += numero ;
          impar++;
        } else {
          if (numero > par)
          par = numero;
        }
      }
            
    } while (numero >= 0);
    
    System.out.println("Ha introducido " + elementos + " números");
    System.out.println("La media de los impares es " + suma/impar);
    System.out.println("El máximo de los pares es " + par);
    }
  }
