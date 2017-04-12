package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * S�stema M�trico Imperial
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class ImperialLengthMetricSystem extends MetricSystem {

	// Variables
	
	/**
	 * Sistema (Implementaci�n Singleton)
	 */
	public static IMetricSystem SYSTEM = new ImperialLengthMetricSystem();
	
	/**
	 * Unidad F�sica Pie
	 */
	public static IPhysicalUnit FOOT = new PhysicalUnit(Quantity.L, "ft", 1, ImperialLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad F�sica Yarda
	 */
	public static IPhysicalUnit YARD = new PhysicalUnit(Quantity.L, "yd", 3, ImperialLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad F�sica Milla
	 */
	public static IPhysicalUnit MILE = new PhysicalUnit(Quantity.L, "ml", 5280, ImperialLengthMetricSystem.SYSTEM);
	
	// Constructor
	
	/**
	 * Constructor de ImperialLengthMetricSystem
	 */
	private ImperialLengthMetricSystem() {
		super();
	}
	
	// M�todos
	
	/**
	 * Devuelve la base del sistema m�trico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return ImperialLengthMetricSystem.FOOT;
	}
	
	/**
	 * Devuelve todas las unidades del sistema m�trico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {ImperialLengthMetricSystem.FOOT, ImperialLengthMetricSystem.YARD, ImperialLengthMetricSystem.MILE};
		return Arrays.asList(ar);
	}
}
