package console;

import java.util.Arrays;
import java.util.Date;

import tareas.*;

/**
 * Clase FullConsole
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class FullConsole extends TextConsole {
	
	/**
	 * Momento en el que empezó a correr la Task actual
	 */
	Date startDate;
	
	/**
	 * task que esta corriendo
	 */
	Task running;
	
	/**
	 * tasks que contiene
	 */
	Tasks tasks;
	
	/**
	 * Constructor de FullConsole
	 */
	public FullConsole(){
		this.tasks = Tasks.getInstance();
		
		this.addComands("start", this::start);
		this.addComands("stop", this::stop);
		this.addComands("list", this::list);
		this.addComands("status", this::status);
		this.addComands("addEstimate", this::addEstimate);
		this.addComands("spend", this::spend);
		this.addComands("parent", this::parent);
	}
	
	/**
	 * Método para borrar o modificar el padre de alguna tarea
	 * @param a
	 */
	private void parent(String a[]){
		if(a.length > 2){
			System.out.println("Introduzca solo el nombre del padre");
			return;
		}
		if(this.running == null){
			System.out.println("No hay tareas corriendo en este momento");
			return;
		}
		if(a.length == 1){
			try{
				this.running.setParent(null);
			}catch(IllegalArgumentException e){
				System.out.println("No se pudo borrar el padre la tarea " + this.running.getName());
				return;
			}
			System.out.println("Se borró el padre de la tarea " + this.running.getName());
			return;
		}
		Task aux = null;
		for(Task t : tasks.getTasks()){
			if(t.getName().equals(a[1])){
				aux = t;
				break;
			}
		}
		if(aux == null){
			System.out.println("La tarea " + a[1] + " no ha sido creada");
			return;
		}
		try{
			this.running.setParent(aux);
		}catch(IllegalArgumentException e){
			System.out.println("No se pudo modificar el padre la tarea " + this.running.getName());
			return;
		}
		System.out.println("Se modificó el padre de la tarea " + this.running.getName());
		return;
	}
	
	/**
	 * Método para añadir tiempo al dedicado de la tarea actual
	 * @param a
	 */
	private void spend(String a[]){
		if(a.length != 2){
			System.out.println("Introduce el número de minutos a variar");
			return;
		}
		if(this.running == null){
			System.out.println("No hay tareas corriendo en este momento");
			return;
		}
		try{
			this.running.getDedicado().incrementTime(Integer.parseInt(a[1]));
			System.out.println("Se han añadido " + a[1] + " minutos al tiempo dedicado de " + this.running.getName());
		}catch(IllegalArgumentException e){
			System.out.println("El tiempo resultante de " + this.running.getName() + " resultaba negativo, se ha puesto a 0");
		}
	}
	
	/**
	 * Método para detener la tarea actual
	 * @param a
	 */
	private void stop(String a[]){
		if(a.length!=1){
			System.out.println("No introduzca ningún otro argumento con 'stop'");
			return;
		}
		if(this.running == null){
			return;
		}
		Date now = new Date();
		long secs = (now.getTime() - this.startDate.getTime()) / 1000;
		this.running.getDedicado().incrementTime((int)secs);
		System.out.println("La tarea " + this.running.getName() + " se ha detenido correctamente");
		this.running = null;
		this.startDate = null;
	}
	
	/**
	 * Método para mostrar la lista de tareas
	 * @param a
	 */
	private void list(String a[]){
		if(a.length!=1){
			System.out.println("No introduzca ningún otro argumento con 'list'");
			return;
		}
		System.out.println("Tareas activas:");
		for(Task t : this.tasks.getTasks()){
			System.out.println(t);
		}
	}
	
	/**
	 * Método que decide qué función de estado llamar
	 * @param a
	 */
	private void status(String a[]){
		if(a.length == 1){
			this.statusActual();
		}
		else if(a.length == 2){
			this.statusTarea(a[1]);
		}
		else{
			System.out.println("Introduzca máximo un argumento a 'status'");
		}
	}
	
	/**
	 * Método para modificar el tiempo estimado de la tarea actual
	 * @param a
	 */
	private void addEstimate(String a[]){
		if(a.length != 2){
			System.out.println("Introduzca el número de minutos a variar");
			return;
		}
		if(this.running == null){
			System.out.println("No hay tareas corriendo en este momento");
			return;
		}
		try{
			this.running.getEstimated().incrementTime(Integer.parseInt(a[1]));
			System.out.println("Se han añadido " + a[1] + " minutos a la tarea " + this.running.getName());		
		}catch(IllegalArgumentException e){
			System.out.println("El tiempo resultante de " + this.running.getName() + " resultaba negativo, se ha puesto a 0");
		}
	}
	
	/**
	 * Método para mostrar el estado de la tarea actual
	 */
	private void statusActual(){
		if(this.running == null){
			System.out.println("No hay tareas corriendo en este momento");
			return;
		}
		System.out.println(this.running);
	}
	
	/**
	 * Método para mostrar el estado de una tarea concreta
	 * @param name
	 */
	private void statusTarea(String name){
		Task aux = null;
		for(Task t : tasks.getTasks()){
			if(t.getName().equals(name)){
				aux = t;
				break;
			}
		}
		if(aux == null){
			System.out.println("La tarea " + name + " no ha sido creada");
			return;
		}
		System.out.println(aux);
	}
	
	/**
	 * Método para crear o continuar con una tarea
	 * @param a
	 */
	private void start(String a[]){
		if(a.length != 2){
			System.out.println("Se necesitan un nombre de tarea");
			return;
		}
		
		String name = a[1];
		this.stop(Arrays.copyOf(a, 1));
		Task aux = null;
		try{
			aux = this.tasks.newTask(name);
			if(aux != null){
				this.running = aux;
				this.startDate = new Date();
				System.out.println("Se ha creado la tarea " + name + " correctamente");
				return;
			}
		}catch(IllegalArgumentException e){ //Ya existe
			for(Task t : tasks.getTasks()){
				if(t.getName().equals(name)){
					aux = t;
					break;
				}
			}
		}
		if(aux == null){
			System.out.println("Ha ocurrido un error creando la tarea " + name);
		}
		
		this.running = aux;
		this.startDate = new Date();
		System.out.println("Se ha continuado la tarea " + name + " correctamente");
	}
}
