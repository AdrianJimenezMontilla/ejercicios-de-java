/**
* Caballo.java
* Definición de la clase caballo
*/




public class Caballo {

// atributos
  String nombre;
  String raza;
  String color;
  int edad;
// constructor
Caballo (String n, String r, String c, int e) {
  this.nombre = n;
  this.raza = r;
  this.color = c;
  this.edad = e;
}
// metodo getter
public String getNombre() {
  return this.nombre;
}
public String getRaza() {
  return this.raza;
}
public String getColor() {
  return this.color;
}
public int getEdad() {
  return this.edad;
}
// Hace que el caballo cabalgue, relinche y rumie
public void cabalga() {
  System.out.println("Tocotoc tocotoc tocotoc");
}

public void relincha() {
  System.out.println("Hiiiiiiieeeeee");
}

public void rumia() {
  System.out.println("Ñam ñam ñam");
}
}

