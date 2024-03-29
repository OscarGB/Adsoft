package ejercicioClase1;

public class Pieza {
	private double peso;
	private int id;
	private static Pieza pesada = null;
	private static int numPiezas; /*Al hacerlo static, nos asguramos que 
	 							es una variable de clase y no podr� ser modificada por objeto?*/
	
	public Pieza(double d){
		this.peso = d;
		this.id = ++numPiezas;
		this.compruebaPeso();
	}
	
	private void compruebaPeso(){
		if (Pieza.pesada == null) Pieza.pesada = this;
		else if(this.peso > Pieza.pesada.peso) Pieza.pesada = this;
	}
	
	public void setPeso(double d) {
		this.peso = d;
	}
	
	public static Pieza masPesada(){
		return Pieza.pesada;
	}
	
	@Override
	public String toString() {
		return this.id+" : "+this.peso;
	}
}
