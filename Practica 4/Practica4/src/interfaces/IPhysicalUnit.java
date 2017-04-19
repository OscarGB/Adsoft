package interfaces;

import exceptions.QuantityException;
import unit.Quantity;

/**
 * Interfaz para Unidades F�sicas
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IPhysicalUnit {
	
	/**
	 * Comprueba si se puede transformar a la Unidad F�sica indicada
	 * @param u
	 * @return
	 */
	boolean canTransformTo(IPhysicalUnit u);
	
	/**
	 * Transforma un cantidad de una unidad f�sica determinada a la correspondiente en �sta unidad 
	 * @param d
	 * @param u
	 * @return
	 * @throws QuantityException
	 */
	double transformTo(double d, IPhysicalUnit u) throws QuantityException;
	
	/**
	 * Devuelve la Quantity de la Unidad F�sica
	 * @return
	 */
	Quantity getQuantity();
	
	/**
	 * Devuelve la abreviatura de la Unidad F�sica
	 * @return
	 */
	String abbrev();
	
	/**
	 * Devuelve el Sistema M�trico al que pertenece la unidad f�sica
	 * @return
	 */
	IMetricSystem getMetricSystem();
}
