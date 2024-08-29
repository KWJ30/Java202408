package ex02;

public class AddFunc1 {

	public static void main(String[] args) {
		
		AddFunc1 myCar = new AddFunc1();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println("가스를 주입하세요.");
	}
	
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스없음");
			return false;
		}
		System.out.println("가스있음");
		return true;
		}
	 
	void run() {
		while (true) {
			if(gas>0) {
				System.out.println("달립니다.(잔량:"+ gas + ")");
				gas -= 1;
			}
			else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
			return;
			}
			
		}
	}
	

	
	}
