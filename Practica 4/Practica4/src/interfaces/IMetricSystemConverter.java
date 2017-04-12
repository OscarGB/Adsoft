package interfaces;

import exceptions.UnknownUnitException;

/**
 * Interfaz para Conversores entre sistemas
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public interface IMetricSystemConverter {
	
	/**
	 * Devuelve el Sistema Métrico fuente
	 * @return
	 */
	IMetricSystem sourceSystem();
	
	/**
	 * Devuelve el Sistema Métrico de destino
	 * @return
	 */
	IMetricSystem targetSystem();
	
	/**
	 * Transforma una Magnitud del Sistema Métrico fuente a una Unidad Física del Sistema Métrico destino
	 * @param from
	 * @param to
	 * @return
	 * @throws UnknownUnitException
	 */
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
	
	/**
	 * Devuelve un Conversor que realiza la conversión inversa
	 * @return
	 */
	IMetricSystemConverter reverse();
}
