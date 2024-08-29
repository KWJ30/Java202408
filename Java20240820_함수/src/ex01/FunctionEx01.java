package ex01;

import java.util.Scanner;

public class FunctionEx01 {

	public static void main(String[] args) {
	func1(); //함수 호출 입력x출력x
	func2(6246481); //입력o출력x
	func2(5636468);
	func3(2434683); //입력o출력o
	System.out.println(func3(2434683)); //이게 1
	System.out.println(pow(1.5,1.5));
}
// void:반환타입 , 함수명: func1, 매개변수:()
	static void func1() { //함수
	System.out.println("매개변수(함수에게 값입력하지 않는다), 반환타입 없는 함수");
}
	
	static void func2(int num) {
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}
	
	static int func3(int num) {
		if(num%2==0)
			return 0;
		else
			return 1;
	}
	
	static double pow(double a, double b) {
	double result=Math.pow(a, b);
		return result;
	}
	}
		

	
