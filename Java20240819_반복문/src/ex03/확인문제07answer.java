package ex03;

import java.util.Scanner;

public class 확인문제07answer {

	public static void main(String[] args) {
	
		int deposit,balance,withdraw;
		deposit=balance=withdraw=0;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");
		System.out.print("선택> ");
		
		//int num = Integer.parseInt(sc.nextLine());
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("예금액> ");
			//deposit = Integer.parseInt(sc.nextLine());
			deposit = sc.nextInt();
			balance += deposit;
			break;
		case 2:
			System.out.print("출금액> ");
			//withdraw = Integer.parseInt(sc.nextLine());
			withdraw = sc.nextInt();
			balance -= withdraw;
			break;
		case 3:
			System.out.print("잔고> "+ balance+"\n");
			break;
		case 4:
			flag = false;
			break;
		default:
			System.out.println("1~4사이 숫자만 입력하세요");
		}
		}
		System.out.println("\n프로그램 종료");
		}
}
