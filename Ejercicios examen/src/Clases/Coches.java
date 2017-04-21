package Clases;

public class Coches implements Comparable{
	private String modelo;
	private int anio;
	private double precio;
	
	public Coches(String modelo, int anio, double precio){
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}
	
	public double getPrecio(){
		return this.precio;
	}

	@Override
	public int compareTo(Object obj) {
		if(obj == null) return -1;
		Coches coche = (Coches) obj;
		
		if(this.precio < coche.getPrecio()) return -1;
		else if(this.precio == coche.getPrecio()) return 0;
		else return 1;
	}
	
	@Override
	public String toString(){
		return this.modelo+", "+this.anio+" "+this.precio;
	}
	
	
}
