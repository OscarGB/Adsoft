package Clase;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<lineaPedido> lineas;
	
	public void add(lineaPedido... lineas) { /*Los ... indican n argumentos de entrada
	 										de tipo lineaPedido*/
		for(lineaPedido lin: lineas) {
			this.lineas.add(lin);
		}
	}
	
	public double total(){
		double acum = 0.0;
		for (lineaPedido p : this.lineas){
			acum += p.getPrecioNeto();
		}
		return acum;
	}
	
	@Override
	public String toString(){
		return this.lineas.toString(); /*Itera los elementos llamando a toString*/
	}
	
}
