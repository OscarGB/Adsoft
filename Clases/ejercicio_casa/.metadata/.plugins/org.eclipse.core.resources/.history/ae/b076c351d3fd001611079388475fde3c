package ejercicio_clase;

import java.util.*; // se importa la clase Scanner

public class EjercicioClase {

	public static void main(String[] args) {
		String email;
		String id;
		String domain;
		String contrasena;
		int lon;
		Scanner entrada=new Scanner(System.in); // se declara e inicializa una instancia  de la clase Scanner.
		System.out.print("Ingrese un texto: ");
		email = entrada.next();
		StringTokenizer tokens=new StringTokenizer(email, "@.");
		id = tokens.nextToken();
		domain = tokens.nextToken();
		lon = domain.length();
		
		
		contrasena = id.substring(0, 2) + domain.substring(lon-2, lon).toUpperCase() + "_" + id.length() + "&" + (2*lon);
		System.out.println(contrasena);
		
		entrada.close();

	}

}
