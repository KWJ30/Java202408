package ex02;

public class AddFunc3 {

	public static void main(String[] args) {
		
		//정수값 10주면 함수에서 1~10까지 합구해서 평균리턴
		
		double result = avg(1234);
		
		System.out.println(result);
		
	}
	
		static double avg(int a) {
			double sum=0;
			for(int i=1; i<=a; i++) {
				sum += i;
				}
			double avg = sum/a;
			return avg;
		}
		
	}
