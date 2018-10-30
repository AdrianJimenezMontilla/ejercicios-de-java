/**
*  Capitulo 6
* 
* Ejercicio 5
* 
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la media
* de esos números.
* @author Adrian Jimenez Montilla
*/

public class Ejercicio5 {
  public static void main(String[] args) {
  
  int numero;
  int maximo = 100;
  int minimo = 199;
  int suma = 0;
  
  for (int i = 0; i < 50; i++) {
    numero = (int)(Math.random() * 100) + 100;
    System.out.print (numero + " ");
    suma += numero; 
    
    if (numero < minimo) {
      minimo = numero;
    }
    
    if (numero > maximo) {
      maximo = numero;
    }
  }
  System.out.println ("maximo: " + maximo + " minimo: " + minimo + " media: " + suma /50);
  
  }
}
