package ex05;

public class 예외처리01 {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		int sum,num = 5;
		
		try {
			//for(int i=0; i< arr.length+1; i++) {sum += arr[i];}
			num = 5/0;
		
		} catch(Exception e) {                     

			System.out.println("그 외 예외 처리구문");
			
			e.printStackTrace(); //에러메시지 출력
			
			System.out.println(e.getMessage());
		} finally{                                    //반드시 처리해야되는 부분
			System.out.println("예외발생여부에 관계없이 무조건 처리하는 문장");
			num=10;
		}
		
		//finally를 쓰게되면 그아래의 문장이 모두 예외여부에 관계없이 실행된다는 점을 바로 인지가능
		
		System.out.println("결과:"+num);
		System.out.println("프로그램종료");
		
	}

}
