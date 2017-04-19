package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * Sístema Métrico Internacional
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class SiLengthMetricSystem extends MetricSystem{
	
	// Variables
	
	/**
	 * Sistema (Implementación Singleton)
	 */
	public static IMetricSystem SYSTEM = new SiLengthMetricSystem();
	
	/**
	 * Unidad Física Milimetro
	 */
	public static IPhysicalUnit MILLIMETER = new PhysicalUnit(Quantity.L, "mm", 0.001F, SiLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad Física Metro
	 */
	public static IPhysicalUnit METER = new PhysicalUnit(Quantity.L, "m", 1, SiLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad Física Kilometro
	 */
	public static IPhysicalUnit KILOMETER = new PhysicalUnit(Quantity.L, "km", 1000, SiLengthMetricSystem.SYSTEM);
	
	// Constructor
	
	/**
	 * Constructor de SiLengthMetricSystem
	 */	
	public SiLengthMetricSystem() {
		super();
	}

	// Métodos
	
	/**
	 * Devuelve la base del sistema métrico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return SiLengthMetricSystem.METER;
	}

	/**
	 * Devuelve todas las unidades del sistema métrico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {SiLengthMetricSystem.MILLIMETER, SiLengthMetricSystem.METER, SiLengthMetricSystem.KILOMETER};
		return Arrays.asList(ar);
	}

}
