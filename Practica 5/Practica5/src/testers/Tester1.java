package testers;

import observers.*;

public class Tester1 {

	public static void main(String[] args) {
		TiempoTareas padre = new TiempoTareas(5);
		TiempoTareas hijo = new TiempoTareas(0);
		
		//No deberia aumentar el valor del padre
		padre.addTarea(hijo);
		
		//Padre deberia pasar a valer 7
		hijo.incrementTime(2);
		
		System.out.println("Deberia valer 7: " + padre.getValue());
		
		//Decrementamos el tiempo mas de lo que se puede
		try{
			hijo.incrementTime(-9);
		} catch(IllegalArgumentException e){
			System.out.println("Se ha tratado de decrementar demasiado el tiempo.");
		}
		
		System.out.println("Padre deberia valer 5: " + padre.getValue());
		System.out.println("Hijo deberia valer 0: " + hijo.getValue());
		
		//Ahora creamos un nieto
		padre = new TiempoTareas(5);
		hijo = new TiempoTareas(0);
		TiempoTareas nieto = new TiempoTareas(3);
		
		//Hijo deberia valer 3
		hijo.addTarea(nieto);
		
		//Padre deberia valer 8
		padre.addTarea(hijo);
		
		//Deberian modificarse tanto nieto, como hijo y padre
		nieto.incrementTime(-2);
		
		System.out.println("Padre deberia valer 6: " + padre.getValue());
		System.out.println("Hijo deberia valer 1: " + hijo.getValue());
		System.out.println("Nieto deberia valer 1: " + nieto.getValue());
		
		hijo.removeTarea(nieto);
		System.out.println("Padre deberia valer 5: " + padre.getValue());
		System.out.println("Hijo deberia valer 0: " + hijo.getValue());
		
	}

}
