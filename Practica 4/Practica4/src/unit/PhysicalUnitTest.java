package unit;

public class PhysicalUnitTest {

	public static void main(String[] args) {
		IPhysicalUnit meter = SiLengthMetricSystem.METER;
		System.out.println(meter); // This is how a meter is printed (abbrev + Quantity)
		System.out.println(meter.canTransformTo(SiLengthMetricSystem.KILOMETER)); // Yes, we can
		System.out.println(meter.canTransformTo(SiTimeMetricSystem.SECOND)); // No, we don't
		try {
			System.out.println("1000 m en km: "+meter.transformTo(1000, SiLengthMetricSystem.KILOMETER));
		} catch (QuantityException e1) {
			System.out.println(e1);
		}
		try {
			System.out.println("1000 m en s: "+meter.transformTo(1000, SiTimeMetricSystem.SECOND)); // Exception!
		} catch (QuantityException e) {
			System.out.println(e);
		}

	}

}
