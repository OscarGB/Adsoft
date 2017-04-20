package observers;

import interfaces.ObservableProperty;
import interfaces.PropertyObserver;

public class TiempoTareasObserver implements PropertyObserver<Integer> {
	
	@Override
	public void propertyChanged(ObservableProperty<Integer> property, Integer oldValue) {
		System.out.println("El atributo ha cambiado de: " + oldValue + " a: " + property.getValue());
	}

}
