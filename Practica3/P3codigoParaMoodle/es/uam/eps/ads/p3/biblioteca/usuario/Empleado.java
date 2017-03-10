package es.uam.eps.ads.p3.biblioteca.usuario;

import es.uam.eps.ads.p3.biblioteca.prestamo.Prestamo;

/** 
 * Clase Empleado
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public class Empleado extends Usuario{
	
	/**
	 * Macro para definir el n�mero de pr�stamos m�ximo de empleado
	 */
	public static int PRESTAMOS_EMPLEADO = 20;
	
	/**
	 * Sanci�n econ�mica del Empleado
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
	 * Funci�n para gestionar la sanci�n por retraso de Publico
	 * @param i, dias de retraso
	 */
	@Override
	public void sancionarPorRetraso(int i) {
		if(i > 4){
			this.sancion += i*(2.50f);
		}
	}
	
	/**
	 * Funci�n para eliminar una sanci�n
	 */
	@Override
	public void eliminarSancion(){
		this.sancion = 0.0f;
	}
	
	/**
	 * Funci�n toString de Empleado
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
