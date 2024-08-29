package ex04;

public class Main {

	public static void main(String[] args) {
	
		Payment pm;
		
		pm = new CreditCardPayment();
		pm.makePayment(10000);
		
		pm = new PayPalPayment();
		pm.makePayment(20000);
		
		pm = new CashPayment();
		pm.makePayment(30000);
		
	}
}
