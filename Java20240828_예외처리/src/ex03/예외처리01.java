package ex03;

import java.util.Scanner;

public class 예외처리01 {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력");
		num1 = sc.nextInt();
		//sc.nextLine();
		num2 = sc.nextInt();
		
		double result = 0;
		
		// num2==0 이면 나누기 하지 않는다
		// try - 문제가 될 소지가 있는경우 try{} 블럭안 기입
		// catch - 문제(예외)가 발생하면 처리하는 블럭 catch(){}
		
		try {
			result = num1/num2;
		}catch(Exception e) {
			e.printStackTrace(); //에러메시지 출력
			System.out.println("-----");
			System.out.println(e.getMessage());
		}
		
		System.out.println("결과:"+result);
		System.out.println("프로그램종료");
		
	}

}
