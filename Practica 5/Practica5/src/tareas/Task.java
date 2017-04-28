package tareas;

import interfaces.ObservableProperty;
import interfaces.PropertyObserver;
import observers.DefaultObservableProperty;

public class Task extends DefaultObservableProperty<Task> implements PropertyObserver<Integer>{
	
	private String taskName;
	
	public Task(String taskName){
		super(null);
		this.taskName = taskName;
	}

//	@Override
//	public void propertyChanged(ObservableProperty<Integer> property, Integer oldValue) {
//		this.observers.
//	}
	
}
