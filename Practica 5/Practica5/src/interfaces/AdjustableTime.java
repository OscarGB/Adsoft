package interfaces;

/**
 * Interfaz AdjustableTime
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface AdjustableTime extends ObservableProperty<Integer> {
	/**
	 * Incrementa el tiempo acumulado en la variable
	 * @param inc
	 */
	void incrementTime(int inc);
}
