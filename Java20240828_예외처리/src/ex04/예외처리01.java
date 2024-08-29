package ex04;

public class 예외처리01 {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		int sum = 0;
		
		try {
			for(int i=0; i< arr.length+1; i++) {sum += arr[i];}
			int num = 6/0;
		} catch(ArrayIndexOutOfBoundsException e) { //자체처리를 하려 할 때 세분화
			
			System.out.println("배열 범위 벗어난 경우");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
			
		} catch(ArithmeticException e) {
			
			System.out.println("분모가 0인 경우");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
			
		} catch(NullPointerException e) {

			System.out.println("null을 참조한 경우");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
		} catch(Exception e) {                      //그 외 모든 예외처리

			System.out.println("그 외 예외 처리구문");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("결과:"+sum);
		System.out.println("프로그램종료");
		
	}

}
