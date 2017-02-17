package eps.uam.ads.p2.autoescuela.alumnos;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	public boolean isFechaValida(){
		if (this.dia < 1 || this.dia > 31 || this.mes < 1 || this.mes > 12 || this.anyo < 0) {
			return false;
		}
		
		return true;
	}
	
	public String getFecha() {
		return (this.dia + "/" + this.mes + "/" + this.anyo);
	}
}