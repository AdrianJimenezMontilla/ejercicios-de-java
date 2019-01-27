public class Bicicleta extends Vehiculo {

  private int marchas;
  
  public Bicicleta(int m) {
    super(); // llama al constructor
    this.marchas = m;
  }

  public void hacerCaballito() {
    System.out.println("Caballito*");
  }
}
