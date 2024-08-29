package ex07;

public class 예외처리01 {

	public static void main(String[] args) {

		try {
		func(10,0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	
	static void func(int n1, int n2) throws Exception{  //떠넘기기 (Arithmetic 안써도됨)
		
		int result = 0;
		
	//	try {
		
		result = n1/n2;
		
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println("결과:"+result);  // 윗줄에서 예외발생해서 바로 메인으로 가서 실행안됨
		
	}

}
