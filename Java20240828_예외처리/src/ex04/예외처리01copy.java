package ex04;

public class 예외처리01copy {

	public static void main(String[] args) {

		int [] arr = {2,3,5,0,7};
		int result = 0;
		
		for(int i=0; i< arr.length+1; i++) {
		
		try {
			result = 210/arr[i];
			//int num = 6/0;
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 범위 벗어난 경우");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
			
			result = 210;
			
		} catch(ArithmeticException e) {
			
			System.out.println("분모가 0인 경우");
			
			e.printStackTrace(); //에러메시지 출력
			
			result = 99999999;
			
			System.out.println(e.getMessage());
			
		} catch(NullPointerException e) {

			System.out.println("null을 참조한 경우");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("결과:"+result);
		System.out.println("프로그램종료");
		
	}

}

}