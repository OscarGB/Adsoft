package es.uam.eps.ads.p3.biblioteca.prestamo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
	 * Flag para saber si se ha devuelto el ejemplar
	 */
	private boolean yaDevuelto;
	
	/**
	 * String de la fecha de devolución de un préstamo
	 */
	public String fechaDevolucion; 
	
	/**
	 * Fecha de fin de prestamo
	 */
	private String finPrestamo;
	/**
	 * Número de prestamos realizados
	 */
	public static int prestamosHistorico = 0;
	
	/**
	 * Array de prestamos pendientes
	 */
	public static ArrayList<Prestamo> pendientes = new ArrayList<Prestamo>();
	
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
		this.yaDevuelto = false;
		this.fechaDevolucion = "";
		Prestamo.prestamosHistorico++;
		Prestamo.pendientes.add(this);
		int plazo = ejemplar.plazoPrestamo();
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
		Prestamo.pendientes.remove(this);
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
		return Prestamo.pendientes.size();
	}
	
	/**
	 * Convierte el Prestamo a String
	 * @return String
	 */
	@Override
	public String toString(){
		String aux;
		aux = this.ejemplar.toString();
		if(yaDevuelto == true){
			aux += " prestado a " + this.user.toString() + " hasta " + this.finPrestamo + " devuelto " + this.fechaDevolucion;
		}
		return aux;
	}
	
	/**
	 * Método privado para saber el número de días de retraso
	 * en formato LocalDate
	 * @return dias de retraso
	 */
	private int diasRetraso(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate date = LocalDate.parse(this.finPrestamo, formatter);
		
		return Period.between(date, FechaSimulada.getHoy()).getDays();
	}

	/**
	 * Método para devolver un préstamo
	 * @return boolean
	 */
	public boolean devolver() {
		int numDiasRetraso = this.diasRetraso();
		
		if(numDiasRetraso > 0){
			this.user.sancionarPorRetraso(numDiasRetraso);
		}
		
		this.fechaDevolucion = FechaSimulada.getHoy().toString();
		
		this.yaDevuelto = true;
		
		return this.ejemplar.devolver();
	}

	/**
	 * Método que devuelve los prestamos pasados de vencimiento
	 * @return ArrayList
	 */
	public static ArrayList<Prestamo> pasadosDeVencimiento() {
		ArrayList<Prestamo> pasados = new ArrayList<Prestamo>();
		
		for(Prestamo p : Prestamo.pendientes){
			if(p.diasRetraso() > 0){
				pasados.add(p);
			}
		}
		return pasados;
	}

	/**
	 * Método que devuelve los préstamos con vencimiento hoy
	 * @return ArrayList
	 */
	public static ArrayList<Prestamo> conVencimientoHoy() {
		ArrayList<Prestamo> vencimientohoy = new ArrayList<Prestamo>();
		
		for(Prestamo p : Prestamo.pendientes){
			if(p.diasRetraso() == 0){
				vencimientohoy.add(p);
			}
		}
		return vencimientohoy;
	}
}
