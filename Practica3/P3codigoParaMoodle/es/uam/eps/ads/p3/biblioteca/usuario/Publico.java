package es.uam.eps.ads.p3.biblioteca.usuario;

import es.uam.eps.ads.p3.biblioteca.prestamo.Prestamo;

/** 
 * Clase Publico
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Publico extends Usuario{
	/**
	 * Macro de número inicial de préstamos máximos de un Publico
	 */
	public static int PRESTAMOS_PUBLICO = 2;
	
	/**
	 * Número de devoluciones a tiempo acumuladas
	 */
	private int numDevueltos;
	
	/**
	 * Constructor de Publico
	 * @param nombre
	 */
	public Publico (String nombre) {
		super(nombre, Publico.PRESTAMOS_PUBLICO);
		numDevueltos = 0;
	}
	
	/** 
	 * Función para gestionar la sanción por retraso de Publico
	 * @param i, dias de retraso
	 */
	@Override
	public void sancionarPorRetraso(int i){
		this.numDevueltos -= i+1;
		this.maxPrestamos = PRESTAMOS_PUBLICO;
	}
	
	/**
	 * Función para devolver préstamos incrementando los acumulados
	 * @param pf prestamo
	 */
	@Override
	public void eliminarPrestamo(Prestamo pf) {
		prestamos.remove(pf);
		this.numDevueltos++;
		if(this.numDevueltos > this.maxPrestamos){
			this.maxPrestamos++;
			this.numDevueltos = 1;
		}
		pf.prestamoDevuelto();
	}
	
	/**
	 * Función toString de Publico
	 * @return String
	 */
	@Override
	public String toString(){
		return "[P: " + this.nombre + ",ppb:" + this.numDevueltos + ",ps:" + this.maxPrestamos + "]";
	}
}
