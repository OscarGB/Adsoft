package Clase;

public class lineaPedido {
	private String descripcion;
	private int cantidad;
	private double costeUnitario;
	private Impuesto impuesto;
	
	public lineaPedido(String descripcion, int cantidad, double d, Impuesto impuesto) {
		super();
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.costeUnitario = d;
		this.impuesto = impuesto;
	}

	public double getPrecioNeto() {
		
		return this.cantidad * this.costeUnitario * (1+this.impuesto.getValor()/100.0);
	}
	
	@Override
	public String toString() {
		return this.cantidad + " de " + this.descripcion + " a " + this.costeUnitario + " impuestos " + this.impuesto;
	}

}
