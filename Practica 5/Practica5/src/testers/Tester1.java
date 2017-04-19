package testers;

import observers.*;

public class Tester1 {

	public static void main(String[] args) {
		TiempoTareasObserver observer = new TiempoTareasObserver();
		TiempoTareas tiempo = new TiempoTareas(0);
		
		//Añadimos el observer
		tiempo.addObserver(observer);
		
		//Debe imprimir una notificación de cambio de valor emitida por el observer
		tiempo.incrementTime(12);
		
		//El valor será negativo, por lo que tiene que saltar una excepción
		try{
			tiempo.incrementTime(-15);
		} catch(IllegalArgumentException e){
			System.out.println("Ha saltado la excepción correctamente");
		}
		
		//Al quitar el observer dejará de imprimir la notificación
		tiempo.removeObserver(observer);
		
		tiempo.incrementTime(8);
		
		//El valor debería ser 20
		System.out.println("Valor final: " + tiempo.getValue());
	}

}
