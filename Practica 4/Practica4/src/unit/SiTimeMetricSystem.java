package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * Sístema Temporal Internacional
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class SiTimeMetricSystem extends MetricSystem{
	
	// Variables
	
	/**
	 * Sistema (Implementación Singleton)
	 */
	public static IMetricSystem SYSTEM = new SiTimeMetricSystem();
	
	/**
	 * Unidad Física Milisegundo
	 */
	public static IPhysicalUnit MILLISECOND = new PhysicalUnit(Quantity.t, "ms", 0.001F, SiTimeMetricSystem.SYSTEM);
	
	/**
	 * Unidad Física Segundo
	 */
	public static IPhysicalUnit SECOND = new PhysicalUnit(Quantity.t, "s", 1, SiTimeMetricSystem.SYSTEM);
	
	/**
	 * Unidad Física Hora
	 */
	public static IPhysicalUnit HOUR = new PhysicalUnit(Quantity.t, "h", 3600, SiTimeMetricSystem.SYSTEM);
	
	// Constructor

	/**
	 * Constructor de SiTimeMetricSystem
	 */	
	private SiTimeMetricSystem() {
		super();
	}
	
	// Métodos
	
	/**
	 * Devuelve la base del sistema métrico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return SiTimeMetricSystem.SECOND;
	}

	/**
	 * Devuelve todas las unidades del sistema métrico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {SiTimeMetricSystem.MILLISECOND, SiTimeMetricSystem.SECOND, SiTimeMetricSystem.HOUR};
		return Arrays.asList(ar);
	}
	
}
