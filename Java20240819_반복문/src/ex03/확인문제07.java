package ex03;

import java.util.Scanner;

public class 확인문제07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");
		System.out.print("선택> ");
		
		int i = sc.nextInt();
		
		int sum = 0;
		
		while(i!=4) {
		if(i==1){System.out.print("예금액>"); int a = sc.nextInt(); sum+=a;
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");}
		
		else if(i==2) {System.out.print("출금액>"); int b = sc.nextInt(); sum-=b;
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");}
		
		else if(i==3) {System.out.print("잔고>"+sum+"\n");
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");}
		
		else {System.out.print("올바른 값을 입력해주세요\n");
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");}
		
		System.out.print("선택> "); i = sc.nextInt();
		}
		System.out.println("\n프로그램 종료");
		}
	}

