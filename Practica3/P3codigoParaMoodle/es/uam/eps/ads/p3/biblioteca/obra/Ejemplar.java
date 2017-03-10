package es.uam.eps.ads.p3.biblioteca.obra;

/** 
 * Clase para Ejemplar
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Ejemplar {
	/**
	 * Obra a la que pertenece el ejemplar
	 */
	private Obra obra;
	
	/**
	 * Constructor de Ejemplar
	 * @param obra
	 */
	public Ejemplar(Obra obra) {
		this.obra = obra;
	}

	/**
	 * Getter de la Obra de un Ejemplar
	 * @return obra
	 */
	public Obra getObra() {
		return this.obra;
	}
	
}
