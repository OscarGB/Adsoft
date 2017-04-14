package converters;

import exceptions.UnknownUnitException;
import interfaces.IMagnitude;
import interfaces.IMetricSystem;
import interfaces.IMetricSystemConverter;
import interfaces.IPhysicalUnit;

public class Converter implements IMetricSystemConverter {
	
	/**
	 * Sistema de origen
	 */
	protected IMetricSystem source;
	
	/**
	 * Sistema destino
	 */
	protected IMetricSystem target;
	
	/**
	 * Multiplicador para pasar de la unidad base de un sistema a otro
	 */
	protected float mult;
	
	/**
	 * Constructor de la clase abstracta
	 * @param source
	 * @param tarjet
	 * @param mult
	 */
	protected Converter(IMetricSystem source, IMetricSystem tarjet, float mult){
		this.source = source;
		this.target = target;
		this.mult = mult;
	}

	/**
	 * Getter del sourceSystem
	 * @return IMetricSystem
	 */
	@Override
	public IMetricSystem sourceSystem() {
		return this.source;
	}


	/**
	 * Getter del targetSystem
	 * @return IMetricSystem
	 */
	@Override
	public IMetricSystem targetSystem() {
		return this.target;
	}

	/**
	 * Metodo para transformar que va a ser sobreescrito
	 * @param Magnitud de origen
	 * @param unidad de destino
	 * @return magnitud
	 * @throws UnknownUnitException 
	 */
	@Override
	public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException {
		return null;
	}

	/**
	 * Metodo para obtener un nuevo conversor inverso
	 * Va a ser sobreescrito
	 * @return conversor
	 */
	@Override
	public IMetricSystemConverter reverse() {
		return null;
	}

}
