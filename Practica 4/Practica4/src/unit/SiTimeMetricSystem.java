package unit;

import java.util.Arrays;
import java.util.Collection;

public class SiTimeMetricSystem extends MetricSystem{
	
	public static IMetricSystem SYSTEM = new SiTimeMetricSystem();
	public static IPhysicalUnit MILLISECOND = new PhysicalUnit(Quantity.t, "ms", 0.001F, SiTimeMetricSystem.SYSTEM);
	public static IPhysicalUnit SECOND = new PhysicalUnit(Quantity.t, "s", 1, SiTimeMetricSystem.SYSTEM);
	public static IPhysicalUnit HOUR = new PhysicalUnit(Quantity.t, "h", 3600, SiTimeMetricSystem.SYSTEM);
	
	private SiTimeMetricSystem() {
		super();
	}
	
	@Override
	public IPhysicalUnit base() {
		return SiTimeMetricSystem.SECOND;
	}

	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {SiTimeMetricSystem.MILLISECOND, SiTimeMetricSystem.SECOND, SiTimeMetricSystem.HOUR};
		return Arrays.asList(ar);
	}
	
}
