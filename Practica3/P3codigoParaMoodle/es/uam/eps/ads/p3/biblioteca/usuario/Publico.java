package es.uam.eps.ads.p3.biblioteca.usuario;

/** 
 * Clase Publico
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Publico extends Usuario{
	public static int PRESTAMOS_PUBLICO = 2;
	/**
	 * Constructor de Publico
	 * @param nombre
	 */
	public Publico (String nombre) {
		super(nombre, Publico.PRESTAMOS_PUBLICO);
	}
	
}
