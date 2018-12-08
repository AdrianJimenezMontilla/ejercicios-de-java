/**
* 6. Números aleatorios
*
* 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparece\
* r de la
*
* forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el n\
* úmero de
*
* suspensos, el número de suficientes, el número de bienes, etc.
*
* @author Adrian Jimenez Montilla
*/

public class Ejercicio11 {
  public static void main(String[] args) {
  
  int nota;
  int suspenso = 0;
  int suficiente = 0;
  int bien = 0;
  int notable = 0;
  int sobresaliente = 0;
  
  for (int i = 0; i < 20;i++) {
    nota = (int)(Math.random() * 5);
    
    switch(nota) {
      case 0:
        System.out.print("suspenso ");
        suspenso++;
        break;
      case 1:
        System.out.print("suficiente ");
        suficiente++;
        break;
      case 2:
        System.out.print("bien ");
        bien++;
        break;
      case 3:
        System.out.print("notable ");
        notable++;
        break;
      case 4:
        System.out.print("sobresaliente ");
        sobresaliente++;
        break;
      default:
    }
  }
  System.out.print("\n Numero de suspensos: " + suspenso);
  System.out.print("\n Numero de suficientes: " + suficiente);
  System.out.print("\n Numero de bienes: " + bien);
  System.out.print("\n Numero de notables: " + notable);
  System.out.print("\n Numero de sobresalientes: " + sobresaliente);
}
}
        
