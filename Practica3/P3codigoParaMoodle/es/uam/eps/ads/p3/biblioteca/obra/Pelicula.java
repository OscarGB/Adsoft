package es.uam.eps.ads.p3.biblioteca.obra;

/** 
 * Clase que implementa Pelicula
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public class Pelicula extends Obra {
	/**
	 * Genero de la pelicula
	 */
	Genero genero;
	
	/**
	 * Constructor de la clase Pel�cula
	 * @param nombre
	 * @param autor
	 * @param anio
	 * @param genero
	 */
	public Pelicula (String nombre, String autor, int anio, Genero genero) {
		super(nombre, autor, anio);
		this.genero = genero;
	}

	/**
	 * Getter de Genero
	 * @return genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Setter de Genero
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}
