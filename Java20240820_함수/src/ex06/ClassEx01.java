package ex06;

import java.util.Scanner;

public class ClassEx01 { //public은 하나만 가능

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Student 김 = new Student(); //객체생성
		김.나이 = 30;
		김.이름 = "원준";
		김.전화번호 = "010-4577-2819";
		
		김.info();
		
		Student 홍 = new Student();
		홍.나이 = 20;
		홍.이름 = "길동";
		홍.전화번호 = "012-3456-7890";
		
		홍.info();
	}

}

class Student{ //클래스 여러개 가능하지만 보통은 1개씀(이름중복x)
	            //클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	String 이름;
	int 나이;
	String 전화번호;
	
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
