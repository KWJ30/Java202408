package ex08;

public class Vehicle {
	
	String licensePlate; //차량번호
	String owner;  //소유자
	
	public Vehicle(String licensePlate,String owner) {
		this.licensePlate = licensePlate;
		this.owner = owner;
	}
	
	double calculateMaintenanceCost() {
		return 0;
	}
	
	void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	void printInfo() {
		System.out.println("차량번호: " + licensePlate);
		System.out.println("소유자: " + owner);
		startEngine();
	}
	
	
	
}
