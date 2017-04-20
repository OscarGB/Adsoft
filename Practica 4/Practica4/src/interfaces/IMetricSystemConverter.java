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
	 * M�todo para transformar entre SI
	 * @param from, Magnitud de origen
	 * @param to, Sistema destino
	 * @return IMagnitude
	 * @throws UnknownUnitException
	 */
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
	
	/**
	 * M�todo para guardar el conversor inverso
	 * @return Conversor
	 */
	IMetricSystemConverter reverse(); 
}
