package ex10.copy;

public class Cargoplane extends Plane{

	Cargoplane(){}
	Cargoplane(String planeName,int getFuelSize){
		super(planeName,getFuelSize);
	}
	
	@Override
	void flight(int distance) {
		setFuelSize(getFuelSize()-5*distance);
	}
	
}
