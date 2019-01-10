/**
* Vehiculo.java
* Definición de la clase vehiculo
*/

public abstract class Vehiculo {
// Atrubutos de clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
// Atributos de instancia
  private int kilometrosRecorridos;
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }
// getter
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
