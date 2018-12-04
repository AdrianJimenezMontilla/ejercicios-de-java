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
* Ejercicio 2
* Devuelve verdadero si el número que se pasa como parámetro es primo y falso
* en caso contrario.
* <p>
* Un número primo es un número natural mayor que 1 y divisible únicamente
* entre el mismo y entre 1.
*
* @param x número del que se quiere saber si es primo
* @return verdadero si el número que se pasa como parámetro es primo y falso
*
en caso contrario
*/

public static boolean esPrimo(long n) {
  if (n < 2) {
    return false;
  } else {
    for (long i = n / 2; i >= 2; i--) {
      if (n % i == 0) {
        return false;
      }
    }
  }
  return true;
}
/**
* Ejercicio3
* Devuelve el menor primo que es mayor al número que se pasa como parámetro.
*
* @param x un número entero
* @return el menor primo que es mayor al número que se pasa como parámetro
*/
public static int siguientePrimo (int x) {
  while (!esPrimo(++x)) {};
  return x;
}

/**
* Ejercicio4
* Dada una base y un exponente, devuelve la potencia.
*
* @param base
* base de la potencia
* @param exponente exponente de la potencia
* @return
número resultante de elevar la base a la potencia indicada
*/
public static double potencia (int base, int exponente) {
  if (exponente == 0) {
    return 1;
  }
  if (exponente < 0) {
    return 1/potencia(base, -exponente);
  }
  
  int n = 1;
  
  for ( int i = 0; i < Math.abs(exponente); i++) {
    n = n * base;
  }
  
  return n;
}
/**
* Ejercicio 5
* Cuenta el número de dígitos de un número entero.
*
* @param x número al que se le quieren contar los dígitos
* @return número de dígitos que tiene el número que se pasa como parámetro
*/
public static int digitos (long x) {
  if ( x < 0) {
    x = -x;
  }
  
  if (x == 0) {
    return 1;
  
  } else {
    int n = 0;
    while (x > 0) {
      x = x / 10;
      n++;
    }
    return n;
  }
}
/**
* Cuenta el número de dígitos de un número entero.
*
* @param x número al que se le quieren contar los dígitos
* @return número de dígitos que tiene el número que se pasa como parámetro
*/
public static int digitos(int x) {
  return digitos ((long)x);
}


/**
* Ejercicio 6 
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

/**
 * Ejercicio 7
/* Devuelve el dígito que está en la posición <code>n</code> de un número
* entero. Se empieza contando por el 0 y de izquierda a derecha.
*
* @param x número entero
* @param n posición dentro del número <code>x</code>
* @return dígito que está en la posición n del número <code>x</code>
*
empezando a contar por el 0 y de izquierda a derecha
*/
public static int digitoN(long x, int n) {
  x = voltea(x);
  
  while(n-- > 0) {
    x = x / 10;
  }
  
  return (int)x %10;
}

/**
/* Devuelve el dígito que está en la posición n de un número entero. Se
* empieza contando por el 0 y de izquierda a derecha.
*
* @param x número entero
* * @param n posición dentro del número <code>x</code>
* @return dígito que está en la posición n del número <code>x</code>
*
empezando a contar por el 0 y de izquierda a derecha
*/
public static int digitoN(int x, int n) {
return digitoN((long)x, n);
}



}

