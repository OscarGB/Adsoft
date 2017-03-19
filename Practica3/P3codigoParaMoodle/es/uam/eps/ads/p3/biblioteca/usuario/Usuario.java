package es.uam.eps.ads.p3.biblioteca.usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.uam.eps.ads.p3.biblioteca.prestamo.Prestamo;

/** 
 * Clase abstracta para Usuario
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public abstract class Usuario {
	/**
	 * Nombre del usuario
	 */
	protected String nombre;
	
	/**
	 * N�mero m�ximo de pr�stamos
	 */
	protected int maxPrestamos;
	
	/**
	 * Array de pr�stamos
	 */
	protected ArrayList<Prestamo> prestamos;
	
	/**
	 * Constructor de Usuario
	 * @param nombre
	 */
	public Usuario (String nombre, int max) {
		this.nombre = nombre;
		this.maxPrestamos = max;
		this.prestamos = new ArrayList<Prestamo>();
	}

	/**
	 * Funci�n para a�adir pr�stamos
	 * @param pf prestamo
	 */
	public void anyadirPrestamo(Prestamo pf) {
		prestamos.add(pf);		
	}

	/**
	 * Funci�n para borrar pr�stamos
	 * @param pf prestamo
	 */
	public void eliminarPrestamo(Prestamo pf) {
		prestamos.remove(pf);	
		pf.prestamoDevuelto();
	}

	/**
	 * Funci�n creada para hacer un Override tanto en Publico
	 * como en Empleado, que sancionen al usuario por retraso
	 * @param i
	 */
	public void sancionarPorRetraso(int i) {
		return;		
	}
	
	/**
	 * Funci�n para eliminar una sanci�n
	 */
	public void eliminarSancion(){
		return;
	}
	
	/**
	 * Funci�n toString para hacer override en Publico y Empleado
	 * @return String
	 */
	@Override
	public String toString(){
		return null;
	}

	/**
	 * Funci�n que comprueba si un Usuario puede prestar una obra
	 * @return boolean true si puede prestar
	 */
	public boolean puedePrestar() {
		if(this.prestamos.size() >= this.maxPrestamos){
			return false;
		}
		return true;
	}

	/**
	 * @return 
	 */
	public List<Prestamo> getPrestamos() {
		return Collections.unmodifiableList(this.prestamos);
	}

	
	
	
}
