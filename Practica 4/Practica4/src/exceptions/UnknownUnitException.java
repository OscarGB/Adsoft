package exceptions;

import interfaces.*;

/**
 * Excepción de tipo UnknowUnitException
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class UnknownUnitException extends QuantityException {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Unidad de la excepcion
	 */
	private IPhysicalUnit unit1;
	
	/**
	 * Unidad de la excepcion
	 */
	private IPhysicalUnit unit2;
	
	/**
	 * Constructor de la excepcion
	 * @param unit1
	 * @param unit2
	 */
	public UnknownUnitException(IPhysicalUnit unit1, IPhysicalUnit unit2){
		super(null, null);
		this.unit1 = unit1;
		this.unit2 = unit2;
	}
	
	/**
	 * (Override) toString
	 * @return String
	 */
	@Override
	public String toString(){
		return "Cannot transform " + this.unit1.abbrev() + " " + 
				this.unit1.getQuantity() + " to " + this.unit2.abbrev() + " "
				+ this.unit2.getQuantity();
	}

}
