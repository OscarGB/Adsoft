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
	 * @param Magnitud de origen
	 * @param Sistema destino
	 * @return Magnitude
	 * @throws UnknownUnitException
	 */
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
	
	/**
	 * Método para guardar el conversor inverso
	 * @return Conversor
	 */
	IMetricSystemConverter reverse(); 
}
