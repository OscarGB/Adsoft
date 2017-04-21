package Prueba2_2014_Ej1;

public abstract class Actividad {
	protected String descripcion;
	protected double precio;
	
	protected Actividad(String descripcion, double precio){
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public double precio(){
		double total = this.precio + this.extras();
		return total;
	}
	
	public double extras(){
		return 0;
	}
	
	@Override
	public String toString(){
		return this.descripcion;
	}
	
}
