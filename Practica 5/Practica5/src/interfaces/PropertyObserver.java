package interfaces;

/**
 * Interfaz PropertyObserver
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 * @param <V>
 */
public interface PropertyObserver<V> {
	/**
	 * Método que es notificado en caso de que una popiedad cambie
	 * @param property
	 * @param oldValue
	 */
	void propertyChanged(ObservableProperty<V> property, V oldValue);
}
