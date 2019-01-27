public class Pizza {
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  
  private String tamano;
  private String tipo;
  private String estado;
  // constructor
  public Pizza(String tamano, String tipo){
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }
  // getters
  public static int getTotalPedidas() {
    return totalPedidas;
  }
  public static int getTotalServidas() {
    return totalServidas;
  }
  
  @Override
  public String toString() {
    return "pizza" + this.tipo + " " + this.tamano + ",  " + this.estado;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println ("Esa pizza esta servida");
    }
  }
}
  
