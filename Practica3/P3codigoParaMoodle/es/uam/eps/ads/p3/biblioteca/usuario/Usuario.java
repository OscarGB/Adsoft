package es.uam.eps.ads.p3.biblioteca.usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.uam.eps.ads.p3.biblioteca.prestamo.Prestamo;

/** 
 * Clase abstracta para Usuario
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public abstract class Usuario {
	/**
	 * Nombre del usuario
	 */
	protected String nombre;
	
	/**
	 * Número máximo de préstamos
	 */
	protected int maxPrestamos;
	
	/**
	 * Array de préstamos
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
	 * Función para añadir préstamos
	 * @param pf prestamo
	 */
	public void anyadirPrestamo(Prestamo pf) {
		prestamos.add(pf);		
	}

	/**
	 * Función para borrar préstamos
	 * @param pf prestamo
	 */
	public void eliminarPrestamo(Prestamo pf) {
		prestamos.remove(pf);	
		pf.prestamoDevuelto();
	}

	/**
	 * Función creada para hacer un Override tanto en Publico
	 * como en Empleado, que sancionen al usuario por retraso
	 * @param i
	 */
	public void sancionarPorRetraso(int i) {
		return;		
	}
	
	/**
	 * Función para eliminar una sanción
	 */
	public void eliminarSancion(){
		return;
	}
	
	/**
	 * Función toString para hacer override en Publico y Empleado
	 * @return String
	 */
	@Override
	public String toString(){
		return null;
	}

	/**
	 * Función que comprueba si un Usuario puede prestar una obra
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
