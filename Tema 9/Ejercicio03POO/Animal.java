/**
* Animal.java
* Definición de la clase animal
*/

public abstract class Animal {

  private Sexo sexo;

  public Animal() {
    this.sexo = Sexo.MACHO;
  }
  public Animal(Sexo s) {
    this.sexo = s;
  }
// getter
  public Sexo getSexo() {
    return this.sexo;
  }
  public void duerme() {
    System.out.println("Zzz");
  }
  
  public void come() {
    System.out.println("Estoy comiendo");
  }
}
  
  
  
