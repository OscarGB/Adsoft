package interfaces;

import exceptions.QuantityException;
import exceptions.UnknownUnitException;

/**
 * Interfaz para Magnitudes
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IMagnitude {
	
	/**
	 * M�todo para sumar dos magnitudes
	 * @param m
	 * @return
	 * @throws QuantityException
	 * @throws UnknownUnitException 
	 */
	IMagnitude add (IMagnitude m) throws QuantityException; 
	
	/**
	 * M�todo para restar dos magnitudes
	 * @param m
	 * @return
	 * @throws QuantityException
	 * @throws UnknownUnitException 
	 */
	IMagnitude subs(IMagnitude m) throws QuantityException;  
	
	/**
	 * M�todo para transformar una Magnitud a una Unidad f�sica concreta (siempre que se pueda)
	 * @param c
	 * @return
	 * @throws QuantityException
	 * @throws UnknownUnitException 
	 */
	IMagnitude transformTo(IPhysicalUnit c) throws QuantityException;  
	
	/**
	 * Devuelve la unidad de la Magnitud 
	 * @return
	 */
	IPhysicalUnit getUnit();  
	
	/**
	 * Devuelve el valor de la Magnitud
	 * @return
	 */
	double getValue();
}
