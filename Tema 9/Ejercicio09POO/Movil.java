public class Movil extends Terminal {
  private String cuota;
  private double gasto = 0;
  
  //constructor
  public Movil (String id, String cuota){
    super(id);
    this.cuota = cuota;
  }
  //getter
  public String getCuota() {
    return cuota;
  }
  
  public double getGasto() {
    return gasto;
  }
  
  @Override
  public String toString(){
    return "nº " + this.getId() + "-" + this.getTiempo() + " segundos de conversacion - " + "tarificados " + this.getGasto() + " euros";
  }
  
  public void llama(Movil m, int segundos) {
    double min = (double)segundos / 60;
    super.llama(m, segundos);
    if (this.cuota.equals("rata")) {
      this.gasto += min * 0.06;
    } else if (this.cuota.equals("mono")) {
      this.gasto += min * 0.12;
    } else if (this.cuota.equals("bisonte")) {
      this.gasto += min * 0.3;
    }
  }
}
