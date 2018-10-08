/**
 *  Capitulo 4
 * 
 * Ejercicio 16
 * 
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
 * infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
 * Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con
 * falso no suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas
 * y las conclusiones del programa.
 * 
 *  @author Adrian Jimenez Montilla
 */

  public class Ejercicio16 {
	public static void main(String[] args) {
		
		
		System.out.println ("Test de 10 preguntas sobre la infidelidad. Deberas responder con si o no. ");
    
    String respuesta; 
    
    int x = 0;
    
    System.out.println ("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    
    respuesta = System.console().readLine();
    respuesta = respuesta.toLowerCase();
    
    if (respuesta.equals ("si")) {
    
    x+=3;
		}
		
		System.out.println ("2. Ha aumentado sus gastos de vestuario");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("3. Ha perdido el interés que mostraba anteriormente por ti");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("5. No te deja que mires la agenda de su teléfono móvil");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("9. Has notado que últimamente se perfuma más");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		System.out.println ("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		
		respuesta = System.console().readLine();
		respuesta = respuesta.toLowerCase();
		
		if (respuesta.equals ("si")) {
			
			x+=3;
		}
		
		if (x < 10) {
		
		System.out.println ("\n ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		
		}
		
		if (x > 10 && x < 23) {
			
			System.out.println ("\n Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}
		
		if (x > 22 && x < 31) {
			
			System.out.println ("\n Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}

	}
}
