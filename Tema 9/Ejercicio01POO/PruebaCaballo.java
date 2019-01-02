

public class PruebaCaballo {
  public static void main(String[] args) {
  
  Caballo p = new Caballo("perdigon", "arabe", "blanco", 5);
  Caballo e = new Caballo("epona", "andaluz", "narron", 4);
  
  System.out.println("Hola, me llamo " + p.getNombre());
  System.out.println("Soy de raza  " + p.getRaza());
  System.out.println("Y mi color es " + p.getColor());
  System.out.println("Tengo  " + p.getEdad());
  p.cabalga();
  p.relincha();
  
  System.out.println("Hola, me llamo " + e.getNombre());
  System.out.println("Soy de raza  " + e.getRaza());
  System.out.println("Y mi color es " + e.getColor());
  System.out.println("Tengo  " + e.getEdad());
  e.cabalga();
  e.relincha();
  }
}
