package matematicas;

public class varias {


/**
* Ejercicio1
* Devuelve verdadero si el número que se pasa como parámetro es capicúa y
*falso en caso contrario.
* <p>
* Un número capicúa es el que se lee igual de izquierda a derecha que de
* derecha a izquierda.
*
* @param x número del que se quiere saber si es capicúa
* @return verdadero si el número que se pasa como parámetro es capicúa y
*
* falso en caso contrario
*/

public static boolean esCapicua(long x) {
  return x == voltea(x);
}

/**
* Devuelve verdadero si el número que se pasa como parámetro es capicúa y
* falso en caso contrario.
* <p>
* Un número capicúa es el que se lee igual de izquierda a derecha que de
* derecha a izquierda.
*
* @param x número del que se quiere saber si es capicúa
* @return verdadero si el número que se pasa como parámetro es capicúa y
*
* falso en caso contrario
*/

public static boolean esCapicua(int x) {
  return esCapicua((long)x);
}










/**
* Ejercicio7 
*Le da la vuelta a un número.
*
* @param x número al que se le quiere dar la vuelta
* @return número volteado (al revés)
*/

public static long voltea(long x) {
  if (x < 0) {
    return -voltea(-x);
  }
  
  long volteado = 0;
  
  while(x > 0) {
    volteado = (volteado * 10) + (x % 10);
    x = x / 10;
  }
  return volteado;
}
/**
* Le da la vuelta a un número.
*
* @param x número al que se le quiere dar la vuelta
* @return número volteado (al revés)
*/
public static int voltea(int x) {
  return (int)voltea((long)x);
}
}

