package Clase;

public enum Impuesto {
	GENERAL(21), REDUCIDO(19), SUPERREDUCIDO(10);
	
	private double impuesto;
	
	private Impuesto(double d) {
		this.impuesto = d;
	}

	public double getValor() {
		
		return this.impuesto;
	}
	
	
}
