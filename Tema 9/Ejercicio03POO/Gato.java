public class Gato extends Mamifero {
  


  public Gato (Sexo s) {
    super(s);
  }

  public Gato () {
    super(Sexo.HEMBRA);
  }
  public void maulla() {
    System.out.println("Miaaaaau");
  }
  public void limpiate() {
    System.out.println("Me limpio");
  }
  public void ronronea() {
    System.out.println("Purrrrrrr");
  }
}
