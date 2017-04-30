package observers;

import java.util.ArrayList;

import interfaces.ObservableProperty;
import interfaces.PropertyObserver;

/**
 * Clase DefaultObservableProperty
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 * @param <V>
 */
public abstract class DefaultObservableProperty<V> implements ObservableProperty<V> {

	/**
	 * Valor que almacena
	 */
	protected V value;
	
	/**
	 * Array de observadores
	 */
	protected ArrayList<PropertyObserver<V>> observers;
	
	/**
	 * Constructor de DefaultObservableProperty
	 * @param value
	 */
	public DefaultObservableProperty(V value){
		this.value = value;
		this.observers = new ArrayList<PropertyObserver<V>>();
	}
	
	/**
	 * Devuelve el valor de la propiedad observable
	 * @return
	 */
	@Override
	public V getValue() {
		return this.value;
	}
	
	/**
	 * Añade un observador a la propiedad
	 * @param o
	 */
	@Override
	public void addObserver(PropertyObserver<V> o) {
		observers.add(o);
	}

	/**
	 * Elimina un observador de la propiedad
	 * @param o
	 */
	@Override
	public void removeObserver(PropertyObserver<V> o) {
		observers.remove(o);

	}
	
	/**
	 * Le da valor a la variable, en caso de que cambie notifica a los observadores
	 * @param newValue
	 */
	protected void setValue(V newValue){
		if(newValue == null){
			return;
		}
		if(newValue.equals(value)){
			return;
		}
		V oldValue = this.value;
		this.value = newValue;
		for (PropertyObserver<V> ob : this.observers){
			ob.propertyChanged(this, oldValue);
		}
		return;
	}

}
