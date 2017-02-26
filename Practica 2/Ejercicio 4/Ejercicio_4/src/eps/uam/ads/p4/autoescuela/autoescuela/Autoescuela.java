package eps.uam.ads.p4.autoescuela.autoescuela;

/**
 * Esta clase refiere a la autoescuela
 * 
 * @author José Ignacio Gómez García, Óscar Gómez Borzdynski
 *
 */
public class Autoescuela {
	
	/**
	 * Nombre de la autoescuela
	 */
	private String nombre;
	
	/**
	 * Constructor de Autoescuela
	 * 
	 * @param nom, nombre de la autoescuela
	 */
	public Autoescuela(String nom){
		this.nombre = nom;
	}
	
	/**
	 * (Override) devuelve un string con los datos de la autoescuela
	 * 
	 * @return String, datos de la autoescuela
	 * 
	 */
	@Override
	public String toString() {
		return this.nombre;			
	}
}
