package ex07;

public class Car extends Vehicle{

	String fuelType; //연료 타입, 예:"Gasoline" 또는 "Diesel"
	int seatingCapacity; //탑승 인원
	
	public Car(String licensePlate,String owner,String fuelType,int seatingCapacity) {
		super(licensePlate,owner);
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
	}
	
	double calculateMaintenanceCost() {
		super.calculateMaintenanceCost();
		return 10000*seatingCapacity;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("연료 타입: " + fuelType);
		System.out.println("탑승 인원: " + seatingCapacity);
		System.out.println("정비 비용: " + calculateMaintenanceCost());
}

}