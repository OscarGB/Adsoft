package unit;

import exceptions.QuantityException;
import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

public class PhysicalUnit implements IPhysicalUnit {
	
	private Quantity quantity;
	private String abbrev;
	public float mult;
	private IMetricSystem system;
	
	public PhysicalUnit(Quantity quantity, String abbrev, float mult, IMetricSystem system){
		this.quantity = quantity;
		this.abbrev = abbrev;
		this.mult = mult;
		this.system = system;
	}
	
	@Override
	public boolean canTransformTo(IPhysicalUnit u) {
		if(this.quantity == u.getQuantity()){
			return true;
		}
		return false;
	}

	@Override
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
		if(this.canTransformTo(u) == false){
			throw new QuantityException(u.getQuantity(), this.getQuantity());
		}
		return d*this.mult/((PhysicalUnit)u).mult;
	}

	@Override
	public Quantity getQuantity() {
		return this.quantity;
	}

	@Override
	public String abbrev() {
		return this.abbrev;
	}
	
	@Override
	public String toString(){
		return this.abbrev() + " " + this.getQuantity();
	}

	@Override
	public IMetricSystem getMetricSystem() {
		return this.system;
	}

}
