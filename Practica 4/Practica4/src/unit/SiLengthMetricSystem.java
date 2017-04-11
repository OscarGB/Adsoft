package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

public class SiLengthMetricSystem extends MetricSystem{
	
	public static IMetricSystem SYSTEM = new SiLengthMetricSystem();
	public static IPhysicalUnit MILLIMETER = new PhysicalUnit(Quantity.L, "mm", 0.001F, SiLengthMetricSystem.SYSTEM);
	public static IPhysicalUnit METER = new PhysicalUnit(Quantity.L, "m", 1, SiLengthMetricSystem.SYSTEM);
	public static IPhysicalUnit KILOMETER = new PhysicalUnit(Quantity.L, "km", 1000, SiLengthMetricSystem.SYSTEM);
	
	private SiLengthMetricSystem() {
		super();
	}
	
	@Override
	public IPhysicalUnit base() {
		return SiLengthMetricSystem.METER;
	}

	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {SiLengthMetricSystem.MILLIMETER, SiLengthMetricSystem.METER, SiLengthMetricSystem.KILOMETER};
		return Arrays.asList(ar);
	}
}
