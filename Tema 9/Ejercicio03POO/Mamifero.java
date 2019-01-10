public abstract class Mamifero extends Animal {

  public Mamifero () {
    super();
  }

  public Mamifero (Sexo s) {
    super(s);
  }
  
  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("No puedo");
    } else {
      System.out.println("Adelante");
    }
  }
  
  public void anda() {
    System.out.println("Estoy andando");
  }
}
