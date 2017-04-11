package testers;

import interfaces.IMetricSystem;
import unit.ImperialLengthMetricSystem;
import unit.SiLengthMetricSystem;

public class MetricSystemTest {

	public static void main(String[] args) {
			IMetricSystem ms = SiLengthMetricSystem.SYSTEM;
			//new SiLengthMetricSystem(); // compilation error
			System.out.println(ms.units());
			System.out.println("Base = "+ms.base());
			System.out.println(SiLengthMetricSystem.METER.canTransformTo(ImperialLengthMetricSystem.FOOT));
			// true, same quantities
	}

}
