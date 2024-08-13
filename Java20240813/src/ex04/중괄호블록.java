package ex04;

public class 중괄호블록 {

	public static void main(String[] args) {
		
		int n = 100;
		n = 200;
		
		{
			int num = 10;
			System.out.println(num);
		}
		
		//System.out.println(num); 중괄호 밖이라 에러가 뜸
		
		{
			int num2 = 20;
			System.out.println(num2);
		}
	
		{
			int num2 = 30;
			System.out.println(num2);
	}
	}
int num = 10;
}
