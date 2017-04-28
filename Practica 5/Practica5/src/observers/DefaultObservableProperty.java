package observers;

import java.util.ArrayList;

import interfaces.ObservableProperty;
import interfaces.PropertyObserver;

public abstract class DefaultObservableProperty<V> implements ObservableProperty<V> {

	protected V value;
	
	protected ArrayList<PropertyObserver<V>> observers;
	
	public DefaultObservableProperty(V value){
		this.value = value;
		this.observers = new ArrayList<PropertyObserver<V>>();
	}
	
	@Override
	public V getValue() {
		return this.value;
	}

	@Override
	public void addObserver(PropertyObserver<V> o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(PropertyObserver<V> o) {
		observers.remove(o);

	}
	
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
