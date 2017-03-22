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
	 * Flag para saber si se ha devuelto el ejemplar
	 */
	private boolean yaDevuelto;
	
	/**
	 * String de la fecha de devoluci�n de un pr�stamo
	 */
	public String fechaDevolucion; 
	
	/**
	 * Fecha de fin de prestamo
	 */
	private String finPrestamo;
	/**
	 * N�mero de prestamos realizados
	 */
	public static int prestamosHistorico = 0;
	
	/**
	 * Array de prestamos pendientes
	 */
	public static ArrayList<Prestamo> pendientes = new ArrayList<Prestamo>();
	
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
	 * Funci�n para gestionar la devoluci�n de un pr�stamo
	 */
	public void prestamoDevuelto() {
		this.ejemplar.getObra().obraDevuelta();
		Prestamo.pendientes.remove(this);
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
	 * M�todo privado para saber el n�mero de d�as de retraso
	 * en formato LocalDate
	 * @return dias de retraso
	 */
	private int diasRetraso(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate date = LocalDate.parse(this.finPrestamo, formatter);
		
		return Period.between(date, FechaSimulada.getHoy()).getDays();
	}

	/**
	 * M�todo para devolver un pr�stamo
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
	 * M�todo que devuelve los prestamos pasados de vencimiento
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
	 * M�todo que devuelve los pr�stamos con vencimiento hoy
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
