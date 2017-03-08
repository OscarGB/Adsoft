package es.uam.eps.ads.p3.biblioteca.usuario;

import java.util.ArrayList;

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
	private String nombre;
	
	/**
	 * Número máximo de préstamos
	 */
	private int maxPrestamos;
	
	/**
	 * Array de préstamos
	 */
	private ArrayList<Prestamo> prestamos;
	
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
	}

	/**
	 * Función creada para hacer un Override tanto en Publico
	 * como en Empleado, que sancionen al usuario por retraso
	 * @param i
	 */
	public void sancionarPorRetraso(int i) {
		return;		
	}
	
}
