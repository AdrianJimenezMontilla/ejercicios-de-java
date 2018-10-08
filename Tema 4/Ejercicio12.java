/**
 *  Capitulo 4
 * 
 * Ejercicio 12
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas 
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El programa 
 * mostrará al final la calificación obtenida. Pásale el minicuestionario a tus 
 * compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las 
 * diferentes asignaturas del curso.
 * 
 *  @author Adrian Jimenez Montilla
 */
 
 public class Ejercicio12 {
    public static void main(String[] args) {
    
    System.out.println ("Cuestionario de 10 preguntas sobre el curso. Deberas responder introduciendo 1, 2 o 3");
    
    int respuesta;
    int puntos = 0;
    
    System.out.println ("1. Linux es un Sistema Operativo. \n 1: Si \n 2: No \n 3: ¿No era un pinguino?");
      
      respuesta = Integer.parseInt(System.console().readLine());
      
      if (respuesta == 1) {
      
            puntos++;
      }
      
      System.out.println ("2. Se pueden crear carpetas mediante la terminal de linux con el comando. \n 1: pwd \n 2: mkdir \n 3: Ninguna de las anteriores ");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
		
      if (respuesta == 2) {
			
            puntos++;
      }
      
      System.out.println ("3. Java no puede mostrar nada en pantalla. \n 1: Verdadero \n 2: Falso \n 3: Puede solo en terminal");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 2) {
			
            puntos++;
      }
		
      System.out.println ("4. Se puede capturar el teclado en java con la clase Scanner. \n 1: Solo si la inicializas y la importas \n 2: Se usa tal cual \n 3: No se puede");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 1) {
			
            puntos++;
      }
		
      System.out.println ("5. El recreo tiene un peso del 100% de la nota. \n 1: Verdadero \n 2: Falso \n 3: Solo si la lias parda y te expulsan.");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 3) {
			
            puntos++;
      }
		
      System.out.println ("6. Una biblioteca es una Base de Datos. \n 1: Las bases de datos solo son las SQL \n 2: Las bases de datos solo estan en  los ordenadores \n 3: Verdadero");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 3) {
			
            puntos++;
      }
		
      System.out.println ("7. Hacen falta los datos para poder hacer un DED. \n 1: Si  \n 2: No \n 3: Solo hace falta el enunciado");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 3) {
			
            puntos++;
      }
		
      System.out.println ("8. HTML es un lenguaje secuencial. \n 1: Si, y ademas es orientado a objetos \n 2: Verdadero \n 3: Falso");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 3) {
			
            puntos++;
      }
		
      System.out.println ("9. XML es un lenguaje totalmente distinto a HTML. \n 1: Si, el XML es de marcas y HTML secuencial \n 2: Si, porque XML no se usa en webs \n 3: No porque ambos son lenguajes de marca");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 3) {
			
            puntos++;
      }
		
      System.out.println ("10. El hardware es la parte abstracta del ordenador. \n 1: Verdadero, no lo podemos tocar \n 2: Falso, es la parte fisica \n 3: ¿Los ordenadores tienen de eso?");
		
      respuesta = Integer.parseInt(System.console().readLine());
		
      if (respuesta == 2) {
			
            puntos++;
      }
		
      System.out.println ("\n Has conseguido una puntuacion de " + puntos + "/10, Gracias por hacer el cuestionario!");

    }
}
