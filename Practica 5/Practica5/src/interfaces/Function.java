package interfaces;

/**
 * Interfaz funcional Function
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
@FunctionalInterface 
public interface Function {
	/**
	 * M�todo que ejecuta la funci�n
	 * @param args
	 * @throws IllegalArgumentException
	 */
	void execute(String ...args) throws IllegalArgumentException; 
}
