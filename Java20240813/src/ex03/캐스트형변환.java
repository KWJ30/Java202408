package ex03;
/*
 * 수동 형변환 or 강제 형변환
 * 큰 자료형-> 작은 자료형 대입
 */
public class 캐스트형변환 {

	public static void main(String[] args) {
		
		short s1;
		int num1 = 50000;
		
		s1 = (short)num1; //강제 형변환
		
		System.out.println(s1);
		
		double d1 = 10.2;
		
		int num2 = (int)d1; //강제 형변환
		
		System.out.println(num2);
		
		System.out.println("----------");
		/*
		 * 정수*정수->정수
		 * 정수*실수->실수
		 * 실수*문자->문자
		 */
		 double d2 = 10 + 10.2; 
		 
		 String str1 = 10 + "abc";
		 
		 System.out.println(d2);
		 System.out.println(str1);
		
	}

}
