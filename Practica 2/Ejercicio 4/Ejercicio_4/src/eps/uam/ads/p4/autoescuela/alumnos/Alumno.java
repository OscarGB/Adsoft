package eps.uam.ads.p4.autoescuela.alumnos;

/**
 * Esta clase refiere a los distintos alumnos de la aplicaci�n de la autoescuela
 * 
 * @author Jos� Ignacio G�mez Garc�a, �scar G�mez Borzdynski
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
	 * Direcci�n del alumno
	 */
	private String direccion;
	
	/**
	 * Tel�fono del alumno
	 */
	private int telefono;
	
	/**
	 * Fecha de matriculaci�n del alumno
	 */
	private Fecha fechaMatricula;
	
	/**
	 * Fecha de superaci�n del te�rico
	 */
	private Fecha fechaSupTeorico;
	
	/**
	 * Fecha de superaci�n del pr�ctico
	 */
	private Fecha fechaSupPractico;

	/**
	 * Constructor de Alumno
	 * 
	 * @param dni, dni del alumno
	 * @param nombre, nombre del alumno
	 * @param apellidos, apellidos del alumno
	 * @param direccion, direcci�n del alumno
	 * @param tlf, tel�fono del alumno
	 * @param dd, d�a de matriculaci�n del alumno
	 * @param mm, mes de matriculaci�n del alumno
	 * @param aa, a�o de matriculaci�n del alumno
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
	 * Asigna la fecha de superaci�n del te�rico
	 * 
	 * @param dd, dia de superaci�n
	 * @param mm, mes de superaci�n
	 * @param aa, a�o de superaci�n
	 * @return void
	 */
	public void setFechaSupTeorico(int dd, int mm, int aa) {
		this.fechaSupTeorico = new Fecha(dd, mm, aa);	
	}
	
	
	
	/**
	 * Devuelve la fecha de superaci�n del te�rico
	 * 
	 * @return Fecha
	 */
	public Fecha getFechaSupTeorico() {
		return this.fechaSupTeorico;
	}

	
	
	/**
	 * Devuelve la fecha de matr�cula
	 * 
	 * @return Fecha, fecha de matriculaci�n
	 */
	public Fecha getFechaMatricula() {
		return this.fechaMatricula;
	}

	
	/**
	 * Asigna la fecha de superaci�n del pr�ctico
	 * 
	 * @param dd, dia de superaci�n
	 * @param mm, mes de superaci�n
	 * @param aa, a�o de superaci�n
	 * @return void
	 */
	public void setFechaSupPractico(int dd, int mm, int aa) {
		this.fechaSupPractico = new Fecha(dd, mm, aa);		
	}
	
	
	/**
	 * Devuelve la fecha de superaci�n del pr�ctico
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
	 * @return String, "true" si es v�lida, "false" si no
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
		return "<dni: " + this.dni + ">\n\tNombre y apellidos: " + this.getNombreYApellidos() + "\n\tDirecci�n: " + this.direccion + "\n\tTel�fono: " + this.telefono + "\n\tFecha de matriculaci�n: " + this.fechaMatricula.getFecha(); 
	}
	
}
