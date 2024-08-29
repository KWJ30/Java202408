package ex10.copy;

public class Airplane extends Plane{

	Airplane(){}
	Airplane(String planeName,int FuelSize){
		super(planeName,FuelSize);
	}
	
	@Override
	void flight(int distance) {
		setFuelSize(getFuelSize()-3*distance);
	}
	
}
