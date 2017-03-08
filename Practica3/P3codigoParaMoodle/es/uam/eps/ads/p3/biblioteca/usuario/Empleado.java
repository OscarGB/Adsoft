package es.uam.eps.ads.p3.biblioteca.usuario;

/** 
 * Clase Empleado
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Empleado extends Usuario{
	public static int PRESTAMOS_EMPLEADO = 20;
	
	/**
	 * Constructor de Empleado
	 * @param nombre
	 */
	public Empleado (String nombre) {
		super(nombre, Empleado.PRESTAMOS_EMPLEADO);
	}
	
}
