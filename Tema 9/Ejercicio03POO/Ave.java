public class Ave extends Animal {
  
  public Ave() {
    super(Sexo.HEMBRA);
  }

  public Ave(Sexo s) {
    super(s);
  }
  
  public void ponHuevo() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Mo puedo poner huevos");
    } else {
      System.out.println("Huevo*");
    }
  }
  
  public void vuela() {
    System.out.println("Estoy volando");
  }
}

