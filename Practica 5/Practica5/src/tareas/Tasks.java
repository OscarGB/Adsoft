package tareas;

import java.util.TreeSet;

public class Tasks {
	
	private TreeSet<Task> set = new TreeSet<Task>();
	
	private static Tasks instance = new Tasks();
	
	private Tasks(){
		
	}

	public static Tasks getInstance(){
		return Tasks.instance;
	}
	
	public Task newTask(String taskName) throws IllegalArgumentException{
		Task task = new Task(taskName);
		
		if(this.set.add(task) == false){
			throw new IllegalArgumentException();
		}
		else{
			return task;
		}
	}
	
}
