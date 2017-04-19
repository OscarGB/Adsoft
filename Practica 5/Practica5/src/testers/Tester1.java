package testers;

import observers.*;

public class Tester1 {

	public static void main(String[] args) {
		TiempoTareasObserver observer = new TiempoTareasObserver();
		TiempoTareas tiempo = new TiempoTareas(0);
		
		//A�adimos el observer
		tiempo.addObserver(observer);
		
		//Debe imprimir una notificaci�n de cambio de valor emitida por el observer
		tiempo.incrementTime(12);
		
		//El valor ser� negativo, por lo que tiene que saltar una excepci�n
		try{
			tiempo.incrementTime(-15);
		} catch(IllegalArgumentException e){
			System.out.println("Ha saltado la excepci�n correctamente");
		}
		
		//Al quitar el observer dejar� de imprimir la notificaci�n
		tiempo.removeObserver(observer);
		
		tiempo.incrementTime(8);
		
		//El valor deber�a ser 20
		System.out.println("Valor final: " + tiempo.getValue());
	}

}
