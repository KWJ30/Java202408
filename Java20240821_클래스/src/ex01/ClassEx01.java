package ex01;

//import java.util.Scanner;

public class ClassEx01 { //public은 하나만 가능

	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		
		Student 김 = new Student(); //객체생성
		
		//int a = sc.nextInt();
		
//		김.나이 = 30;
//		김.이름 = "원준";
//		김.전화번호 = "010-4577-2819";
		김.infoAge(500);
		김.info();
		
		/*멤버변수는 외부공개x
		 * int a; a=10; Sysout(a); -> a변수를 초기화해야 사용가능한것 처럼
		 * 멤버변수 초기화해야함. 방법은 2가지
		 * 1. 생성자 2. setter
		 */
		
		Student 홍 = new Student();
		
//		홍.나이 = 20;
//		홍.이름 = "길동";
//		홍.전화번호 = "012-3456-7890";
		
		홍.info();
	}

}

/* private < default < protected < public
   private 같은 class 내에서만 공개
   default 같은 package 내에서만 공개
   protected 다른 package 에서도 상속하면 공개
   public 모두 공개 */

class Student{ //클래스 여러개 가능하지만 보통은 1개씀(이름중복x)
	            //클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	private String 이름;
	private int 나이;	
	private String 전화번호;
	
	void infoAge(int age) {
		if(age>0 && age<120) {
			나이 = age;}
		else {System.out.println("0~120 숫자입력할것");
		}
	}
	
	void info() {
		System.out.printf("이름 : %s, 나이: %d, 전화번호:%s\n", 이름, 나이, 전화번호);
	}
	
	void 입실() {
		System.out.println("입실하다.");
	}
	
	void 퇴실() {
		System.out.println("퇴실하다.");
	}
	
	void 조퇴() {
		System.out.println("조퇴하다");
	}
}
