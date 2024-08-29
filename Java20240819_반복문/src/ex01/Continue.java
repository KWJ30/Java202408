package ex01;

public class Continue {

	public static void main(String[] args) {
		
		//1부터 10사이의 짝수 합 구하기
		
		for(int i=1; i<=10; i++) {
			if(i%2==0||i%3==0) {continue;}
			System.out.println(i);
		}
		
	}

}
