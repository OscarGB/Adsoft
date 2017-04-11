package interfaces;

import exceptions.UnknownUnitException;

public interface IMetricSystemConverter {
	IMetricSystem sourceSystem();
	IMetricSystem targetSystem();
	IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
	IMetricSystemConverter reverse();
}
