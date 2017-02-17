package eps.uam.ads.p2.autoescuela.alumnos;

public class Alumno {
	
	private int dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private Fecha fechaMatricula;
	private Fecha fechaSupTeorico;
	private Fecha fechaSupPractico;

	public Alumno(int dni, String nombre, String apellidos, String direccion, int tlf, int dd, int mm, int aa) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = tlf;
		this.fechaMatricula = new Fecha(dd, mm, aa);
	}

	public void setFechaSupTeorico(int dd, int mm, int aa) {
		this.fechaSupTeorico = new Fecha(dd, mm, aa);	
	}
	
	public Fecha getFechaSupTeorico() {
		return this.fechaSupTeorico;
	}

	public Fecha getFechaMatricula() {
		return this.fechaMatricula;
	}

	public void setFechaSupPractico(int dd, int mm, int aa) {
		this.fechaSupPractico = new Fecha(dd, mm, aa);		
	}

	public String getNombreYApellidos() {
		return (this.nombre + " " + this.apellidos);
	}

	public Fecha getFechaSupPractico() {
		return this.fechaSupPractico;
	}

	public String isFechaValida(Fecha fechaMatricula) {
		if(fechaMatricula.isFechaValida() == true) {
			return "true";
		}
		
		return "false";
	}
	
	@Override
	public String toString() {
		return "<dni: " + this.dni + ">\n\tNombre y apellidos: " + this.getNombreYApellidos() + "\n\tDirección: " + this.direccion + "\n\tTeléfono: " + this.telefono + "\n\tFecha de matriculación: " + this.fechaMatricula.getFecha(); 
	}
	
}
