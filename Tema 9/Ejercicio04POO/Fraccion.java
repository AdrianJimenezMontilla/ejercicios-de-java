public class Fraccion {

  private int numerador;
  private int denominador;
  //COnstructor
  
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  //getter
  public int getNumerador() {
    return numerador;
  }
  public int getDenominador() {
    return denominador;
  }
  
  @Override
  public String toString() {
    return this.numerador + "/" + this.denominador;
  }
  
  /**
   * invierte la fraccion
   * @return la fraccion invertida
   */
public Fraccion invierte() {
  return new Fraccion(this.denominador, this.numerador);
}

/**
 * simplifica una fraccion
 * @return fraccion simplificada
 */
 
public Fraccion simplifica() {
  int n = this.numerador;
  int d = this.denominador;
      
    for (int i = 2; i < (n + d); i++) {
      if (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }
    return new Fraccion(n, d);
}
 /**
   * Multiplica 2 fracciones
   * @param f una fraccion
   * @return la fraccion resultante de multiplicar las 2 fracciones dadas como
   * parametros
   */
public Fraccion multiplica(Fraccion f) {
    return new Fraccion (this.numerador * f.getNumerador(), this.denominador 
            * f.getDenominador());
}
/**
   * Multiplica una fraccion con un número entero
   * @param n numero entero
   * @return una fraccion resultado de la multiplicacion
   */
public Fraccion multiplica(int n) {
    return new Fraccion (this.numerador * n, this.denominador);
}
/**
   * Divide 2 fracciones
   * @param f una fraccion
   * @return la fraccion resultante de dividir las 2 fracciones dadas como
   * parámetros
   */    
public Fraccion divide(Fraccion f) {
    return new Fraccion(this.numerador * f.getDenominador(), this.denominador 
            * f.getNumerador());
}
/**
   * Divide una fraccion con un número entero
   * @param n numero entero
   * @return una fraccion resultado de la división
   */
public Fraccion divide(int n) {
    return new Fraccion (this.numerador, this.denominador * n);
  }
}
