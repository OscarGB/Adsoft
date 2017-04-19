package interfaces;

import java.util.ArrayList;

public abstract class DefaultObservableProperty<V> implements ObservableProperty<V> {

	private V value;
	
	private ArrayList<PropertyObserver<V>> observers;
	
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
