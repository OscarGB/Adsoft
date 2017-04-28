package observers;

import java.util.ArrayList;

import interfaces.AdjustableTime;
import interfaces.ObservableProperty;
import interfaces.PropertyObserver;

public class TiempoTareas extends DefaultObservableProperty<Integer> implements AdjustableTime, PropertyObserver<Integer>{
	
	private ArrayList<TiempoTareas> subtareas; 

	/**
	 * Constructor de la clase TiempoTareas
	 * @param value
	 */
	public TiempoTareas(int value){
		super(new Integer(value));
		this.subtareas = new ArrayList<TiempoTareas>();
	}
	
	/**
	 * Metodo para aniadir una tarea
	 * @param tarea
	 */
	public void addTarea(TiempoTareas tarea){
		if(tarea == null) return;
		if(this.subtareas.add(tarea) == true){
			this.incrementTime(tarea.getValue());
			tarea.addObserver(this);

		}
	}
	
	/**
	 * Metodo para eliminar una tarea
	 * @param tarea
	 */
	public void removeTarea(TiempoTareas tarea){
		if(tarea == null) return;
		if(this.subtareas.remove(tarea) == true){
			this.incrementTime(-tarea.getValue());
			tarea.removeObserver(this);
		}
	}
	
	/**
	 * Metodo para incrementar el tiempo y notificar a los observers
	 * @param incremento
	 */
	@Override
	public void incrementTime(int inc) throws IllegalArgumentException {
		if(this.getValue() + inc < 0){
			this.setValue(new Integer(0)); //Set del value a 0 para poder seguir trabajando. Se lanza la excepcion
			throw new IllegalArgumentException();
		}else{
			this.setValue(new Integer(this.getValue() + inc));
		}
	}

	/**
	 * Metodo propertyChanged para notificar cambios a este observer
	 * @param observable property
	 * @param oldValue
	 */
	@Override
	public void propertyChanged(ObservableProperty<Integer> property, Integer oldValue) {
		this.incrementTime(property.getValue() - oldValue);
	}
}
