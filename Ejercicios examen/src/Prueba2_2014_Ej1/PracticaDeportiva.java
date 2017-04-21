package Prueba2_2014_Ej1;

public class PracticaDeportiva extends Actividad{
	protected static double contabilidad = 0;
	private double nivel;
	
	public PracticaDeportiva(String descripcion, double base, double nivel){
		super(descripcion, base);
		this.nivel = nivel;
	}
	
	public double extras(){
		double extra = this.precio * this.nivel;
		return this.precio * this.nivel;
	}
	
	public double precio(){
		double total = this.precio + this.extras();
		PracticaDeportiva.recuento(total);
		return total;
	}
	
	public static double total(){
		return PracticaDeportiva.contabilidad;
	}
	
	protected static void recuento(double precio){
		PracticaDeportiva.contabilidad += precio;
	}
}
