package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * Sístema Métrico Imperial
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class ImperialLengthMetricSystem extends MetricSystem {

	// Variables
	
	/**
	 * Sistema (Implementación Singleton)
	 */
	public static IMetricSystem SYSTEM = new ImperialLengthMetricSystem();
	
	/**
	 * Unidad Física Pie
	 */
	public static IPhysicalUnit FOOT = new PhysicalUnit(Quantity.L, "ft", 1, ImperialLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad Física Yarda
	 */
	public static IPhysicalUnit YARD = new PhysicalUnit(Quantity.L, "yd", 3, ImperialLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad Física Milla
	 */
	public static IPhysicalUnit MILE = new PhysicalUnit(Quantity.L, "ml", 5280, ImperialLengthMetricSystem.SYSTEM);
	
	// Constructor
	
	/**
	 * Constructor de ImperialLengthMetricSystem
	 */
	private ImperialLengthMetricSystem() {
		super();
	}
	
	// Métodos
	
	/**
	 * Devuelve la base del sistema métrico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return ImperialLengthMetricSystem.FOOT;
	}
	
	/**
	 * Devuelve todas las unidades del sistema métrico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {ImperialLengthMetricSystem.FOOT, ImperialLengthMetricSystem.YARD, ImperialLengthMetricSystem.MILE};
		return Arrays.asList(ar);
	}
}
