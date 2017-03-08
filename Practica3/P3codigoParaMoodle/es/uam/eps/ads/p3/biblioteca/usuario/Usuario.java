package es.uam.eps.ads.p3.biblioteca.usuario;

import java.util.ArrayList;

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
	private String nombre;
	
	/**
	 * N�mero m�ximo de pr�stamos
	 */
	private int maxPrestamos;
	
	/**
	 * Array de pr�stamos
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
	}

	/**
	 * Funci�n creada para hacer un Override tanto en Publico
	 * como en Empleado, que sancionen al usuario por retraso
	 * @param i
	 */
	public void sancionarPorRetraso(int i) {
		return;		
	}
	
}
