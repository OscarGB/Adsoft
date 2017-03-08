package es.uam.eps.ads.p3.biblioteca.obra;

/**
 * Clase abstracta para Obra
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public abstract class Obra {
	/**
	 * titulo de una obra
	 */
	private String titulo;
	
	/**
	 * autor/director de una obra
	 */
	private String autor; 
	
	/**
	 * a�o de publicaci�n
	 */
	private int anio;
	
	/**
	 * Constructor de Obra
	 * @param titulo
	 * @param autor
	 * @param anio
	 */
	public Obra(String titulo, String autor, int anio){
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
	}
}
