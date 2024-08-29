package ex01;

public class Account {

	private int balance;

	void deposit(int amount) {balance+=amount;}
	void withdraw(int amount) {if(amount>balance){System.out.println("잔액부족");} 
	else {balance-=amount;} }
	
	int getBalance() {
		return balance;
	}
	
	}
	
