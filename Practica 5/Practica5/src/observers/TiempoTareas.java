package observers;

import interfaces.AdjustableTime;

public class TiempoTareas extends DefaultObservableProperty<Integer> implements AdjustableTime {

	public TiempoTareas(int n){
		super(new Integer(n));
	}
	
	@Override
	public void incrementTime(int inc) throws IllegalArgumentException {
		if(this.getValue() + inc < 0){
			throw new IllegalArgumentException();
		}else{
			this.setValue(new Integer(this.getValue() + inc));
		}
	}
}
