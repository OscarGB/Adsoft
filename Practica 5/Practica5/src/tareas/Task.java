package tareas;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import interfaces.AdjustableTime;
import observers.TiempoTareas;

/**
 * Clase Task
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class Task implements Comparable {
	
	/**
	 * Nombre de la tarea
	 */
	private String taskName;
	
	/**
	 * Tiempo estimado
	 */
	private TiempoTareas estimado;
	
	/**
	 * Tiempo dedicado
	 */
	private TiempoTareas dedicado;
	
	/**
	 * Set de tareas hijas
	 */
	private TreeSet<Task> hijas;
	
	/**
	 * Tarea padre
	 */
	private Task parent;
	
	/**
	 * Constructor de Task
	 * @param taskName
	 */
	public Task(String taskName){
		this.taskName = taskName;
		this.estimado = new TiempoTareas(0);
		this.dedicado = new TiempoTareas(0);
		this.hijas = new TreeSet<Task>();
		this.parent = null;
	}
	
	/**
	 * Getter de taskName
	 * @return
	 */
	public String getName(){
		return this.taskName;
	}
	
	/**
	 * Metodo containsTask
	 * @param t
	 * @return
	 */
	public boolean containsTask(Task t){
		if(t.equals(this) == true){
			return true;
		}else{
			for(Task i: this.hijas){
				if(i.containsTask(t)) return true;
			}
			return false;
		}
	}
	
	/**
	 * Metodo para añadir una subtarea
	 * @param t
	 * @return
	 */
	public boolean addTask(Task t) throws IllegalArgumentException{
		
		if(this.containsTask(t) == true) return false;
		if(t.getParent() != null) throw new IllegalArgumentException();
		
		this.dedicado.addTarea((TiempoTareas)t.getDedicado());
		this.estimado.addTarea((TiempoTareas)t.getEstimated());
		t.setParent(this);
		
		return true;
	}
	
	/**
	 * Metodo para cambiar el padre
	 * @param parent
	 */
	public void setParent(Task parent) throws IllegalArgumentException{
		if(parent != null){
			if(this.containsTask(parent)) throw new IllegalArgumentException();
		}
		if(this.parent != null) this.parent.hijas.remove(this);
		this.parent = parent;
		if(parent != null){
			this.parent.hijas.add(this);
		}
	}
	
	/**
	 * Metodo para obtener las tareas hijas
	 * @return
	 */
	public Set<Task> getTasks(){
		Set<Task> set = Collections.unmodifiableSet(this.hijas);
		return set;
	}

	/**
	 * Metodo para eliminar una tarea
	 * @param task
	 * @return
	 */
	public boolean removeTask(Task task) {
		if(this.containsTask(task) == false) return false;
		this.dedicado.removeTarea((TiempoTareas)task.getDedicado());
		this.estimado.removeTarea((TiempoTareas)task.getEstimated());
		task.setParent(null);
		return true;
	}

	/**
	 * Metodo para obtener el padre de una tarea
	 * @return
	 */
	public Task getParent() {
		return this.parent;
	}
	
	/**
	 * Metodo para obtener el tiempo estimado
	 * @return
	 */
	public AdjustableTime getEstimated(){
		return this.estimado;
	}
	
	/**
	 * Metodo para obtener el tiempo dedicado
	 * @return
	 */
	public AdjustableTime getDedicado(){
		return this.dedicado;
	}

	/**
	 * (Override) equals de Task
	 * @return
	 */
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(!(obj instanceof Task)) return false;
		
		Task task = (Task) obj;
		if(this.taskName.toLowerCase().trim().equals(task.getName().toLowerCase().trim()) == true){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * (Override) compareTo de Task
	 * @return
	 */
	@Override
	public int compareTo(Object obj) {
		Task task = (Task) obj;
		
		return task.getName().toLowerCase().trim().compareTo(this.getName().toLowerCase().trim());
	}
	
	/**
	 * (Override) toString de una Task
	 * @return
	 */
	@Override
	public String toString(){
		return "Task: " + this.taskName + " Tiempo estimado: " + this.getEstimated().getValue() + " Tiempo dedicado: " + this.getDedicado().getValue();
	}
	
	
}
