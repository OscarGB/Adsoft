package es.uam.eps.ads.p3.biblioteca.prestamo;
import es.uam.eps.ads.p3.biblioteca.obra.Ejemplar;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;

/** 
 * Clase para Prestamo
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public class Prestamo {
	
	/**
	 * Ejemplar prestado
	 */
	private Ejemplar ejemplar;
	
	/**
	 * Usuario que realiza el pr�stamo
	 */
	private Usuario user;
	
	/**
	 * Constructor de Prestamo
	 * @param ejemplar
	 * @param user
	 */
	public Prestamo(Ejemplar ejemplar, Usuario user){
		this.ejemplar = ejemplar;
		this.user = user;
	}
}
