package es.uam.eps.ads.p3.biblioteca.prestamo;
import es.uam.eps.ads.p3.biblioteca.obra.Ejemplar;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;

/** 
 * Clase para Prestamo
 * @author José Ignacio Gómez, Óscar Gómez
 * @date 03/03/2017
 *
 */
public class Prestamo {
	
	/**
	 * Ejemplar prestado
	 */
	private Ejemplar ejemplar;
	
	/**
	 * Número de prestamos realizados
	 */
	public static int prestamosHistorico = 0;
	
	/**
	 * Número de prestamos pendientes
	 */
	public static int prestamosPendientes = 0;
	
	/**
	 * Usuario que realiza el préstamo
	 */
	private Usuario user;
	
	/**
	 * Constructor de Prestamo
	 * @param ejemplar
	 * @param user
	 */
	public Prestamo(Ejemplar ejemplar, Usuario user){
		this.ejemplar = ejemplar;
		this.user = user;
		Prestamo.prestamosHistorico++;
		Prestamo.prestamosPendientes++;
	}
	
	/**
	 * Función para gestionar la devolución de un préstamo
	 */
	public void prestamoDevuelto() {
		this.ejemplar.getObra().obraDevuelta();
		Prestamo.prestamosPendientes--;
	}

	/**
	 * Función que devuelve el Ejemplar prestado
	 * @return Ejemplar
	 */
	public Ejemplar getEjemplar() {
		return this.ejemplar;
	}

	/**
	 * Función que devuelve el usuario del prestamo.
	 * @return Usuario del prestamo
	 */
	public Usuario getUsuario() {
		return this.user;
	}
	
	/**
	 * Función que retorna el número de préstamos que ha habido.
	 * @return int prestamos historicos
	 */
	public static int numPrestamosHistoricos(){
		return Prestamo.prestamosHistorico;
	}
	
	/**
	 * Función que retorna el número de préstamos que aún no se han devuelto.
	 * @return int prestamos pendientes
	 */
	public static int numPrestamosPendientes(){
		return Prestamo.prestamosPendientes;
	}
	
	@Override
	public String toString(){
		String aux;
		aux += "{" + this.ejemplar.toString() + "(";
		if(this.)
	}
}
