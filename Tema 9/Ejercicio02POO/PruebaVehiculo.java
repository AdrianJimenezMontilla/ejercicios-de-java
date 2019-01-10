
public class PruebaVehiculo {
  public static void main(String[] args) {
  
    int opcion = 0;
    int km;
    
    Bicicleta orbea = new Bicicleta(7);
    Coche ford = new Coche(900);
    
    while (opcion != 8) {
    
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quieres ir en bicicleta? ");
          km = Integer.parseInt(System.console().readLine());
          orbea.recorre(km);
          break;
        case 2:
          orbea.hacerCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer en coche? ");
          km = Integer.parseInt(System.console().readLine());
          ford.recorre(km);
          break;
        case 4:
          ford.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(orbea.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(ford.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } 
    } 
  }
}
