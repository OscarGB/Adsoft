package unit;

import exceptions.QuantityException;
import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * Unidad Física
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class PhysicalUnit implements IPhysicalUnit {
	
	//Variables
	
	/**
	 * Quantity de la Unidad Física
	 */
	private Quantity quantity;
	
	/**
	 * Abreviatura
	 */
	private String abbrev;
	
	/**
	 * Multiplicador (para cambios entre unidades)
	 */
	public float mult;
	
	/**
	 * Sistema Métrico al que pertenece
	 */
	private IMetricSystem system;
	
	//Constructor
	
	/**
	 * Constructor de PhysicalUnit
	 * @param quantity
	 * @param abbrev
	 * @param mult
	 * @param system
	 */
	public PhysicalUnit(Quantity quantity, String abbrev, float mult, IMetricSystem system){
		this.quantity = quantity;
		this.abbrev = abbrev;
		this.mult = mult;
		this.system = system;
	}
	
	//Métodos
	
	/**
	 * Comprueba si se puede transformar a la Unidad Física indicada
	 * @param u
	 * @return
	 */
	@Override
	public boolean canTransformTo(IPhysicalUnit u) {
		if(this.quantity == u.getQuantity()){
			return true;
		}
		return false;
	}

	/**
	 * Transforma un cantidad de una unidad física determinada a la correspondiente en ésta unidad 
	 * @param d
	 * @param u
	 * @return
	 * @throws QuantityException
	 */
	@Override
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
		if(this.canTransformTo(u) == false){
			throw new QuantityException(u.getQuantity(), this.getQuantity());
		}
		return d*this.mult/((PhysicalUnit)u).mult;
	}

	/**
	 * Devuelve la Quantity de la Unidad Física
	 * @return
	 */
	@Override
	public Quantity getQuantity() {
		return this.quantity;
	}

	/**
	 * Devuelve la abreviatura de la Unidad Física
	 * @return
	 */
	@Override
	public String abbrev() {
		return this.abbrev;
	}
	
	/** (Override)
	 * Método toString
	 * @return
	 */
	@Override
	public String toString(){
		return this.abbrev() + " " + this.getQuantity();
	}

	/**
	 * Devuelve el Sistema Métrico al que pertenece la unidad física
	 * @return
	 */
	@Override
	public IMetricSystem getMetricSystem() {
		return this.system;
	}

}
