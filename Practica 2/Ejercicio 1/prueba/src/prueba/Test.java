package prueba;

public class Test {
	public static void main(String args[]){
		Electro e1 = new Electro();
		Electro e2 = new Frigo();
		Frigo f1 = new Frigo();
		
		e1.abrirPuerta();
		e2.abrirPuerta();
		((Frigo)e2).sinligar();
		f1.abrirPuerta();
		f1.sinligar();
		
		
	}
}
