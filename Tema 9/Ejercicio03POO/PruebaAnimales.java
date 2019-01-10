public class PruebaAnimales {

  public static void main(String[] args) {
    Pinguino pingu = new Pinguino(Sexo.MACHO);
    pingu.vuela();
    pingu.nada();
    pingu.ponHuevo();
    pingu.come();
    
    Perro manchitas = new Perro(Sexo.HEMBRA);
    manchitas.duerme();
    manchitas.anda();
    manchitas.amamanta();
    
    
    Lagarto trex = new Lagarto(Sexo.MACHO);
    trex.tomaElSol();
    trex.duerme();
    
    Gato garfield = new Gato(Sexo.MACHO);
    garfield.maulla();
    garfield.amamanta();
    garfield.duerme();
    
    Canario figaro = new Canario(Sexo.HEMBRA);
    figaro.canta();
    figaro.ponHuevo();
  }
}
