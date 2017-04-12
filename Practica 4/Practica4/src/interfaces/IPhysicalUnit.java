package interfaces;

import exceptions.QuantityException;
import unit.Quantity;

/**
 * Interfaz para Unidades Físicas
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IPhysicalUnit {
	
	/**
	 * Comprueba si se puede transformar a la Unidad Física indicada
	 * @param u
	 * @return
	 */
	boolean canTransformTo(IPhysicalUnit u);
	
	/**
	 * Transforma un cantidad de una unidad física determinada a la correspondiente en ésta unidad 
	 * @param d
	 * @param u
	 * @return
	 * @throws QuantityException
	 */
	double transformTo(double d, IPhysicalUnit u) throws QuantityException;
	
	/**
	 * Devuelve la Quantity de la Unidad Física
	 * @return
	 */
	Quantity getQuantity();
	
	/**
	 * Devuelve la abreviatura de la Unidad Física
	 * @return
	 */
	String abbrev();
	
	/**
	 * Devuelve el Sistema Métrico al que pertenece la unidad física
	 * @return
	 */
	IMetricSystem getMetricSystem();
}
