package unit;

import exceptions.QuantityException;
import exceptions.UnknownUnitException;
import interfaces.IMagnitude;
import interfaces.IMetricSystemConverter;
import interfaces.IPhysicalUnit;

/**
 * Magnitud
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class Magnitude implements IMagnitude {
	
	// Variables
	
	/**
	 * Valor de la Magnitud
	 */
	private double valor;
	
	/**
	 * Unidad Física de la magnitud
	 */
	private IPhysicalUnit unit;
	
	//Constructor
	
	/**
	 * Constructor de Magnitud
	 * @param valor
	 * @param unit
	 */
	public Magnitude(double valor, IPhysicalUnit unit) {
		this.valor = valor;
		this.unit = unit;
	}

	/**
	 * Método para sumar dos magnitudes
	 * @param m
	 * @return
	 * @throws QuantityException
	 */
	@Override
	public IMagnitude add(IMagnitude m) throws QuantityException {
		IMagnitude aux = m.transformTo(this.getUnit());
		
		return new Magnitude(this.getValue() + aux.getValue(), this.getUnit());
	}

	/**
	 * Método para restar dos magnitudes
	 * @param m
	 * @return
	 * @throws QuantityException
	 */
	@Override
	public IMagnitude subs(IMagnitude m) throws QuantityException {
		IMagnitude aux = m.transformTo(this.getUnit());
		
		return new Magnitude(this.getValue() - aux.getValue(), this.getUnit());
	}

	/**
	 * Método para transformar una Magnitud a una Unidad física concreta (siempre que se pueda)
	 * @param c
	 * @return magnitud
	 * @throws QuantityException
	 * @throws UnknownUnitException
	 */
	@Override
	public IMagnitude transformTo(IPhysicalUnit c) throws QuantityException {
		if(this.getUnit().getMetricSystem().equals(c.getMetricSystem()) == true){
			return new Magnitude(this.getUnit().transformTo(this.getValue(),  c), c);
		}
		
		IMetricSystemConverter conv = this.getUnit().getMetricSystem().getConverter(c.getMetricSystem());
		if(conv == null){
			throw new UnknownUnitException(this.getUnit(), c);
		}
		
		return conv.transformTo(this, c);
		
	}

	/**
	 * Devuelve la unidad de la Magnitud 
	 * @return
	 */
	@Override
	public IPhysicalUnit getUnit() {
		return this.unit;
	}

	/**
	 * Devuelve el valor de la Magnitud
	 * @return
	 */
	@Override
	public double getValue() {
		return this.valor;
	}
	
	/** (Override)
	 * Método toString
	 * @return
	 */
	@Override
	public String toString(){
		return this.getValue() + " [" + this.getUnit() + "]";
	}

}
