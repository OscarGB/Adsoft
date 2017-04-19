package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * S�stema M�trico Internacional
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class SiLengthMetricSystem extends MetricSystem{
	
	// Variables
	
	/**
	 * Sistema (Implementaci�n Singleton)
	 */
	public static IMetricSystem SYSTEM = new SiLengthMetricSystem();
	
	/**
	 * Unidad F�sica Milimetro
	 */
	public static IPhysicalUnit MILLIMETER = new PhysicalUnit(Quantity.L, "mm", 0.001F, SiLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad F�sica Metro
	 */
	public static IPhysicalUnit METER = new PhysicalUnit(Quantity.L, "m", 1, SiLengthMetricSystem.SYSTEM);
	
	/**
	 * Unidad F�sica Kilometro
	 */
	public static IPhysicalUnit KILOMETER = new PhysicalUnit(Quantity.L, "km", 1000, SiLengthMetricSystem.SYSTEM);
	
	// Constructor
	
	/**
	 * Constructor de SiLengthMetricSystem
	 */	
	public SiLengthMetricSystem() {
		super();
	}

	// M�todos
	
	/**
	 * Devuelve la base del sistema m�trico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return SiLengthMetricSystem.METER;
	}

	/**
	 * Devuelve todas las unidades del sistema m�trico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {SiLengthMetricSystem.MILLIMETER, SiLengthMetricSystem.METER, SiLengthMetricSystem.KILOMETER};
		return Arrays.asList(ar);
	}

}
