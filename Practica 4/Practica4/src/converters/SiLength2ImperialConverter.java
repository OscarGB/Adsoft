package converters;

import exceptions.QuantityException;
import exceptions.UnknownUnitException;
import interfaces.*;
import unit.*;

public class SiLength2ImperialConverter extends Converter {
	
	/**
	 * Constructor de SiLength2ImperialConverter
	 */
	public SiLength2ImperialConverter() {
		super(new SiLengthMetricSystem(), new ImperialLengthMetricSystem(), 3.280839895f);
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
		if(to.getMetricSystem() != this.target){
			throw new UnknownUnitException(from.getUnit(), to);
		}
		
		try {
			meter = from.transformTo(SiLengthMetricSystem.METER);
			multiplier = meter.getValue() * this.mult;
			foot = new Magnitude(multiplier, ImperialLengthMetricSystem.FOOT);
			foot = foot.transformTo(to);
			return foot;
		} catch (QuantityException e) {
			throw new UnknownUnitException(from.getUnit(), to);
		}
	}

	/**
	 * Metodo que devolvera un nuevo conversor con source y target invertidos,
	 * y con un multiplicador inverso al utilizado en este conversor
	 */
	@Override
	public IMetricSystemConverter reverse() {
		return new Converter(new ImperialLengthMetricSystem(), new SiLengthMetricSystem(), 1/this.mult);
	}

}
