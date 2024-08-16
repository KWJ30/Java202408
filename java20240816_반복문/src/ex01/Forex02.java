package ex01;

import java.util.Scanner;

public class Forex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요:");
		
		int a = sc.nextInt();
		int sum=0;
		for(int i=1; i<=a; i++){
			if(i%2==1) {sum+= i;}
		}
		
		System.out.println("홀수합은 "+sum+" 입니다");
		
	}

}
