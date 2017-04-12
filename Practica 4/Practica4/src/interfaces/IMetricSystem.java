package interfaces;

import java.util.Collection;

/**
 * Interfaz para Sistemas M�tricos
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IMetricSystem {
	
	/**
	 * Devuelve la base del sistema m�trico
	 * @return
	 */
	IPhysicalUnit base();
	
	/**
	 * Devuelve todas las unidades del sistema m�trico
	 * @return
	 */
	Collection<IPhysicalUnit> units();
}
