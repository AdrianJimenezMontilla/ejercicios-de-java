public class Coche extends Vehiculo {

  private int caballos;

  public Coche(int c) {
    super();
    this.caballos = c;
  }

  public void quemaRueda() {
    System.out.println("Quemo rueda");
  }
}
