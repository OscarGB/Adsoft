package interfaces;

import java.util.Collection;

/**
 * Interfaz para Sistemas Métricos
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IMetricSystem {
	
	/**
	 * Devuelve la base del sistema métrico
	 * @return
	 */
	IPhysicalUnit base();
	
	/**
	 * Devuelve todas las unidades del sistema métrico
	 * @return
	 */
	Collection<IPhysicalUnit> units();
	
	/**
	 * Devuelve el convertidor de sistema métrico
	 * @param Sistema al que se convierte
	 * @return converter
	 */
	IMetricSystemConverter getConverter(IMetricSystem to);
}
