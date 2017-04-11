package unit;

import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

public abstract class MetricSystem implements IMetricSystem {
	
	protected MetricSystem() {
	}

	@Override
	public IPhysicalUnit base() {
		return null;
	}

	@Override
	public Collection<IPhysicalUnit> units() {
		return null;
	}

}
