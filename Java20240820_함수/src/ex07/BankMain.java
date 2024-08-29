package ex07;

public class BankMain {
	
	public static void main(String[] args) {
		
		BankClass b = new BankClass();
		
		b.계좌번호="123-456-789012";
		b.소유자이름="홍길동";
		b.잔액=10000;
		
		b.입금(1000);
		b.출금(500);
		b.잔액();
		b.info();
		
	}
}

class BankClass{
	String 계좌번호;
	String 소유자이름;
	int 잔액;	
	
	void 입금(int money) {잔액+=money; System.out.println("입금:"+money);}
	void 출금(int money) {잔액-=money; System.out.println("출금:"+money);}
	void 잔액() {System.out.println("잔액:"+잔액);}
	

	void info() {System.out.printf("계좌번호:%s, 이름:%s, 잔액:%d", 계좌번호,소유자이름,잔액);}

}
