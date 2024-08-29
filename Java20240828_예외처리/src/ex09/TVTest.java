package ex09;

public class TVTest {

	public static void main(String[] args) {
		
		TV a = new SaleTV("SALETV-1",40,1,300000);
		RentalTV b = new RentalTV("RENTALTV-10",42,1,100000); //SaleTV, RentalTV 클래스 의 객체를 각각 생성한다

		a.channelUp();
		a.channelUp(); //SaleTV 객체는 채널을 두 개 높인다

		b.channelDown();
		b.channelDown();
		b.channelDown(); //RentalTV 객체는 채널을 세 개 내린다

		
		printAllTV(a);
		printAllTV(b);//각 객체에 대하여 printAllTV() 을 호출한다

		printRentalTV(b);//Rentable 타입의 객체 인 RentalTV 객 체는 printRentalTV() 를 호출한다
	}
	
			static void printAllTV(TV tv) {
			System.out.println(tv.toString()); // 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다
			tv.play();// 아규먼트로 전달된 객체의 play () 를 호출한다
			if(tv instanceof SaleTV) {tv.sale();}// tv 변수에 전달된 객체가 SaleTV 타입이면 sale() 메서드를 호출한다
			}
			
			static void printRentalTV(Rentable tv) {
				tv.rent();// 아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다
			}
	}
