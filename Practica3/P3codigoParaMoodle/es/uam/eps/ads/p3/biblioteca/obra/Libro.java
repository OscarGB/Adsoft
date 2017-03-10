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
	 * Plazo de pr�stamo del libro
	 */
	private int plazo;
	
	/**
	 * N�mero de veces que el libro ha sido prestado
	 */
	private int prestamos;
	
	/**
	 * Macro para definir el plazo de libro predeterminado
	 */
	private static int PLAZO_LIBRO = 25;
	
	
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
		this.plazo = PLAZO_LIBRO;
		this.prestamos = 0;
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
		this.plazo = PLAZO_LIBRO;
		this.prestamos = 0;
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

	/**
	 * Funci�n toString de Libro
	 * @return String
	 */
	@Override
	public String toString(){
		return "[L:" + this.titulo + ", " + this.autor + " (" + this.anio + ") plazo:" + this.plazo + "]";
	}
	
	/**
	 * Funci�n que incrementa el n�mero de veces que
	 * ha sido prestado (popularidad)
	 */
	public void obraDevuelta() {
		this.prestamos++;
		if(this.prestamos == 10) {
			this.prestamos = 0;
			this.plazo -= 1;
		}
	}
	
}
