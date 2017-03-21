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
	protected String titulo;
	
	/**
	 * autor/director de una obra
	 */
	protected String autor; 
	
	/**
	 * a�o de publicaci�n
	 */
	protected int anio;
	
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
	
	/**
	 * Funci�n toString para hacer override en Pelicula y Libro
	 * @return String
	 */
	@Override
	public String toString(){
		return null;
	}

	/**
	 * Funci�n para ser seobreescrita en Libro, que incrementa el n�mero de veces que
	 * ha sido prestado (popularidad)
	 */
	public void obraDevuelta() {
		return;		
	}
	
	/** 
	 * Funci�n que sobreescribe equals, comprobando si dos Obras son iguales.
	 * @param other Obra a comparar.
	 * @return boolean true si son iguales
	 */
	@Override
	public boolean equals(Object other){
		
		if(this.titulo != ((Obra)other).titulo || this.autor != ((Obra)other).autor){
			return false;
		}
		
		return true;
	}
	
	

	/**
	 * Funci�n para Override en Libro y Pelicula
	 * @return 0
	 */
	public int plazoPrestamo(){
		return 0;
	}
}
