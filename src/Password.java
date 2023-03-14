import java.util.Random;

/*Haz una clase llamada Password que siga las siguientes condiciones:
 * - Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
 * - Los constructores serán los siguientes:
 * 		- Un constructor por defecto.
 * 		- Un constructor con la longitud que nosotros le pasamos. Gererara una contraseña
 * 	 aleatoria con esa longitud.*/

public class Password {

	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = 8;
		this.contrasena=generadorContrasena(8);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena=generadorContrasena(longitud);
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	
	public void setContrasena(String contrasena) {

		this.contrasena = contrasena;
	}

	// Metodo que genera una contraseña automatica de determinada longitud
	private String generadorContrasena(int longitud) {
		String caracteresPermitidos = "abcçdefghijklmnopqrstuvwxyzABCÇDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random aleatorio = new Random();
		StringBuilder pass = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			int indice = aleatorio.nextInt(caracteresPermitidos.length());
			char caracterAleatorio = caracteresPermitidos.charAt(indice);
			pass.append(caracterAleatorio);
		}

		return contrasena = pass.toString();
	}

}
