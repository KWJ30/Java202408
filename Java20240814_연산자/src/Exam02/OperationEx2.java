package Exam02;

public class OperationEx2 {

	public static void main(String[] args) {
		
		int num = 4000;
		int a= num/3600;
		int b= num%3600/60;
		int c= (num%3600)%60;
		System.out.println(a+"시간 "+b+"분 "+c+"초");
	
		System.out.println(Math.pow(5,100));
		System.out.printf("%5.5f",Math.pow(5,100));
	}

}
