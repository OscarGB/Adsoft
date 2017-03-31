package unit;

import java.util.Collection;

public interface IMetricSystem {
	IPhysicalUnit base();
	Collection<IPhysicalUnit> units();
}
