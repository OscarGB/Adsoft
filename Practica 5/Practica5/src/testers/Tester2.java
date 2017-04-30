package testers;

import tareas.*;

/**
 * Clase Tester1
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class Tester2 {

	public static void main(String[] args) {
		Tasks ts = Tasks.getInstance();
		
		Task t1 = ts.newTask("Comprar el pan");
		
		t1.getDedicado().incrementTime(10);
		t1.getEstimated().incrementTime(12);
		
		Task t11 = ts.newTask("Ir a la tienda");
		
		if(t1.addTask(t11) == true){
			System.out.println("t11 añadida correctamente a t1");
		}
		else{
			System.out.println("ERROR");
		}
		
		t11.getDedicado().incrementTime(8);
		t11.getEstimated().incrementTime(2);
		
		Task t12 = ts.newTask("Pagar");
		
		t12.getDedicado().incrementTime(6);
		t12.getEstimated().incrementTime(1);
		
		if(t1.addTask(t12) == true){
			System.out.println("t12 añadida correctamente a t1");
		}
		else{
			System.out.println("ERROR");
		}
		
		Task t111 = ts.newTask("Coger el coche");
		
		t111.getDedicado().incrementTime(2);
		t111.getEstimated().incrementTime(3);
		
		if(t11.addTask(t111) == true){
			System.out.println("t111 añadida correctamente a t11");
		}
		else{
			System.out.println("ERROR");
		}
		
		System.out.println("El tiempo estimado de t1 tiene que valer 18: " + t1.getEstimated().getValue());
		System.out.println("El tiempo dedicado de t1 tiene que valer 26: " + t1.getDedicado().getValue());
		
		try{
			ts.newTask("coger el coche");
		}catch(IllegalArgumentException e){
			System.out.println("Se ha caputarado la excepción de manera correcta, no se pueden crear dos Task con el mismo nombre");
		}
		
		if(t1.containsTask(t111) == true){
			System.out.println("t111 está contenido en t1 de manera indirecta");
		}
		else{
			System.out.println("ERROR");
		}
		
		if(t1.containsTask(t11) == true){
			System.out.println("t11 está contenido en t1 de manera directa");
		}
		else{
			System.out.println("ERROR");
		}
		
		if(t11.containsTask(t1) == false){
			System.out.println("t1 no está contenido en t11");
		}
		else{
			System.out.println("ERROR");
		}
		
		if(t11.addTask(t111) == false){
			System.out.println("No se puede añadir t111 de nuevo a t1");
		}
		else{
			System.out.println("ERROR");
		}
		
		try{
			t111.addTask(t11);
		}catch(IllegalArgumentException e){
			System.out.println("Se ha caputarado la excepción de manera correcta, no se puede añadir una Task con padre");
		}

		if(t111.removeTask(t1) == false){
			System.out.println("No se puede eliminar una Task que no está contenida en la Task actual");
		}
		else{
			System.out.println("ERROR");
		}
		
		if(t11.removeTask(t111) == true){
			System.out.println("Se puede eliminar una Task que está contenida en la Task actual");
		}
		else{
			System.out.println("ERROR");
		}
		
		System.out.println("El tiempo estimado de t1 tiene que valer 15: " + t1.getEstimated().getValue());
		System.out.println("El tiempo dedicado de t1 tiene que valer 24: " + t1.getDedicado().getValue());
		
		try{
			t1.setParent(t11);
		}catch(IllegalArgumentException e){
			System.out.println("Se ha caputarado la excepción de manera correcta, no se puede cambiar el padre de esta tarea");
		}
		
		System.out.println(Tasks.getInstance().getTasks());
		System.out.println(t1.getTasks());
		
	}

}
