package ex02;

/*
 * num1 = 20;
 * num2 = 10;
 * 두 수 교환해서 출력
 */
public class NumberChange2 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 10;
		
		// sysout -> ctrl+space
		System.out.println("before------");
		System.out.println("num1 : " + num1 + " ,num2 : " + num2);

		int x = num1-num2;
		if(x>=0) {System.out.println(-x);}
		else {System.out.println(x);}
	}

}
