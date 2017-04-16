package unit;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import interfaces.IMetricSystem;
import interfaces.IMetricSystemConverter;
import interfaces.IPhysicalUnit;

/**
 * Test para la conversión
 * @author Oscar Gomez
 * @author Jose Ignacio Gomez
 */
public abstract class MetricSystem implements IMetricSystem {
	
	//Variables
	
	/**
	 * Registro de conversores
	 * De tipo HashSet para evitar repeticiones
	 */
	protected static Set<IMetricSystemConverter> register = new HashSet<IMetricSystemConverter>();
	
	// Constructor
	
	/**
	 * Constructor para Sistema Métrico
	 */
	protected MetricSystem() {
	}

	// Métodos
	
	/**
	 * Devuelve el convertidor de sistema métrico
	 * @param to, Sistema al que se convierte
	 * @return converter
	 */
	public IMetricSystemConverter getConverter(IMetricSystem to){
		if(MetricSystem.register.isEmpty() == true){
			return null;
		}
		for(IMetricSystemConverter ms: MetricSystem.register){
			if(ms.targetSystem().equals(to) == true){
				return ms;
			}
		}
		
		return null;
	}
	
	/**
	 * Metodo para aniadir un conversor al registro
	 * @param conv, conversor
	 * @return boolean
	 */
	public static boolean registerConverter(IMetricSystemConverter conv){
		if(MetricSystem.register.add(conv) && MetricSystem.register.add(conv.reverse())){
			return true;
		}
		
		return false;
	}
	
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
	
	/**
	 * (Override) Metodo equals para comparar MetricSystems
	 * @param Object obg
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj){
		IMetricSystem sys = (IMetricSystem) obj;
		if(this.base().equals(sys.base())){
			return true;
		}
		return false;
	}
		
	/**
	 * Metodo toString para debugging
	 */
	@Override
	public String toString(){
		return this.base().toString();
	}

}
