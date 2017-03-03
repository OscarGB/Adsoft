/* Crea un programa java que poermita crear Piezas con un determinado peso
 * A cada pieza se le asignar� autom�ticamente un identificador �nico.
 * La clase pieza debe contener un m�todo est�tico que devuelva la pieza
 * m�s pesada creada hasta el momento.
*/


package piezas;

public class MainPiezas {

	public static void main(String[] args){
		Pieza p1 = new Pieza(4.5);
		Pieza p2 = new Pieza(5);
		Pieza p3 = new Pieza(0.5);
		
		System.out.println(p1 + "\n" + p2 + "\n" + p3);
		System.out.println("Mas pesada: " + Pieza.masPesada());
	}
	
}
