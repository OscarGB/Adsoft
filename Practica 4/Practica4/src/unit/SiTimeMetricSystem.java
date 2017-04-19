package unit;

import java.util.Arrays;
import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * S�stema Temporal Internacional
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public class SiTimeMetricSystem extends MetricSystem{
	
	// Variables
	
	/**
	 * Sistema (Implementaci�n Singleton)
	 */
	public static IMetricSystem SYSTEM = new SiTimeMetricSystem();
	
	/**
	 * Unidad F�sica Milisegundo
	 */
	public static IPhysicalUnit MILLISECOND = new PhysicalUnit(Quantity.t, "ms", 0.001F, SiTimeMetricSystem.SYSTEM);
	
	/**
	 * Unidad F�sica Segundo
	 */
	public static IPhysicalUnit SECOND = new PhysicalUnit(Quantity.t, "s", 1, SiTimeMetricSystem.SYSTEM);
	
	/**
	 * Unidad F�sica Hora
	 */
	public static IPhysicalUnit HOUR = new PhysicalUnit(Quantity.t, "h", 3600, SiTimeMetricSystem.SYSTEM);
	
	// Constructor

	/**
	 * Constructor de SiTimeMetricSystem
	 */	
	private SiTimeMetricSystem() {
		super();
	}
	
	// M�todos
	
	/**
	 * Devuelve la base del sistema m�trico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return SiTimeMetricSystem.SECOND;
	}

	/**
	 * Devuelve todas las unidades del sistema m�trico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		IPhysicalUnit ar[] = new IPhysicalUnit[] {SiTimeMetricSystem.MILLISECOND, SiTimeMetricSystem.SECOND, SiTimeMetricSystem.HOUR};
		return Arrays.asList(ar);
	}
	
}
