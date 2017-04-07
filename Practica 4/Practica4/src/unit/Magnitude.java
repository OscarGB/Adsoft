package unit;

public class Magnitude implements IMagnitude {
	
	private double valor;
	private IPhysicalUnit unit;
	
	public Magnitude(double valor, IPhysicalUnit unit) {
		this.valor = valor;
		this.unit = unit;
	}

	@Override
	public IMagnitude add(IMagnitude m) throws QuantityException {
		IMagnitude aux = m.transformTo(this.getUnit());
		
		return new Magnitude(this.getValue() + aux.getValue(), this.getUnit());
	}

	@Override
	public IMagnitude subs(IMagnitude m) throws QuantityException {
		IMagnitude aux = m.transformTo(this.getUnit());
		
		return new Magnitude(this.getValue() - aux.getValue(), this.getUnit());
	}

	@Override
	public IMagnitude transformTo(IPhysicalUnit c) throws QuantityException {
		//El QuantityException lo lanza el transformTo de PhysicalUnit
		return new Magnitude(this.getUnit().transformTo(this.getValue(),  c), c);
		
	}

	@Override
	public IPhysicalUnit getUnit() {
		return this.unit;
	}

	@Override
	public double getValue() {
		return this.valor;
	}
	
	@Override
	public String toString(){
		return this.getValue() + " [" + this.getUnit() + "]";
	}

}
