public class Pinguino extends Ave {

  public Pinguino() {}

  public Pinguino(Sexo s) {
    super(s);
  }

  public void nada() {
    System.out.println("splash!");
  }

  public void vuela() {
    System.out.println("Cant!");
  }
}
