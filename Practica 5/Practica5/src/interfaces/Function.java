package interfaces;

/**
 * Interfaz funcional Function
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
@FunctionalInterface 
public interface Function {
	/**
	 * Método que ejecuta la función
	 * @param args
	 * @throws IllegalArgumentException
	 */
	void execute(String ...args) throws IllegalArgumentException; 
}
