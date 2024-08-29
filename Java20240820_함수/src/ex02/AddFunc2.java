package ex02;

public class AddFunc2 {

	public static void main(String[] args) {
		
		//정수값 10주면 함수에서 1~10까지 합구해서 리턴
		
		int result = sum(100);
		
		System.out.println(result);
		
	}
	
		static int sum(int a) {
			int sum=0;
			for(int i=1; i<=a; i++) {
				sum += i;
			}
			return sum;
		}
		
	}
