package exceptions;

import unit.Quantity;

/**
 * Excepción de tipo QuantityException
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class QuantityException extends Exception {

	/**
	 * Exception
	 */
	private static final long serialVersionUID = -716541999601160661L;
	
	private Quantity q1;
	
	private Quantity q2;
	
	public QuantityException(Quantity q1, Quantity q2) {
		this.q1 = q1;
		this.q2 = q2;
	}
	
	@Override
	public String toString(){
		return "Quantities " + this.q1 + " and " + this.q2 + " are not compatible";
	}

}
