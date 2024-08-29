package ex04;

public class Car {

	private static int count = 0;
	private String carname;
	
	Car(String carname){
		this.carname = carname; count++;
		System.out.println("차량 구입, 이름: "+ carname); }
		
	static void showTotalCars() {
		System.out.println("구매한 차량 수: "+ count);}

	
	
}
