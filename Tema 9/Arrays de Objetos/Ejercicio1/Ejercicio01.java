public class Ejercicio01 {
  public static void main(String[] args) {
    
    Gato[] gato = new Gato[4];
    
    System.out.println("Introduzca los datos de los gatos.");
    String sexo = "";
    String color;
    for (int i = 0; i < gato.length; i++) {
      gato[i] = new Gato();
      System.out.print("Color del gato " + i + ": ");
      color = (System.console().readLine());
      (gato[i]).setColor(color);
      System.out.print("Sexo del gato " + i + ": ");
      sexo = (System.console().readLine());
      (gato[i]).setSexo(sexo);
      System.out.println();
    }
    
    System.out.println("Gatos guardados.");
    for (int i = 0; i < gato.length; i++) {
      System.out.println("Gato " + i + ":");
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Sexo: " + gato[i].getSexo());
      System.out.println();
    }
  }
}
