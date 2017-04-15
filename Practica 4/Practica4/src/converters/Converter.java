package converters;

import exceptions.QuantityException;
import exceptions.UnknownUnitException;
import interfaces.IMagnitude;
import interfaces.IMetricSystem;
import interfaces.IMetricSystemConverter;
import interfaces.IPhysicalUnit;
import unit.Magnitude;

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
	protected Converter(IMetricSystem source, IMetricSystem target, float mult){
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
	 * Método para transformar SI a Imperial. Primero pasa a metros, y luego pasa los metros a foot
	 * @param magnitud en el SI
	 * @param unidad fisica destino
	 * @return Magnitud en Imperial
	 */
	@Override
	public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException {
		IMagnitude meter;
		IMagnitude foot;
		double multiplier;
		if(from == null || to == null){
			return null;
		}
		if(to.getMetricSystem().equals(this.target) != true){
			throw new UnknownUnitException(from.getUnit(), to);
		}
		
		try {
			meter = from.transformTo(from.getUnit().getMetricSystem().base());
			multiplier = meter.getValue() * this.mult;
			foot = new Magnitude(multiplier, to.getMetricSystem().base());
			foot = foot.transformTo(to);
			return foot;
		} catch (QuantityException e) {
			throw new UnknownUnitException(from.getUnit(), to);
		}
	}
	
	/**
	 * toString para debugging
	 * @return String
	 */
	@Override
	public String toString(){
		return "From: "+this.source+" To: "+this.target+" Mult: "+this.mult;
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
