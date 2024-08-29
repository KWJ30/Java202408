package ex04mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile a = new Ltab("Ltab",500,"ABC-01");
		Mobile b = new Otab("Otab",1000,"XYZ-20");// 각각의 Mobile 객체를 생성한다.
		
	//	a.printMobile();
	//	b.printMobile(); // 생성된 객체의 정보를 출력한다.(printMobile() 호출)
		
		MobileTest.printTitle();
		MobileTest.printMobile(a);
		MobileTest.printMobile(b);
		
		a.charge(10);
		b.charge(10);// 각각의 Mobile 객체에 10분씩 충전을 한다.
		
		MobileTest.printTitle();
		MobileTest.printMobile(a);
		MobileTest.printMobile(b);
		
	//	a.printMobile();
	//	b.printMobile();// 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
		
		a.operate(5);
		b.operate(5);// 각각의 Mobile 객체에 5분씩 통화를 한다.
		
		MobileTest.printTitle();
		MobileTest.printMobile(a);
		MobileTest.printMobile(b);
		
	//	a.printMobile();
	//	b.printMobile();// 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
		}
		public static void printMobile(Mobile mobile) {
			
			System.out.printf("%10s\t %10d\t %10s\t\n",
					mobile.getMobileName(),
					mobile.getBatterySize(),
					mobile.getOsType());
			System.out.println();
			}
		
		public static void printTitle() {
			System.out.println("     Mobile	     Battery	     OS");
			System.out.println("---------------------------------------------");
		}
	}

/* 실행결과
   Mobile Battery OS
--------------------------------------------------------
Ltab 500 ABC-01
Otab 1000 XYZ-20
[ 10분 충전 ]
Mobile Battery OS
--------------------------------------------------------
Ltab 600 ABC-01
Otab 1080 XYZ-20
[ 5분 통화 ]
Mobile Battery OS
--------------------------------------------------------
Ltab 550 ABC-01
Otab 1020 XYZ-20 */
