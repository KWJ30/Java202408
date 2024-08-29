package ex10.copy;

public abstract class Plane {

	private String PlaneName;
	private int fuelSize;
	
	Plane(){}
	Plane(String PlaneName,int fuelSize){
		this.PlaneName = PlaneName;
		this.fuelSize = fuelSize;
	}
	
	public String getPlaneName() {
		return PlaneName;
	}
	public void setPlaneName(String planeName) {
		PlaneName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	void refuel(int fuel) {fuelSize +=fuel;}
	
	void flight(int distance) {}
	
	
	
}
