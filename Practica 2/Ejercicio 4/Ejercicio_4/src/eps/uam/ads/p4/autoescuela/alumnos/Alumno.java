package eps.uam.ads.p4.autoescuela.alumnos;

/**
 * Esta clase refiere a los distintos alumnos de la aplicación de la autoescuela
 * 
 * @author José Ignacio Gómez García, Óscar Gómez Borzdynski
 *
 */

public class Alumno {
	
	/**
	 * DNI del alumno
	 */
	private int dni;
	
	/**
	 * Nombre del alumno 
	 */
	private String nombre;
	
	/**
	 * Apellidos del alumno
	 */
	private String apellidos;
	
	/**
	 * Dirección del alumno
	 */
	private String direccion;
	
	/**
	 * Teléfono del alumno
	 */
	private int telefono;
	
	/**
	 * Fecha de matriculación del alumno
	 */
	private Fecha fechaMatricula;
	
	/**
	 * Fecha de superación del teórico
	 */
	private Fecha fechaSupTeorico;
	
	/**
	 * Fecha de superación del práctico
	 */
	private Fecha fechaSupPractico;

	/**
	 * Constructor de Alumno
	 * 
	 * @param dni, dni del alumno
	 * @param nombre, nombre del alumno
	 * @param apellidos, apellidos del alumno
	 * @param direccion, dirección del alumno
	 * @param tlf, teléfono del alumno
	 * @param dd, día de matriculación del alumno
	 * @param mm, mes de matriculación del alumno
	 * @param aa, año de matriculación del alumno
	 */
	public Alumno(int dni, String nombre, String apellidos, String direccion, int tlf, int dd, int mm, int aa) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = tlf;
		this.fechaMatricula = new Fecha(dd, mm, aa);
	}

	
	/**
	 * Asigna la fecha de superación del teórico
	 * 
	 * @param dd, dia de superación
	 * @param mm, mes de superación
	 * @param aa, año de superación
	 * @return void
	 */
	public void setFechaSupTeorico(int dd, int mm, int aa) {
		this.fechaSupTeorico = new Fecha(dd, mm, aa);	
	}
	
	
	
	/**
	 * Devuelve la fecha de superación del teórico
	 * 
	 * @return Fecha
	 */
	public Fecha getFechaSupTeorico() {
		return this.fechaSupTeorico;
	}

	
	
	/**
	 * Devuelve la fecha de matrícula
	 * 
	 * @return Fecha, fecha de matriculación
	 */
	public Fecha getFechaMatricula() {
		return this.fechaMatricula;
	}

	
	/**
	 * Asigna la fecha de superación del práctico
	 * 
	 * @param dd, dia de superación
	 * @param mm, mes de superación
	 * @param aa, año de superación
	 * @return void
	 */
	public void setFechaSupPractico(int dd, int mm, int aa) {
		this.fechaSupPractico = new Fecha(dd, mm, aa);		
	}
	
	
	/**
	 * Devuelve la fecha de superación del práctico
	 * 
	 * @return Fecha
	 */
	public Fecha getFechaSupPractico() {
		return this.fechaSupPractico;
	}

	
	/**
	 * Devuelve nombre y apellidos del alumno
	 * 
	 * @return String, nombre y apellidos
	 */
	public String getNombreYApellidos() {
		return (this.nombre + " " + this.apellidos);
	}

	/**
	 * Estudia la validez de la fecha pasada como argumento
	 * 
	 * @param fecha, fecha a evaluar
	 * 
	 * @return String, "true" si es válida, "false" si no
	 */
	public String isFechaValida(Fecha fecha) {
		if(fecha.isFechaValida() == true) {
			return "true";
		}
		
		return "false";
	}
	
	
	/**
	 * (Override) devuelve un string con los datos del alumno
	 * 
	 * @return String, datos del alumno
	 * 
	 */
	@Override
	public String toString() {
		return "<dni: " + this.dni + ">\n\tNombre y apellidos: " + this.getNombreYApellidos() + "\n\tDirección: " + this.direccion + "\n\tTeléfono: " + this.telefono + "\n\tFecha de matriculación: " + this.fechaMatricula.getFecha(); 
	}
	
}
