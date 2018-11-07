/**
*  Capitulo 7
* 
* Ejercicio 8
* 
* Realiza un programa que pida la temperatura media que ha hecho en cada mes
* de un determinado año y que muestre a continuación un diagrama de barras
* horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
* de asteriscos o cualquier otro carácter.
* @author Adrian Jimenez Montilla
*/


public class Ejercicio8 {
  public static void main(String[] args) {
  
    String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "JUnio", "JUlio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    
    int[] temperatura = new int[12];
    int i;
    
    for (i = 0; i < 12; i++) {
      System.out.println ("Introduza la temperatura media de " + mes[i]);
      temperatura [i] = Integer.parseInt(System.console().readLine());
    }
    
    for (i = 0; i < 12; i++) {
      System.out.printf("%12s  │", mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("�");
      }
      System.out.println(" " + temperatura[i] + "ºC");
    }
  }
}
