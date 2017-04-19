package interfaces;

import exceptions.*;

public interface IMetricSystemConverter {  
	/**
	 * Sistema de origen
	 * @return MetricSystem
	 */
	IMetricSystem sourceSystem();  
	
	/**
	 * Sistema destino
	 * @return MetricSystem
	 */
	IMetricSystem targetSystem();  
	
	/**
	 * Método para transformar entre SI
	 * @param from, Magnitud de origen
	 * @param to, Sistema destino
	 * @return IMagnitude
	 * @throws UnknownUnitException
	 */
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
	
	/**
	 * Método para guardar el conversor inverso
	 * @return Conversor
	 */
	IMetricSystemConverter reverse(); 
}
