package piezas;

public class Pieza {
	private double peso;
	private static int numPiezas = 0;
	private int id;
	public static Pieza pesada = null;
	
	public Pieza(double d){
		this.peso = d;
		Pieza.numPiezas++;
		this.id = Pieza.numPiezas;
		if (Pieza.pesada == null) Pieza.pesada = this;
		else if (this.peso > Pieza.pesada.peso) Pieza.pesada = this;
	}
	
	public static Pieza masPesada() {
		return Pieza.pesada;
	}
	
	public void compruebaPeso(){
		if (Pieza.pesada == null) Pieza.pesada = this;
		else if (this.peso > Pieza.pesada.peso) Pieza.pesada = this;
	}
	
	public void setPeso(double d){
		this.peso = d;
		this.compruebaPeso();
	}
	
	@Override
	public String toString() {
		return this.id + " : " + this.peso;
	}
}
