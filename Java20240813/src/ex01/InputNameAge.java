package ex01;

import java.util.Scanner;

/*
 * 나이하고 이름을 키보드 통해서 입력 받아서
 * 출력
 */
public class InputNameAge {

	public static void main(String[] args) {
/*기본자료형->
 * 정수형 byte, short, int, long
 * 실수형 float,double
 * 논리형 boolean
 * 문자형 char
 */
		Scanner sc = new Scanner(System.in); //키보드통해서 입력받기위해 쓴 문구
	
		
		System.out.println("이름을 입력하세요:");
	
		String name = sc.nextLine(); //String은 참조자료형이어서 주소값(문자열)을 입력받아야 함
	
		System.out.println("나의 이름은 "+name+" 입니다");
	
		
		System.out.println("나이를 입력하세요:");
		
		int age = sc.nextInt();
		
		System.out.println("나이는 "+age+" 입니다");
		
		
		System.out.println("프로그램종료");
	
		sc.nextLine();
	}

}
