package ex01;

import java.util.Scanner;

public class 예외처리01 {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력");
		num1 = sc.nextInt();
		//sc.nextLine();
		num2 = sc.nextInt();
		
		double result;
		
		if(num2==0) {  //if 사용
			result = 99999999;
		}
		else{result = num1/num2;}
		
		System.out.println("결과:"+result);
		System.out.println("프로그램종료");
		
	}

}
