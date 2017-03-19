package es.uam.eps.ads.p3.biblioteca.prestamo;
import es.uam.eps.ads.p3.biblioteca.obra.Ejemplar;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;

/** 
 * Clase para Prestamo
 * @author Jos� Ignacio G�mez, �scar G�mez
 * @date 03/03/2017
 *
 */
public class Prestamo {
	
	/**
	 * Ejemplar prestado
	 */
	private Ejemplar ejemplar;
	
	/**
	 * N�mero de prestamos realizados
	 */
	public static int prestamosHistorico = 0;
	
	/**
	 * N�mero de prestamos pendientes
	 */
	public static int prestamosPendientes = 0;
	
	/**
	 * Usuario que realiza el pr�stamo
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
	 * Funci�n para gestionar la devoluci�n de un pr�stamo
	 */
	public void prestamoDevuelto() {
		this.ejemplar.getObra().obraDevuelta();
		Prestamo.prestamosPendientes--;
	}

	/**
	 * Funci�n que devuelve el Ejemplar prestado
	 * @return Ejemplar
	 */
	public Ejemplar getEjemplar() {
		return this.ejemplar;
	}

	/**
	 * Funci�n que devuelve el usuario del prestamo.
	 * @return Usuario del prestamo
	 */
	public Usuario getUsuario() {
		return this.user;
	}
	
	/**
	 * Funci�n que retorna el n�mero de pr�stamos que ha habido.
	 * @return int prestamos historicos
	 */
	public static int numPrestamosHistoricos(){
		return Prestamo.prestamosHistorico;
	}
	
	/**
	 * Funci�n que retorna el n�mero de pr�stamos que a�n no se han devuelto.
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
