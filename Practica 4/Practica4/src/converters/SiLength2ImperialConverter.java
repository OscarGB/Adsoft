package converters;

import interfaces.*;
import unit.*;

/**
 * Conversor de Si a imperial
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class SiLength2ImperialConverter extends Converter {
	
	/**
	 * Constructor de SiLength2ImperialConverter
	 */
	public SiLength2ImperialConverter() {
		super(new SiLengthMetricSystem(), new ImperialLengthMetricSystem(), 3.280839895f);
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
