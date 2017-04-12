package interfaces;

import exceptions.UnknownUnitException;

/**
 * Interfaz para Conversores entre sistemas
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IMetricSystemConverter {
	
	/**
	 * Devuelve el Sistema M�trico fuente
	 * @return
	 */
	IMetricSystem sourceSystem();
	
	/**
	 * Devuelve el Sistema M�trico de destino
	 * @return
	 */
	IMetricSystem targetSystem();
	
	/**
	 * Transforma una Magnitud del Sistema M�trico fuente a una Unidad F�sica del Sistema M�trico destino
	 * @param from
	 * @param to
	 * @return
	 * @throws UnknownUnitException
	 */
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
	
	/**
	 * Devuelve un Conversor que realiza la conversi�n inversa
	 * @return
	 */
	IMetricSystemConverter reverse();
}
