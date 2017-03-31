package unit;

import java.util.Collection;

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
