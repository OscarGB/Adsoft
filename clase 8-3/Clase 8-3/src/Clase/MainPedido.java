package Clase;

public class MainPedido {
	public static void main(String[] args) {
		Pedido mp = new Pedido();
		mp.add(new lineaPedido("Cacahuetes", 12, 4.5, Impuesto.GENERAL),
				new lineaPedido("Libros", 1, 100, Impuesto.REDUCIDO));
		System.out.println("Pedido: " + mp.toString());
	}
}
