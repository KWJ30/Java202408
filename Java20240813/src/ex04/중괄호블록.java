package ex04;

/*
 * 이클립스 단축키
 * 줄복사: ctrl+alt+방향키
 * 줄삭제: ctrl+d
 * 줄이동: alt+방향키
 * 창분할: ctrl+shift+[     (토글기능)
 * 화면확대: ctrl+m    (토글기능)
 * 
 * 윈도우 단축키(캡쳐)- 윈도우키+shift+s
 */
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
