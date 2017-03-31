package unit;

import java.util.Arrays;
import java.util.Collection;

public class ImperialLengthMetricSystem extends MetricSystem {

	public static IMetricSystem SYSTEM = new ImperialLengthMetricSystem();
	public static IPhysicalUnit FOOT = new PhysicalUnit(Quantity.L, "ft", 1, ImperialLengthMetricSystem.SYSTEM);
	public static IPhysicalUnit YARD = new PhysicalUnit(Quantity.L, "yd", 3, ImperialLengthMetricSystem.SYSTEM);
	public static IPhysicalUnit MILE = new PhysicalUnit(Quantity.L, "ml", 5280, ImperialLengthMetricSystem.SYSTEM);
	
	private ImperialLengthMetricSystem() {
		super();
	}
	
	@Override
	public IPhysicalUnit base() {
		return ImperialLengthMetricSystem.FOOT;
	}

	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {ImperialLengthMetricSystem.FOOT, ImperialLengthMetricSystem.YARD, ImperialLengthMetricSystem.MILE};
		return Arrays.asList(ar);
	}
}
