package interfaces;

import exceptions.QuantityException;
import unit.Quantity;

public interface IPhysicalUnit {
	boolean canTransformTo(IPhysicalUnit u);
	double transformTo(double d, IPhysicalUnit u) throws QuantityException;
	Quantity getQuantity();
	String abbrev();
	IMetricSystem getMetricSystem();
}
