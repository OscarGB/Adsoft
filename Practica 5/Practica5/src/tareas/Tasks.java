package tareas;

import java.util.Set;
import java.util.TreeSet;

/**
 * Clase Tasks
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class Tasks {
	
	/**
	 * Set con todas las tareas (evita repeticiones)
	 */
	private TreeSet<Task> set = new TreeSet<Task>();
	
	/**
	 * Patrón singleton
	 */
	private static Tasks instance = new Tasks();

	/**
	 * Creador privado (patrón singleton)
	 */
	private Tasks(){}
	
	/**
	 * Método que devuelve la instanciaDefaultObservableProperty del patrón
	 * @return
	 */
	public static Tasks getInstance(){
		return Tasks.instance;
	}
	
	/**
	 * Método que crea una nueva Task
	 * @param taskName
	 * @return
	 * @throws IllegalArgumentException
	 */
	public Task newTask(String taskName) throws IllegalArgumentException{
		Task task = new Task(taskName);
		
		if(this.set.add(task) == false){
			throw new IllegalArgumentException();
		}
		else{
			return task;
		}
	}
	
	/**
	 * Getter de todas los tasks
	 * @return
	 */
	public Set<Task> getTasks(){
		return set;
	}
	
}
