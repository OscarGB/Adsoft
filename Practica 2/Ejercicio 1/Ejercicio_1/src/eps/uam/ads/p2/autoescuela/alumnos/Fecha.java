package eps.uam.ads.p2.autoescuela.alumnos;

/**
 * Esta clase hace referencia a las Fechas con las que trabajar� nuestra aplicaci�n
 * 
 * @author Jos� Ignacio G�mez Garc�a, �scar G�mez Borzdynski
 *
 */

public class Fecha {
	/**
	 * Dia
	 */
	private int dia;
	
	/**
	 * Mes
	 */
	private int mes;
	
	/**
	 * A�o
	 */
	private int anyo;
	
	/**
	 * Constructor de Fecha
	 * 
	 * @param dia
	 * @param mes
	 * @param anyo
	 */
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	/**
	 * Estudia la validez de la fecha del objeto
	 * 
	 * @return boolean, true si es v�lida, false si no
	 */
	public boolean isFechaValida(){
		if (this.dia < 1 || this.dia > 31 || this.mes < 1 || this.mes > 12 || this.anyo < 0) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Devuelve la fecha almacenada en el objeto
	 * 
	 * @return String, cadena con formato dd/mm/aaaa
	 */
	public String getFecha() {
		return (this.dia + "/" + this.mes + "/" + this.anyo);
	}
}
