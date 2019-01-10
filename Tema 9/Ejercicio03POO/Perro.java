public class Perro extends Mamifero {

  public Perro (Sexo s) {
    super(s);
  }

  public Perro () {
    super(Sexo.HEMBRA);
  }

  public void ladra() {
    System.out.println("Guau!");
  }

  public void rueda() {
    System.out.println("Estoy rodando");
  }
}
