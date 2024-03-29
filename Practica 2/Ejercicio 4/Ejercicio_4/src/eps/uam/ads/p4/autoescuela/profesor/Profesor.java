package eps.uam.ads.p4.autoescuela.profesor;

import eps.uam.ads.p4.autoescuela.alumnos.Fecha;
import eps.uam.ads.p4.autoescuela.autoescuela.Autoescuela;

/**
 * Esta clase refiere a los profesores de la autoescuela
 * 
 * @author Jos� Ignacio G�mez Garc�a, �scar G�mez Borzdynski
 *
 */
public class Profesor {
	
	/**
	 * Fecha de inicio de trabajo en la autoescuela
	 */
	private Fecha fechaIni;
	
	/**
	 * Fecha de fin de trabajo en la autoescuela
	 */
	private Fecha fechaFin;
	
	/**
	 * Nombre del profesor
	 */
	private String nombre;
	
	/**
	 * Apellidos del profesor
	 */
	private String apellidos;
	
	/**
	 * Autoescuela en la que trabaja el profesor
	 */
	private Autoescuela auto;
	
	/**
	 * Constructor de Profesor
	 * 
	 * @param ape, apellidos del profesor
	 * @param nom, nombre del profesor
	 * @param au, autoescuela donde trabaja el profesor
	 * @param fini, fecha inicio de trabajo del profesor
	 * @param ffin, fecha fin de trabajo del profesor
	 */
	public Profesor(String nom, String ape, Autoescuela au, Fecha fini, Fecha ffin){
		this.fechaIni = fini;
		this.fechaFin = ffin;
		this.nombre = nom;
		this.apellidos = ape;
		this.auto = au;
	}
	
	/**
	 * (Override) devuelve un string con los datos del profesor
	 * 
	 * @return String, datos del profesor
	 * 
	 */
	@Override
	public String toString() {
		return "El profesor " + this.nombre + " " + this.apellidos + " trabaj� en la autoescuela " + this.auto + " desde el " + this.fechaIni.getFecha() + " hasta el " + this.fechaFin.getFecha() + ".";
	}
}
