package es.uam.eps.ads.p3.biblioteca.usuario;

import es.uam.eps.ads.p3.biblioteca.prestamo.Prestamo;

/** 
 * Clase Empleado
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Empleado extends Usuario{
	
	/**
	 * Macro para definir el número de préstamos máximo de empleado
	 */
	public static int PRESTAMOS_EMPLEADO = 20;
	
	/**
	 * Sanción económica del Empleado
	 */
	private float sancion;
	
	/**
	 * Constructor de Empleado
	 * @param nombre
	 */
	public Empleado (String nombre) {
		super(nombre, Empleado.PRESTAMOS_EMPLEADO);
		sancion = 0.0f;
	}
	
	/* 
	 * Función para gestionar la sanción por retraso de Publico
	 * @param i, dias de retraso
	 */
	@Override
	public void sancionarPorRetraso(int i) {
		if(i > 4){
			this.sancion += i*(2.50f);
		}
	}
	
	/**
	 * Función para eliminar una sanción
	 */
	@Override
	public void eliminarSancion(){
		this.sancion = 0.0f;
	}
	
	/**
	 * Función toString de Empleado
	 * @return String
	 */
	@Override
	public String toString(){
		String aux;
		aux = "[E: " + this.nombre;
		if(this.sancion > 0){
			aux += " $" + this.sancion;
		}
		aux += "]";
		return aux;
	}
	
}
