package ex06;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank 김 = new Bank();
		
		김.계좌번호 = "110-397-786466";
		김.이름 = "원준";
		김.잔액 = 10000;
		
		김.입금(1000);
		김.출금(500);
		김.잔액();
		김.info();
	}

}

class Bank {

	String 계좌번호;
	String 이름;
	int 잔액;
	
	void 입금(int a) {잔액+=a;}
	void 출금(int a) {잔액-=a;}
	void 잔액() {System.out.println("잔액:"+잔액);}
	
	void info() {System.out.printf("계좌번호:%s, 이름:%s, 잔액:%d", 계좌번호,이름,잔액);}
}