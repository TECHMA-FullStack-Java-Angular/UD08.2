/*Haz una clase llamada Password que siga las siguientes condiciones:
 * - Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
 * - Los constructores serán los siguientes:
 * 		- Un constructor por defecto.
 * 		- Un constructor con la longitud que nosotros le pasamos. Gererara una contraseña
 * 	 aleatoria con esa longitud.*/

public class Ejercicio2App {

	public static void main(String[] args) {

		Password pass1 = new Password();
		
		Password pass2 = new Password(10);
		
		
		System.out.println("Password por defecto: "+pass1.getContrasena());
		System.out.println("Password por con longitud determinada: "+pass2.getContrasena());
		
		pass1.setContrasena("HolaMundo");
		System.out.println("Password alterada: "+pass1.getContrasena());
		
	}

}
