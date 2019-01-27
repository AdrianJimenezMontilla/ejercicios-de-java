public class Ameba {
  //Atributos
  private int peso;
  
  
  //Constructor
  public Ameba() {
    this.peso = 3;
  }
  
  
  //Getter
  public int getPeso() {
    return peso;
  }
  
  
  //Setters
  public void setPeso(int peso) {
    this.peso = peso;
  }
  
  
  //Métodos
  @Override
  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos.";
  }
  
  void come(int p) {
    this.peso += p - 1;
  }
  
  void come(Ameba a) {
    this.peso += a.getPeso() - 1;
    a.setPeso(0);
  }
}
