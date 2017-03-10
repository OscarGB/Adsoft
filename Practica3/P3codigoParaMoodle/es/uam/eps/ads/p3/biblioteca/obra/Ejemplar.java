package es.uam.eps.ads.p3.biblioteca.obra;

import es.uam.eps.ads.p3.biblioteca.prestamo.Prestamo;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;

/** 
 * Clase para Ejemplar
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Ejemplar {
	/**
	 * Obra a la que pertenece el ejemplar
	 */
	private Obra obra;
	
	/**
	 * Control de identificadores
	 */
	public static int num = 0;
	
	/**
	 * Identificador único
	 */
	private int identificador;
	
	/**
	 * Booleano para comprobar si un ejemplar está prestado.
	 */
	private boolean prestado;
	
	/**
	 * Prestamo en el que se encuentra
	 */
	private Prestamo pre;
	
	/**
	 * Constructor de Ejemplar
	 * @param obra
	 */
	public Ejemplar(Obra obra) {
		this.obra = obra;
		Ejemplar.num++;
		this.identificador = Ejemplar.num;
	}

	/**
	 * Getter de la Obra de un Ejemplar
	 * @return obra
	 */
	public Obra getObra() {
		return this.obra;
	}

	/**
	 * Función para prestar un ejemplar.
	 * @param u1 usuario que toma el ejemplar
	 * @return Prestamo realizado
	 */
	public Prestamo prestar(Usuario u1) {
		if(this.prestado == true){
			return null;
		}
		if(u1.puedePrestar() == true){
			for(Prestamo p : u1.getPrestamos()){
				if(p.getEjemplar().obra.equals(this.obra)){
					return null;
				}
			}
			Prestamo pf = new Prestamo(this, u1);
			u1.anyadirPrestamo(pf);
			this.pre = pf;
			return pf;
		}
		return null;
	}

	/**
	 * Función para devolver un ejemplar.
	 */
	public void devolver() {
		if(this.prestado == false){
			return;
		}
		
		this.pre.getUsuario().eliminarPrestamo(pre);
		this.prestado = false;
		this.pre = null;
		return;
		
	}
	
	public String toString(){
		String aux = "{" + this.identificador + this.obra.toString() + "(";
		if(this.prestado = false){
			aux += "disponible)}";
		}
		else{
			aux += "prestado)} prestado a " + ;
		}
	}
	
}
