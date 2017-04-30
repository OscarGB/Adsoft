package interfaces;

/**
 * Interfaz ObservableProperty
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 * @param <V>
 */
public interface ObservableProperty<V> {
	/**
	 * Devuelve el valor de la propiedad observable
	 * @return
	 */
	V getValue();
	
	/**
	 * Añade un observador a la propiedad
	 * @param o
	 */
	void addObserver(PropertyObserver<V> o);
	
	/**
	 * Elimina un observador de la propiedad
	 * @param o
	 */
	void removeObserver(PropertyObserver<V> o);
}
