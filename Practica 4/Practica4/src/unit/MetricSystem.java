package unit;

import java.util.Collection;

import interfaces.IMetricSystem;
import interfaces.IPhysicalUnit;

/**
 * Sistema M�trico
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public abstract class MetricSystem implements IMetricSystem {
	
	// Constructor
	
	/**
	 * Constructor para Sistema M�trico
	 */
	protected MetricSystem() {
	}

	// M�todos
	
	/**
	 * Devuelve la base del sistema m�trico
	 * @return
	 */
	@Override
	public IPhysicalUnit base() {
		return null;
	}

	/**
	 * Devuelve todas las unidades del sistema m�trico
	 * @return
	 */
	@Override
	public Collection<IPhysicalUnit> units() {
		return null;
	}

}
