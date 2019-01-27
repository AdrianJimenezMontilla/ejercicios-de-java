public class Terminal {
  private int tiempo = 0;
  private String id;
  
  //constructor
  
  public Terminal(String id) {
    this.id = id;
  }
  
  //getter
  public int getTiempo() {
    return tiempo;
  }
  
  public String getId() {
    return id;
  }
  
  @Override
  public String toString() {
    return "nº " + this.getId() + "-" + this.getTiempo() + "segundos de conversacion";
  }
  
  public void llama(Terminal t , int segundos){
    this.tiempo += segundos;
    t.tiempo += segundos;
  }
}
