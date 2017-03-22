package es.uam.eps.ads.p3.biblioteca.prestamo;
import es.uam.eps.ads.p3.biblioteca.obra.Ejemplar;
import es.uam.eps.ads.p3.biblioteca.usuario.Usuario;
import es.uam.eps.ads.p3.fechasimulada.FechaSimulada;

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
	 * Fecha de fin de prestamo
	 */
	private String finPrestamo;
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
		int plazo = ejemplar.getPlazo();
		FechaSimulada.avanzar(plazo);
		this.finPrestamo = FechaSimulada.getHoy().toString();
		FechaSimulada.avanzar(-plazo);
	}
	
	/**
	 * Devuelve la fecha de fin de prestamo.
	 * @return
	 */
	public String getFinPrestamo(){
		return this.finPrestamo;
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
	
	/**
	 * Convierte el Prestamo a String
	 * @return String
	 */
	@Override
	public String toString(){
		String aux;
		aux = this.ejemplar.toString();
		return aux;
		//if(this.)
	}
}
