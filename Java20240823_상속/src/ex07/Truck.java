package ex07;

public class Truck extends Vehicle{
	
	double loadCapacity; //적재 용량(톤)
	
	public Truck(String licensePlate,String owner, double loadCapacity) {
		super(licensePlate,owner);
		this.loadCapacity = loadCapacity;
	}
	
	double calculateMaintenanceCost() {
		super.calculateMaintenanceCost();
		return 20000*loadCapacity;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("적재 용량: " + loadCapacity);
		System.out.println("정비 비용: " + calculateMaintenanceCost());
}
	
}
