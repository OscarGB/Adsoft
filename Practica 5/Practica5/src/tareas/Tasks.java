package tareas;

import interfaces.ObservableProperty;
import interfaces.PropertyObserver;
import observers.TiempoTareas;

public class Tasks implements PropertyObserver<Integer>{
	
	private Tasks(){
		
	}

	@Override
	public void propertyChanged(ObservableProperty<Integer> property, Integer oldValue) {
		// TODO Auto-generated method stub
		
	}
}
