package es.uam.eps.ads.p3.biblioteca.obra;

/** 
 * Clase que implementa Libro
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public class Libro extends Obra{
	/**
	 * Editorial del libro
	 */
	private String editorial;
	
	/**
	 * N�mero de ediciones
	 */
	private int numedicion;
	
	
	/**
	 * Constructor de la clase Libro
	 * @param nombre
	 * @param autor
	 * @param anio
	 * @param editorial
	 * @param numedicion
	 */
	public Libro (String nombre, String autor, int anio, String editorial, int numedicion) {
		super(nombre, autor, anio);
		this.editorial = editorial;
		this.numedicion = numedicion;
	}

	/**
	 * Constructor de la clase Libro, desconociendo editorial y numediciones
	 * @param nombre
	 * @param autor
	 * @param anio
	 */
	public Libro(String nombre, String autor, int anio) {
		super(nombre, autor, anio);
		this.editorial = null;
		this.numedicion = 0;
	}

	/**
	 * Getter de editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Setter de editorial
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Getter del n�mero de ediciones
	 */
	public int getNumedicion() {
		return numedicion;
	}

	/**
	 * Setter del n�mero de ediciones
	 * @param numedicion
	 */
	public void setNumedicion(int numedicion) {
		this.numedicion = numedicion;
	}

	
	
	
}
