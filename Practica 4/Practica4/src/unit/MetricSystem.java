package unit;

import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * Sistema Métrico
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public abstract class MetricSystem implements IMetricSystem {
	
	// Constructor
	
	/**
	 * Constructor para Sistema Métrico
	 */
	protected MetricSystem() {
	}

	// Métodos
	
	/**
	 * Devuelve la base del sistema métrico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return null;
	}

	/**
	 * Devuelve todas las unidades del sistema métrico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		return null;
	}

}
